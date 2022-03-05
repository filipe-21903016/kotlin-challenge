package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.MenorDeIdadeException
import pt.ulusofona.cm.kotlin.challenge.exceptions.PessoaSemCartaException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoNaoEncontradoException
import java.time.LocalDate
import java.time.temporal.ChronoUnit

data class Pessoa(val nome: String, val dataDeNascimento: Date) {
    var veiculos = mutableListOf<Veiculo>()
    var carta: Carta? = null
    var posicao: Posicao = Posicao()

    fun comprarVeiculo(veiculo: Veiculo) {
        veiculo.dataDeAquisicao = Date.now()
        this.veiculos.add(veiculo)
    }


    fun pesquisarVeiculo(identificador: String): Veiculo {
        for (veiculo in veiculos) {
            if (identificador == veiculo.identificador)
                return veiculo
        }
        throw VeiculoNaoEncontradoException("Veiculo com identificador:$identificador não foi encontrado")
    }


    fun venderVeiculo(identificador: String, comprador: Pessoa) {
        val veiculo = pesquisarVeiculo(identificador)
        comprador.comprarVeiculo(veiculo)
        veiculos.remove(veiculo)
    }

    fun moverVeiculoPara(identificador: String, x: Int, y: Int) {
        if(!this.temCarta())
            throw PessoaSemCartaException("$nome não tem carta para conduzir o veículo indicado")
        val veiculo = pesquisarVeiculo(identificador)
        veiculo.moverPara(x, y)
    }

    fun temCarta(): Boolean {
        return carta != null
    }

    fun tirarCarta() {
        if (getIdade() < 18)
            throw MenorDeIdadeException("Necessita de 18 anos de idade para poder tirar a carta")
        else
            carta = Carta()
    }


    private fun getIdade(): Int {
        return ChronoUnit.YEARS.between(this.dataDeNascimento.data, LocalDate.now()).toInt()
    }

    override fun toString(): String {
        return "Pessoa | $nome | $dataDeNascimento | $posicao"
    }


}