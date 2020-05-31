package edu.holycross.shot.template

import org.scalatest.FlatSpec
import edu.holycross.shot.cite._

class CrossedClassSpec extends FlatSpec {

  "A CrossedClass instance" should "have a name member" in {
    val expected = "Obj. name"
    val crossedObject = CrossedClass(expected)
    assert(crossedObject.name == expected)
  }

  it should "display logging output in both JS and JVM" in {
    val expected = "rumpelstitskin"
    val crossedObject = CrossedClass(expected)
    assert(crossedObject.name == expected)
  }

  it should "have a hard-coded CtsUrn member" in {
    val crossedObject = CrossedClass("Iliad")
    val expected = CtsUrn("urn:cts:greekLit:tlg0012.tlg001:")
    assert(crossedObject.iliad == expected)
  }
}
