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
 * Peça pelo número de pacientes e a última senha gerada.
 * EX:
 * Integer numeroPacientes = pedeInteiro()
 * Integer ultimaSenha = pedeInteiro()
 *
 * Gere todas as senhas para todos os pacientes, a partir da ultima senha gerada.
 *
 * EX:
 * Se numero de pacientes é 5 e a ultima senha é 10, mostrar:
 * 11, 12, 13, 14, 15.
 *
 * EX2:
 * Se numero de pacientes é 3 e a ultima senha é 45, mostrar:
 * 46, 47, 48.
 */

