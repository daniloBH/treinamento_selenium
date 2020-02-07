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

int valor = pedeInteiro();
int valor1 = pedeInteiro();
int valor2 = pedeInteiro();
Integer media (Integer nota1 , Integer nota2, Integer nota3){
    return ((nota1 + nota2 + nota3) / 3);
}
    mostra(media(valor,valor1,valor2));
