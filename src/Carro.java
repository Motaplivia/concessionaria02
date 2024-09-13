public class Carro extends Veiculo {
    private int qtdDePortas;

    public Carro(String marca, String modelo, int ano, int quantidadeDePortas) {
        super(marca, modelo, ano);
        this.qtdDePortas = qtdDePortas;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Quantidade de Portas: " + qtdDePortas);
    }

    @Override
    public void mover() {
        System.out.println("O carro está acelerando na estrada.");
    }
}
