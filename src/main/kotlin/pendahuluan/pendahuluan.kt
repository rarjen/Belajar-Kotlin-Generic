package pendahuluan

// Kode Bukan Generic
class Data(val data: Any)

// Kode Generic
class DataGeneric<T>(val data: T);

fun main() {
    val dataString = Data("Otniel");
    val valueString: String = dataString.data as String // data harus manual di konversi
    println(valueString)

    val dataInt = Data(10);
    val valueInt: Int = dataInt.data as Int;
    println(valueInt)


    // Data Generic
    val genericString = DataGeneric<String>("Otniels");
    val valueGenericString: String = genericString.data;
    println(valueGenericString)

    val genericInt = DataGeneric<Int>(20);
    val valueGenericInt: Int = genericInt.data; // Otomatis dikonversi ke Tipe data yang diinginkan
    println(valueGenericInt);
}