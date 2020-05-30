package edu.holycross.shot.template

object JVMMain {
  def main(args: Array[String]): Unit = {
    val crossedObject = CrossedClass("Object of cross-built class in JVM")
    println(crossedObject.name)
  }
}
