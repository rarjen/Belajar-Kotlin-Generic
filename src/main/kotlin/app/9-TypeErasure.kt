package app

class TypeErasure<T>(param: T) {
    private val data: T = param
    fun getData(): T = data;
}

fun main() {
    /*
    Type Erasure
    - Type erasure adalah proses pengecekan generic pada saat compile time, dan menghiraukan pengecekan pada saat runtime
    - Type erasure menjadikan informasi generic yang kita buat akan hilang ketika kode program kita telah di compile
      menjadi binary file
    - Compiler akan mengubah generic parameter type menjadi tipe Any (atau Object di Java)
     */

    val data1 = TypeErasure("Otniel");
    val name = data1.getData();
    println(name)

    /*
    Problem Type Erasure
    - Karena informasi generic hilang ketika menjadi binary file
    - Oleh karena itu, konversi tipe data generic akan berbahaya jika dilakukan scr tidak bijak
     */

    // Kita konversi data1 ke Integer (Tidak terjadi error)
    val data2: TypeErasure<Int> = data1 as TypeErasure<Int>
//    val number = data2.getData(); // error konversi runtime: Kita memaksa menjadi integer sedangkan TypeErasure nya adl object
//    println(number);

}