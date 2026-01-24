package com.example.part_03_fungsi

fun main() {
  sapaUser("Adi")
  sapaUser("Bambang")
  sapaUser("Citra")
}

fun sapaUser(name: String) {
  val greetOpening: String = "Halo, $name!"
  val greetAddition: String = "Semoga harimu menyenangkan"

  println(greetOpening)
  println(greetAddition)
}
