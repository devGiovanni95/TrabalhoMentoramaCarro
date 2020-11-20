package Carro;

public class Carro {
    public static final String VERMELHO = "Vermelho";
    public static final String PRETA = "Preta";

    private Integer quantidadePneus;
    private Integer quantidadeCalotas;
    private Integer quantidadeParafusosPneus;

    /*
     * public Carro() {} = construtor que o java automaticamente cria
     */
    /*
     * o construtor acima e a versao basica que o java ja cria. agora se quizermos
     * que ele mostre algumas informações como a quantidade de pneus do carro
     * faremos assim:
     */
    public Carro(Integer quantidadePneus) {
        setQuantidadePneus(quantidadePneus);
        // this.quantidadePneus = quantidadePneus; utilizaremos o uoutro modo para que
        // possamos criar varia regras
        /*
         * o this.quantidadePneus pega dav vaiavel la fora e po segungo quantidadePneus
         * pega do construtor declarado na classe
         */
    }

    /*
     * criaremos uma regra para adicionar + 1 na quantidade de pneus para constar o
     * Estepe do carro tambem
     */
    public Integer getQuantidadePneus() {
        return quantidadePneus + 1;
        /*
         * criando essa regra poderemos alterar a quantitade de estepes que irão em cada
         * carro podendo mudar para qualquer valor que quizermos
         */
    }

    public void setQuantidadePneus(Integer quantidadePneus) {

        // quantidadeCalotas = quantidadePneus; o certo seria :
        setQuantidadeCalotas(quantidadePneus);
        quantidadeParafusosPneus = quantidadePneus * 4;
        this.quantidadePneus = quantidadePneus;
    }

    public void setCor(String cor) {
        System.out.println(cor);
    }

    /*
     * Para criarmos o getter e o setter tem um atalho cliqua com botao direito do
     * mause + generate +getter and setter + ;escolhe os que estao faltando e pronto
     */
    public Integer getQuantidadeCalotas() {
        return quantidadeCalotas;
    }

    public void setQuantidadeCalotas(Integer quantidadeCalotas) {
        this.quantidadeCalotas = quantidadeCalotas;
    }

    public Integer getQuantidadeParafusosPneus() {
        return quantidadeParafusosPneus;
    }

    public void setQuantidadeParafusosPneus(Integer quantidadeParafusosPneus) {
        this.quantidadeParafusosPneus = quantidadeParafusosPneus;
    }

    public void imprimeValores() {
        System.out.println("Quantidade de pneus " + getQuantidadePneus());
        System.out.println("Quantidade de calotas " + getQuantidadeCalotas());
        System.out.println("Quantidade de parafusos para pneu " + getQuantidadeParafusosPneus());

        /*
         * quantidadePneus = nao utilizaremos essa variavel pois ela mostra quantos
         * pneus o carro poswsui , mas queremos mostra tambem a soma total de pneus que
         * o carro tem com o estepe incluido por isso usaremos o getQuantidadePneus
         */
    }
}
// Exemplo de constantes que nao serao alteradas por ser de um carro de cor fixo
