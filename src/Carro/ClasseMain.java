package Carro;

public class ClasseMain {

    public static void main(String... args) {

        Carro carro = new Carro(4); // depois que criamos um construtor na classe publica do carro somos obrigados a
        // declarar no caso a quantidade de pneus que o carro tem

        carro.setCor("Cor do carro " + Carro.VERMELHO);

        carro.imprimeValores();
    }
}
