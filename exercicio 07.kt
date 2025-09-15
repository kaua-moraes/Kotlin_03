fun main() {
    /*7 - Escreva um algoritmo para ler as notas de avaliações de um aluno,
    calcule e imprima a média (simples) desse aluno. Só devem ser aceitos
    valores válidos durante a leitura (0 a 10) para cada nota. São 6 notas ao total.
    Caso o valor informado para qualquer uma das notas esteja fora do limite
    estabelecido, deve ser solicitado um novo valor ao usuário.
     */

    var nota: Double
    var media: Double
    var soma = 0.0
    var contador = 1

    println("Digite as 6 notas: ")

    while (contador <= 6) {
        println("Nota $contador :")
        nota = readLine()!!.toDouble()

        if (nota >= 0 && nota <= 10) {
            soma += nota
            contador++
        } else {
            println("Nota Inválida! Digite um valor entre 0 e 10.")
        }
    }

    media = soma / 6
    println("Sua média é $media")

}