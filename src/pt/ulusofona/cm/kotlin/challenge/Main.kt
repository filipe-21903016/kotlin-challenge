package pt.ulusofona.cm.kotlin.challenge
import pt.ulusofona.cm.kotlin.challenge.models.*
import java.text.SimpleDateFormat
import java.util.logging.SimpleFormatter

fun main(){
    val f = SimpleDateFormat("dd-MM-yyyy")


    var filipe : Pessoa = Pessoa("Filipe", f.parse("28-06-2000"))
    var motor = Motor(1000,500)
    var carro = Carro("KIT",motor)
    var maria : Pessoa = Pessoa("Maria", f.parse("05-05-2004"))
    val bicla = Bicicleta("Bicla")


    maria.comprarVeiculo(carro)
    maria.tirarCarta()
    maria.moverVeiculoPara("KIT",1,4)
    maria.moverVeiculoPara("KIT",1,4)



}