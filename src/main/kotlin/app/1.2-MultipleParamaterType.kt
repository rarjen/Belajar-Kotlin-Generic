package app

import data.MyDataMultipleParam

typealias MyData<T, U> = MyDataMultipleParam<T, U>;

fun main() {
    /*
    Multiple Parameter Type
    - Parameter type di Generic type boleh lebih dari satu
    - Namun harus menggunakan nama type berbeda
    - Ini sangat berguna ketika kita ingin membuat generic parameter type yang banyak
     */

    val myData: MyData<String, Int> = MyData<String, Int>("Otniel", 22);
    myData.printData();
    println(myData.getData());
    println(myData.getSecond());

    val myData2 = MyData(10, "Indomie");
    myData2.printData()
    println(myData2.getData());
    println(myData2.getSecond());
}