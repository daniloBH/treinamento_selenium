package br.com.touchtec.Classes_e_Objetos

import com.sun.org.apache.xerces.internal.xni.parser.XMLDTDContentModelSource

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

class CasaDosSonhos {
    Integer numeroComodo
    Double tamTerreno
    String endereco
    Boolean piscina
    Integer tamJardim
    String caracteristica

    CasaDosSonhos(Integer comodos, Double terreno, String endereco, Boolean piscina, Integer tamJardim, String caracteristica){
        this.numeroComodo = comodos
        this.tamTerreno = terreno
        this.endereco = endereco
        this.piscina = piscina
        this.tamJardim = tamJardim
        this.caracteristica = caracteristica
    }
}
CasaDosSonhos minhaCasa = new CasaDosSonhos(2, 300, 'Rua das laranjeiras', true, 200,'Branca')
