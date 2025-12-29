package com.example.part_02_control_flow

fun main() {
  /**
   * KONDISI adalah hasil evaluasi (expression) yang menghasilkan nilai boolean
   */

  println("=================")
  // IF
  val nilaiA: Int = 2000
  val nilaiB: Int = 3000
  if(nilaiA < nilaiB) {
    println("nilaiB $nilaiB lebih besar dari nilaiA $nilaiA")
  }

  /**
   * if, var, val umum juga disebut sebagai keyword.
   * Keyword adalah beragam nama kode yang sudah disimpan (reserved) sebagai bagian dari sistem.
   * Dampaknya adalah developer tidak bisa menggunakan nama-nama tersebut sebagai nama variabel.
   */
  //Syntax Error
  //var if: String = "Namaku"


  println("================================")
  //IF-ELSE
  val nilaiAIfElse: Int = 1000
  val nilaiBIfElse: Int = 4000
  if (nilaiAIfElse > nilaiBIfElse) {
    println("nilaiAIfElse lebih besar")
  } else {
    println("nilaiBIfElse lebih besar")
  }


  println("=================================")
  // ELSE-IF
  val nilaiAElseIf: Int = 7000
  val nilaiBElseIf: Int = 7000
  if (nilaiAElseIf > nilaiBElseIf) {
    println("nilaiAElseIf lebih besar")
  } else if (nilaiAElseIf == nilaiBElseIf) {
    println("nilainya sama besar")
  } else {
    println("nilaiBElseIf lebih besar")
  }

  // Kode else if benar tapi salah urutan
  val aElseIf: Int = 4000
  val bElseIf: Int = 4000
  if (aElseIf == bElseIf) {
    println("Sama Besar")
  } else if (aElseIf >= bElseIf) {
    println("aElseIf memang \"lebih besar sama dengan\" tapi tidak akan pernah dieskekusi")
  } else {
    println("kurang dari") 
  }

  /*
   * IF-EXPRESSION HARUS DIBARENGI ELSE
   */
  println("=================================")
  // IF-EXPRESSION
  val aIfExpression: Int = 5000
  val bIfExpression: Int = 5000
  val pemberitahuan: String = if(aIfExpression > bIfExpression) { 
    "nilai aIfExpression $aIfExpression lebih besar dari bIfExpression $bIfExpression"
  } else if (aIfExpression == bIfExpression) {
    "nilainya sama besar"
  } else {
    "bIfExpression lebih besar"
  }
  
  println(pemberitahuan)


  println("---------------------------------")
  // IF-EXPRESSION dengan string template
  val hargaBarangA: Int = 7000
  println("Harga Barang  A yaitu $hargaBarangA itu termasuk ${if(hargaBarangA < 10000) "murah" else { "mahal" }}")
}
