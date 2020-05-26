package br.com.touchtec.Revisao_POO.Exercicio

class LegendaImagem {
    String legenda

    LegendaImagem(String legenda) {
        this.legenda = legenda
    }

    static void montaLegenda(String nome, String cor) {
        new LegendaImagem(nome + cor)
    }
}
