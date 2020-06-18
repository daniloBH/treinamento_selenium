package br.com.touchtec.ExerciciosResolvidos.ExerciciosClasses

/**
 * Construindo a sua casa
 * Crie uma classe chamada CasaDosSonhos que tenha os seguintes atributos:
 * 1) número de comodos
 * 2) tamanho do terreno em metros quadrados
 * 3) texto descrevendo aonde a casa ficaria
 * 4) tem piscina?
 * 5) tamanho do jardim em metros quadrados
 * 6) um texto com alguma característica importante pra sua casa dos sonhos
 *
 * Depois de criada a classe, crie o objeto da sua Casa dos Sonhos com os valores que
 * sua casa dos sonhos teria
 */

class CasaDoSonhos{
    Integer comodos
    Double terreno
    String endereco
    Boolean piscina
    Double jardim
    String caracteristica
    CasaDoSonhos(Integer comodos, Double terreno, String endereco, Boolean piscina, Double jardim, String caracteristica){
        this.comodos = comodos
        this.terreno = terreno
        this.endereco = endereco
        this.piscina = piscina
        this.jardim = jardim
        this.caracteristica = caracteristica

    }
}
CasaDoSonhos CasaDosSonhos = new CasaDoSonhos(6,600, 'Rua das laranjeiras', true, 200, 'Branca e Linda')