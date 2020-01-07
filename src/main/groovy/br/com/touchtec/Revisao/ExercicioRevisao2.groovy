package br.com.touchtec.Revisao

import javax.swing.JFrame
import javax.swing.JOptionPane

// IGNOREM ESTE TRECHO
Closure<String> pedeString = {
    JFrame frame = new JFrame()
    String answer = JOptionPane.showInputDialog(frame, "Digite um inteiro")
    frame.dispose()
    return answer
}

Closure<Integer> pedeInteiro = {
    JFrame frame = new JFrame()
    String answer = JOptionPane.showInputDialog(frame, "Digite um inteiro")
    frame.dispose()
    return Integer.parseInt(answer)
}

def mostra = { def texto ->
    JFrame frame = new JFrame()
    String answer = JOptionPane.showMessageDialog(frame, texto.toString())
    frame.dispose()
    return answer
}

def mostraMapa = { def map ->
    String texto = ""
    map.each{
        texto += "$it.key : $it.value\r\n"
    }
    mostra(texto)
}

/**
 * Crie um programa que peça o nome e a idade de 6 pessoas e depois mostre as seguintes
 * informações:
 *
 * 1) O nome e a idade das pessoas maiores de 18
 * 2) O nome, idade e quanto falta para 18 anos para os menores de idade
 *
 * Para isso, guarde as informações em um mapa
 */

def mapa = [:]


