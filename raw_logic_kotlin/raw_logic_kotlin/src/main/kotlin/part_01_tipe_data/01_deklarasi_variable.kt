package org.example.part_01_tipe_data

fun main() {
    /**
     * Intinya ada var dan val
     * tipe data = String, Int, Double, Float,
     */
//    var nameVar0: String // error
//    print(nameVar0)

    var nameVar: String
    nameVar = "Belajar var"
    print(nameVar + "\n")

    val nameVal: String
    nameVal = "Belajar val"
    print(nameVal + "\n")

    print("\n=================\n")

    var nameVar1: String = "Belajar var 1"
    print(nameVar1 + "\n")

    val nameVal1: String = "Belajar val 1"
    print(nameVal1 + "\n")

    print("\n==================\n")

    var nameVar2: String? = null    // tanda tanya artinya adalah nullable type
    print(nameVar2 + "\n")

    val nameVal2: String? = null
    print(nameVal2 + "\n")

    print("\n==================\n")

    var nameVar3: String? = null
    nameVar3 = "Belajar var 3"
    print(nameVar3 + "\n")

    // Error (tidak boleh)
//    val nameVal3: String? = null
//    nameVal3 = "Belajar val 3"
//    print(nameVal3 + "\n")

    print("\n==================\n")

    var numberVar: Int
    numberVar = 1
    print("$numberVar \n")

    val numberVal: Int
    numberVal = 1
    print("$numberVal \n")

    print("\n==================\n")

    var numberVar1: Int? = null
    numberVar1 = 1
    print("$numberVar1 \n")

//    val numberVal1: Int? = null // erorr
//    numberVal1 = 1

    print("\n==================\n")

    var numberVar2: Int?
    numberVar2 = 1
    print("$numberVar2 \n")

    print("\n==================\n")

//    var booleanVar: Boolean  // error dan harus diinisialisasi
//    print(booleanVar)
    var booleanVar: Boolean
    booleanVar = true
    print("booleanVar\n")

    val booleanVal: Boolean
    booleanVal = false
    print(booleanVal)

    print("\n====================\n")

    var charVar: Char
    charVar = 'a'
    print("$charVar \n")

    print("\n==================\n")
    /**
     * ON-GOING
     * SISANYA BESOK-BESOK (GA KEJAR PERFEKSIONIS)
     */
}