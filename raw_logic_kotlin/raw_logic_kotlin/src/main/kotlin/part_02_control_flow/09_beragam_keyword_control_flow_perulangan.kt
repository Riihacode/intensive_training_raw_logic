package com.example.part_02_control_flow

fun main() {
  /**
   *  BREAK
   *  keyword yang dapat digunakan ketika kita ingin menghentikan proses perulangan sebelum proses tersebut sepenuhnya selesai.keyword yang dapat digunakan ketika kita ingin menghentikan proses perulangan sebelum proses tersebut sepenuhnya selesai.
   */
  var nomorBarang: Int = 1
  while(nomorBarang <= 10) {
    println("Memproses barang nomor: $nomorBarang")

    if (nomorBarang == 6) {
      println("Barang rusak terdeteksi pada nomor $nomorBarang! Hentikan mesin ...")
      break
    }

    nomorBarang++
  }


  println("==============================================")
  /**
   * CONTINUE
   * elewatkan proses perulangan tertentu dan lanjut ke perulangan berikutnya. 
   */
  val jumlahHariDalamBulan: Int = 30
  for (tanggal in 1..jumlahHariDalamBulan) {
    if ((tanggal %2) == 0) {
      println("Terdeteksi tanggal genap: tanggal $tanggal")
      continue
    }

    println("Menghidupkan mesin pada tanggal ganjil: tanggal $tanggal")
  }
}
