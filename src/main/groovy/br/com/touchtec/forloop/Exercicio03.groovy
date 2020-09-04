package br.com.touchtec.forloop

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
 * Percorra todos os números de 0 a 10.0
 * Se o número for par, multiplique por 5 e mostre o número.
 * Se o número for impar, multiplique por 10 e mostre o número.
 *
 * Dica: Aprenda o operador '%' para descobrir se o número é par ou não. Temos o google para isso!
 */

Integer n

for(n = 0; n <= 10; n = n+1) {
    if(n % 2 == 0) {
        mostra(n * 5)
    }
    else {
        mostra(n * 10)
    }
}
  