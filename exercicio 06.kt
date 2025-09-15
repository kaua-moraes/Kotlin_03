fun main() {
    /*6 - Escreva um programa para ler 2 notas de um aluno, calcular e imprimir a média final.
    Considere que a nota de aprovação é 9,5. Logo após escrever a mensagem "Calcular a média de
    outro aluno Sim/Não?" e solicitar um resposta. Se a resposta for "S", o programa deve ser
    executado novamente, caso contrário deve ser encerrado exibindo a quantidade de alunos aprovados.
     */
    var nota1: Double
    var nota2: Double
    var media: Double
    var aprovado = 0
    var resposta: String

    do {
        print("Digite a primeira de nota: ")
        nota1 = readLine()!!.toDouble()

        print("Digite a segunda nota: ")
        nota2 = readLine()!!.toDouble()

        media = (nota1.toDouble() + nota2.toDouble()) / 2

        println("media = $media")

        if (media >= 9.5) {
            println("Aluno aprovado!")
            aprovado++
        } else {
            println("Aluno reprovado!")
        }

        print("Deseja calcular a média de outro aluno S/N?")
        resposta = readLine()!!.toString()

    }
    while (resposta == "S" || resposta == "s")

    print("Alunos aprovados $aprovado")
}