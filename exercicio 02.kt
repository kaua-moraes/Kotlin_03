fun main() {
    /*2 - Escreva um algoritmo para ler 2 valores informados
     pelo usuário e enquanto o segundo valor informado for
     igual ou menor que ZERO, deve ser lido um novo valor,
      mas para a mesma variável. Ou seja, para o segundo valor
      não pode ser aceito o valor zero nem um valor negativo.
     */

    var num1 : Int
    var num2 : Int
    var result: Int

    println("Digite um número: ")
    num1 = readLine()!!.toInt()

    println("Digite outro número: ")
    num2 = readLine()!!.toInt()

    while (num2 <= 0) {
        println("Seu número é inválido! Digite novamente: ")
        num2 = readLine()!!.toInt()
    }

    result = num1 / num2
    println("A divisão de $num1 por $num2 é: $result")
}