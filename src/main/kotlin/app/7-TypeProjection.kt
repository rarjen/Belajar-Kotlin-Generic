package app

// Invariant
class Container<T>(var data: T);



// Dari Invariant (Jadi tidak bisa kita masukkan seperti ini)
fun copyContainer(from: Container<Any>, to: Container<in Any>) {
    to.data = from.data
}

// Kita paksa jadi covariant
fun copy(from: Container<out Any>, to: Container<Any>) {
    to.data = from.data
}

fun main() {
    /*
    Type Projection
    - Kadang agak sulit untuk membuat class generic type yang harus covariant atau contravariant, misal karena memang di
      class generic tersebut terdapat input dan output generic parameter type
    - Namun jika kita membuat function untuk memanipulasi data invariant sangat lah sulit, karena generic parameter
      type nya harus selalu sama
    - Kita bisa melakukan type projection, yaitu menambahkan informasi covariant atau contravariant di parameter function,
      ini memaksa isi function untuk melakukan pengecekan
    - Jika covariant, kita tidak boleh mengubah data generic di object
    - Jika contravariant, kita tidak boleh ngambil data generic object
     */


    val container1 = Container("Kevin");
    val container2 = Container("Leinto");

//    copyContainer(container1, container2); //error


    val container3 = Container("Otniel");
    val container4: Container<Any> = Container("Kevin");
    copy(container3, container4)

    println(container3.data)
    println(container4.data)

}