package pt.ulusofona.cm.kotlin.challenge
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoNaoEncontradoException
import pt.ulusofona.cm.kotlin.challenge.models.*

fun main(){
    var filipe : Pessoa = Pessoa("Filipe", Date("28-06-2000"))
    var motor = Motor(1000,500)
    var carro = Carro("KIT",motor)
    var maria : Pessoa = Pessoa("Maria", Date("23-04-2000"))
    filipe.comprarVeiculo(carro)
    println("Filipe comprou o carro")
    println("Veiculos Filipe:")
    for (veiculo in filipe.veiculos)
        println(" - $veiculo")

    filipe.venderVeiculo("KIT",maria)
    println("Filipe vendeu KIT")
    println("Veiculos Filipe:")
    for (veiculo in filipe.veiculos)
        println(" - $veiculo")
    println("")
    println("Veiculos Maria:")
    for (veiculo in maria.veiculos)
        println(" - $veiculo")

    maria.moverVeiculoPara("KIT",3,4)
    println("moveu veiculo")
    for (veiculo in maria.veiculos)
        println(" - $veiculo")
    maria.moverVeiculoPara("KIT",3,4)



}