package com.example.part_02_control_flow

fun main() {
  /*
   * COLLECTION
   * langsung nyinggung range dan collection
   * collection di pembahasan selanjutnya
   */
  for(i in 1..5) {
    println("Nilai: $i")
  }

  /*
  var x: Int = 0
  for (i in x..5) {
    println("Sekarang nomor $i")
  }
  */

  println("===================================")
  // DIGABUNG DENGAN RANGE
  val nilaiGanjil: IntProgression = 1.rangeTo(10) step 2
  for (currentNilai in nilaiGanjil) {
    println("Nilai Sekarang: $currentNilai")
  }
}
