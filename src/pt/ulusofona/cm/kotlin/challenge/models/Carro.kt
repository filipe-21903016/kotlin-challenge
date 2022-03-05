package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.time.format.DateTimeFormatter

data class Carro(override val identificador : String, var motor : Motor) : Veiculo(identificador), Movimentavel
{
    override fun requerCarta(): Boolean {
        return true
    }

    override fun toString(): String {
        return "Carro | $identificador | $dataDeAquisicao | $posicao"
    }


}