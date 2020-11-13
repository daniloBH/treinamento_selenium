package br.com.touchtec.Revisao_POO.Exercicio

class Texto {
    String texto

    Texto(String texto) {
        this.texto = texto
    }

    /**
     * Voce pode modificar o texto montado para deixar as paginas mais caprichadas!
     */
    static Texto montaTexto(String nome, String cor, Integer tamanho, Integer peso) {
        return new Texto(nome + cor + tamanho.toString() + peso.toString())
    }
}
