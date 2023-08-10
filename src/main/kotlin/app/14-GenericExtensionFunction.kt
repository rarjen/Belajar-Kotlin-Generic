package app

class Data<T>(val data: T);

fun Data<String>.printData() {
    val string = this.data
    println("String value is $string");
}

fun Data<Int>.printNumber() {
    val number = this.data;
    println("The Number is $number");
}


// Jika nama function sama maka akan error krn pada binary code informasi generic <T> tidak di teruskan dan keduanya adalah ttp <Any>
fun main() {
    /*
    Generic Extension Function
    - Generic juga bisa digunakan pada extension function
    - Dengan begitu kita bisa memilih jenis generic parameter type apa yang bisa menggunakan extension function tersebut
     */

    var data1: Data<String> = Data<String>("Kevin");
    data1.printData();

    var data2: Data<Int> = Data<Int>(2);
    data2.printNumber()
//    data2.printData; //error

    /*
    Output:

    String value is Kevin
    The Number is 2
     */

}