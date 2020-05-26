package br.com.touchtec.Revisao_POO.Exercicio

class Texto {
    String texto

    Texto(String texto) {
        this.texto = texto
    }

    static void montaTexto(String nome, String cor, Integer tamanho, Integer peso) {
        new Texto(nome + cor + tamanho.toString() + peso.toString())
    }
}
