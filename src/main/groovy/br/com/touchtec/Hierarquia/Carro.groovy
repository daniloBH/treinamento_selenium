package br.com.touchtec.Hierarquia

import br.com.touchtec.Polimorfismo.CamaroteInferior



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
