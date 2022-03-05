package pt.ulusofona.cm.kotlin.challenge
import pt.ulusofona.cm.kotlin.challenge.models.*
import java.text.SimpleDateFormat
import java.util.logging.SimpleFormatter

fun main(){
    val f = SimpleDateFormat("dd-MM-yyyy")


    var filipe : Pessoa = Pessoa("Filipe", f.parse("28-06-2000"))
    var motor = Motor(1000,500)
    var carro = Carro("KIT",motor)
    var maria : Pessoa = Pessoa("Maria", f.parse("23-04-2002"))
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


    maria.moverPara(1,1)
    maria.moverPara(1,1)



}