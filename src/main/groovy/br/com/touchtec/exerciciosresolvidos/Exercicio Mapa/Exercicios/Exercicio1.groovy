package br.com.touchtec.Mapas.Exercicios

import javax.swing.JFrame
import javax.swing.JOptionPane

/**
 * Ignorar essa parte aqui!
 */
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
 * Exercicio 1: Mapa do Tesouro
 * Nesse exercício você está participando de uma caça ao tesouro, e sua equipe precisa procurar por pistas nas regiões descritas
 * no mapa abaixo. Ao longo da procura vocês descobriram as seguintes coisas:
 *
 * 1) Não tem pista em Interlagos
 * 2) Não tem pista no Butantã
 * 3) Na Liberdade tem pista! Ela mostrou que vocês deveriam olhar no Itaim por outra pista
 * 4) No Brás tinha outra pista! Mas parece precisar de outra...
 * 5) No Itaim tinha outra pista! Juntando com a do Brás vocês são levados para a Vila Olímpia
 * 6) Eeeeeita, o tesouro tava na Vila Olímpia! Vitória!
 *
 * Juntando tudo o que aconteceu, modifique o mapa para ficar atualizado com o que aconteceu durante a caça e depois use o mostraMapa()
 *  para ver como ficou!
 * Obs.: Precisa colocar as regiões que apareceram durante a caça
 */

//Essas variáveis são para deixar mais fácil de indicar o que tinha em cada lugar
def naoVerificado = "Não Verificado"
def semNada = "Sem pista encontrada"
def pistaEncontrada = "Pista encontrada aqui!"
def tesouroEncontrado = "O Tesouro tava aqui o tempo todo!"

def mapa = [Liberdade: naoVerificado, Interlagos: naoVerificado, Itaquera: naoVerificado, Butantã: naoVerificado, Brás: naoVerificado]

mapa["Interlagos"]=semNada;
mapa["Butantã"]=semNada;
mapa['Liberdade']=pistaEncontrada;
mapa['Brás']=pistaEncontrada;
mapa['Itaim']=pistaEncontrada;
mapa['Vila Olímpia']=tesouroEncontrado;

mostraMapa(mapa);