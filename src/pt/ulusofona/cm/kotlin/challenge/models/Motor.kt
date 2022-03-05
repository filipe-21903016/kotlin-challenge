package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoDesligadoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoLigadoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel

data class Motor (val cavalos : Int,val cilindrada : Int): Ligavel{
    var ligado : Boolean = false

    override fun ligar() {
        if (ligado)
            throw VeiculoLigadoException("Veiculo já se encontra ligado")
        ligado = true
    }

    override fun desligar() {
        if (!ligado)
            throw VeiculoDesligadoException("Veiculo já se encontra desligado")
        ligado = false
    }

    override fun estaLigado(): Boolean {
        return ligado
    }

    override fun toString(): String {
        return "Motor | $cavalos | $cilindrada"
    }

}
