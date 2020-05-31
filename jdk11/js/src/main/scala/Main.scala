package edu.holycross.shot.template

import edu.holycross.shot.cite._

object JSMain {
  def main(args: Array[String]): Unit = {
    val crossedObject = CrossedClass("Object of cross-built class in ScalaJS")
    println(crossedObject.name)
  }
}
