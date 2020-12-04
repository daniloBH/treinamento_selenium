package br.com.touchtec.Polimorfismo

/**
 * Polimorfismo
 *
 * Polimorfismo ("Muitas Formas") na Orientação a Objetos, é o nome dado para a capacidade de se usar um mesmo elemento de
 * diferentes formas.
 *
 * Isso ocorre de duas formas:
 *
 *  Sobrecarga e
 *  Sobreposição
 */

class Forma {
    Integer largura
    Integer altura

    Forma() {}

    /**
     * No método soma() temos uma sobrecarga. Veja que o mesmo método é declarado quatro vezes! Mas ele aceita um número diferente
     * de parâmetros em cada declaração!
     *
     * Isso é o Polimorfismo de "Sobrecarga", você cria várias versões do mesmo método em uma classe que funcionam de forma
     * diferente. Cada declaração deve ter algo que diferencie ela das outras, ou seja, ela aceita um tipo ou número diferente
     * de parâmetros. Chamamos essas diferentes combinações de parâmetros de diferentes assinaturas do método.
     * Por exemplo as assinaturas do soma são:
     * - soma(Integer numero)
     * - soma(String texto)
     * - soma(Integer numero1, Integer numero2)
     * - soma(Integer numero, String texto)
     * Voce pode mudar o tipo que o método retorna entre as diferentes funções, mas ele não muda a assinatura!!
     * Ou seja, se tivessemos um String soma(Integer numero) ele daria problema por ter a mesma "assinatura" do
     * Integer soma(Integer numero).
     */
    Integer soma(Integer numero) {
        return largura + numero
    }

    Integer soma(String texto) {
        return texto.toInteger() + largura
    }

    Integer soma(Integer numero1, Integer numero2) {
        return numero1 + numero2
    }

    String soma(String numero1, Integer numero2) {
        return numero1 + numero2
    }

    String soma(Integer numero, String texto) {
        return (numero + texto.toInteger()).toString()
    }

    Integer calculaArea() {
        return largura * altura
    }
}

Forma forma = new Forma(largura: 2, altura: 3)
println(forma.soma(2) == forma.largura + 2)
println(forma.soma("5") == forma.largura + 5)
println(forma.soma(2, 2) == 4)

/**
 * Agora com a classe Triangulo podemos ver um Polimorfismo de Sobreposição. Nesse caso o método calculaArea é declarado
 * na classe Triangulo de forma diferente da classe pai Forma. Isso significa que um objeto Triangulo que chame o calculaArea
 * usará a implementação do método da Triangulo.
 * Obs.: Um triangulo não consegue calcular a area usando a formula da Forma!!
 */
class Triangulo extends Forma{

    @Override
    Integer calculaArea() {
        return (largura * altura)/2
    }

    /**
     * Nesse método usamos o super.calculaArea.
     * O super indica que voce quer usar a versão do método declarado na classe pai
     * Se tirarmos o super ele usará o calculaArea do Triangulo e fará a conta errada
     */
    Integer calculaAreaAlternativo() {
        return super.calculaArea()/2
    }
}

Triangulo triangulo = new Triangulo(largura: 4, altura: 2)
println(triangulo.calculaArea() == 4)
println(triangulo.calculaAreaAlternativo() == 4)

/**
 * Já no Retangulo, o calculaArea continua funcionando como ele foi declarado na classe Forma
 */
class Retangulo extends Forma {
    Integer diagonal

    Integer determinaDiagonal() {
        this.diagonal = Math.sqrt(largura^2 + altura^2).toInteger()
    }
}

Retangulo retangulo = new Retangulo(largura: 8, altura: 6)
println(retangulo.calculaArea() == 48)

