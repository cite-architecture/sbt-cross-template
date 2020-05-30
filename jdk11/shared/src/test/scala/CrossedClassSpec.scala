package edu.holycross.shot.template

import org.scalatest.FlatSpec

class CrossedClassSpec extends FlatSpec {

  "A CrossedClass instance" should "have a name member" in {
    val expected = "Instance name"
    val crossedObject = CrossedClass(expected)
    assert(crossedObject.name == expected)
  }
}
