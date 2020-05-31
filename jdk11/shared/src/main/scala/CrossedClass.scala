package edu.holycross.shot.template

//import scala.scalajs.js
import wvlet.log._

// JVM only:
// import wvlet.log.LogFormatter.SourceCodeLogFormatter

import edu.holycross.shot.cite._

import scala.scalajs.js.annotation._

@JSExportAll
case class CrossedClass(name: String) extends LogSupport {
  info("Created CrossedClass object")
  if (name.size > 10) {
    warn(s"${name} seems like a long name!")
  }
  // prove CITE libraries can be imported
  val iliad = CtsUrn("urn:cts:greekLit:tlg0012.tlg001:")
}
