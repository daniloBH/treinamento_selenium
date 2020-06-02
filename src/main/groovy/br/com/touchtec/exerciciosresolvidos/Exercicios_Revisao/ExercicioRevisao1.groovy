package br.com.touchtec.exerciciosresolvidos.Exercicios_Revisao

import javax.swing.JFrame
import javax.swing.JOptionPane

// IGNOREM ESTE TRECHO
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

def mostraLista = { List<String> lista ->
    mostra(lista.join(", "));
}

/**
 * Escreva um programa que faça essas três coisas:
 * a) Leia os números que o usuario inserir até ele
 *  digitar um numero negativo.
 *  Obs.: Só para quando ele colocar o negativo, esse número negativo não deve ser guardado/considerado
 *
 * b) Depois mostre todos os números inseridos
 *
 * c) E depois mostre a soma de tudo que o usuario inseriu
 */

List<Integer> numeros = [];
while (true) {
    Integer num = pedeInteiro();
    if(num < 0){
        break
    }
    numeros.add(num);
}

mostraLista(numeros);
Integer soma = 0;
for(Integer numero : numeros){
    soma += numero;
}
mostra(soma);
