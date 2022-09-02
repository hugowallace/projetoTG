import java.util.Random;

public abstract class Veiculos {
    //ATRIBUTOS
    protected String modelo;
    protected String cor;
    protected String anoDeFabricacao;
    protected int placa;
    protected String tipoCombustivel;
    protected int chassi;
    protected String montadora;

    public Veiculos(String modelo, String anoDeFabricacao, String montadora) {
        Random gerador = new Random();

        this.modelo = modelo;
        this.anoDeFabricacao = anoDeFabricacao;
        this.chassi = gerador.nextInt(999999999);
        this.montadora = montadora;
        this.placa = gerador.nextInt(999999);

    }

    //Métodos do Veículo
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setrCor(String cor) {
        this.cor = cor;
    }

    public String getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void setAnoDeFabricacao(String anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getChassi() {
        return chassi;
    }

    public void setChassi(int chassi) {
        this.chassi = chassi;
    }

    public String getMontadora() {
        return montadora;
    }

    public void setMontadora(String montadora) {
        this.montadora = montadora;
    }

    public String carroStatus() {
        return
                "Modelo: " + this.modelo +
                        "\nCor: " + this.cor +
                        "\nAno De Fabricacao: " +
                        "\nPlaca: " + this.placa +
                        "\nTipo do Combustivel: " + tipoCombustivel +
                        "\nChassi: " + this.chassi +
                        "\nMontadora: " + this.montadora;
    }
}
