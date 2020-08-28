package br.com.touchtec.Revisao_POO.Exercicio

/**
 * A partir do infoBichos montar um Livro com as informações abaixo.
 * Os métodos montaLivro, montaPaginaComBicho e montaPaginaIlustrativaComBicho devem ser criados para permitir isso.
 * Olhe as classes Texto, Titulo, InfoImagem e LegendaImagem para saber como montar as paginas.
 *
 * No final, crie um metodo na classe Livro que imprima o Livro passando por todas as paginas criadas.
 */

def infoBichos = [
        [nome: "Jaguatirica", cor: "amarelo e preto", peso: 10, tamanho: 70, paginaIlustrativa: false],
        [nome: "Lobo Guará", cor: "laranja", peso: 19, tamanho: 130, paginaIlustrativa: true, infoImagem: "Uma foto de um Lobo Guará olhando por cima do capim",
            legendaImagem: "O Lobo Guará vai ser o bicho da nota de 200 reais"],
        [nome: "Ariranha", cor: "Marrom", peso: 15, tamanho: 90, paginaIlustrativa: false],
        [nome: "Arara", cor: "azul e amarelo", peso: 1, tamanho: 65, paginaIlustrativa: true, infoImagem: "Um grupo de araras sobrevoando a Amazônia, muito bonito",
            legendaImagem: "As araras vivem com seus parceiros a vida toda"]
]