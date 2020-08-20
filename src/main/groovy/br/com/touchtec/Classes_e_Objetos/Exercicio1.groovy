package br.com.touchtec.Classes_e_Objetos

import sun.nio.fs.GnomeFileTypeDetector

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

class CasaDosSonhos {
    Integer comodo;
    Integer tamanhoTerreno;
    String local;
    Boolean piscina;
    Integer tamanhoJardim;
    List<String> caracteristica;

    CasaDosSonhos(Integer comodo, Integer tamanhoTerreno, String local,Boolean piscina, Integer tamanhoJardim){
        this.comodo = comodo;
        this.tamanhoTerreno = tamanhoTerreno;
        this.local = local;
        this.piscina = piscina;
        this.tamanhoJardim = tamanhoJardim;
    }
    Integer getComodo(){
        return this.comodo
    }
    void setComodo(Integer Comodo) {
        this.comodo = comodo;
    }
    Integer getTamanhoTerreno(){
        return this.tamanhoTerreno
    }
    void setTamanhoTerreno(Integer tamanhoTerreno){
        this.tamanhoTerreno = tamanhoTerreno;
    }
    String getLocal(){
        return this.local
    }
    void setLocal(String local){
        this.tamanhoTerreno = tamanhoTerreno;
    }
    Boolean getPiscina(){
        return this.piscina
    }
    void setPiscina(boolean piscina){
        this.piscina = piscina;
    }
    Integer getTamanhoJardim(){
        return this.tamanhoJardim
    }
    void setTamanhoJardim(Integer tamanhoJardim){
        this.tamanhoJardim = tamanhoJardim;
    }
    List<String> getCaracteristica(){
        return this.caracteristica;
    }

    void setCaracteristica(List<String> caracteristica){
        this.caracteristica = caracteristica;
    }
}
CasaDosSonhos nossaCasa = new CasaDosSonhos(5,400,"3Corações",true,150)

List<String> caracteristica = ["Era uma casa, muito engraçada", "Não tinha teto, não tinha nada","Ninguém podia entral nela não", "Porque na casa não tinha chão"]
nossaCasa.setCaracteristica(caracteristica);

mostra(nossaCasa.getLocal());
mostra(nossaCasa.getCaracteristica()[0]);
mostra(nossaCasa.getCaracteristica()[1]);
