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
 * Exercicio 2:
 * Temos um mapa que relaciona o nome de cidades com sua distância em km até a capital Paulista.
 * Para esse exercício mostre o conteúdo do mapa utilizando o mostra() com o texto no seguinte padrão:
 *  " Municipio: __________ , Distancia em Km: ____ "
 *               ^nome da cidade fica aqui      ^distancia aqui
 */

def mapa = [Indaiatuba:99, Marilia:438, Itu:102, Campinas:100, Maua:26]

//Já deixei pronta essa parte da iteração, só chamar as propriedades a partir do "elemento"
mapa.each { elemento ->

}
