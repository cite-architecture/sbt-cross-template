# sbt-cross-template

Pairs of build.sbt` and `project/plugins.sbt` files tested with specific versions of the JVM, and supporting:

- cross-compilation, to both JVM and ScalaJS, and to more than one version of Scala
- unit testing of all code (shared, JVM- and JS-specific)
- live documentation generated with `mdoc`
- publication to bintray

