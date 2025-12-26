package com.example.part_01_tipe_data

fun main() {
  println("=========================")
  println("Operator perbandingan umum =")
  val a: Int = 10
  val b: Int = 10
  println(a == b)

  val c: String = "nama"
  val d: String = "nama"
  println(c != d)

  println("=========================")
  println("Operator perbandingan angka =")
  val j: Int = 10
  val k: Int = 5
  val l: Int = 20
  val m: Int = 10

  println("# true semua")
  val lebihDari: Boolean = j > k
  println(lebihDari)

  val kurangDari: Boolean = k < l
  println(kurangDari)

  val lebihDariSamaDengan: Boolean = j >= m
  println(lebihDariSamaDengan)

  val kurangDariSamaDengan: Boolean = j <= m
  println(kurangDariSamaDengan)

  println("# versi false")
  val lebihDariF: Boolean = k > j
  println(lebihDariF)

  val kurangDariF: Boolean = j < k
  println(kurangDariF)

  val lebihDariSamaDenganF: Boolean = j >= l
  println(lebihDariSamaDenganF)

  val kurangDariSamaDenganF: Boolean = l <= m
  println(kurangDariSamaDenganF)

  println("======================")
  println("Mengenal Operator Logika = ")
  val andA: Boolean = true
  val andB: Boolean = true
  val andC: Boolean = false

  val andTestTrue: Boolean = andA && andB
  println(andTestTrue)

  val andTestFalse: Boolean = andB && andC
  println(andTestFalse)

  println("----------------------")
  val orA: Boolean = true
  val orB: Boolean = true
  val orC: Boolean = false
  val orD: Boolean = false

  val orTestTrue1: Boolean = orA || orB
  println(orTestTrue1)

  val orTestTrue2: Boolean  = orA || orC
  println(orTestTrue2)

  val orTestFalse: Boolean = orC || orD
  println(orTestFalse)

  println("----------------------")
  val notA: Boolean = true
  val notB: Boolean = false

  val notTestFalse: Boolean = !notA
  println(notTestFalse)

  val notTestTrue: Boolean = !notB
  println(notTestTrue)
}
