package br.com.touchtec.Modificadores_de_Acesso
/**
 * Nesse exercicio você mexerá na classe PastaDeArquivos, ela possui métodos privados e todas suas propriedades são
 * privadas também. Seu objetivo é encontrar um jeito de modificar todas as propriedades da classe para poder realizar
 * as mudanças pedidas no final do exercicio.
 * Voce pode modificar a classe, mas nada de apagar os privates!
 */
class PastaDeArquivos {
    private Long idDiretorio
    private String nomePasta
    private List<String> conteudoArquivos

    PastaDeArquivos(Long idDiretorio, String nomePasta, List<String> conteudoArquivos, List<Integer> arquivosPrivados) {
        this.idDiretorio = idDiretorio
        this.nomePasta = nomePasta
        this.conteudoArquivos = conteudoArquivos
    }

    private alterarIdDiretorio(Long novoId) {
        this.idDiretorio = novoId
    }

    void alterarNomePasta(String novoNome){
        this.nomePasta = novoNome
    }

    private void alterarConteudoDoArquivo(List<String> novoConteudo) {
        this.conteudoArquivos = novoConteudo
    }

    void mostrarInfosPasta() {
        println("Id:" + this.idDiretorio+ "\n" +
                "Nome da Pasta:" + this.nomePasta + "\n" +
                "Conteudo Arquivos:" + this.conteudoArquivos + "\n")
    }



}

List<String> conteudoDocs = ["Relatórios Gerência", "Documentação Issues Novas", "Folha de Pagamento"]

PastaDeArquivos docsTouch = new PastaDeArquivos(532, "docsTouch", conteudoDocs, [2])

/**
 * Esses debvem ser os valores do docsTouch a serem mostrados
 * Id: 588
 * Nome da Pasta: docsTouch2019
 * Conteudo Arquivos: ["Relatórios Gerência - 2019", "Documentação Issues 2019", "Folha de Pagamento - 2019"]
 */

docsTouch.mostrarInfosPasta()
