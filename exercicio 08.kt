fun main() {
    /* Ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive)
   e N (inclusive). Considere que o N será sempre maior que ZERO.*/

    var number: Int
    var int: Int

    println("Digite um número: ")
    number = readLine()!!.toInt()

    if (number <= 0) {
        println("Tente novamente!")
    } else {
        println("Números de 1 até $number")

        for (int in 1..number) {
            println(int)
        }

    }


}