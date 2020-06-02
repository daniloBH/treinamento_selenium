package br.com.touchtec.Funcoes

import javax.swing.JFrame
import javax.swing.JOptionPane

def mostra = { def texto ->
    JFrame frame = new JFrame()
    String answer = JOptionPane.showMessageDialog(frame, texto.toString())
    frame.dispose()
    return answer
}

/**
 * Faça uma função que compare dois Integers e devolva qual é maior.
 * Depois use essa função para achar o maior número da lista abaixo
 */
