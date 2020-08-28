package br.com.touchtec.Revisao_POO

/**
 * Com isso montar uma classe que tenha as propriedades como private
 *
 * Bônus:
 * Atalhos do Intellij para ajudar a programar:
 *  Alt + Insert: menu de criação de métodos (Constructor, getters, setters, dar Override, etc...
 *  Ctrl + Shift + N: abrir janela de pesquisa pra abrir arquivo
 *  Ctrl + Clique: Vai para o lugar aonde aquilo foi declarado, ou se clicar na declaração, mostra a lista dos lugares que
 * usam o método ou propriedade
 *  Ctrl + Shift + F: busca com vários filtros diferentes
 *  Renomear variavel/metodo/propriedade: clique direito em cima do que quer renomear -> Refactor -> Rename (ou Shift + F6)
 */

public class Bicho {

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
        return this.nome
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
        return this.cor
    }

    private void setCor(String cor) {
        this.cor = cor
    }

    Integer getPeso() {
        return this.peso
    }

    private void setPeso(Integer peso) {
        this.peso = peso
    }

    Integer getTamanho() {
        return this.tamanho
    }

    private void setTamanho(Integer tamanho) {
        this.tamanho = tamanho
    }

    /**
     * Polimorfismo de sobrecarga!
     * Várias 'versões' do mesmo método, mas com parâmetros diferentes
     */
    private void mudarDadosBicho(String nome, String cor, Integer peso, Integer tamanho) {
        this.setNome(nome)
        this.cor = cor
        this.peso = peso
        this.tamanho = tamanho
    }

    private void mudarDadosBicho(String cor, Integer peso, Integer tamanho) {
        this.cor = cor
        this.peso = peso
        this.tamanho = tamanho
    }

    public void mudarPesoETamanho(Integer peso, Integer tamanho) {
        this.peso = peso
        this.tamanho = tamanho
    }

    public void mudaNomeECor(String nome, String cor) {
        this.setNome(nome)
        this.setCor(cor)
    }

}

/**
 * Hieraraquia - Montar uma classe derivada de Bicho
 * Polimorfismo - Na classe derivada deve ter métodos que sobrescrevem da classe Bicho (sobreposição)
 *              - Também deve ter métodos com várias assinaturas (sobrecarga)
 *
 */

public class BichoMarinho extends Bicho{
    Boolean temCauda
    String tipoCauda
    Boolean respiraDebaixoDagua

    BichoMarinho(String nome, String cor, Integer peso, Integer tamanho, Boolean temCauda, String tipoCauda, Boolean respiraDebaixoDagua) {
        super(nome, cor, peso, tamanho)
        this.temCauda = temCauda
        this.tipoCauda = tipoCauda
        this.respiraDebaixoDagua = respiraDebaixoDagua
    }

    BichoMarinho(String nome, String cor, Integer peso, Integer tamanho, Boolean temCauda) {
        super(nome, cor, peso, tamanho)
        this.temCauda = temCauda
    }

    Boolean getTemCauda() {
        return temCauda
    }

    void setTemCauda(Boolean temCauda) {
        this.temCauda = temCauda
    }

    String getTipoCauda() {
        return tipoCauda
    }

    void setTipoCauda(String tipoCauda) {
        this.tipoCauda = tipoCauda
    }

    Boolean getRespiraDebaixoDagua() {
        return respiraDebaixoDagua
    }

    void setRespiraDebaixoDagua(Boolean respiraDebaixoDagua) {
        this.respiraDebaixoDagua = respiraDebaixoDagua
    }

    @Override
    void mudarPesoETamanho(Integer peso, Integer tamanho) {
        super.mudarPesoETamanho(peso, tamanho)
    }

    void mudaInfosCauda(Boolean temCauda) {
        this.temCauda = temCauda
    }

    void mudaInfosCauda(Boolean temCauda, String tipoCauda) {
        this.temCauda = temCauda
        this.tipoCauda = tipoCauda
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

