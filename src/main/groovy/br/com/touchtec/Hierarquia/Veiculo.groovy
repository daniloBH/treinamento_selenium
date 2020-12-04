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


/**
 * Veja que a classe Veiculo tem o termo "abstract" antes do nome, isso indica que a classe Veículo é uma classe abstrata,
 * ou seja, não se pode criar objetos do tipo Veiculo, apenas das classes que extendem ela, como Carro por exemplo.
 * Portanto, isso não irá funcionar:
 *      Veiculo veiculo = new Veiculo()
 * Mas isso aqui funciona:
 */


abstract class Veiculo {

    private String placa
    private String cor
    private String marca
    private Integer peso
    private Integer numChassi = 155678

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

    Integer getNumChassi() {
        return this.numChassi
    }
}