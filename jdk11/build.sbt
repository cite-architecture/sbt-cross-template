
lazy val scala211 = "2.11.12"
lazy val scala212 = "2.12.10"
lazy val supportedScalaVersions = List(scala212, scala211)

ThisBuild / scalaVersion := scala212

lazy val root = (project in file("."))
  .aggregate(crossed.js, crossed.jvm)
  .settings(
    // crossScalaVersions must be set to Nil on the aggregating project
    crossScalaVersions := Nil,
    publish / skip := true
  )

lazy val crossed = crossProject(JSPlatform, JVMPlatform).in(file(".")).
  // shared settings:
  settings(
    name := "foo",
    version := "0.1-SNAPSHOT",
    licenses += ("GPL-3.0",url("https://opensource.org/licenses/gpl-3.0.html")),

    resolvers += Resolver.jcenterRepo,
    libraryDependencies ++= Seq(
      "org.scalatest" %%% "scalatest" % "3.1.2" % "test",
      "org.wvlet.airframe" %%% "airframe-log" % "20.5.2",

      "edu.holycross.shot.cite" %%% "xcite" % "4.3.0"
    )
  ).
  jvmSettings(
    // JVM-specific settings:
    libraryDependencies ++= Seq(
      "org.scala-js" %% "scalajs-stubs" % "1.0.0" % "provided",
    )
  ).
  jsSettings(
    // JS-specific settings:
    scalaJSUseMainModuleInitializer := true,
  )




lazy val docs = project       // new documentation project
  .in(file("docs-build")) // important: it must not be docs/
  .dependsOn(crossed.jvm)
  .enablePlugins(MdocPlugin)
  .settings(
    mdocIn := file("guide"),
    mdocOut := file("mdocs")
  )
