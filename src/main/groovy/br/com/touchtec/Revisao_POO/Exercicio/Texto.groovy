package br.com.touchtec.Revisao_POO.Exercicio

class Texto {
    String texto

    Texto(String texto) {
        this.texto = texto
    }

    /**
     * Voce pode modificar o texto montado para deixar as paginas mais caprichadas!
     */
    // toString tranforma Tipo da declaração em outra, por exemplo Integer em String

    static Texto montaTexto(String nome, String cor, Integer tamanho, Integer peso){
        return new Texto("Nome do Animal: " + nome + "\n" + "Cor: "+ cor +
                "\n" + "Tamanho: " + tamanho.toString() + "\n" + "Peso: " + peso.toString())
    }
}
