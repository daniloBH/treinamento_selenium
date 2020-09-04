package br.com.touchtec.ConflitoGit

import javax.swing.JFrame
import javax.swing.JOptionPane

/**
 * Nessa aula vamos aprender a lidar com os conflitos do Git!
 * Conflitos acontecem no git quando tentamos realizar uma operação do git que 'atualiza' nosso repositorio local de
 * alguma forma. Por exemplo, git rebase/git pull, git merge, cherrypick. Isso acontece quando tem mudanças diferentes
 * nos dois repositorios (local e remoto), ou seja voce mexeu em um arquivo e outra pessoa mexeu em outras coisas no
 * mesmo arquivo. Desse jeito o coitado do git não sabe o que é o certo, então voce precisa dizer pra ele o que é
 * pra ficar!
 *
 * Para isso rodamos o comando 'git mergetool' que por sua vez usa um editor de texto especial pra resolver isso.
 * Esse editor tem 3 'colunas' que são, da esquerda para a direita: a sua versão local, a versão final e a versão remota
 * A versão final é a mistura que você vai montar das mudanças locais e do remoto.
 */

def mostra = { def texto ->
    JFrame frame = new JFrame()
    String answer = JOptionPane.showMessageDialog(frame, texto.toString())
    frame.dispose()
    return answer
}

Closure<Integer> pedeInteiro = {
    JFrame frame = new JFrame()
    String answer = JOptionPane.showInputDialog(frame, "Digite um inteiro")
    frame.dispose()
    return Integer.parseInt(answer)
}

/**
 * Tentando causar
 */
def mostraLista = { List<String> lista ->
    mostra(lista.join(", "));
}

String olaPessoa(String nome, Integer idade) {
    abobrinha
    return("Olá " + nome + ", Idade:" + idade)
}

olaPessoa("Paulo", 18)
abobrinha
abobrinha
abobrinha

void oiMundo() {
    print("Olá Mundo!")
}

oiMundo()

Integer determinaMaior(Integer a, Integer b) {
    if(a > b) {
        return a
    }
    else {
        return b
    }
    /**
     * Tentando causar
     */
}

List<String> lista = []
lista.add(pedeInteiro().toString())
abobrinha
lista.add(pedeInteiro().toString())
lista.add('abobrinha')
mostraLista(lista)
/**
 * Tentando causar
 */
void mostraMaior(Integer a, Integer b) {
    if(a > b) {
        println(a)
    }
    else {
        println(b)
        /**
         * Tentando causar
         */
    }
}
abobrinha

mostraMaior(5, 6)

Integer a = 8
Integer b = 6
determinaMaior(a, b)