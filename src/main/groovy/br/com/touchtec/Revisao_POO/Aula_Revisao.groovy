package br.com.touchtec.Revisao_POO

/**
 * Falar sobre public, private e protected!
 * Com isso montar uma classe que tenha as propriedades como private
 *
 * Bônus:
 * Atalhos do Intellij para ajudar a programar:
 *  Alt + Insert: menu de criação de métodos (Constructor, getters, setters, dar Override, etc...
 *  Ctrl + Shift + N: abrir janela de pesquisa pra abrir arquivo
 *  Ctrl + Clique: Vai para o lugar aonde aquilo foi declarado, ou se clicar na declaração, mostra a lista dos lugares que
 * usam o método ou propriedade
 *  Ctrl + Shift + F: busca com vários filtros diferentes
 */

public class Bicho {

    /**
     * Tipos de permissão de acesso:
     * Public: Qualquer um pode usar o que voce está declarando.
     * Private: Apenas a própria classe pode usar o que você está declarando.
     * Protected e o "padrão" (sem nada escrito): uma proteção um pouco mais frouxa que o private,
     * mas não é aberto como o public.
     *
     * Caso queira saber os detalhes, vale a pesquisa no Google qual a diferença entre os 3 no Java ;)
     */
    private String nome;
    private String cor;
    private Integer peso;
    private Integer tamanho;

    public Bicho(String nome, String cor, Integer peso, Integer tamanho) {
        this.nome = nome
        this.cor = cor
        this.peso = peso
        this.tamanho = tamanho
    }

    String getNome() {
        return nome
    }

    /**
     * Setters privados! Evitar que qualquer lugar que usa a classe consiga modificar alguma propriedade.
     *
     * Isso ajuda na manutenção do código, se temos métodos específicos para alterar essas propriedades a classe fica
     * mais "controlada", quem usa a classe tem q seguir um padrão para mudar as coisas da classe.
     */
    private void setNome(String nome) {
        this.nome = nome
    }

    String getCor() {
        return cor
    }

    private void setCor(String cor) {
        this.cor = cor
    }

    Integer getPeso() {
        return peso
    }

    private void setPeso(Integer peso) {
        this.peso = peso
    }

    Integer getTamanho() {
        return tamanho
    }

    private void setTamanho(Integer tamanho) {
        this.tamanho = tamanho
    }

    def getMudar() {
        return mudar
    }

    private void setMudar(mudar) {
        this.mudar = mudar
    }

    private mudarDadosBicho(String nome, String cor, Integer peso, Integer tamanho) {
        this.nome = nome
        this.cor = cor
        this.peso = peso
        this.tamanho = tamanho
    }

    public mudarPesoETamanho(Integer peso, Integer tamanho) {
        this.peso = peso
        this.tamanho = tamanho
    }

}

public class LivroBichos {

    private List<Bicho> listaDeBichos

    public LivroBichos(List<Bicho> listaDeBichos) {
        this.listaDeBichos = listaDeBichos
    }

    /**
     * Ao tentar usar os métodos da classe Bicho veremos que os private não podem ser usados
     */
    private alterarRegistroBicho(Integer posicaoBicho, String nome, String cor, Integer peso, Integer tamanho) {
        Bicho novoBicho = new Bicho(nome, cor, peso, tamanho)
        novoBicho.mudarPesoETamanho(peso, tamanho)
    }
}

