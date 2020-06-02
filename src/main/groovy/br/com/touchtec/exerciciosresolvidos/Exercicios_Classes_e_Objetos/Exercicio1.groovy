package br.com.touchtec.exerciciosresolvidos.Exercicios_Classes_e_Objetos

import javax.swing.JFrame
import javax.swing.JOptionPane


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

def mostra = { def texto ->
    JFrame frame = new JFrame()
    String answer = JOptionPane.showMessageDialog(frame, texto.toString())
    frame.dispose()
    return answer
}

class CasaDosSonhos{
    Integer comodo;
    Double tamanhoTerrenoX;
    Double tamanhoTerrenoY;
    String local;
    boolean temPiscina;
    Double tamanhoJardim;
    String minhaMansao;

    CasaDosSonhos(Integer comodo, Double tamanhoTerrenoX, Double tamanhoTerrenoY, String local, boolean temPiscina, Double tamanhoJardim, String minhaMansao){
        this.comodo = comodo;
        this.tamanhoTerrenoX = tamanhoTerrenoX;
        this.tamanhoTerrenoY = tamanhoTerrenoY;
        this.local = local;
        this.temPiscina = temPiscina;
        this.tamanhoJardim = tamanhoJardim;
        this.minhaMansao = minhaMansao;

    }
    Integer getcomodo(){
        return this.comodo;
    }
    void setcomodo(Integer comodo){
        this.comodo = comodo;
    }
    Double gettamanhoTerrenoX(){
        return this.tamanhoTerrenoX;
    }
    void settamanhoTerrenoX(Double tamanhoTerrenoX){
        this.tamanhoTerrenoX = tamanhoTerrenoX;
    }
    Double gettamanhoTerrenoY(){
        return this.tamanhoTerrenoY;
    }
    void settamanhoTerrenoY(Double tamanhoterrenoY){
        this.tamanhoTerrenoY = tamanhoterrenoY;
    }
    String getlocal(){
        return this.local;
    }
    void setlocal(String local){
        this.local = local;
    }
    boolean gettemPiscina(){
        return this.temPiscina;
    }
    void settemPiscina(boolean temPiscina){
        this.temPiscina = temPiscina;
    }
    Double gettamanhoJardim(){
        return this.tamanhoJardim;
    }
    void settamanhoJardim(Double tamanhoJardim){
        this.tamanhoJardim = tamanhoJardim;
    }
    String getminhaMansao(){
        return this.minhaMansao;
    }
    void setminhaMansao(String minhaMansao){
        this.minhaMansao = minhaMansao;
    }
}

CasaDosSonhos minhaCasaMinhaVida = new CasaDosSonhos(15,40,50,"Presidente Epitácio", true, 2000, "No meio da Floresta" )
//Integer cmd = minhaCasaMinhaVida.getcomodo();
//mostra(cmd);