package app

import kotlin.properties.Delegates
import kotlin.properties.ObservableProperty
import kotlin.reflect.KProperty

class LogObservableProperty<T>(data: T) : ObservableProperty<T>(data) {
    override fun beforeChange(property: KProperty<*>, oldValue: T, newValue: T): Boolean {
        println("Before change ${property.name} value from $oldValue to $newValue");
        return true;
    }

    override fun afterChange(property: KProperty<*>, oldValue: T, newValue: T) {
        println("After change ${property.name} value from $oldValue to $newValue");
    }
}

class Car(brand: String, year: Int) {
    var brand: String by LogObservableProperty<String>(brand);
    var year : Int by LogObservableProperty<Int>(year);

    // Contoh delegates object (Bisa digunakan saat kita malas buat class yang sangat panjang diatas :v)
    var owner : String by Delegates.notNull<String>()
    var description: String by Delegates.vetoable("Description"){ property, oldValue, newValue ->
        println("Before change ${property.name} value from $oldValue to $newValue");
        true
    };
    var other: String by Delegates.observable("Other"){property, oldValue, newValue ->
        println("After change ${property.name} value from $oldValue to $newValue");
    }
}

fun main() {
    /*
    Observable Property Class
    - Generic interface delegate yang sebelumnya kita gunakan (ReadOnlyProperty dan ReadWriteProperty) kita perlu
      mengatur value datanya secara manual
    - Kadang kita hanya butuh melakukan sesuatu sebelum dan setelah data nya diubah
    - Untuk kasus seperti ini, kita bisa menggunakan generic class ObservableProperty
     */

    val car = Car("Toyota", 2019);
    println(car.brand);
    println(car.year)
    car.brand = "Wuling";
    car.year = 2020;
    println(car.brand);
    println(car.year);

    /*
    Output:

    Toyota
    2019
    Before change brand value from Toyota to Wuling
    After change brand value from Toyota to Wuling
    Before change year value from 2019 to 2020
    After change year value from 2019 to 2020
    Wuling
    2020
     */

    /*
    Object Delegates
    - Delegates.notNull() -> ReadWriteProperty yg nilai awal bisa null, namun error jika masih null
    - Delegates.vetoable(value, beforeChange) -> ObservableProperty dengan beforeChange
    - Delegates.observable(value, afterChange) -> ObservableProeprty deengan afterChange
     */

    car.owner = "Kevin"
    println(car.owner); //error daat running

    car.description = "This is description";
    println(car.description);

    car.other = "This is other";
    println(car.other);

    /*
    Output:

    Before change description value from Description to This is description
    This is description
    After change other value from Other to This is other
    This is other
     */
}