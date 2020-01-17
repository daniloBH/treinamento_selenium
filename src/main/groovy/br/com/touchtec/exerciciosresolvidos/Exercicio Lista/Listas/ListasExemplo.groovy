package br.com.touchtec.Listas

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

List<Double> listaDouble = [0.15, 0.25, 035]

List<Integer> numero = [1, 2, 3]

List<String> listaSenhas = ["015", "020", "Issao"]

//Como chama a primeira senha?

//Precisa alterar a senha q tá na posição 2 para "080"! Como faz?

//Chegou mais gente, precisa colocar as senhas 075, 030, 040 na lista

Integer ultimoIndice = listaSenhas.size() - 1

chamaSenha( listaSenhas[ultimoIndice] );

//Atendeu uma pessoa, pode tirar a senha 015 da lista
listaSenhas.remove(1)

mostraListaDeSenhas(listaSenhas)
listaSenhas[1] = "0020"
mostraListaDeSenhas(listaSenhas)

//Precisa chamar a senha 075 na lista. Como fazer? (Lembrar do for(i : lista))

for(Integer i = 0; i < 5; i++) {
    chamaSenha(i)
}

for(String senha in listaSenhas) {
    chamaSenha(senha)
}
