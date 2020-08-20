package br.com.touchtec.Polimorfismo

/**
 * Implemente os seguintes métodos:
 *
 * 1) Na classe Montador implemente o método fazerTarefa(String instrucao), que imprime a seguinte frase:
 *      "Montagem realizada com a seguinte instrucao: (INSIRA A INSTRUCAO PASSADA AQUI)" e que depois chama o fazerTarefa() da
 *      classe pai Funcionario
 * 2) Na classe Empacotador implemente o método fazerTarefa(String instrucao, String tipoEmbalagem), que imprime a seguinte frase:
 *      "Item embalado com a embalagem: (Imprimir o tipoEmbalagem aqui)"
 *      Depois chame o fazerTarefa(String instrucao) da classe pai Funcionario
 *
 * No final utilize os métodos criados para realizar as tarefas comentadas no final
 */

class Funcionario {
    Boolean realizouTarefa

    Boolean getRealizouTarefa() {
        return realizouTarefa
    }

    void setRealizouTarefa(Boolean realizouTarefa) {
        this.realizouTarefa = realizouTarefa
    }

    String fazerTarefa() {
        this.setRealizouTarefa(true)
        return "Tarefa Feita!"
    }

    String fazerTarefa(String instrucao) {
        println("Realizou a tarefa seguindo a instrucao:" + instrucao)
        return this.fazerTarefa()
    }
}

class Montador extends Funcionario {

    String fazerTarefa(String instrucao) {
        println("Realizou a tarefa seguindo a instrucao:" + instrucao)
        return super.fazerTarefa()
    }

}

class Empacotador extends Funcionario {

    String fazerTarefa(String instrucao, String tipoEmbalagem ) {
        println("Item embalado com a embalagem: " + tipoEmbalagem)
        return super.fazerTarefa(instrucao)
    }
}

Montador montador = new Montador()
montador.fazerTarefa( " Fez tudo que tinha que fazer com a ferramenta " )
Empacotador empacotador = new Empacotador()
empacotador.fazerTarefa("separou os item ", " sacola biodegradavel")
/**
 * Tarefas a serem realizadas pelo montador e empacotador
 */
// Retirar os // quando for testar o q vc fez!
//montador.fazerTarefa("Juntou a coisa com o treco")
//empacotador.fazerTarefa("Empactar tudo junto", "Caixa de Papelão")