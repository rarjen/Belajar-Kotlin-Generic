package app

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class StringLogReadWriteProperty(var data: String) : ReadWriteProperty<Any, String> {
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        println("Get property ${property.name} with value $data");
        return  data;
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: String) {
        println("Set property ${property.name} from $data to $value");
        data = value;

    }
}

class Person(param: String) {
    var name: String by StringLogReadWriteProperty(param);
}

fun main() {
    /*
    Read Write Property Interface
    - Selain ReadOnlyProperty, kita juga menggunakan interface generic ReadWriteProperty sebagai delegate
    - ReadWriteProperty bisa digunakan untuk variable var (mutable)
     */

    val person = Person("Otniel");
    println(person.name);
    println(person.name);

    person.name = "Kevin";
    println(person.name);

    /*
    Output:
    Get property name with value Otniel
    Otniel
    Get property name with value Otniel
    Otniel
    Set property name from Otniel to Kevin
    Get property name with value Kevin
    Kevin
     */
}