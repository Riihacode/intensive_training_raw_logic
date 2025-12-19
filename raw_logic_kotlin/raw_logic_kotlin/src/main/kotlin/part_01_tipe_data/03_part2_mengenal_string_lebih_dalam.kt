package org.example.part_01_tipe_data

fun main(){
    val test1 = Test()
    test1.check()
}

class Test {

    var listOutput = mutableListOf<String>()
    val listExpectedOutput = mutableListOf("Berkas tersebut telah berhasil disimpan di: C:\\Users\\Budi\\Documents")

    val errorList = mutableListOf<String>()

    fun println(input: String){
        listOutput.add(input)
        kotlin.io.println(input)
    }

    /**
     * Tambahkan nilai “C:\Users\Budi\Documents” pada variabel fileName, lalu gunakan variabel tersebut untuk menghasilkan tampilan yang diharapkan.
     *
     * HANYA KERJAKAN YANG INI, YANG LAINNYA HANYA UNTUK TESTING PENGECEKAN
     * JAWABAN AGAR HASILNYA ADALAH "Berkas tersebut telah berhasil disimpan di: C:\Users\Budi\Documents"
     *     \\: menambah karakter backslash ke dalam teks.
     *     \t: menambah tab ke dalam teks.
     *     \n: membuat baris baru di dalam teks.
     *     \$: menambahkan karakter dollar pada teks.
     */
    fun main() {
        var fileName: String
        fileName = "C:\\Users\\Budi\\Documents"
        println("Berkas tersebut telah berhasil disimpan di: $fileName")
    }

    fun expectedOutput() {
        for (output in listExpectedOutput) {
            println(output)
        }
    }

    fun check(){
        kotlin.io.println("Output program kamu:")
        main()

        val status = if (listOutput == listExpectedOutput)  "Berhasil ✅"  else "Belum tepat ❌"

        kotlin.io.println("\nStatus: $status\n")

        if (status == "Belum tepat ❌") {
            kotlin.io.println("Expected Output:")
            expectedOutput()
        }
    }
}