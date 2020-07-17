package br.com.touchtec.Hierarquia

import javax.swing.JFrame
import javax.swing.JOptionPane

/**
 * Nesse exercicio temos a classe abstrata Bicho que possui um conjunto de propriedades e o método abstrato getInfoFicha.
 *
 * Você deve criar 3 classes de animais diferentes que extendam Bicho e implementem o getInfoFicha de jeitos diferentes.
 * A implementação do getInfoFicha pode ser só utilizar propriedades diferentes para montar o String que devolve. Por exemplo,
 * podemos juntar o nomeComum, nome Cientifico e a descricao para montar um único String que será devolvido pelo getInfoFicha.
 *
 * Depois de criar essas classes, crie objetos das classes que você fez e crie um objeto da classe FichaDosBichos,
 * depois use os métodos da FichaDosBichos pra exibir as informações de cada bicho.
 */

abstract class Bicho {
    String nomeComum
    String nomeCientifico
    String descricao
    String habitat

    String getNomeComum() {
        return nomeComum
    }

    void setNomeComum(String nomeComum) {
        this.nomeComum = nomeComum
    }

    String getNomeCientifico() {
        return nomeCientifico
    }

    void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico
    }

    String getDescricao() {
        return descricao
    }

    void setDescricao(String descricao) {
        this.descricao = descricao
    }

    String getHabitat() {
        return habitat
    }

    void setHabitat(String habitat) {
        this.habitat = habitat
    }

    abstract String getInfoFicha()
}

class FichaDosBichos {
    String informacao

    String infoBicho(Bicho bicho) {
        this.informacao = bicho.getInfoFicha()
    }

    String mostraInformacao(String texto) {
        JFrame frame = new JFrame()
        String answer = JOptionPane.showMessageDialog(frame, texto.toString())
        frame.dispose()
        return answer
    }

    abstract String getInfoFicha()
}

class Borboleta extends Bicho{

}
class Elefante extends Bicho{

}
class golfinho extends Bicho{

}