package com.example.part_02_control_flow

fun main() {
  /**
   * 1. Expressions = proses menghasilkan nilai baru
   * 2. Statement   = keseluruhan source code yang bertindak sebagai perintah di dalamnya termasuk expressions
   */

  val nilaiA: Int = 10
  val nilaiB: Int = 5
  val hasilPenjumlahan: Int = nilaiA + nilaiB
  println("\"val hasilPenjumlahan: Int = nilaiA + nilaiB\" adalah statement")
  println("\"nilaiA + nilaiB\" adalah expressions")
  println("Hasil Penjumlahan = $hasilPenjumlahan")
}
