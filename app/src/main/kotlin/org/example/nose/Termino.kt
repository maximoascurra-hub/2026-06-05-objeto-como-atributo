package org.example.nose
class Termino(var escalar:Int=0,var grado:Int=0){
    override fun toString():String{
        return "${escalar}x^$grado"
    }
}