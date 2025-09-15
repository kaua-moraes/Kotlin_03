fun main() {

    var valor1 : Int
    var valor2: Int
    var soma = 0
    var quantidade = 0

    println("Digite o primeiro valor: ")
    valor1 = readln().toInt()

    println("Digite o segundo valor: ")
    valor2 = readln().toInt()

    if (valor1 < valor2) {

        var int = valor1
        while (int <= valor2) {
            soma += int
            quantidade++
            int++
        }

        val media = soma.toDouble() / quantidade.toDouble()

        println("A média dos números entre $valor1 e $valor2 é: $media")
    } else {
        println("O primeiro valor deve ser menor que o segundo")
    }
}