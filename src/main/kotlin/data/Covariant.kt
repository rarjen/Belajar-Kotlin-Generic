package data


// Simple nya saat kita buat menjadi covarinat (out) maka kita hanya boleh buat function yang memiliki return T bukan menerima parameter T

// dan juga harus val, kalau var menandakan akan bisa diubah dan akan ada input. Ini tidak boleh
class Covariant<out T>(val data: T) {

    // Hanya boleh dipake return value bukan input data
    fun data() : T {
        return this.data;
    }

    // Error: Tidak boleh buat fun dengan input generic covariant
//    fun setData(param: T) {
//        this.data = param;
//    }
}