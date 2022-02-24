package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.time.LocalDate

open abstract class Veiculo (identificador: String) : Movimentavel {
    var posicao : Posicao = Posicao()
    var dataDeAquisicao : LocalDate? = null

    abstract fun requerCarta(): Boolean
    override fun moverPara(x:Int, y:Int){
        posicao?.alterarPosicaoPara(x,y);
    }
}
