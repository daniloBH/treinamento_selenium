package br.com.touchtec.Funções

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

/**
 * Escreva uma função que receba três números e que depois calcule e exiba a média deles.
 * Depois de fazer a função chame ela para testar o seu funcionamento
 * Obs.: Utilize o mostra() e pedeInteiro() para facilitar a sua vida
 */


 fdsf