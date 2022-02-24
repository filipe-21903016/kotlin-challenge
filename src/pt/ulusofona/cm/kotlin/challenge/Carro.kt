package pt.ulusofona.cm.kotlin.challenge

class Carro(identificador : String, motor : Motor) : Veiculo(identificador), Movimentavel
{
    override fun requerCarta(): Boolean {
        return true
    }
}