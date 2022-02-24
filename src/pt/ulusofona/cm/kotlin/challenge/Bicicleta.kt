package pt.ulusofona.cm.kotlin.challenge

class Bicicleta(identificador : String) : Veiculo(identificador), Movimentavel{
    override fun requerCarta(): Boolean {
        return false
    }
}