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

class Borboleta extends Bicho {
    Boolean ar;

    Boolean getAr() {

        return ar;
    }
    void setAr(Boolean ar){
        this.ar = ar;
    }
    @Override
    String getInfoFicha(){
        return ('Nome: ' + this.nomeComum + '\n' + 'Descrição: '+ this.descricao + '\n' + 'Onde Vivem?: ' + this.habitat);
    }
}

class Elefante extends Bicho{
    Boolean terra;

    Boolean getTerra() {

        return terra;
    }
    void setTerra(Boolean terra){
        this.terra = terra;
    }
    @Override
    String getInfoFicha(){
        return ('Classificação Cientifica: ' + this.nomeCientifico + '\n' + 'Onde Vivem?: ' + this.habitat +'\n'+ 'Descrição: '+ this.descricao);
    }
}
class Golfinho extends Bicho {
    Boolean agua;

    Boolean getAgua() {

        return agua;
    }
    void  setAgua(){
        this.agua = agua;
    }
    @Override
    String getInfoFicha(){
        return  ('Nome: ' + this.nomeComum + '\n' + 'Onde Vivem? ' + this.habitat + '\n' + 'Descrição: ' + this.descricao);
    }

}
Borboleta borboleta = new Borboleta();
borboleta.setNomeComum("BORBOLETAS MONARCAS");
borboleta.setHabitat('Vivem Perambulando');
borboleta.setDescricao('Os adultos atingem uma envergadura de 40–100 mm, \n com as asas dianteiras largas, em geral apenas 1,4 a 1,9 vezes mais longas que largas. \n A cor de fundo das asas é em geral castanho-escuro, \n mas são comuns diversos tons de laranja, castanho, amarelo, vermelho, azul, roxo ou preto.')

FichaDosBichos fichaUm = new FichaDosBichos();
fichaUm.infoBicho(borboleta);
fichaUm.mostraInformacao(fichaUm.informacao);

Elefante elefante = new Elefante();
elefante.setNomeCientifico("ELEPHANTIDAE");
elefante.setHabitat('Na Savana');
elefante.setDescricao('Os elefantes são animais herbívoros, alimentando-se de ervas, gramíneas, frutas e folhas de árvores. \n Dado o seu tamanho, um elefante adulto pode ingerir entre 70 a 150 kg de alimentos por dia. \n As fêmeas vivem em manadas de 10 a 15 animais, lideradas por uma matriarca, compostas por várias reprodutoras e crias de variadas idades. \n Devido ao seu porte, os elefantes têm poucos predadores. Eles vivem cerca de 60 anos e morrem quando seus molares caem, impedindo que se alimentem de plantas. ');

FichaDosBichos fichaDois = new FichaDosBichos();
fichaDois.infoBicho(elefante);
fichaDois.mostraInformacao(fichaDois.informacao);

Golfinho golfinho = new Golfinho();
golfinho.setNomeComum('BOTO-COR-DE-ROSA');
golfinho.setHabitat('Rio Amazonas');
golfinho.setDescricao('É o maior golfinho de água doce, \nas espécies se distribuem nas bacias dos rios Amazonas e Solimões. \nOs adultos apresentam uma coloração rosada. \nTem a dieta mais ampla, alimentando-se principalmente de peixes, mas completando com tartarugas e caranguejos. ');

FichaDosBichos fichaTres = new FichaDosBichos();
fichaTres.infoBicho(golfinho);
fichaTres.mostraInformacao(fichaTres.informacao);