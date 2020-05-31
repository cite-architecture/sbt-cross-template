# sbt-cross-template

Template files tested with specific versions of the JVM, and supporting:

- cross-compilation, to both JVM and ScalaJS, and to more than one version of Scala, including export of shared code to JVM and JS
- unit testing of all code (in shared, JVM- and JS-specific directories)
- logging with airframe logger
- live documentation generated with `mdoc`
- publication to bintray

## Template sets

- [jdk11](./jdk11/):  for sbt 1.3.0 and ScalaJS 1.0.0, using JDK 11
