package app

interface CanSayHello{
    fun sayHello(name: String);
}

open class EmployeeWhere;

class ManagerWhere : EmployeeWhere();

class VicePresidentWhere : EmployeeWhere(), CanSayHello {
    override fun sayHello(name: String) {
        println("Hello $name, I'm the Vice President");
    }
}

class CompanyWhere<T>(val employee: T) where T : EmployeeWhere, T : CanSayHello;

fun main() {
    /*
    Where Keyword
    - Kadang kita ingin membatasi tipe data dengan beberapa jenis tipe data di generic parameter type
    - Secara default, hanya satu tipe data yang bisa digunakan untuk membatasi generic parameter type
    - Jika kita ingin menggunakan lebih dari satu tipe data, kita bisa menggunakan kata kunci where
     */

//    val data1 = CompanyWhere(EmployeeWhere()); // Error krn tidak bisa implementasi sayHello
//    val data2 = CompanyWhere(ManagerWhere()); // Error krn tidak bisa implementasi sayHello
    val data3 = CompanyWhere(VicePresidentWhere());
    data3.employee.sayHello("Otniel");

//    val data4 = CompanyWhere("String") // Error: Not an employee

}