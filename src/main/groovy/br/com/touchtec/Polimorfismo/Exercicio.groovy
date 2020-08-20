package br.com.touchtec.Polimorfismo

/**
 * A partir da classe Ingresso implemente as seguintes classes com seus devidos métodos:
 *  1) Classe VIP que herda Ingresso e possui uma propriedade valorAdicional e um método que devolve
 *  o valor total do ingresso VIP (valor normal + o valorAdicional)
 *  2) Na classe VIP a imprimeValor deverá utilizar esse valor total em vez do valor normal
 *  3) Classe CamaroteInferior que herda da VIP, possui uma propriedade localizacao e um método para imprimir essa propriedade
 *  4) Classe CamaroteSuperior que herda da VIP, possui uma propriedade valorCamarote e um método para devolver o valor total
 *  do ingresso (valor do VIP + valor camarote). Esse valor total deverá ser impresso pelo método imprimeValor
 *
 */

class Ingresso {
    Integer valor

    Ingresso(){}

    void imprimeValor() {
        println(this.valor)
    }
}
//Colocar espaço entre cada declaração!! E tambem entre as classes
//Isso vai deixar mais legível
//Outra coisa, pode tirar os construtores vazios
class Vip extends Ingresso {
    Integer valorAdicional

    float valor() {
        return valor + this.valorAdicional
    }
   @Override
    void imprimeValor(){
        println(this.valor())
    }
}
class CamaroteInferior extends Vip {
    String localizacao

    void imprimeLocal(){
        println(this.localizacao)
    }
}
class CamaroteSuperior extends Vip {
    Integer valorCamarote
    CamaroteSuperior(){}

    float valor(){
        return super.valor() + valorCamarote
    }
    @Override
    void imprimeValor(){
        println(this.valor())
    }
}
