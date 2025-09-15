fun main() {
    /*Faça um algoritmo que calcule e escreva a média
    aritmética dos números inteiros entre 15 (inclusive) e 100 (inclusive).*/

    var soma : Int = 0
    var numero : Int
    var quantidade : Int = 0
    var media : Double = 0.0

    for (numero in 15..100) {
        soma += numero
        quantidade ++
    }

    media = soma.toDouble() / quantidade.toDouble()

    println("A média dos números é: $media")

}