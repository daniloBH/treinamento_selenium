package br.com.touchtec.Modificadores_de_Acesso

class Bicho {

    /**
     * Private indica que essas propriedades só podem ser acessadas dentro da classe Bicho
     * É como se elas fossem invisíveis para quem está fora da classe
     */
    private String nomeSecreto
    private Boolean voa

    Bicho(String nomeSecreto) {
        this.nomeSecreto = nomeSecreto
    }

    /**
     * Olha só, esse método é public mas ele chama uma propriedade private!
     * Desse jeito quem está de fora consegue ver indiretamente o nomeSecreto, é só chamar esse método
     */
    String devolveInfosSecretas() {
        return this.nomeSecreto
    }

    /**
     * Um método private só pode ser utilizado dentro da classe
     * Novamente é como se ele fosse invisível para quem está fora
     */
    private String alterarNomeSecreto(String nomeSecreto) {
        this.nomeSecreto = nomeSecreto
    }
}

class Macaco extends Bicho{
    /**
     * Esse acesso a propriedade nomeSecreto viola o private e não funcionará!
     */
    String descobrirSegredo() {
        return this.nomeSecreto
    }

    Macaco(String nomeSecreto) {
        super(nomeSecreto)
    }

    /**
     * Tentar usar a função private não vai dar certo aqui! Viola o private!
     */
    String mudar() {
        this.alterarNomeSecreto("Novo nome")
    }

    String imprimeInfos() {
        String texto = "Oi eu sou um macaco, meu nome é:" + this.devolveInfosSecretas()
        return texto
    }
}

Bicho bicho = new Bicho("Babuíno")
/**
 * Ihh mais uma vez, nomeSecreto é secreto! Só pode chamar ele desse jeito dentro da classe!
 */
bicho.nomeSecreto = "Nome"

Macaco macaco = new Macaco()
/**
 * Desse jeito não vai pegar o nomeSecreto, pq ele tenta acessar a propriedade nomeSecreto pela classe Macaco
 */
println(macaco.descobrirSegredo())
/**
 * Chamando assim conseguimos imprimir o nomeSecreto
 */
println(macaco.devolveInfosSecretas())
