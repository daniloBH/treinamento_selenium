package br.com.touchtec.exerciciosresolvidos.Exercicios_Classes_e_Objetos

import org.codehaus.groovy.ast.expr.BooleanExpression

import javax.swing.text.StyledEditorKit


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



    Monstrinho(String nome, String cor, Integer peso, Integer tamanho) {
        this.setNome(nome);
        this.setCor(cor);
        this.setPeso(peso);
        this.setTamanho(tamanho);
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
        return this.nome
    }

    void setNome(String nome) {
        this.nome = nome
    }

    Boolean maisAltoQue(Monstrinho outroMonstrinho){
        if(this.tamanho > outroMonstrinho.tamanho){
            return true
        }else{
            return false
        }
    }

    Boolean maisPesadoQue(Monstrinho outroMonstrinho) {
        if (this.peso > outroMonstrinho.peso) {
            return true
        } else {
            return false
        }
    }

    Boolean mesmacor(Monstrinho outroMonstrinho){
        if (this.cor == outroMonstrinho.cor){
            return true
        }else{
            return false
        }
    }


    //Pode colocar os métodos aqui


}

Monstrinho monstroGordo = new Monstrinho("Gordola", "Azul", 200, 40);
Monstrinho monstroMagro = new Monstrinho("Vareta", "Laranja", 60, 80);
Monstrinho monstroPequeno = new Monstrinho("Bola", "Azul", 30, 15);
Monstrinho monstroCarrancudo = new Monstrinho("Carranca", "Verde", 150, 70);

monstroPequeno.maisAltoQue(monstroCarrancudo)

monstroGordo.maisPesadoQue(monstroMagro)

monstroGordo.mesmacor(monstroPequeno)


