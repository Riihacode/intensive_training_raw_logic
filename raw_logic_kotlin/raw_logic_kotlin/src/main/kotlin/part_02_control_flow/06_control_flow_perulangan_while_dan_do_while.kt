package com.example.part_02_control_flow

fun main() {
  /**
   * WHILE = kondisi & statement
   * evaluasi dulu lalu eksekusi
   */
  var counter: Int = 1
  while(counter <= 70) {
    println("Hello World $counter")
    counter++
  }

  println("\n\n ============================= \n\n")
  /**
   * DO-WHILE
   * eksekusi dulu baru evaluasi
   */
  var counterDoWhile: Int = 1
  do {
    println("Angka ke $counterDoWhile")
    counterDoWhile++
  } while(counterDoWhile <= 70)
}
