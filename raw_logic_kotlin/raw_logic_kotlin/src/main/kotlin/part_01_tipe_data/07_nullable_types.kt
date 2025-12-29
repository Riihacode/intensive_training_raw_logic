package com.example.part_01_tipe_data

fun main() {
  /**
   * VERSI NULL POINTER EXCEPTION
   */
  //val namaKu: String = null
  //println(namaku)

  // SAFE CALLS OPERATOR
  println("================================")
  val judul: String = "Belajar Kotlin" 
  var catatanBuku: String? = null
  var panjangCatatanBuku: Int? = catatanBuku?.length
  println("Buku $judul memiliki panjang catatan buku sebanyak $panjangCatatanBuku")

  catatanBuku = "GACOR WOY"
  panjangCatatanBuku = catatanBuku?.length
  println("Buku $judul memiliki panjang catatan buku sebanyak $panjangCatatanBuku")

  // Elvis operator
  println("===========================")
  val judul2: String = "Belajar kotlin language"
  var noteBuku: String? = null
  var panjangNoteBuku: Int? = noteBuku?.length ?: 0
  println("Buku berjudul \"$judul2\", memiliki panjang Note Buku yaitu $panjangNoteBuku")

  /*
   * JANGAN PAKAI INI
   * BERESIKO NULL POINTER EXCEPTION
   */
  val nameAssertionNoError: String? = "welcome"
  println(nameAssertionNoError!!.length)

  val nameAssertionError: String? = null
  println(nameAssertionError!!.length)    // Null Pointer Exception``
}
