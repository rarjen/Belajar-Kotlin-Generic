package data

class MyDataMultipleParam<T, U>(val firstData: T, val secondData: U) {
    fun printData() {
        return println("Data is $firstData $secondData")
    }

    fun getData() : T {
        return firstData;
    }

    fun getSecond() : U {
        return secondData;
    }
}