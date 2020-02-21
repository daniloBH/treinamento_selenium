package br.com.touchtec.Polimorfismo

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

    void imprimeValor() {
        println(this.valor)
    }
}
