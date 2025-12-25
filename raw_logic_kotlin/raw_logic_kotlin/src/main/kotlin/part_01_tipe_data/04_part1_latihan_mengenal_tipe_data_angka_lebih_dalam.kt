package org.example.part_01_tipe_data

fun main() {
  val test1 = Test()
  test1.check()
}

class Test {
  var listOutput = mutableListOf<String>()
	val listExpectedOutput = mutableListOf("Nilai rata-rata siswa: 73.63636363636364", "73.63636363636364")

  fun println(input: String){
    listOutput.add(input)
    kotlin.io.println(input)
  }

  /**
   *  TEMPAT MENULIS SOURCE CODE
   */
  fun main() {
    var totalNilai: Double = 700.00
    var jumlahMapel: Double = 11.00
    var bonusPerMapel: Double = 10.00
    var bufferInput: Double? = 0.00

    bufferInput = (totalNilai + jumlahMapel * bonusPerMapel) / jumlahMapel

    val nilaiRataRataSiswa: Double = bufferInput  
    println("Nilai rata-rata siswa: $nilaiRataRataSiswa")

    checkHasil(nilaiRataRataSiswa)
  }

  fun expectedOutput() {
    for (output in listExpectedOutput) {
      println(output)
    }
  }
    
  fun checkHasil(nilai: Int){
    listOutput.add(nilai.toString())
  }
    
  fun checkHasil(nilai: Double){
    listOutput.add(nilai.toString())
  }
    
  fun check(){
    kotlin.io.println("Output program kamu:")
    main()
      
    val status = if (listOutput == listExpectedOutput)  "Berhasil ✅"  else "Belum tepat ❌"
        
    kotlin.io.println("\nStatus: $status\n")
        
    if (status == "Belum tepat ❌") {
      kotlin.io.println("Expected Output:")
      expectedOutput()
    }
  }
}
