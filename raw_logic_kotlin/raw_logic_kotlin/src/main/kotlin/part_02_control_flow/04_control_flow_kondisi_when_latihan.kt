package com.example.part_02_control_flow

fun main(){
    val test1 = Test()
    test1.check()
}

class Test {

    var listOutput = mutableListOf<String>()
	  val listExpectedOutput = mutableListOf("Plat DK adalah plat kendaraan untuk daerah Bali")

    val errorLog = mutableListOf<String>()
    
    fun println(input: String){
        listOutput.add(input)
        kotlin.io.println(input)
    }
    
    /**
     * YANG DIISI
     */
    fun main() {
        val platKendaraan: String
        val inputPlatKendaraan: String

        inputPlatKendaraan = "DK"

        /*
        platKendaraan = when(inputPlatKendaraan) {
          "DK"  -> "Plat $inputPlatKendaraan adalah plat kendaraan untuk daerah Bali"
          "A"   -> "Plat $inputPlatKendaraan adalah plat kendaraan untuk daerah Banten"
          "K"   -> "Plat $inputPlatKendaraan adalah plat kendaraan untuk daerah Surabaya"
          "DM"  -> "Plat $inputPlatKendaraan adalah plat kendaraan untuk daerah Gorontalo"
          else  -> "Program belum mengetahui plat kendaraan tersebut"
        }
        */
        when(inputPlatKendaraan) {
          "DK"  -> {
            println("Plat $inputPlatKendaraan adalah plat kendaraan untuk daerah Bali")
          }
          "A"   -> {
            println("Plat $inputPlatKendaraan adalah plat kendaraan untuk daerah Banten")
          }
          "K"   -> {
            println("Plat $inputPlatKendaraan adalah plat kendaraan untuk daerah Surabaya")
          }
          "DM"  -> {
            println("Plat $inputPlatKendaraan adalah plat kendaraan untuk daerah Gorontalo")
          }
          else  -> { 
            println("Program belum mengetahui plat kendaraan tersebut") 
          }
        }

        platKendaraan = inputPlatKendaraan

        // Kode ini digunakan untuk mengecek hasil dari kode yang Anda buat
        checkHasil(platKendaraan) // Hanya hapus kode ini jika kamu menggunakan Kotlin Playground
    }
    
    fun expectedOutput() {
        for (output in listExpectedOutput) {
            println(output)
        }
    }
    
    fun checkHasil(platKendaraan: String){
        if (platKendaraan != "DK") errorLog.add("pastikan variabel platKendaraan sesuai dengan nilai yang ditetapkan")
    }
    
    fun check(){
        kotlin.io.println("Output program kamu:")
        main()
        
        if (errorLog.isNotEmpty()) {
            kotlin.io.println("\nStatus: Belum tepat ❌\n")
            kotlin.io.println("Alasan: ${errorLog.first()}")
            return
        }
        
        val status = if (listOutput == listExpectedOutput)  "Berhasil ✅"  else "Belum tepat ❌"
        
        kotlin.io.println("\nStatus: $status\n")
        
        if (status == "Belum tepat ❌") {
            kotlin.io.println("Expected Output:")
            expectedOutput()
        }
    }    
}
