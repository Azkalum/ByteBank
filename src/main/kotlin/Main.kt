fun main() {
    println("Bem Vindo ao ByteBank!")

    val contaRenan = Conta(titular = "Renan", numero = 1000)
    contaRenan.deposita(200.0)

    val contaFran = Conta(numero = 1001, titular = "Fran")
    contaFran.deposita(300.0)

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

    println("Transferencia da Conta da Fran para a conta do Renan")

    if (contaFran.transfere(valor = 300.0, destino = contaRenan)) {
        println("Transferência efetuada")
    } else {
        println("Falha na transferência")
    }

    println(contaFran.saldo)
    println(contaRenan.saldo)

}

class Conta(
    var titular: String,
    val numero: Int
) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) {
            saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}

//    fun getSaldo(): Double{
//        return saldo
//    }
//
//    fun setSaldo(valor: Double) {
//        if(valor > 0){
//            saldo = valor
//
//        }
//    }


fun testacopiasEReferencias() {

    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = Conta(titular = "João", numero = 1002)

    var contaMaria = Conta(titular = "Maria", numero = 1003)

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