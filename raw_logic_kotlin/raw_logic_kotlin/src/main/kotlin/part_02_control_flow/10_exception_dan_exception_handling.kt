package com.example.part_02_control_flow

fun main() {
  /*
   *  EXCEPTION HANDLING
   *  untuk atasi program error tidak berhenti mendadak
   */

  // Arithmetic exception error
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
  val NPEValueA: String? = null
  val NPEValueB: String = NPEValueA!!
  println(NPEValueB)
}
