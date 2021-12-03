package data

import android.app.Person

class Tables {
    abstract class information{
        companion object{
            val _id = "id"
            val _nombre = "Name"
            val _Direccion = "Address"
            val _telefono = "Phone"
            val _correo = "Email"
            val TABLE_NAME = "Info"
            var persons: MutableList<Person> = ArrayList()
        }
    }

}
