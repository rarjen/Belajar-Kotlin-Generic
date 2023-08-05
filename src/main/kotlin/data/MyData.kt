package data


// Dengan Class Generic ini kita bisa menentukan tipe data yang kita suka
class MyData<T>(val firstData: T) {

    fun printData() {
        return println("Data is $firstData")
    }

    fun getData() : T {
        return firstData;
    }
}