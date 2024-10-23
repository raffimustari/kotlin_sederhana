import java.util.ArrayList

fun main() {
    val fruits = listOf(
        Pair("apel", 35000),
        Pair("jeruk", 50000),
        Pair("mangga", 25000),
        Pair("duku", 15000),
        Pair("semangka", 20000)
    )

    val cart = ArrayList<Pair<String, Int>>()

    while (true) {
        println("Menu:")
        println("1. Beli Buah")
        println("2. Lihat Struk")
        println("3. Keluar")
        print("Pilih menu: ")

        val choice = readLine()!!.toInt()

        when (choice) {
            1 -> {
                println("Daftar Buah:")
                fruits.forEachIndexed { index, fruit ->
                    println("${index + 1}. ${fruit.first} (Rp${fruit.second})")
                }

                print("Pilih buah (nomor): ")
                val fruitIndex = readLine()!!.toInt() - 1
                print("Jumlah: ")
                val quantity = readLine()!!.toInt()

                cart.add(Pair(fruits[fruitIndex].first, quantity))
                println("Anda telah memilih $quantity ${fruits[fruitIndex].first}")
            }
            2 -> {
                println("Struk Belanja:")
                cart.forEachIndexed { index, item ->
                    println("${index + 1}. ${item.first} x ${item.second} = Rp${fruits.find { it.first == item.first }!!.second * item.second}")
                }

                val total = cart.sumOf { fruits.find { it.first == it.first }!!.second * it.second }
                println("Total: Rp$total")

                // Tambahkan diskon atau fitur pembayaran di sini
            }
            3 -> {
                println("Terima kasih!")
                break
            }
            else -> {
                println("Pilihan tidak valid.")
            }
        }
    }
}