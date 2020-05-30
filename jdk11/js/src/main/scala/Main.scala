package edu.holycross.shot.template


object JSMain {
  def main(args: Array[String]): Unit = {
    val crossedObject = CrossedClass("Object of cross-built class in ScalaJS")
    println(crossedObject.name)
  }
}
