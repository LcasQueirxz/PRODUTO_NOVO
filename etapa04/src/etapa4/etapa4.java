package etapa4;

class conta {
    private String nome;
    private double precoCusto;
    private double precoVenda;
    private String dataFabricacao;
    private String dataValidade;

    // Construtor que recebe todos os atributos
    public conta(String nome, double precoCusto, double precoVenda, String dataFabricacao, String dataValidade) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.dataFabricacao = dataFabricacao;
        this.dataValidade = dataValidade;
    }

    // Construtor que recebe nome, preco de custo, preco de venda e data de fabricacao
    // A data de validade sera 1 mes apos a data de fabricacao
    public conta(String nome, double precoCusto, double precoVenda, String dataFabricacao) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.dataFabricacao = dataFabricacao;
        this.dataValidade = calcularDataValidade(dataFabricacao);
    }

    // Construtor que recebe apenas nome e preco de custo
    // O preco de venda sera 10% a mais sobre o preco de custo
    // A data de validade sera 1 mes apos a data de fabricacao
    public conta(String nome, double precoCusto) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoCusto * 1.10;
        this.dataFabricacao = "01/01/2024";  // Definir uma data padrao ou deixar para ser definida depois
        this.dataValidade = calcularDataValidade(this.dataFabricacao);
    }

    // Metodo para calcular a data de validade (simples)
    private String calcularDataValidade(String dataFabricacao) {
        // Simula a adicao de um mes
        return "01/02/2024";  // Substituir por logica de calculo de mes
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
    public String getConta() {
    	return "nome: " + nome  + " precoCusto : " + precoCusto + " precoVenda : " + precoVenda + " dataFabricacao: " + dataFabricacao;
    }

}
public class etapa4 {
    public static void main(String[] args) {
        // Teste dos diferentes construtores
        conta produto1 = new conta("Produto A", 100.0, 150.0, "01/01/2024", "01/06/2024");
        conta produto2 = new conta("Produto B", 200.0, 250.0, "01/01/2024");
        conta produto3 = new conta("Produto C", 300.0);
        // exibindo informacoes dos produtos
        System.out.println("Nome: " + produto1.getNome() + ", Preco Venda: " + produto1.getPrecoVenda());
        System.out.println("Nome: " + produto2.getNome() + ", Preco Venda: " + produto2.getPrecoVenda());
        System.out.println("Nome: " + produto3.getNome() + ", Preco Venda: " + produto3.getPrecoVenda());
        // exibindo informacoes dos produtos usando getConta()
        System.out.println(produto1.getConta());
        System.out.println(produto2.getConta());
        System.out.println(produto3.getConta());
    }
}
    



