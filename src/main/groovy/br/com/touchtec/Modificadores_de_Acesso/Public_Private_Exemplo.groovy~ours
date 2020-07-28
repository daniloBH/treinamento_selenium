package br.com.touchtec.Modificadores_de_Acesso

class Bicho {

    public String nomeSecreto
    public Boolean voa

    Bicho(String nomeSecreto) {
        this.nomeSecreto = nomeSecreto
    }

    String devolveInfosSecretas() {
        return this.nomeSecreto
    }

    private String alterarNomeSecreto(String nomeSecreto) {
        this.nomeSecreto = nomeSecreto
    }
}

class Macaco extends Bicho{
    String descobrirSegredo() {
        return this.nomeSecreto
    }

    Macaco(String nomeSecreto) {
        super(nomeSecreto)
    }

    String mudar() {
        this.alterarNomeSecreto("Novo nome")
    }

    String imprimeInfos() {
        String texto = "Oi eu sou um macaco, meu nome é:" + this.devolveInfosSecretas()
        return texto
    }
}

Bicho bicho = new Bicho("Babuíno")
bicho.nomeSecreto = "Nome"

Macaco macaco = new Macaco()
println(macaco.descobrirSegredo())
