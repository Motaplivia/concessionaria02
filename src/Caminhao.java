public class Caminhao extends Veiculo {
    private double cpddDeCarga;

    public Caminhao(String marca, String modelo, int ano, double capacidadeDeCarga) {
        super(marca, modelo, ano);
        this.cpddDeCarga = capacidadeDeCarga;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Capacidade de Carga: " + cpddDeCarga + " toneladas");
    }

    @Override
    public void mover() {
        System.out.println("O caminhão está transportando carga.");
    }
}
