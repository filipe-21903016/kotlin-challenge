package pt.ulusofona.cm.kotlin.challenge

import java.time.LocalDate

abstract class Veiculo ( var identificador: String) : Movimentavel{
    var posicao : Posicao? = null
    var dataDeAquisicao : LocalDate? = null

    abstract fun requerCarta(): Boolean

    override fun moverPara(x:Int, y:Int){
        posicao = Posicao(x,y)
    }
}
