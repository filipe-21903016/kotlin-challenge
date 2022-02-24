package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel

data class Motor (val cavalos : Int,val cilindrada : Int) : Ligavel {
    var ligado : Boolean = false

    override fun ligar() {
        this.ligado = true
    }
    override fun desligar() {
        this.ligado = false
    }
    override fun toString(): String {
        return "Motor | $cavalos | $cilindrada"
    }


}
