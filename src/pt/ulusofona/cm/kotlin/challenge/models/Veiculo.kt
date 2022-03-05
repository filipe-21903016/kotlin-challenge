package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.time.LocalDate

abstract class Veiculo (open val identificador: String) : Movimentavel {
    var posicao : Posicao = Posicao()
    var dataDeAquisicao : Date = Date.now()

    abstract fun requerCarta(): Boolean
    override fun moverPara(x:Int, y:Int){
        posicao.alterarPosicaoPara(x,y);
    }
}
