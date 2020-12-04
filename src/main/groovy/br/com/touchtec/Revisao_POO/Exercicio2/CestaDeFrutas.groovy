package br.com.touchtec.Revisao_POO.Exercicio2

class CestaDeFrutas {
    String dono
    /**
     * Nas listas abaixo, o nome da fruta fica na lista frutas, e a quantidade dessa fruta fica na lista quantidades.
     * Ou seja se foram colhidas 5 maçãs e 1 abacaxi:
     * frutas = ["Maçãs", "Abacaxi]
     * quantidades = [5, 1]
     */
    List<String> frutas
    List<Integer> quantidades

    String getDono() {
        return dono
    }

    void setDono(String dono) {
        this.dono = dono
    }

    List<String> getFrutas() {
        return frutas
    }

    void setFrutas(List<String> frutas) {
        this.frutas = frutas
    }

    List<Integer> getQuantidades() {
        return quantidades
    }

    void setQuantidades(List<Integer> quantidades) {
        this.quantidades = quantidades
    }
}
