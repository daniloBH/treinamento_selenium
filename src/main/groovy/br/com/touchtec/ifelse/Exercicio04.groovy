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
 * Escreva um programa para ler 3 valores inteiros (considere que  não	
 * serão lidos valores iguais) e mostrá-los em ordem crescente.
 */

Integer a = pedeInteiro ()
Integer b = pedeInteiro ()
Integer c = pedeInteiro ()

if (a < b) {
    if (b < c) {
        mostra(''+ a + ', ' + b + ', ' + c + ', ')
    }
    else {
        mostra ('' + a + ', '+ c + ', '+ b +', ')
    }
}
if (b < a){
    if (a < c){
        mostra (''+ b + ', ' + a + ', ' + c + ', ')
    }
    else {
        mostra (''+ b + ', ' + c + ', ' + a + ', ')
    }
}
if (c < a){
    if (a < b){
       mostra ( ''+ c + ', ' + a + ', ' + b + ', ')
    }
    else {
        mostra ( ''+ c + ', ' + b + ', ' + a + ', ')
    }
}