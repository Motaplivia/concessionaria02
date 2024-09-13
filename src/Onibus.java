public class Onibus extends Veiculo {
    private int numDeAssentos;

    public Onibus(String marca, String modelo, int ano, int numeroDeAssentos) {
        super(marca, modelo, ano);
        this.numDeAssentos = numeroDeAssentos;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Número de Assentos: " + numDeAssentos);
    }

    @Override
    public void mover() {
        System.out.println("O ônibus está transportando passageiros.");
    }
}
