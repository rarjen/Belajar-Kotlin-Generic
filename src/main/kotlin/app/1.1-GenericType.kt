package app

import data.MyData

fun main() {
    /*
    Generic Type
    - Generic type adalah class atau interface yang memiliki parameter type
    - Tidak ada ketentuan dalam pembuatan generic parameter type, namun biasanya kebanyakan orang menggunakan 1 karakter
      sebagai generic parameter type
    - Nama generic parameter type yang biasa digunakan adalah :
        -> E - Element (biasa digunakan di collection atau struktur data)
        -> K - Key
        -> N - Number
        -> T - Type
        -> V - Value
        -> S,U,V etc. - 2nd, 3rd, 4th types
     */

    val myData: MyData<Int> = MyData<Int>(10);
    myData.printData();
    myData.getData();

    val myData2 = MyData("Kevin");
    myData2.printData();
    myData2.getData();
}