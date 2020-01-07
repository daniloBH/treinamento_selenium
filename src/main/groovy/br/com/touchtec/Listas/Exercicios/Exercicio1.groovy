package br.com.touchtec.Listas.Exercicios

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

List<String> listaSenhas = ["015", "020", "030"]

/**
 * Chame a primeira senha da listaSenhas e depois apague ela
 * Depois disso use o mostraListaDeSenhas para ver como ficou a lista
 * Lembrete: "chamar" a senha é só usar a função chamaSenha ali em cima -> chamaSenha(listaSenhas[2])
 */
