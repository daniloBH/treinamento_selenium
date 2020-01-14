package br.com.touchtec.Funções

import javax.swing.JFrame
import javax.swing.JOptionPane

def mostra = { def texto ->
    JFrame frame = new JFrame()
    String answer = JOptionPane.showMessageDialog(frame, texto.toString())
    frame.dispose()
    return answer
}

/** Funções (ou Métodos)
 *  O que é? Um pedaço de código/lógica que tem um nome que você chama
 *  Como cria uma? Você declara a função definindo o nome, o que ela retorna e os parâmetros dela
 */

String olaPessoa(String nome) {
    return "Olá " + nome
}

/**
 * O nome da função é como ela será identificada, no exemplo acima o nome dela é: olaPessoa
 */

/**
 * O que ela retorna é o tipo de coisa que ela devolve
 * (String, Integer, Double, List<String>, etc...)
 * A olaPessoa devolve uma String
 */

/**
 * O void indica que a função não devolve nada
 */
void oiMundo() {
    print("Olá Mundo!")
}

/**
 * Parâmetros são o que passamos pra função para ela fazer a função dela (piadão bom aqui)
 */
Integer determinaMaior(Integer a, Integer b) {
    if(a > b) {
        return a
    }
    else {
        return b
    }
}

 /**
 * Chamar a função é que nem chamar alguém, você usa o nome da criatura.
 */
Integer a = 8
Integer b = 6
determinaMaior(a, b)