package org.example.nose
import org.example.nose.Fecha
class Persona (private var nombre: String, private var apellido: String, private var registro: Fecha=Fecha(6, 7, 2067)){
    override fun toString(): String{
        return "$nombre, $apellido, $registro"
    }
}