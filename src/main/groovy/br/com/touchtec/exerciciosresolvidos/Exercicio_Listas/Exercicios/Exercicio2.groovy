package br.com.touchtec.exerciciosresolvidos.Exercicio_Listas.Exercicios

import javax.swing.JFrame
import javax.swing.JOptionPane

def chamaSenha = { def texto ->
    JFrame frame = new JFrame()
    String answer = JOptionPane.showMessageDialog(frame, texto.toString())
    frame.dispose()
    return answer
}

def mostraListaDeSenhas = { List<String> listaSenhas ->
    chamaSenha(listaSenhas.join(", "))
}

List<Integer> listaSenhas = [15, 20, 30, 29, 40, 50, 80, 101, 160, 999]

//Achar na lista, senhas que se encaixem num certo padrão ( entre 0 e 10, maior q 35) e chamar elas

/**
 * Procure no listaSenhas por senhas que se encaixem em uma dessas categorias e chame elas:
 * 1) Senhas menores que 10
 * 2) Senhas maiores que 50 e menores que 100
 * 3) Senhas maiores que 150
 */

for(Integer lista : listaSenhas) {
    if (lista <= 10){
        chamaSenha(lista);
    }
    if (lista >= 50 && lista < 100){
        chamaSenha(lista);
    }
   if (lista > 150){
       chamaSenha(lista);
   }
}