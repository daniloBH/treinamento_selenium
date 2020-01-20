package br.com.touchtec.Classes_e_Objetos

import javax.swing.JFrame
import javax.swing.JOptionPane

def mostra = { def texto ->
    JFrame frame = new JFrame()
    String answer = JOptionPane.showMessageDialog(frame, texto.toString())
    frame.dispose()
    return answer
}

/**
 * Classes e Objetos
 * O começo de Programação Orientada a Objetos
 *
 * O que é uma classe? Um tipo de Objeto que voce pode criar, como um template
 * Integer, String, List, Map são todas classes que já foram criadas no Java para ajudar a gente
 *
 * O que é um Objeto? algo que você criou dentro do seu programa capaz de ser alterado ou realizar
 * algum tipo de função no código.
 * String nome = "Abba" -> nome é um Objeto da classe String que foi criado
 */
class Teste {
    //Atributos da classe
    String nome;
    String autor;
    List<String> anotacoes;

    //Construtor da classe, função responsável por criar o objeto
    Teste() {}

    //Daqui para baixo temos os métodos da classe

    /**
     * Esses aqui são os getters e setters
     * Os getters dão "get" nos atributos, ou seja devolvem o valor deles
     */
    String getNome() {
        return this.nome;
    }

    /**
    * Os setters "setam" o valor de um atributo, ou seja alteram ele para o valor passado
    * quando a função é chamada
    */
    void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * "this" é o que usamos para referenciar a própria classe, ou seja
     *  é como se falássemos com "this.autor" que queremos que a classe devolva a
     *  propriedade dela mesma
     */
    String getAutor() {
        return this.autor;
    }

    void setAutor(String autor) {
        this.autor = autor;
    }

    List<String> getAnotacoes() {
        return this.anotacoes;
    }

    void setAnotacoes(List<String> anotacoes) {
        this.anotacoes = anotacoes;
    }
}

// teste1 é um Objeto da classe Teste
//Criamos um objeto de uma classe chamando o construtor
Teste teste1 = new Teste();

//Métodos/Funções são aquilo que usamos para interagir com objetos de uma Classe
teste1.setNome("Teste Exploratório");
teste1.setAutor("Issao");
def anotacoes = ["Dia 1: comecei o teste agora, por enquanto nada de especial",
"Dia 2: já achei uns bug meio estranho, mas a equipe já sabia deles",
"Dia 3: mais bugs, mas agora ninguém pode me ajudar, ninguém conhecia nada dessa parte do sistema"];
teste1.setAnotacoes(anotacoes);

def nomeDoTeste = teste1.getNome();
mostra(nomeDoTeste);


