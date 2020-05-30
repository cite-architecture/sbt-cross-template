package edu.holycross.shot.template

import org.scalatest.FlatSpec

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
}
