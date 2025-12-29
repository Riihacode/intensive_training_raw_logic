package org.example.part1_01_tipe_data

fun main() {
  val angka1: Int = 20
  val angka2: Int = 5
  val angka3: Int = 2

  println("###########################################") 
  println("OPERATOR ARITMATIKA DASAR")
  //penjumlahan
  val hasilPenjumlahan: Int = angka1 + angka2
  println(hasilPenjumlahan)

  val hasilPengurangan: Int = angka1 - angka2
  println(hasilPengurangan)

  val hasilPembagian: Int = angka1 / angka2
  println(hasilPembagian)

  val hasilPerkalian: Int = angka1 * angka2
  println(hasilPerkalian)

  val hasilPembagianPecahan: Int = angka1 % angka2
  println(hasilPembagianPecahan)

  println("###########################################")
  println("Pembuktian operator dengan kurung")
  
  val hasilTanpaKurung: Int = angka1 + angka2 *angka3
  println(hasilTanpaKurung)

  val hasilDenganKurung: Int = (angka1 + angka2) * angka3
  println(hasilDenganKurung)

  val hasilLain: Int = angka1 / angka2 + angka2 * angka3
  println(hasilLain)

  println("###########################################")
  println("###########################################")
  println("###########################################")
   
  println("increment decrement")
  
  var score: Int = 10
  score = score +  1
  println(score)

  var scoreIncrement: Int = 10
  scoreIncrement++
  println(scoreIncrement)


  var score2: Int = 10
  score2 = score2 - 1
  println(score2)

  var score2Decrement: Int = 10
  score2Decrement--
  println(score2Decrement)


  println("###########################################")
  println("###########################################")
  println("###########################################")
  println("Augmented Assignment Operator")

  var a: Int = 5
  var b: Int = 10
  
  a++
  println(a)

  b--
  println(b)

  var x: Int = 5
  var y: Int = 10

  x += 3
  println(x)

  x -=1
  println(x)

  y *= 5
  println(y)

  y /= 2
  println(y)


  println("###########################################")
  println("###########################################")
  println("###########################################") 
}
