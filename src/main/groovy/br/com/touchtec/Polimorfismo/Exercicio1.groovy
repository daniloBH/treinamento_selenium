package br.com.touchtec.Polimorfismo

import com.sun.java.swing.plaf.windows.WindowsTextAreaUI
import org.codehaus.groovy.runtime.dgmimpl.arrays.IntegerArrayGetAtMetaMethod

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
    public Integer valorNormal

    Ingresso(Integer valorNormal){
        this.valorNormal = valorNormal;
    }

    void imprimeValorNormal() {
        println("Valor do Ingresso Normal: " + this.valorNormal)
    }
}

class VIP extends Ingresso {
    Integer valorAdicional

    VIP(Integer valorAdicional, Integer valorNormal){
        super(valorNormal);
        this.valorAdicional = valorAdicional
    }

    Integer valorVip(){
        return (super.valorNormal + this.valorAdicional)
    }

    void imprimeValorVip() {
        println("Valor do Ingresso VIP: " + this.valorVip())
    }
}

class CamaroteInferior extends VIP {
    String local

    CamaroteInferior(String local){
        super(20,30)
        this.local = local;
    }

//    String getLocal(){
//        return this.local
//    }
    void setLocal(String local){
        this.local = local;
    }
    void imprimeLocal(){
        println("A Localização é: " + this.local)
    }

}
class CamaroteSuperior extends VIP{
    Integer valorCamaroteSuperior

    CamaroteSuperior(Integer valorCamaroteSuperior, Integer valorAdicional, Integer valorNormal){
        super(valorAdicional,valorNormal);
        this.valorCamaroteSuperior = valorCamaroteSuperior
    }

    Integer valorCamarote(){
        return  (this.valorAdicional + this.valorNormal + this.valorCamaroteSuperior);
    }

    void imprimeCamaroteSuperior() {
        println("Valor do Ingresso Camarote Superior: " + this.valorCamarote());
    }

}

Ingresso ingressoNormal = new Ingresso(100);
println(ingressoNormal.imprimeValorNormal());

VIP ingressoVip = new VIP(200,100);
println(ingressoVip.imprimeValorVip());

CamaroteInferior local = new CamaroteInferior("Av dos Ipês, 2135, Jd das Flores - SP")
println(local.imprimeLocal())

CamaroteSuperior ingressoCamarote = new CamaroteSuperior(150, 200, 100);
println(ingressoCamarote.imprimeCamaroteSuperior())

//String endereco = "Av dos Ipês - 2135, Jd Das Flores"