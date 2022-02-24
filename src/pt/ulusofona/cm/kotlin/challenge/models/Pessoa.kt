package pt.ulusofona.cm.kotlin.challenge.models
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Date

data class Pessoa(val nome : String, val dataDeNascimento : LocalDate)
{
    var veiculos = mutableListOf<Veiculo>()
    var carta : Carta? = null
    var posicao : Posicao = Posicao()

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

    override fun toString(): String {
        return "Pessoa | $nome | ${dataDeNascimento.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))
            .toString()} | " + posicao.toString()
    }


}