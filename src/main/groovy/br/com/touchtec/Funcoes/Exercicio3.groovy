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
 * !DESAFIO!
 *
 * Escreva uma função capaz de dizer se um número é primo ou não. Um número é primo se ele
 * for divisível apenas por 1 e ele mesmo, ou seja 5 é um número primo, pois somente 1 e 5
 * dividem ele, enquanto 6 não é primo, pois 1, 2, 3 e 6 dividem ele.
 *
 * Com essa função pronta, faça um loop para mostrar todos os primos entre 1 e 500
// */

<<<<<<< HEAD
boolean primo (Integer a){
    if(a <=1){
        return false;
    }
    if (a % 2 == 0){
        return false
    }
    int metade = a/2;
    for (int i=3; i <= metade; i++){
        if ((a % i) == 0)
            return false
    }
    return true;
}
for (Integer num = 0; num <= 50; num++){
    if(primo(num)){
        mostra(num);
    }
=======
boolean numero (Integer a){
        if (a % 2 != 0){
            return true
        }
}
for (Integer num = 2; num <= 20; num++){ 
    numero(num);
>>>>>>> 07/02/2020
}