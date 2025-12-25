package org.example.part1_01_tipe_data

fun main() {
  val angka1 = 20
  val angka2 = 5
  val angka3 = 2

  println("###########################################") 
  println("OPERATOR ARITMATIKA DASAR")
  //penjumlahan
  val hasilPenjumlahan = angka1 + angka2
  println(hasilPenjumlahan)

  val hasilPengurangan = angka1 - angka2
  println(hasilPengurangan)

  val hasilPembagian = angka1 / angka2
  println(hasilPembagian)

  val hasilPerkalian = angka1 * angka2
  println(hasilPerkalian)

  val hasilPembagianPecahan = angka1 % angka2
  println(hasilPembagianPecahan)

  println("###########################################")
  println("Pembuktian operator dengan kurung")
  
  val hasilTanpaKurung = angka1 + angka2 *angka3
  println(hasilTanpaKurung)

  val hasilDenganKurung = (angka1 + angka2) * angka3
  println(hasilDenganKurung)

  val hasilLain = angka1 / angka2 + angka2 * angka3
  println(hasilLain)

  println("###########################################")
  println("###########################################")
  println("###########################################")
   
  println("increment decrement")
  
  var score = 10
  score = score +  1
  println(score)

  var scoreIncrement = 10
  scoreIncrement++
  println(scoreIncrement)


  var score2 = 10
  score2 = score2 - 1
  println(score2)

  var score2Decrement = 10
  score2Decrement--
  println(score2Decrement)


  println("###########################################")
  println("###########################################")
  println("###########################################")
  println("Augmented Assignment Operator")

  var a = 5
  var b = 10
  
  a++
  println(a)

  b--
  println(b)

  var x = 5
  var y = 10

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
