package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel

data class Bicicleta(override val identificador : String) : Veiculo(identificador), Movimentavel {
    override fun requerCarta(): Boolean {
        return false
    }

    override fun toString(): String {
        return "Bicicleta | $identificador | ${DateFormatter.format(dataDeAquisicao)} | $posicao"
    }


}