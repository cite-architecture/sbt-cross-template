package edu.holycross.shot.template

import org.scalatest._


class JSExportsSpec extends FlatSpec {

	"The Scala export of CrossedClass"  should "expose the case class and its methods" in {
    val expected = "Test name".size
    assert(CrossedClass("Test name").name.size == expected)
	}

}
