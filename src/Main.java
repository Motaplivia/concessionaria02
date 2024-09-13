public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Hilux", 2020, 4);
        carro.exibirDetalhes();
        carro.mover();

        Moto moto = new Moto("Yamaha", "MT-09" , 2022, 700);
        moto.exibirDetalhes();
        moto.mover();

        Caminhao caminhao = new Caminhao("volvo", "vmx", 2020, 25.0);
        caminhao.exibirDetalhes();
        caminhao.mover();

        Onibus onibus = new Onibus("Mercedes", "OF-1721", 2018, 50);
        onibus.exibirDetalhes();
        onibus.mover();


    }
}
