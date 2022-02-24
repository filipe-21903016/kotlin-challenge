package pt.ulusofona.cm.kotlin.challenge
import java.time.LocalDate
import java.util.Date
import java.util.stream.Stream

class Pessoa(var nome : String, var dataDeNascimento : Date)
{
    var veiculos = mutableListOf<Veiculo>()
    var carta : Carta? = null
    var posicao : Posicao? = null

    fun comprarVeiculo(veiculo : Veiculo) {
        this.veiculos.add(veiculo)
    }

    fun pesquisarVeiculo(identificador : String) : Veiculo? {
        /*if (veiculos.isNotEmpty())
        {
           return veiculos.stream().filter { identificador.equals(identificador) }.toList().firstOrNull()
        }*/
        return null
    }
    fun venderVeiculo(identificador: String, comprador : Pessoa) {
        // sell vehicle
        /*
        var veiculo = veiculos.stream().filter { identificador.equals(identificador) }.toList().firstOrNull()
        if (veiculo != null) {
            comprador.veiculos.add(veiculo)
        }
        this.veiculos.remove(veiculo)
         */
    }

    fun moverVeiculoPara(identificador: String, x : Int, y: Int)
    {
        //var veiculo = veiculos.stream().filter { identificador.equals(identificador) }.toList().firstOrNull()
        //veiculo?.posicao = Posicao(x, y)
    }

    fun temCarta(): Boolean {
        return this.carta != null
    }

    fun tirarCarta(){
        this.carta = null
    }
}