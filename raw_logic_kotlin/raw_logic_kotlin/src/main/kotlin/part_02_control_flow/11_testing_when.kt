package com.example.part_02_control_flow

fun main() {
  val currentLocation: String? = null
  println("I just asked anywhere and they said that i was at Yogyakarta")
  currentLocation = "Yogyakarta"

  val averageFoodPrice: Int = when(currentLocation) {
    "Semarang"    -> 12_000
    "Yogyakarta"  -> 10_000
    "Jakarta"     -> 20_000
    else          -> 15_000
  }

  println("Jadi harga makan sekarang sepertinya adalah Rp. $averageFoodPrice")
}

