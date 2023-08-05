package data

class Function(val name: String) {
    fun <T> sayHello(param: T) {
        println("Hello $param, My name is ${this.name}")
    }

    fun <T, U> sayGoodBye(param1 : T, param2: U) {
        println("Goodbye $param1 $param2, ${this.name} signing out!")
    }

}