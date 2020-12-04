package br.com.touchtec.Hierarquia

/**
 * A classe pista usa um veiculo no método dela! Isso significa que vc pode passar um Carro ou um Caminhao pra esse
 * método que ele funciona! Essa é a mágica da hierarquia, como os Carros e Caminhões também são Veiculos não precisamos
 * nos preocupar com que tipo de veiculo tá na pista.
 * Isso nos permite tratar de forma diferenciada cada tipo de classe derivada de uma classe pai!
 */

class Pista {
    Integer numero

    Integer getNumero() {
        return numero
    }

    void setNumero(Integer numero) {
        this.numero = numero
    }

    Integer determinaVelocidade(Veiculo veiculo) {
        return veiculo.getVelocidadeMaxima()
    }
}