package app

import data.Function

fun main() {
    /*
    Generic Function
    - Generic parameter type tidak hanya bisa digunakan pada class atau interface
    - Kita juga bisa menggunakan generic parameter type di function
    - Generic parameter type yang kita deklarasikan di function, hanya bisa diakses di function tersebut, tidak bisa
      digunakan di luar function
    - Ini cocok jika kita ingin membuat generic function, tanpa harus mengubah deklarasi class
     */


    // Kode Program Generic 1
    val function = Function("Kevin");
    function.sayHello("Lei");
    function.sayHello(1);

    // Kode Program Generic 2
    function.sayHello<String>("Leinto");
    function.sayHello<Int>(22)

    function.sayGoodBye("Otniel", "Abiel");

    function.sayGoodBye("Otniel", 1);

    function.sayGoodBye(1, "Abiel");

}