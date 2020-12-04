package br.com.touchtec.Revisao_POO.Exercicio

import br.com.touchtec.Revisao_POO.Bicho

class PaginaIlustrativa extends Pagina{

    InfoImagem infoImagem
    LegendaImagem legendaImagem

    PaginaIlustrativa(Texto texto, Titulo titulo, InfoImagem infoImagem, LegendaImagem legendaImagem) {
        super(texto, titulo)
        this.infoImagem = infoImagem
        this.legendaImagem = legendaImagem
    }

    /**
     * Os parâmetros desse método ficam a seu critério
     */
    PaginaIlustrativa montaPaginaIlustrativaComBicho(){


    }

    Boolean getInfoImagem(){
        return infoImagem
    }
    void setInfoImagem(Boolean infoImagem){
        this.infoImagem= infoImagem
    }
}
