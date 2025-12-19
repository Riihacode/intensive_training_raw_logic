package org.example.part_01_tipe_data

fun main() {
    /**
     * Byte     = size 8;  nilai minimal -128                               ; nilai maksimal 127
     * Short    = size 16; nilai minimal -32768                             ; nilai maksimal 32767
     * Int      = size 32; nilai minimal -2,147,483,648 (-2^31)             ; nilai maksimal 2,147,483,647 (2^31-1)
     * Long     = size 64; nilai minimal 9,223,372,036,854,775,808 (-2^63)  ; nilai maksimal 9,223,372,036,854,775,807 (2^63 - 1)
     */

    val byteNumber: Byte = 127
    print(byteNumber)

//    val byteNumber1: Byte = 129  // error
//    print(byteNumber)
    val byteNumber2: Byte = -128
    print("\n$byteNumber2\n")

    val shortMaxNumber: Short = 32767
    println("Nilai maksimal Short: $shortMaxNumber \n")

    val intMaxNumber: Int = 2147483647
    println("Nilai maksimal Int: $intMaxNumber \n")

    val longMaxNumber: Long = 9223372036854775807
    println("Nilai maksimal Long: $longMaxNumber \n")

    print("\n==================\n")

    // Khusus untuk long harus pakai L kalau tidak akan dianggap Int secara default
    val anotherIntNumber = 9
    println(anotherIntNumber)

    // Khusus untuk long harus pakai L
    val anotherLongNumber = 9L
    println(anotherLongNumber)

    print("\n==================\n")

    val floatNumber: Float = 3.4f
    println("Nilai Float: $floatNumber \n")

    val anotherFloatNumber = -3.4f
    println("Nilai Float: $anotherFloatNumber \n")

    val doubleNumber: Double = 0.0
    println("Nilai Double: $doubleNumber \n")

    val anotherDoubleNumber = -10.0
    println("Nilai Double: $anotherDoubleNumber \n")
}