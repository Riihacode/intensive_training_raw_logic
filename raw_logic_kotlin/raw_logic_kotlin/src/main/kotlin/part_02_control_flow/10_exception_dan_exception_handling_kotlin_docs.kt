package com.example.part_02_control_flow

fun main() {
  // arithmethic exception 
  // numberformat exception
  // null pointer exception

  // throw exception
  /* Throwing an exception indicates that an unexpected runtime error has occurred in the code. 
   * Exceptions are objects, and throwing one creates an instance of an exception class
   * bisa langsung sperti ini di fun main():
   *    throw IllegalArgumentException()
   */
  //throw IllegalArgumentException()
  val userInput: Int = -1
  //val cause: String = IllegalArgumentException("Original cause: illegal state")
  val cause: IllegalArgumentException = IllegalArgumentException("Original cause: illegal state")
  if(userInput < 1) {
    throw IllegalArgumentException("Input must be non negative", cause)
  }
}
