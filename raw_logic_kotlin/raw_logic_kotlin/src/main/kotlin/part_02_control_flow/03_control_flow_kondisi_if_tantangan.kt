package com.example.part_02_control_flow

fun main(){
  val test1 = Test()
  test1.check()
}

class Test {

  var listOutput = mutableListOf<String>()
	val listExpectedOutput = mutableListOf("Tunggu sebentar, kantor akan segera buka")

  val errorLog = mutableListOf<String>()
    
  fun println(input: String){
    listOutput.add(input)
    kotlin.io.println(input)
  }
    
  fun main() {
    val openHours: Int  = 7
    val now: Int        = 7

    if (now > openHours) {  
      println("Kantor sudah buka")
    } else if (now == openHours) {
      println("Tunggu sebentar, kantor akan segera buka")
      checkHasil(openHours, now)
    } else {
      println("Saat ini kantor tutup")
    }
  }


  fun expectedOutput() {
    for (output in listExpectedOutput) {
      println(output)
    }
  }
    
  fun checkHasil(openHours: Int, now: Int){
    if (openHours != 7 || now != 7) errorLog.add("pastikan variabel openHours dan now sesuai dengan nilai yang ditetapkan")
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
