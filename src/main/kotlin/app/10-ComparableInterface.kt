package app

import data.Fruit

/*
Materi Lain: (Materi Kotlin Generic selesai pada TypeErasure)
 */
fun main() {
    /*
    Comparable
    - Sebelumnya kita sudah tahu bahwa operator perbandingan == dan != akan menggunakan metode equals sebagai implementasinya.
    - Bagaimana dengan operator perbandingan lainnya? Seperti > >= < <= ?
    - Operator perbandingan tersebut bisa kita lakukan, jika object kita mewariskan interface generic Comparable
     */

    val fruit1 = Fruit("Apple", 100);
    val fruit2 = Fruit("Orange", 10);

    println(fruit1 > fruit2); //false
    println(fruit1 >= fruit2); //true
    println(fruit1 < fruit2); //false
    println(fruit1 <= fruit2); //true

}