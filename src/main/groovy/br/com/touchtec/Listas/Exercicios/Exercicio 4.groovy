package br.com.touchtec.Listas.Exercicios

import javax.swing.JFrame
import javax.swing.JOptionPane

def chamaSenha = { def texto ->
    JFrame frame = new JFrame()
    String answer = JOptionPane.showMessageDialog(frame, texto.toString())
    frame.dispose()
    return answer
}

def mostraListaDeSenhas = { List<String> listaSenhas ->
    chamaSenha(listaSenhas.join(", "))
}

List<String> listaSenhas = ["012", "013", "035", "044", "088"]

/**
 * Monte um loop usando o for() que percorra a lista de trás para frente. Para isso vale lembrar que
 * as listas possuem o método .size() que devolve o número de elementos que tem na lista (que é o tamanho da lista)
 * Dica: Lembre-se que os índices da lista começam no 0 e não no 1!
 */

