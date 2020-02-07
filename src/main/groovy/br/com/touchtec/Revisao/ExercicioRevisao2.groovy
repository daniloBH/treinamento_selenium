package br.com.touchtec.Revisao

import javax.swing.JFrame
import javax.swing.JOptionPane

// IGNOREM ESTE TRECHO
Closure<String> pedeString = {
    JFrame frame = new JFrame()
    String answer = JOptionPane.showInputDialog(frame, "Digite Nome")
    frame.dispose()
    return answer
}

Closure<Integer> pedeInteiro = {
    JFrame frame = new JFrame()
    String answer = JOptionPane.showInputDialog(frame, "Digite Idade")
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

def mapas = []
for (int i=1 ; i<=3; i++) {
    def mapa = [:]
    mapa['nome'] = pedeString();
    mapa['idade'] = pedeInteiro();
    mapas.add(mapa);
}
for(def mapa : mapas){
    if(mapa ['idade'] >= 18){
        mostraMapa(mapa);
    }
}
for (def mapa : mapas){
    if(mapa ['idade'] < 18){
        int falta = 18 - mapa['idade'];
        mostra(mapa['nome'] + " falta " + falta + " anos para 18 anos.");
    }
}

//String nome = pedeString();
//Integer idade = pedeInteiro();


