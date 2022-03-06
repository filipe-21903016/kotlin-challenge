package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.AlterarPosicaoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoDesligadoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoLigadoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel

data class Carro(override val identificador : String, var motor : Motor) : Veiculo(identificador), Movimentavel,Ligavel
{
    override fun ligar() {
        if (estaLigado())
            throw VeiculoLigadoException("Veiculo já está ligado")
        motor.ligar()
    }
    override fun desligar() {
        if (!estaLigado())
            throw VeiculoDesligadoException("Veiculo já está desligado")
        motor.desligar()
    }

    override fun estaLigado(): Boolean {
        return motor.estaLigado()
    }

    override fun requerCarta(): Boolean {
        return true
    }

    override fun moverPara(x: Int, y: Int) {
        try {
            if (!estaLigado())
                ligar()
            posicao.alterarPosicaoPara(x,y)
            desligar()
        }catch (e : AlterarPosicaoException){
            desligar()
            throw e
        }
    }

    override fun toString(): String {
        return "Carro | $identificador | ${DateFormatter.format(dataDeAquisicao)} | $posicao"
    }

}