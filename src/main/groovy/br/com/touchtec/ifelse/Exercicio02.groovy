package br.com.touchtec.ifelse

import javax.swing.JFrame
import javax.swing.JOptionPane

// IGNOREM ESTE TRECHO
Closure<Integer> pedeInteiro = {
    JFrame frame = new JFrame()
    String answer = JOptionPane.showInputDialog(frame, "Digite um inteiro")
    frame.dispose()
    return Integer.parseInt(answer)
}

Closure<Double> pedeDouble = {
    JFrame frame = new JFrame()
    String answer = JOptionPane.showInputDialog(frame, "Digite um real")
    frame.dispose()
    return Double.parseInt(answer)
}

def mostra = { def texto ->
    JFrame frame = new JFrame()
    String answer = JOptionPane.showMessageDialog(frame, texto.toString())
    frame.dispose()
    return answer
}

/**
 * Peca o ano que a pessoa nasceu (Ex: 1982). Mostre uma mensagem indicando se a
 * pessoa pode votar este ano ou não.
 */

Integer AnoNascimento
AnoNascimento=pedeInteiro()

if (AnoNascimento > 2004){
    mostra ('Vocẽ ainda não pode votar')
}
else {(AnoNascimento<=2004)
    mostra ('Você está apto a votar')
}
