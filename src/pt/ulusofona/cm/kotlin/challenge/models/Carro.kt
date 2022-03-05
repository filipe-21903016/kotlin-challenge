package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoDesligadoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoLigadoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel

data class Carro(override val identificador : String, var motor : Motor) : Veiculo(identificador), Movimentavel,Ligavel
{
    override fun ligar() {
        motor.ligar()
    }
    override fun desligar() {
        motor.desligar()
    }

    override fun requerCarta(): Boolean {
        return true
    }

    override fun toString(): String {
        return "Carro | $identificador | ${DateFormatter.format(dataDeAquisicao)} | $posicao"
    }

}