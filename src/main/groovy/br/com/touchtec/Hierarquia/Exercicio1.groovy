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
}
class Hipopotamo extends Bicho {
    String fofo
    String fefeGosta

    String getFofo() {
        return fofo
    }

    void setFofo(String fofo) {
        this.fofo = fofo
    }

    String getFefeGosta() {
        return fefeGosta
    }

    void setFefeGosta(String fefeGosta) {
        this.fefeGosta = fefeGosta
    }

    @Override
    String getInfoFicha() {
        return 'Nome Comum: '+ nomeComum + ' Nível de Fofura: ' + fofo + ' Onde vive: ' + habitat + ' O Fefe gosta? ' + fefeGosta
    }
}

class Jacare extends Bicho {
    String igualALagartixa
    String fefePrefereAligator

    String getIgualALagartixa () {
        return igualALagartixa
    }
    void setIgualALargatixa (String igualALagartixa) {
        this.igualALagartixa = igualALagartixa
    }
    String getfefePrefereAligator () {
        return fefePrefereAligator
    }
    void setFefeprefereAligator (String fefePrefereAligator) {
        this. fefePrefereAligator = fefePrefereAligator
    }

    @Override
    String getInfoFicha () {
        return 'Nome Comum: ' + nomeComum + ' É igual a Lagartixa? ' + igualALagartixa + ' Onde vive: ' + habitat + ' O Fefe gosta? ' +fefePrefereAligator
    }
}

class Aguia extends Bicho {
    String velocidadeMaxima
    String eFiel

    String getVelocidadeMaxima () {
        return velocidadeMaxima
    }
    void setVelocidadeMaxima (String velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima
    }
    String getEfiel () {
        return eFiel
    }
    void setVelocidademaxima (String eFiel) {
        this.eFiel = eFiel
    }
    @Override
    String getInfoFicha () {
        return 'Nome Comum: ' + nomeComum + ' Qual a velocidade máxima? ' + velocidadeMaxima + ' Tem uma vida amorosa ativa? ' + eFiel + ' Onde viva: ' + habitat
    }
}

Hipopotamo hipopotamozinho = new Hipopotamo()
hipopotamozinho.setNomeComum('Hipopotamo;')
hipopotamozinho.setFofo('muito fofo;')
hipopotamozinho.setHabitat('perto de rios;')
hipopotamozinho.setFefeGosta('Sim, gosta muito')
hipopotamozinho.getInfoFicha()

Jacare jacarezinho = new Jacare()
jacarezinho.setNomeComum('Jacaré;')
jacarezinho.setIgualALagartixa('sim, é uma lagartixa pequena;')
jacarezinho.setHabitat('a beira da água;')
jacarezinho.setFefePrefereAligator('o fefe gosta mais de aligators')
jacarezinho.getInfoFicha()

Aguia littleAguia = new Aguia()
littleAguia.setNomeComum('Aguia;')
littleAguia.setVelocidadeMaxima('160 km/h;')
littleAguia.seteFiel('é fiel aos seus parceiros;')
littleAguia.setHabitat('cerrado')
littleAguia.getInfoFicha()

FichaDosBichos fichahipo = new FichaDosBichos()
fichahipo.mostraInformacao(hipopotamozinho.getInfoFicha())
FichaDosBichos fichajac = new FichaDosBichos()
fichajac.mostraInformacao(jacarezinho.getInfoFicha())
FichaDosBichos fichaaguia = new FichaDosBichos()
fichaaguia.mostraInformacao(littleAguia.getInfoFicha())
