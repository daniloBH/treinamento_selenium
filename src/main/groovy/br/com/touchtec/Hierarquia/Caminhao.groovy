package br.com.touchtec.Hierarquia

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