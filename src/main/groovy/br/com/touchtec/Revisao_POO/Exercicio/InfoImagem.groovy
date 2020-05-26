package br.com.touchtec.Revisao_POO.Exercicio

class InfoImagem {
    String info

    InfoImagem(String info) {
        this.info = info
    }

    static void montaInfoImagem(String nome, Integer tamanho, String cor) {
        new InfoImagem(nome + tamanho.toString() + cor)
    }
}
