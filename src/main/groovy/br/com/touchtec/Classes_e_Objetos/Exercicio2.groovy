package br.com.touchtec.Classes_e_Objetos


/**
 * Nesse exercicio você é um cuidador de um santuário de Monstrinhos e lá você guarda uma ficha de todos eles.
 * Para ajudar temos a classe Monstrinho que descreve com alguns atributos um monstrinho qualquer.
 * A classe já tem todos os atributos que precisa mas não os métodos que irão te ajudar. Você precisa criar os
 * seguintes métodos:
 * 1) maisAltoQue(Monstrinho outroMonstrinho) -> devolve verdadeiro se o monstrinho é mais alto que o outro, retorno um Boolean
 * 2) maisPesadoQue(Monstrinho outroMonstrinho) -> devolve verdadeiro se o monstrinho é mais pesado que o outro, retorna um Boolean
 * 3) mesmaCor(Monstrinho outroMonstrinho) -> devolve verdadeiro se o outro for da mesma cor.
 *
 * Depois de criar esses métodos na classe Monstrinho, use eles para comparar os Monstrinhos criados depois da declaração da classe.
 */

class Monstrinho {

    String nome;
    String cor;
    Integer peso;
    Integer tamanho;
    Integer agressividade;


    Monstrinho(String nome, String cor, Integer peso, Integer tamanho, Integer agressividade) {
        this.setNome(nome);
        this.setCor(cor);
        this.setPeso(peso);
        this.setTamanho(tamanho);
        this.setAgressividade(agressividade)
    }

    Integer getTamanho() {
        return tamanho
    }

    void setTamanho(Integer tamanho) {
        this.tamanho = tamanho
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

    String getNome() {
        return nome
    }

    void setNome(String nome) {
        this.nome = nome
    }

    Integer getAgressividade(){
        return agressividade
    }
    void setAgressividade(Integer agressividade) {
        this.agressividade = agressividade
    }

    //Pode colocar os métodos aqui

    Boolean maisAltoQue (Monstrinho outroMonstrinho){
        if(this.tamanho > outroMonstrinho.tamanho){
            return true
        }else{
            return false
        }
    }
    Boolean maisPesadoQue (Monstrinho outroMonstrinho) {
        if (this.peso > outroMonstrinho.peso) {
            return true
        } else {
            return false
        }
    }
    Boolean mesmaCor (Monstrinho outroMonstrinho) {
        if (this.cor > outroMonstrinho.cor) {
            return true
        } else {
            return false
        }
    }
    Boolean luta(Monstrinho outroMonstrinho){
        if (this.forca(this.peso, this.tamanho, this.agressividade)
                >= this.forca(outroMonstrinho.peso, outroMonstrinho.tamanho, outroMonstrinho.agressividade)){
            return true;
        } else {
            return false;
        }
    }
    Double forca (Integer peso, Integer tamanho, Integer agressividade) {
        return (0.8 * peso + 1.1 * tamanho + 1.2 * agressividade) / 3
    }



}

/**
 * Exercicio Extra! Para aqueles que vão além
 *
 * Briga de monstrinho!
 * Agora crie um método luta(Monstrinho outroMonstrinho) que determina se o monstro que chamou a luta ganha
 * do outro.
 * Para saber se um monstro ganha do outro implemente a seguinte lógica:
 * 1) Ganha se tiver mais força que o outro.
 * 2) A força é determinada usando a seguinte fórmula:
 *      força = (0.8 * peso + 1.1 * tamanho + 1.2 * agressividade)/3
 * 3) Veja q temos a agressividade agora, ela será uma nova propriedade Integer dos monstrinhos, implemente ela tmbm,
 * 4) Modifique o contrutor para incluir essa propriedade e inicialize os monstrinhos abaixos com os seguintes valores:
 *      monstroGordo -> agressividade = 10
 *      monstroMagro -> agressividade = 20
 *      monstroPequeno -> agressividade = 30
 *      monstroCarrancudo -> agressividade = 15
 * 5) Agora determine qual monstro ganha de todos os outros! Para isso monte algo como um torneio entre eles
 */


Monstrinho monstroGordo = new Monstrinho("Gordola", "Azul", 200, 40,50);
Monstrinho monstroMagro = new Monstrinho("Vareta", "Laranja", 60, 80,40);
Monstrinho monstroPequeno = new Monstrinho("Bola", "Azul", 30, 15,20);
Monstrinho monstroCarrancudo = new Monstrinho("Carranca", "Verde", 150, 70,10);

monstroGordo.setAgressividade(10);
monstroMagro.setAgressividade(20);
monstroPequeno.setAgressividade(30);
monstroCarrancudo.setAgressividade(15);

Monstrinho vencedor, vencedor1;

if (monstroGordo.luta(monstroMagro)){
    println ("Round 1 Vencedor:" + monstroGordo.nome);
    vencedor = monstroGordo;
} else {
    println ("Round 1 Vencedor: " + monstroMagro.nome);
    vencedor = monstroMagro;
}
if (monstroPequeno.luta(monstroCarrancudo)){
    println("Round 2 Vencedor:" + monstroPequeno.nome)
    vencedor1 = monstroPequeno;
} else {
    println ("Round 2 Vencedor: " + monstroCarrancudo.nome);
    vencedor1 = monstroCarrancudo;
}
if (vencedor.luta(vencedor1)){
    println ("Round 3 Vencedor: " + vencedor.nome);
}else {
    println("Round 3 Vencedor: " + vencedor1.nome);
}
