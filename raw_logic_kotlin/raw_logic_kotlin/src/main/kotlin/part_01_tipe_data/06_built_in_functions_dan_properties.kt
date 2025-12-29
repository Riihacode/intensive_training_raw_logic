package com.example.part_01_tipe_data

fun main() {
  println("bedanya built in function dan properties bisa dilihat dari adanya tanda () atau tidak ada tanda tersebut")
  println("=============================")
  println("boleh pakai val")
  println("Built-In functions = ")
  
  var nameString: String = "namaku"
  nameString = "NAMAKU"
  println(nameString)

  var nameBuiltString: String = "namanya"
  println(nameBuiltString.uppercase())
  
  println("-----------------------------")
  
  println("Analogi manual yang salah dari dicoding")
  val scoreInt: Int = 70
  val scoreIntInDouble: Double = 80.0
  println(scoreIntInDouble)

  val anotherScoreInt: Int = 40
  println(anotherScoreInt.toDouble())

  println("=============================")
  println("Bulit-in Properties = ")
  var anotherName: String = "namaku"
  println(anotherName.length)

  println("Gabungan Built-In functions + Built-In Properties = ")
  var anotherNameFunctionsAndProperties: String = "Anaya"
  println("Namanya adalah ${anotherNameFunctionsAndProperties.uppercase()} yang berjumlah ${anotherNameFunctionsAndProperties.length} karakter huruf")

  println("=============================")
  println("LANJUTAN REFERENSI Built In Functions dan Properties = ")
  println("String   = https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/")
  println("Number   = https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-number/")
  println("Boolean  = https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/")
}
