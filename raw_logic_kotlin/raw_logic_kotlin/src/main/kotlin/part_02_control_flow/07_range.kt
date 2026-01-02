package com.example.part_02_control_flow

fun main() {
  /*
   *  range
   */
  val rangeTest: IntRange = 1..10
  println(rangeTest)

  /*
   *  rangeTo
   */
  val rangeToTest: IntRange = 5.rangeTo(15)
  println(rangeToTest)

  /*
   *  rangeDown
   */
  val rangeDownTest: IntProgression = 20.downTo(5)
  println(rangeDownTest)
}
