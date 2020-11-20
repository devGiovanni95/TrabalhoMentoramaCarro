
package Carro;

public class ClasseMainTarefa {
    public static void main(String... args) {
        TarefaCarro carro = new TarefaCarro(4, 4, 2020, "F"); // depois que criamos um construtor na classe publica do carro somos
        // obrigados a
        // declarar no caso a quantidade de pneus que o carro tem
        /*
         * se quizermos deixar a cor do carro como opcional poderemos fazer da seguinte
         * forma: carro.setCor("Cor do carro " + Carro.VERMELHO);
         */
        carro.setCor(TarefaCarro.AZUL);
        carro.setVidroEletrico(TarefaCarro.SIM);
        carro.setAr(TarefaCarro.NAO);
        carro.imprimeValores();
    }
}