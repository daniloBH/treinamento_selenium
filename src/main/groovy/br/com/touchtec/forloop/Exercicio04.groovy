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
 * DESAFIO!
 *
 * Dado um conjunto de números: 0, 1 e 2.
 *
 * Imprima todas as combinações possíveis:
 * - 0 e 0
 * - 0 e 1
 * - 0 e 2
 * - 1 e 1
 * - 1 e 2
 * - 2 e 2
 *
 * Obs: Não imprimir 1 e 0. É a mesma combinação do 0 e 1.
 * Dica: Usem 2 loops (2 for)
 * Dica2: Pensem bem como vcs vão inicializar as variáveis em cada for.
 */

for(Integer a = 0; a <= 2; a++) {
    for(Integer b = a; b <= 2; b++) {
        mostra("${a}, ${b}")
    }
}




