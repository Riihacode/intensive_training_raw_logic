package com.example.part_02_control_flow

fun main(){
  val test1 = Test()
  test1.check()
}

class Test {

  var listOutput = mutableListOf<String>()
	val listExpectedOutput = mutableListOf<String>()

  val errorLog = mutableListOf<String>()
    
  fun println(input: String){
    listOutput.add(input)
    kotlin.io.println(input)
  }
  
  /*
  fun main() {
    var stockMinuman: Int = 10
    val finalStockMinuman: Int
    var isEmpty: Boolean = false
        
    do {
      while(stockMinuman >= 0) {
        println("Memeriksa sistem...")
            
        if (stockMinuman == 0) {
          println("Stok habis. Mesin berhenti beroperasi.\n")
          isEmpty = true
          break
        } else if (stockMinuman >= 1) { 
          println("Stok Minuman: $stockMinuman")
          println("Mengeluarkan 1 minuman...\n")
          stockMinuman--
        } else {
          println("Unknown")
        }
      }
      
    } while(!isEmpty)

    // Kode ini digunakan untuk mengecek hasil dari kode yang Anda buat
    checkHasil(stockMinuman) // Hanya hapus kode ini jika kamu menggunakan Kotlin Playground
  }
   */
  fun main() {
    var stockMinuman = 0      // ← KONDISI YANG DIUJI
    var isEmpty = false
    
    /*
    do {
        while (stockMinuman >= 0) {
            println("Memeriksa sistem...")

            if (stockMinuman == 0) {
                //println("Stok habis. Mesin berhenti beroperasi.")
                println("Stok habis. Mesin berhenti beroperasi.\n")
                isEmpty = true
            } else {
              println("Stok minuman: $stockMinuman\n")
              println("Mengeluarkan 1 minuman...\n\n")
            }

            stockMinuman--
        }
    } while (!isEmpty)
    */

    // [ SUCCESS ]
    do {
      //println("Memeriksa sistem...")   // ← SATU KALI (lakukan dulu)

      while (stockMinuman >= 0) {
        //if (stockMinuman == 0) {
            //println("Memeriksa sistem...")  
            //println("Stok habis. Mesin berhenti beroperasi.\n")
            println(
                "Memeriksa sistem...\n" +
                "Stok habis. Mesin berhenti beroperasi.\n"
            )
            isEmpty = true
            break
        //}
      }

    } while (!isEmpty)


    // verifikasi
    checkHasil(stockMinuman)
  } 

    
  fun expectedOutput() {
    for (output in listExpectedOutput) {
      println(output)
    }
  }

  fun checkHasil(stock: Int){
    var stockMinuman = stock
    var output = StringBuilder()

    while (stockMinuman >= 0) {
      output.append("Memeriksa sistem...\n")

      if (stockMinuman == 0) {
        output.append("Stok habis. Mesin berhenti beroperasi.\n")
      } else {
        output.append("Stok minuman: $stockMinuman\n")
        output.append("Mengeluarkan 1 minuman...\n\n")
      }

      stockMinuman--
    }
    listExpectedOutput.add(output.toString())
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
