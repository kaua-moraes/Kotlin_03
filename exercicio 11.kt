fun main() {
    /*11 - Escreva um programa para imprimir todas as tabuadas de 1 a N. N será informado pelo usuário.*/

    var number: Int
    var int: Int
    var conta: Int

    println("Digite até qual tabuada deseja ir? ")
    number = readLine()!!.toInt()

    if (number < 1) {
        println("Informe um número válido!")
    } else {
        println("Tabuada de 1 até $number")

        for (int in 1..number) {
            println("\nTabuada de $int")
            println("-------------")

            for (conta in 1..10) {
                println("$int x $conta = ${int * conta}")
            }
        }
    }
}