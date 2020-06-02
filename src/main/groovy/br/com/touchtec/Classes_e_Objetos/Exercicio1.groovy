package br.com.touchtec.Classes_e_Objetos

import javax.swing.JFrame
import javax.swing.JOptionPane

/**
 * Construindo a sua casa
 * Crie uma classe chamada CasaDosSonhos que tenha os seguintes atributos:
 * 1) número de comodos
 * 2) tamanho do terreno em metros quadrados
 * 3) texto descrevendo aonde a casa ficaria
 * 4) tem piscina?
 * 5) tamanho do jardim em metros quadrados
 * 6) um texto com alguma característica importante pra sua casa dos sonhos
 *
 * Depois de criada a classe, crie o objeto da sua Casa dos Sonhos com os valores que
 * sua casa dos sonhos teria
 */

def mostra = { def texto ->
    JFrame frame = new JFrame()
    String answer = JOptionPane.showMessageDialog(frame, texto.toString())
    frame.dispose()
    return answer
}
