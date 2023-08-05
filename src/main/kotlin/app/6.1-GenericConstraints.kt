package app

open class Employee;

class Manager : Employee();

class VicePresident : Employee();

class bukanTurunan;

// Ini sebenarnya constrainya any (T: Any)
class Perusahaan<T>(val employee: T);

// Jika ingin membatasi hanya kelas employee dan turunannya maka bis tambahkan T: Employee
class Company<T: Employee>(val employee: T)


fun main() {
    /*
    Generic Constraint
    - Kadang kita ingin membatasi data yang boleh digunakan di generic parameter type
    - Kita bisa menambahkan constraint di generic parameter type dengan menyebutkan tipe yang diperbolehkan
    - Secara otomatis, type data yang bisa digunakan adalah type yang sudah kita sebutkan, atau class-class turunannya
    - Secara default, constraint type untuk generic parameter type adalah Any, sehingga semua tipe data bisa digunakan
     */

    // Contoh tidak dibatasi
    val manager = Manager();
    val perusahaan = Perusahaan(manager);
    val perusahaan2 = Perusahaan(bukanTurunan()); // Ini bisa karena tidak dibatasi

    // Contoh dibatasi
    val company = Company(Manager());
    val company2 = Company(VicePresident());
    val company3 = Company(Employee());
//    val company4 = Company(bukanTurunan()); // error
//    val company5 = Company("String"); // error

}