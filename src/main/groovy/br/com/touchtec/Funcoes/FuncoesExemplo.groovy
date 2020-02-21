package br.com.touchtec.Funcoes

import javax.swing.JFrame
import javax.swing.JOptionPane

def mostra = { def texto ->
    JFrame frame = new JFrame()
    String answer = JOptionPane.showMessageDialog(frame, texto.toString())
    frame.dispose()
    return answer
}

Closure<Integer> pedeInteiro = {
    JFrame frame = new JFrame()
    String answer = JOptionPane.showInputDialog(frame, "Digite um inteiro")
    frame.dispose()
    return Integer.parseInt(answer)
}

def mostraLista = { List<String> lista ->
    mostra(lista.join(", "));
}

/** Funções
 *  (Também chamadas de Métodos no Java)
 *  O que é? Um pedaço de código/lógica que tem um nome que você chama
 *  Como cria uma? Você declara a função definindo o nome, o que ela retorna e os parâmetros dela
 */

String olaPessoa(String nome, Integer idade) {
    return("Olá " + nome + ", Idade:" + idade)
}

//olaPessoa("Paulo", 18)

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

oiMundo()
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

//List<String> lista = []
//lista.add(pedeInteiro().toString())
//lista.add(pedeInteiro().toString())
//mostraLista(lista)

void mostraMaior(Integer a, Integer b) {
    if(a > b) {
        println(a)
    }
    else {
        println(b)
    }
}

mostraMaior(5, 6)
 /**
 * Chamar a função é que nem chamar alguém, você usa o nome da criatura.
 */
Integer a = 8
Integer b = 6
determinaMaior(a, b)

/**
 * Funções servem para vc encapsular um pedaço de código com um nome, evitando que vc tenha que reescrever a lógica
 * várias vezes
 */