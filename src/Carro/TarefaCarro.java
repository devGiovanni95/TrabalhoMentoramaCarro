package Carro;

public class TarefaCarro {
    public static final String VERMELHO = "Vermelho";
    public static final String PRETA = "Preta";
    public static final String BRANCA = "Branca";
    public static final String AZUL = "Azul";
    public static final String CINZA = "Cinza";

    public static final String G = "Gasolina";
    public static final String A = "Etanol";
    public static final String D = "Diesel";
    public static final String F = "Flex";

    public static final String SIM = "Sim";
    public static final String NAO = "Não";

    private Integer quantidadePneus;
    private Integer quantidadeCalotas;
    private Integer quantidadeParafusosPneus;
    private Integer numeroPortas;
    private String cor;
    private String numeroChassi;
    private double anoFabricacao;
    private String combustivel;
    private String vidroEletrico;
    private String ar;

    /*
     * public Carro() {} = construtor que o java automaticamente cria
     */
    /*
     * o construtor acima e a versao basica que o java ja cria. agora se quizermos
     * que ele mostre algumas informações como a quantidade de pneus do carro
     * faremos assim:
     */
    public TarefaCarro(Integer quantidadePneus, Integer numeroPortas, double anoFabricacao, String combustivel) {
        setQuantidadePneus(quantidadePneus);
        setNumeroPortas(numeroPortas);
        setAnoFabricacao(anoFabricacao);
        setCombustivel(combustivel);
        // this.quantidadePneus = quantidadePneus; utilizaremos o outro modo para que
        // possamos criar varia regras
        /*
         * o this.quantidadePneus pega da vaiavel la fora e para segundo quantidadePneus
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

    /*
     * public void setCor(String cor) { System.out.println(cor); }
     */

    public Integer getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(Integer numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNumeroChassi() {
        return numeroChassi;
    }

    public void setNumeroChassi(String numeroChassi) {
        this.numeroChassi = numeroChassi;
    }

    public double getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(double anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getVidroEletrico() {
        return vidroEletrico;
    }

    public void setVidroEletrico(String vidroEletrico) {
        this.vidroEletrico = vidroEletrico;
    }

    public String getAr( ) {
        return ar;
    }

    public void setAr(String ar) {
        this.ar = ar;
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
        System.out.println("Quantidade de portas " + getNumeroPortas());
        System.out.println("Cor do veiculo " + getCor());
        System.out.println("Numero do chassi " + getNumeroChassi());
        System.out.println("Ano de fabricação " + getAnoFabricacao());
        System.out.println("Tipo de combustivel " + getCombustivel());
        System.out.println("Possui vidro elétrico: " + getVidroEletrico());
        System.out.println("Possui ar condicionado: " + getAr());

        /*
         * quantidadePneus = nao utilizaremos essa variavel pois ela mostra quantos
         * pneus o carro poswsui , mas queremos mostra tambem a soma total de pneus que
         * o carro tem com o estepe incluido por isso usaremos o getQuantidadePneus
         */
    }
}
// Exemplo de constantes que nao serao alteradas por ser de um carro de cor fixo
