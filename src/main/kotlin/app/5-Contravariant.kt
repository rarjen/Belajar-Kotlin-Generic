package app

class Contravariant<in T> {
    fun sayHello(name: T) {
//        println("Hello $name");
        return println("Hello $name");
//        return name; // Error
    }

    // Error
//    fun getData(): T {
//        return data;
//    }
}

fun main() {
    /*
    Contravariant
    - Contravariant artinya kita bisa melakukan subtitusi supertype (parent) dengan subtype (child)
    - Tidak semua jenis class generic yang mendukung contravariant, hanya class generic yang menggunakan generic
      parameter type sebagai parameter function
    - Artinya saat kita membuat object Contoh<Any>, maka bisa disubtitusi menjadi Contoh<String>
    - Untuk memberitahu bahwa generic parameter type tersebut adalah covariant, kita perlu menggunakan kata kunci in
     */

    val dataAny: Contravariant<Any> = Contravariant();
    val dataString: Contravariant<String> = dataAny;
    val dataInt: Contravariant<Int> = dataAny;


    // Ini diperbolehkan karena Any masih menerima tipe data apa saja sehingga. Namun kita juga tidak bisa melakukan mengembalikan return data: T (data generic type nya)
    dataString.sayHello("Leinto");
    dataInt.sayHello(2);
}