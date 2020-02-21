package br.com.touchtec.ExerciciosResolvidos.ExerciciosListas

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
410
List<List<String>> listaDeSenhas = [ ["05", "06", "07"] , ["15", "16", "17"] , ["25", "26", "27"] ]

/**
 * !!!DESAFIO!!!
 * Quem conseguir resolver essa vai ganhar uma recompensa (vulgo, chocolate) na correção!
 *
 * Algum dev infeliz resolveu organizar as listas de senhas para 3 guichês de atendimento
 * em uma lista de listas...
 * Agora pra chamar uma senha voce tem que usar o índice da lista de fora e depois o índice da de dentro...
 *
 * Pera, como assim? Vamos com um exemplo:
 * Para pegar o primeiro elemento da primeira lista da listaDaListaDeSenhas voce faz o seguinte: */

    //Com isso temos a lista ["05", "06", "07"] na variavel primeiraLista
    def primeiraLista = listaDeSenhas[0]

    //Agora para pegar o primeiro elemento dessa lista é só fazer isso
    def primeiraSenha = primeiraLista[0]
    //Então: primeiraSenha == "05"

/**
 * Agora está mais claro? (Espero que sim :P)
 * Para esse exercício vocês terão que percorrer a listaDeSenhas e chamar todas as senhas!
 */


primeiraLista = listaDeSenhas [0]
primeiraSenha = primeiraLista [0]
segundaLista = listaDeSenhas [1]
terceiraLista = listaDeSenhas [2]


for (String senha:primeiraLista){
    chamaSenha(senha)
}
for (String senha: segundaLista){
    chamaSenha(senha)
}
for (String senha:terceiraLista){
    chamaSenha(senha)
}