package com.example.part_01_tipe_data

fun main() {
  // SAFE CALLS OPERATOR
  val judul: String = "Belajar Kotlin" 
  var catatanBuku: String? = null
  var panjangCatatanBuku: Int? = catatanBuku?.length
  println("Buku $judul memiliki panjang catatan buku sebanyak $panjangCatatanBuku")

  catatanBuku = "GACOR WOY"
  panjangCatatanBuku = catatanBuku?.length
  println("Buku $judul memiliki panjang catatan buku sebanyak $panjangCatatanBuku")
}
