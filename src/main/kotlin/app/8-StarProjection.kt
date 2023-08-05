package app

// Kita tidak peduli tipe datanya krn ingin mengambil panjangnya saja
// Dengan star projection kita bisa masukkan semua jenis tipe data apapun. Ex: Ada array int & array String
fun displayLength(array: Array<*>) {
    println("Length array is ${array.size}")
}

fun main() {
    /*
    Star Projection
    - Kadang ada kasus kita tidak peduli dengan generic parameter type pada object
    - Misal kita hanya ingin mengambil panjang data Array<T>, dan kita tidak peduli dengan isi data T nya
    - Jika kita mengalami kasus seperti ini, kita bisa menggunakan Star Projection
    - Star projection bisa dibuat dengan mengganti generic parameter type dengan karakter * (star, bintang)
     */

    val arrayInt = arrayOf(1, 2, 3, 4, 5, 6);
    val arrayString = arrayOf("Otniel", "Kevin", "Abiel");
    val arrayCampur = arrayOf("Otniel", 1, "Mantap", 200L);

    displayLength(arrayInt);
    displayLength(arrayString);
    displayLength(arrayCampur);
}