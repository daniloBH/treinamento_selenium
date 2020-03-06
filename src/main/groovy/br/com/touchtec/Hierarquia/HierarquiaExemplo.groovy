package br.com.touchtec.Hierarquia

/**
 * Hierarquias
 *
 * Na Orientação a Objetos, as classes podem fazer parte de uma hierarquia, aonde elas 'herdam'
 * métodos e atributos das classes acima delas.
 * Um exemplo:
 *                  Veiculo
 *                     |
 *             -----------------
 *             |               |
 *             |               |
 *             |               |
 *             V               V
 *           Carro          Caminhão
 *
 *    Nessa hierarquia, o Carro e o Caminhão são 'filhos' do Veiculo, portanto o Carro possui os métodos e atributos da
 *    classe Veiculo, além daquilo que for declarado dentro da classe Carro. A classe Caminhão terá também aquilo declarado
 *    na classe Veículo, mas não o que for declarado na classe Carro.
 */
abstract class Veiculo {

    String placa
    String cor
    String marca
    Integer peso

    String getPlaca() {
        return placa
    }

    void setPlaca(String placa) {
        this.placa = placa
    }

    String getCor() {
        return cor
    }

    void setCor(String cor) {
        this.cor = cor
    }

    String getMarca() {
        return marca
    }

    void setMarca(String marca) {
        this.marca = marca
    }

    Integer getPeso() {
        return peso
    }

    void setPeso(Integer peso) {
        this.peso = peso
    }

    /**
     * Método abstrato
     * O funcionamento do método pesoPorEixo é específico para cada classe que extende Veiculo
     */
    abstract Integer pesoPorEixo()

    abstract Integer getVelocidadeMaxima()
}

class Carro extends Veiculo {
    Boolean carroFlex

    Boolean getCarroFlex() {
        return carroFlex
    }

    void setCarroFlex(Boolean carroFlex) {
        this.carroFlex = carroFlex
    }

    @Override
    Integer pesoPorEixo() {
        return (this.peso/2)
    }

    @Override
    Integer getVelocidadeMaxima() {
        return 120
    }
}

class Caminhao extends Veiculo {

    /**
     * O atributo numeroEixos só irá existir nos Objetos Caminhao, Carros não tem esse atributo.
     */
    Integer numeroEixos

    Integer getNumeroEixos() {
        return numeroEixos
    }

    void setNumeroEixos(Integer numeroEixos) {
        this.numeroEixos = numeroEixos
    }

    @Override
    Integer pesoPorEixo() {
        return (this.peso/this.numeroEixos)
    }

    @Override
    Integer getVelocidadeMaxima() {
        return 100
    }
}

/**
 * Veja que a classe Veiculo tem o termo "abstract" antes do nome, isso indica que a classe Veículo é uma classe abstrata,
 * ou seja, não se pode criar objetos do tipo Veiculo, apenas das classes que extendem ela, como Carro por exemplo.
 * Portanto, isso não irá funcionar:
 *      Veiculo veiculo = new Veiculo()
 * Mas isso aqui funciona:
 */
Carro peugeotDoIssao = new Carro()
//peugeotDoIssao.pesoPorEixo()

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

Pista pista = new Pista()
println pista.determinaVelocidade(peugeotDoIssao)

/** Criar a classe Moto como exemplo*/

/**
 * Cuidados com Hierarquias:
 * Pode ficar bem difícil de entender e manter o código quando se tem uma 'árvore' de classes muito comprida
 * Boas práticas dizem que deveriam se ter menos de 7 camadas
 * Portanto esse é um recurso que deve ser utilizado com cuidado! (Dicas do Titio Issao)
 */