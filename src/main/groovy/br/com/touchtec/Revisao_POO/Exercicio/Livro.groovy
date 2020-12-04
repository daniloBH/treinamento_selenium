package br.com.touchtec.Revisao_POO.Exercicio

/**
 * O Livro possui um conjunto de paginas e métodos que permitem montar as paginas de um livro a partir de um conjunto
 * de informações de diversos Bichos.
 * montaLivro -> método que recebe informações de todos os Bichos descritos no livro e monta uma pagina pra cada,
 * decide se a página é Ilustrativa ou não pela propriedade paginaIlustrativa fornecida.
 * Se for ilustrativa, ela tambem terá a infoImagem e a legendaImagem.
 */

class Livro {

    List<Pagina> listaPaginas
    List<PaginaIlustrativa> listaPaginaIlustrativa

    Livro(){
        super()
    }

    Livro(List<Pagina> listaPaginas, List<PaginaIlustrativa> listaPaginaIlustrativa){
        this.listaPaginas = listaPaginas
        this.listaPaginaIlustrativa = listaPaginaIlustrativa
    }

    // Este método que recebe a Lista de Bichos, para a montegem do livro..
    // A Lista está no arquivo Exercicio1

    Livro montaLivro(List<Bichos> listaDosBichos){
        for(Bichos bicho : listaDosBichos){


        }


    }



}