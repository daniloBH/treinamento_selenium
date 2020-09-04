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
 * Peça dois números e mostre o maior deles.
 */

Integer numero1
Integer numero2
numero1=pedeInteiro()
numero2=pedeInteiro()

if (numero1>numero2){
    mostra (numero1)
}
else{
    (numero2>numero1)
    mostra (numero2)
}
