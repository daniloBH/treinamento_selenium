package br.com.touchtec.Hierarquia

class Moto extends Veiculo{
    Boolean temBau;

    Boolean getTemBau() {
        return this.temBau;
    }

    void setTemBau(Boolean temBau) {
        this.temBau = temBau;
    }

    @Override
    Integer pesoPorEixo() {
        return this.peso;
    }

    @Override
    Integer getVelocidadeMaxima() {
        return 120;
    }
}
