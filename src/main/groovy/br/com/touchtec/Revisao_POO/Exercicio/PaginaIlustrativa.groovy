package br.com.touchtec.Revisao_POO.Exercicio

import br.com.touchtec.Revisao_POO.Bicho

class PaginaIlustrativa extends Pagina{

    /**
     * A infoImagem
     */
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
    PaginaIlustrativa montaPaginaIlustrativaComBicho() {

    }
}
