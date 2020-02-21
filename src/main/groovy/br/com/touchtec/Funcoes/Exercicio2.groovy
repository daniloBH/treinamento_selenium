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

List<Integer> listaNumeros = [15, 2, 6, 16, 12, 8, 30, 29, -1, 32, 1, 25, 11, 2];

Integer maior(Integer a, Integer b){
        if (a > b){
            return a;
        }else{
            return b;
        }
}
int grande = listaNumeros[0];
for (int valor : listaNumeros){
    grande = maior(valor,grande);
}
    mostra(grande);
