


## Feature checklist

Implemented:

- cross-compilation, to both JVM and ScalaJS, and to more than one version of Scala
- unit testing of all code (shared, JVM- and JS-specific)
- correct exports to mains running in both JVM and JS branches
- `docs` project uses `mdoc`  to generate live documentation for `crossedJVM` with  `docs/mdoc`
- publication to bintray



## Test environment



OS: Mac OS 10.14.6

Output of `sbt sbtVersion`:

```
[info] crossedJS / sbtVersion
[info] 	1.3.0
[info] crossedJVM / sbtVersion
[info] 	1.3.0
[info] sbtVersion
[info] 	1.3.0
```

Output of `java -version`:

```
openjdk version "11.0.5" 2019-10-15
OpenJDK Runtime Environment AdoptOpenJDK (build 11.0.5+10)
OpenJDK 64-Bit Server VM AdoptOpenJDK (build 11.0.5+10, mixed mode)
```
