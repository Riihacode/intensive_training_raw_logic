package org.example.part_01_tipe_data

fun main() {
    var name: String = "Budi"
    print("Namanya adalah " + name + "\n")

    print("\n==================\n")

    val name1: String = "Budi"
    val location1: String = "Yogyakarta"
    print("Si $name1 sedang berada di $location1 \n")

    print("\n==================\n")

    val name2: String = "Budi"
    val hobby2: String = "Sepakbola"
    print("Si $name2 yang hobby $hobby2 mengatakan \"berlatihlah secukupnya!\" \n")

    print("\n==================\n")

    val menu: String = "==== [MENU] =====\n1. Nasi Goreng \"GACOR\" \n2. Mie Goreng\n3. Nasi Padang"
    print(menu)

    print("\n\n==================\n")

    // tidak tercetak "GGWP"
    val menu1: String = """
        === [ Menu ] ===
         1. Nasi \"GGWP\"       
         2. Mie Goreng
         3. Nasi Bungkus
    """.trimIndent()

    print(menu1)

    print("\n==================\n")

    val menu2: String = """
        === [ Menu ] ===
         1. Nasi GGWP       
         2. Mie Goreng
         3. Nasi Bungkus
    """.trimIndent()

    print(menu2)

    print("\n\n==================\n")

    val menu3: String = """
        === [ Menu ] ===
         1. Nasi \"GGWP"\       
         2. Mie Goreng
         3. Nasi Bungkus
    """.trimIndent()

    println(menu3)
}