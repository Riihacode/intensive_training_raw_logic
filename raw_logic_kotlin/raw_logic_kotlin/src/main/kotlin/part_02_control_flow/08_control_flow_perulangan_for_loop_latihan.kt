package com.example.part_02_control_flow

const val MINGGU_PERTAMA: Int = 1

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

  fun main() {
    var bulanTerakhirMenabung: Int = 10
    val defaultSaving: Int = 10_000
    val iteration: IntProgression = MINGGU_PERTAMA.rangeTo(bulanTerakhirMenabung) step 1
    var currentSavingAccumulation: Int? = null
    var lastSavingAccumulation: Int? = null

    for (currentIteration in iteration) {
      if (currentSavingAccumulation == null) {
        currentSavingAccumulation = defaultSaving
        println("Total tabungan di minggu ke-$currentIteration: Rp $currentSavingAccumulation")
        continue
      }

      currentSavingAccumulation += currentIteration * defaultSaving
      println("Total tabungan di minggu ke-$currentIteration: Rp $currentSavingAccumulation")
    }

    if (lastSavingAccumulation == null) {
      lastSavingAccumulation = currentSavingAccumulation
      println("\nTotal tabungan selama $bulanTerakhirMenabung minggu = Rp $lastSavingAccumulation")
    } else {
      println("Error: lastSavingAccumulation =  $lastSavingAccumulation")
    }

    // Kode ini digunakan untuk mengecek hasil dari kode yang Anda buat
    //checkHasil(bulanTerakhirMenabung) // Hanya hapus kode ini jika kamu menggunakan Kotlin Playground
    
    // checkHasil(lastSavingAccumulation ?: 0)  // akan error karena di test-nya tidak mengecek hasil output dan hanya menjaga stabilitas sistem default
    checkHasil(bulanTerakhirMenabung)
  }
  
  fun expectedOutput() {
    for (output in listExpectedOutput) {
      println(output)
    }
  }

  fun checkHasil(bulanTerakhirMenabung: Int){
    if (bulanTerakhirMenabung != 10) errorLog.add("Tetapkan nilai variabel bulanTerakhirMenabung dengan nilai 10")

    var totalTabungan = 0
    
    for (i in 1..bulanTerakhirMenabung) {
      val tabunganMingguIni = i * 10_000
      totalTabungan += tabunganMingguIni
      listExpectedOutput.add("Total tabungan di minggu ke-$i: Rp $totalTabungan")
    }
    listExpectedOutput.add("\nTotal tabungan selama 10 minggu: Rp $totalTabungan\n")
  }

  fun check(){
    kotlin.io.println("Output program kamu:")
    main()

    if (errorLog.isNotEmpty()) {
      kotlin.io.println("\nStatus: Belum tepat ❌\n")
      kotlin.io.println("Alasan: ${errorLog.first()}")
      return
    }
    
    val status = if (listOutput.first().contentEquals(listExpectedOutput.first(), true)) "Berhasil ✅" else "Belum tepat ❌"

    kotlin.io.println("\nStatus: $status\n")
    
    if (status == "Belum tepat ❌") {
      kotlin.io.println("Expected Output:")
      expectedOutput()
    }
  }    
}
