package br.com.touchtec.Mapas

import javax.swing.JFrame
import javax.swing.JOptionPane

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
 * Mapas
 * Estrutura de Dados que representa um relacionamento chave-valor
 * Lista aonde cada coisa dentro dela tem duas propriedades: um valor e uma chave
 */

//Como criar um mapa e como adicionar elementos novos
def mapa = [:]
def mapa2 = [nome: 'Issao', cargo: 'Mizeravi', salario: 10]

//Passa a chave como se fosse a posição de uma lista
//mapa['dia'] = 15;
//mapa['mes'] = "Fevereiro";
//mapa['ano'] = "2020";
//mostraMapa(mapa);
//mostraMapa(mapa2);

//O relacionamento é em um sentido só, voce procura a chave para ter o valor associado,
// o contrário não funciona

//      chave -> valor
mapa["2020"] == null;
mapa['ano'] == '2020';

//Como iterar pelo mapa

//def mapa2 = [nome: 'Issao', cargo: 'Mizeravi', salario: 10]

//mapa2.each { elemento ->
//
//    if(elemento.value == 10) {
//        mostra(elemento.key)
//    }
//}

//Obs.: key é chave e value é valor

//Repetição de chaves! Não deixa repetir a chave

//mapa["ano"] = '2077';
//mostraMapa(mapa);

//Chave é unica mas valor não

mapa2['nome'] = 'Mizeravi';
mostraMapa(mapa2);

