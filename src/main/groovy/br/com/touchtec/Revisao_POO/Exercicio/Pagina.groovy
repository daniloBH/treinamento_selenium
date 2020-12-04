package br.com.touchtec.Revisao_POO.Exercicio

import br.com.touchtec.Revisao_POO.Bicho
import com.sun.org.apache.xpath.internal.operations.Bool
import com.sun.org.apache.xpath.internal.operations.String

import javax.xml.soap.Text

class Pagina {

    Texto texto
    Titulo titulo

    Pagina(Texto texto, Titulo titulo) {
        this.texto = texto
        this.titulo = titulo
    }

/**
 * Os parâmetros desse método ficam a seu critério
 */

    static Pagina montaPaginaComBicho(Bichos bicho){
        this.texto = Texto.montaTexto(bicho.getNome(),bicho.getCor(),bicho.getTamanho(),bicho.getPeso())
        this.titulo = new Titulo("Informações sobre o Bicho: ")



    }
}
