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

List<String> listaSenhas = ["015", "020", "030", "Issao", "050", "060"]

/**
 * Eita o Issao hackeou o sistema e se colocou na lista das senhas!
 * Chame as senhas mas pule esse mizerávi!
 */

for (String lista : listaSenhas){
    if (lista == "Issao"){
        continue
    }
    chamaSenha(lista);
}


//
//chamaSenha(listaSenhas[0]);
//chamaSenha(listaSenhas[1]);
//chamaSenha(listaSenhas[2]);
//chamaSenha(listaSenhas[4]);
//chamaSenha(listaSenhas[5]);
//
