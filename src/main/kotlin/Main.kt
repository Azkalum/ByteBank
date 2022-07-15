fun main() {
    println("Bem Vindo ao ByteBank!")
    val contaRenan = Conta()

    contaRenan.titular = "Renan"
    contaRenan.numero = 1000
    contaRenan.saldo = 200.0

    val contaFran = Conta()

    contaFran.titular = "Fran"
    contaFran.numero = 1001
    contaFran.saldo = 300.0

    println(contaRenan.titular)
    println(contaRenan.numero)
    println(contaRenan.saldo)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println("Depositando na conta do Renan")
    contaRenan.deposita(50.0)
    println(contaRenan.saldo)

    println("Depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println("Sacando a conta do Renan")
    contaRenan.saca(250.0)
    println(contaRenan.saldo)

    println("Sacando a conta da Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)

    println("Saque em Excesso na conta do Renan")
    contaRenan.saca(100.0)
    println(contaRenan.saldo)

    println("Saque em Excesso na conta da Fran")
    contaFran.saca(500.0)
    println(contaFran.saldo)

}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0

    fun deposita(valor: Double){
        this.saldo += valor
    }

    fun saca(valor: Double){
        if(this.saldo >= valor){
            saldo -= valor
        }
    }

}

fun testacopiasEReferencias(){

    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = Conta()
    contaJoao.titular = "João"

    var contaMaria = Conta()
    contaMaria.titular = "Maria"
    contaJoao.titular = "João"

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)

}

fun testaLacos() {

    var i = 0
    while (i < 5) {

        val titular = "Renan $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = i + 10.0

        println("Titular: $titular")
        println("Número da conta $numeroConta")
        println("Saldo da conta: $saldo")
        println()
        i++

    }

fun testaCondicoes(saldo: Double) {

    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta é negativa")
    }

}
}