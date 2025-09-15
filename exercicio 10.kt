fun main() {
    /*10 - Escreva um programa em que o usuário informe 10 valores e escreva
     quantos desses valores lidos estão entre os números 24 e 42 (incluindo
     os valores 24 e 42) e quantos deles estão fora deste intervalo.
     */

    var entre = 0
    var fora = 0
    var int: Int
    var valor: Int

    println("Digite 10 valores: ")

    for (int in 1..10) {
        println("Valor $int")
        valor = readLine()!!.toInt()

        if (valor >= 24 && valor <= 42) {
            entre++
        } else {
            fora++
        }
    }
    println("Entre: $entre")
    println("Fora: $fora")
}