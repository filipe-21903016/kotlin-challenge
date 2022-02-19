package pt.ulusofona.cm.kotlin.challenge

class Motor (var cavalos : Int, var cilindrada : Int) : Ligavel{
    var ligado : Boolean = false

    override fun ligar() {
        this.ligado = true
    }

    override fun desligar() {
        this.ligado = false
    }
}
