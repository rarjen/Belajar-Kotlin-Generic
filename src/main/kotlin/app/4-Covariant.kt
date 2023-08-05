package app

import data.Covariant

fun main() {
    /*
    Covariant
    - Covariant artinya kita bisa melakukan subtitusi subtype (child) dengan supertype (parent)
    - Tidak semua jenis class generic yang mendukung covariant, hanya class generic yang menggunakan generic parameter
      type sebagai return type function
    - Artinya saat kita membuat object Contoh<String>, maka bisa disubtitusi menjadi Contoh<Any>
    - Untuk memberitahu bahwa generic parameter type tersebut adalah covariant, kita perlu menggunakan kata kunci out
     */


    val data1: Covariant<String> = Covariant("Otniel");
//    data1.data = "KEvin"; //error
    // Any adl parent class daru string
    val data2: Covariant<Any> = data1;
    println(data2.data());

//    data2.setData(100); // Ini tidak terlihat error krn Any merupakan parent dari semua data type
    // Namun kita sudah set any menjadi string jadi sangat berbahaya karena bisa menyebabkan error ditengah jalan saat program di eksekusi


    val data3: Covariant<Int> = Covariant(2);
    val data4: Covariant<Any> = data3;
    println(data4.data());


}