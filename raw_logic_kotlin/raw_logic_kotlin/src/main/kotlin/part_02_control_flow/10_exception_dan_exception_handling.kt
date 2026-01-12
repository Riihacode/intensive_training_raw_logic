package com.example.part_02_control_flow

fun main() {
  /*
   *  EXCEPTION HANDLING
   *  1. Untuk atasi program error tidak berhenti mendadak
   *  2. [IMPORTANT] Jika ada catch yang dideklarasikan yang tepat dengan error yang akan terjadi maka line program di bawahnya akan tetap dieksekusi
   *  3. [IMPORTANT] Jika ada catch yang dideklarasikan dan tidak ada yang tepat maka line program di bawahnya tidak akan dieksekusi
   */

  println("===========================================")
  println(" [EXCEPTION] ")
  /* 
   * Arithmetic exception error
   *
   */
  /*
  val errorValueA: Int = 6
  val errorValueB: Int = 0
  val errorResult: Int = errorValueA / errorValueB
  println(errorResult)
  */

  println("\n=========================================")
  // NumberFormatException
  /* 
  val errorNumberFormatFromString: String = "10.0"
  println(errorNumberFormatFromString.toInt())
  */

  println("\n=========================================")
  // NulPointerException
  /*
  val NPEValueA: String? = null
  val NPEValueB: String = NPEValueA!!
  println(NPEValueB)
  */

  println("===========================================")
  println(" [EXCEPTION-HANDLING]")
  // blok try-catch
  /*
  val valueExHandl: String? = null
  try {
    val valueExHandlError: String = valueExHandl!!
    println("valueHandlError")
  } catch (e: NullPointerException) {
    println("Nilai valueExHandl adalah null tapi dipaksa kalau tidak boleh null. Error: $e")
  }
  */

  println("============================================")
  // blok finally (opsional)
  /*
  val valueXFinallyA: String = "11.0"
  try {
    val valueXFinallyB: Int = valueXFinallyA.toInt()
    println(valueXFinallyB)
  } catch (e: NullPointerException) { // println tidak akan dieksekusi karena ini jenis NumberFormatException
    println("Error NullPointerException pada valueXFinallyB karena originalnya adalah 11.0. Error: $e")
  } finally {
    println("Program logout dan membersihkan memory")   // akan berhenti di sini karena crash-nya ada di sini
  }

  println("Proses selanjutnya akan dieksekusi ...")
  */
  
  println("============================================")
  // blok finally (opsional)
  val valueMultiCatchFinallyA: String = "11.0"
  try {
    val valueMultiCatchFinallyB: Int = valueMultiCatchFinallyA.toInt()
    println(valueMultiCatchFinallyB)
  } catch (e: NullPointerException) { // println tidak akan dieksekusi karena ini jenis NumberFormatException
    println("Error NullPointerException pada valueXFinallyB karena originalnya adalah 11.0. Error: $e")
  } catch (e: ArithmeticException) {
    println("Error ArithmeticException woy!! Error = $e")
  } /*catch (e: NumberFormatException) {
    println("[BENAR] Tebakan coding manual anda sebelum compile telah benar. Error = $e")
  }*/ finally {
    println("[Multi Catch Finally] Program logout dan membersihkan memory")   // akan berhenti di sini karena crash-nya ada di sini
  }

  println("Proses selanjutnya akan dieksekusi ...")

  println("===================================================================")
  println("[IMPORTANT] Ini hanya sebagian, dokumentasi EXCEPTION yang lengkap di sini \"https://kotlinlang.org/docs/exceptions.html\"")
}
