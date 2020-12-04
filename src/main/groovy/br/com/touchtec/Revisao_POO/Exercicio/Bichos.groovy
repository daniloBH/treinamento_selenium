package br.com.touchtec.Revisao_POO.Exercicio

class Bichos{
    String nome
    String cor
    Integer peso
    Integer tamanho
    Boolean paginaIlustrativa
//    Map<String> bicharada

    Bichos(String nome, String cor, Integer peso, Integer tamanho, Boolean paginaIlustrativa){
        this.nome = nome
        this.cor = cor
        this.peso = peso
        this.tamanho = tamanho
        this.paginaIlustrativa = paginaIlustrativa
    }

    String getNome() {
        return nome
    }

    void setNome(String nome) {
        this.nome = nome
    }

    String getCor() {
        return cor
    }

    void setCor(String cor) {
        this.cor = cor
    }

    Integer getPeso() {
        return peso
    }

    void setPeso(Integer peso) {
        this.peso = peso
    }

    Integer getTamanho() {
        return tamanho
    }

    void setTamanho(Integer tamanho) {
        this.tamanho = tamanho
    }

    Boolean getPaginaIlustrativa() {
        return paginaIlustrativa
    }

    void setPaginaIlustrativa(Boolean paginaIlustrativa) {
        this.paginaIlustrativa = paginaIlustrativa
    }
}
