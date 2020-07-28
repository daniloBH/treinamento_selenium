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

<<<<<<< ours
    PastaDeArquivos(Long idDiretorio, String nomePasta, List<String> conteudoArquivos, List<Integer> arquivosPrivados) {
=======
    PastaDeArquivos(Long idDiretorio, String nomePasta, List<String> conteudoArquivos) {
>>>>>>> theirs
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


<<<<<<< ours
<<<<<<< ours
<<<<<<< ours
=======
>>>>>>> theirs
   void setAlteraIdDiretorio(long id){
       this.alterarIdDiretorio(id)

   }

    void setAlterarConteudoDoArquivo(List conteudo){
        this.alterarConteudoDoArquivo(conteudo)

    }
=======
>>>>>>> theirs
<<<<<<< ours
=======
>>>>>>> theirs
=======
>>>>>>> theirs

}

List<String> conteudoDocs = ["Relatórios Gerência", "Documentação Issues Novas", "Folha de Pagamento"]
<<<<<<< ours
<<<<<<< ours
<<<<<<< ours
=======
>>>>>>> theirs
List<String> arquivos = ["Relatórios Gerência - 2019", "Documentação Issues 2019", "Folha de Pagamento - 2019"]

PastaDeArquivos docsTouch = new PastaDeArquivos(532, "docsTouch", conteudoDocs, [2])
docsTouch.setAlteraIdDiretorio(588)
docsTouch.alterarNomePasta('docsTouch2019')
docsTouch.setAlterarConteudoDoArquivo(arquivos)
=======

PastaDeArquivos docsTouch = new PastaDeArquivos(532, "docsTouch", conteudoDocs, [2])

>>>>>>> theirs
/**
 * Esses debvem ser os valores do docsTouch a serem mostrados
=======

PastaDeArquivos docsTouch = new PastaDeArquivos(532, "docsTouch", conteudoDocs)

/**
 * Esses devem ser os valores do docsTouch a serem mostrados
>>>>>>> theirs
 * Id: 588
 * Nome da Pasta: docsTouch2019
 * Conteudo Arquivos: ["Relatórios Gerência - 2019", "Documentação Issues 2019", "Folha de Pagamento - 2019"]
 */

docsTouch.mostrarInfosPasta()
<<<<<<< ours
<<<<<<< ours
<<<<<<< ours

=======
>>>>>>> theirs
=======
>>>>>>> theirs
=======

=======
>>>>>>> theirs
>>>>>>> theirs
