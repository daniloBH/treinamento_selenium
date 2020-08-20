package br.com.touchtec.Polimorfismo

import org.codehaus.groovy.runtime.dgmimpl.arrays.IntegerArrayGetAtMetaMethod

/**
 * A partir da classe Ingresso implemente as seguintes classes com seus devidos métodos:
 *  1) Classe VIP que herda Ingresso e possui uma propriedade valorAdicional e um método que devolve
 *  o valor total do ingresso VIP (valor normal + o valorAdicional)
 *  2) Classe Normal que herda Ingresso e tem um método que imprime: "Ingresso Normal"
 *  3) Classe CamaroteInferior que herda da VIP, possui uma propriedade localizacao e um método para imprimir essa propriedade
 *  4) Classe CamaroteSuperior que herda da VIP, possui uma propriedade valorCamarote e um método para devolver o valor total
 *  do ingresso
 *
 *  Obs.: O método que calcula o valor do ingresso irá ser declarado na classe VIP e sobreposto caso necessário nas classes que
 * herdaram a VIP
 */

class Ingresso {
    Integer valor

    Ingresso(Integer valor){
        this.valor = valor;
    }

    void imprimeValor() {
        println(this.valor)
    }
}
class VIP extends Ingresso {
    Integer valorAdicional

    VIP(Integer valorAdicional) {
        super(200)
        this.valorAdicional = valorAdicional
    }
    Integer valorVip(){
        return this.valorAdicional + valor
    }
}

class Normal extends Ingresso {
    Integer valorNormal

    Normal(Integer valorNormal){
        super(100);
        this.valorNormal = valorNormal;
    }

    void imprimeValor(){
        println(this.valorNormal)
    }
}
class CamaroteInferior extends VIP {
    String local
    Integer camarote

    CamaroteInferior(String local, Integer camarote){
        super(80)
        this.local = local;
        this.camarote = camarote;
    }
    Integer valorCamarote(){
        return this.camarote + valorAdicional
    }
    void imprimeLocal(){
        println(this.local)
    }

}
class CamaroteSuperior extends VIP{

}
