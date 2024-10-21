fun main() {
    println("masukan angka pertama: ")
    val angka1 = readLine()!!.toInt()

    println("Masukan angka kedua: ")
    val angka2 = readLine()!!.toInt()

    println("Masukan operator (+, -, *, /): ")
    val operator = readLine()!!

    val result = when (operator) {
        "+" -> angka1 + angka2
        "-" -> angka1 - angka2
        "*" -> angka1 * angka2
        "/" -> {
        }
        else -> {
            println("operator tidak ada Silakan masukan operator yang benar (+, -, *, /).")
            return
        }
    }
}