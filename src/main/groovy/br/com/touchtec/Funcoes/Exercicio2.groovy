package br.com.touchtec.Funções

import javax.swing.JFrame
import javax.swing.JOptionPane

Closure<String> pedeString = {
    JFrame frame = new JFrame()
    String answer = JOptionPane.showInputDialog(frame, "Digite um texto")
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

/**
 * Faça uma função que compare dois Integers e devolva qual é maior.
 * Depois use essa função para achar o maior número da lista abaixo
 */

List<Integer> listaNumeros = [15, 2, 6, 16, 12, 8, 30, 29, -1, 32, 1, 25, 11, 2];

//Integer num1 = pedeInteiro()
//Integer num2 = pedeInteiro()

Integer compara (Integer num1, Integer num2){
    if (num1 > num2){
        return num1
    }
    else {
        return num2
    }
}

Integer maiorAteAgora = listaNumeros [0]
for (Integer numero : listaNumeros){
    maiorAteAgora = compara(numero, maiorAteAgora)
}
mostra (maiorAteAgora)
