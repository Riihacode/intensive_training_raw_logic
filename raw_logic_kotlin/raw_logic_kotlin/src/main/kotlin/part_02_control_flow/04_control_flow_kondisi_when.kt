package com.example.part_02_control_flow

fun main() {
  /**
   *  WHEN = subject, opsi nilai, dan statement
   */

  val scoreAnda: Int = 100
  var scoreCategory: Char? = null
  
  when(scoreAnda) {
    100 -> {
      println("MANTAP DAPAT TINGGI")
      scoreCategory = 'A'
    }
    70 -> {
      println("MANTAP SUDAH BAGUS")
      scoreCategory = 'B'
    }
    else -> {
      println("TENANG MASIH BISA DIPERBAIKI")
      scoreCategory = 'C'
    }
  }

  println("Score category anda adalah $scoreCategory")

  /*
   * ERROR MISSMATCH KARENA INI DIANGGAP BOOLEAN DAN BUKAN INT
   */
  /*    
  val scoreAnda: Int = 100
  var scoreCategory: Char? = null
  
  when(scoreAnda) {
    (71 >= 100) -> {
      println("MANTAP DAPAT TINGGI")
      scoreCategory = 'A'
    }
    (50 >= 70) -> {
      println("MANTAP SUDAH BAGUS")
      scoreCategory = 'B'
    }
    else -> {
      println("TENANG MASIH BISA DIPERBAIKI")
      scoreCategory = 'C'
    }
  }

  println("Score category anda adalah $scoreCategory")
  */

  println("\n\n")
  /**
   * MIRIP RENTANG IF ELSE
   */
  val scoreMiripIf: Int = 85
  var categoryScoreMiripIf: Char? = null

  when(scoreMiripIf) {
    in 71..100 -> {
      println("MANTAP SCORE SANGAT TINGGI")
      categoryScoreMiripIf = 'A'
    }
    in 51..70 -> {
      println("MANTAP SUDAH BAGUS")
      categoryScoreMiripIf = 'B'
    }
    in 0..50 -> {
      println("AMAN, ASALKAN NIAT BAGUS TIDAK MASALAH")
      categoryScoreMiripIf = 'C'
    }
    else -> {
      println("GAADA NILAI ITU")
    }
  }

  println("Kategori score anda adalah $categoryScoreMiripIf")


  println("=======================================")
  // WHEN-EXPRESSION
  val hariIni: String = "Senin"
  val aktivitasHariIni: String? = when(hariIni) {
    "Senin" -> "BEKERJA"
    "Sabtu" -> "Liburan"
    "Minggu"-> "Istirahat"
    else -> null
  }

  println("Aktivitas hari ini adalah $aktivitasHariIni")
}
