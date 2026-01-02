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
   *  ada output bernama `step`
   */
  val rangeDownTest: IntProgression = 20.downTo(5)
  println(rangeDownTest)


  println("=========================================")
  /**
   *  step
   */
  val rangeStepTest: IntProgression = 1..10 step 2
  println(rangeStepTest)

  val downToStepTest: IntProgression = 20.downTo(5).step(2)
  println(downToStepTest)



  println("=========================================")
  /**
   *  in
   */
  val rangeInTestPart1: IntProgression = 1..10 step 3
  if  (7 in rangeInTestPart1) {
    println("Nomor 7 ada di rangeInTestPar1")
  } else {
    println("Nomor 7 tidak ada di rangeInTestPart1")
  }

  val rangeInTestPart2: IntProgression = 1..10 step 2
  if  (7 in rangeInTestPart2) {
    println("Nomor 7 ada di rangeInTestPart2")
  } else {
    println("Nomor 7 tidak ada di rangeInTestPart2")
  }

  val rangeToInTestPart1: IntProgression = 1.rangeTo(10) step 4
  if  (7 in rangeToInTestPart1) {
    println("7 ada di rentang rangeToInTestPart1 secara increment")
  } else {
    println("7 tidak ada di rentang rangeToInTestPart1 secara increment")
  }

  val rangeToInTestPart2: IntProgression = 1.rangeTo(10) step 3
  if(7 in rangeToInTestPart2) {
    println("7 ada di rentang rangeToInTestPart2 secara increment")
  } else {
    println("7 tidak ada di rentang rangeToInTestPart2 secara increment")
  }

  val rangeDownToInTestPart1: IntProgression = 20.downTo(5) step 2
  if (7 in rangeDownToInTestPart1) {
    println("7 ada di rentang rangeDownToInTestPart1 secara decrement") 
  } else {
     println("7 tidak ada di rentang rangeDownToInTestPart1 secara decrement")
  }

  val rangeDownToInTestPart2: IntProgression = 20.downTo(5) step 3
  if (7 in rangeDownToInTestPart2) {
    println("7 ada di rentang rangeDownToInTestPart2")
  } else {
    println("7 tidak ada di rentang rangeDownToInTestPart2")
  }

  val rangeDownToInTestPart3: IntProgression = 20.downTo(5) step 1
  if (7 in rangeDownToInTestPart3) {
    println("7 ada di rentang rangeDownToInTestPart2")
  } else {
    println("7 tidak ada di rentang rangeDownToInTestPart2")
  }


  println("==========================================")
  /**
   *  in dengan operator logika
   */
  val rangeInNotTestPart1: IntProgression = 1..10 step 2
  if(7 !in rangeInNotTestPart1) {
    println("7 tidak ada di antara 1 .. 10")
  } else {  
    println("7 ada di antara 1 .. 10")
  }

  val rangeToInNotTestPart1: IntProgression = 1.rangeTo(10) step 2
  if (7 !in rangeToInNotTestPart1) {
    println("7 tidak ada di antara 1 .. 10 dengan step 2")
  } else {
    println("7 ada di antara 1 .. 10 dengan step 2")
  }
 
  val rangeToInNotTestPart2: IntProgression = 1.rangeTo(10) step 3
  if (7 !in rangeToInNotTestPart2) {
    println("7 tidak ada di antara 1 .. 10 dengan step 3")
  } else {
    println("7 ada di antara 1 .. 10 dengan step 3")
  }
}
