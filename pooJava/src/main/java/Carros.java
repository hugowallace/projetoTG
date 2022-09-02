import java.util.Random;

public class Carros extends Veiculos {
    public String vidroEletrico;
    public String tipoCambio;
    public String arCondicionado;
    public String bancoCouro;

    public Carros(String modelo, String anoDeFabricacao, String montadora, String vidroEletrico, String tipoCambio, String arCondicionado, String bancoCouro) {
        super(modelo, anoDeFabricacao, montadora);
        Random gerador = new Random();
        this.vidroEletrico = vidroEletrico;
        this.tipoCambio = tipoCambio;
        this.arCondicionado = arCondicionado;
        this.bancoCouro = bancoCouro;
        this.setTipoCombustivel("Gasolina");
    }

    public String getVidroEletrico() {
        return vidroEletrico;
    }

    public void setVidroEletrico(String vidroEletrico) {
        this.vidroEletrico = vidroEletrico;
    }

    public String getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(String tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public String getArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(String arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public String getBancoCouro() {
        return bancoCouro;
    }

    public void setBancoCouro(String bancoCouro) {
        this.bancoCouro = bancoCouro;
    }

    @Override
    public String toString() {
        return getModelo() +
                "\nvidroEletrico= " + vidroEletrico +
                "\ntipoCambio= " + tipoCambio +
                "\nbancoCouro= " + bancoCouro +
                "\ncor= " + cor +
                "\nanoDeFabricacao= " + anoDeFabricacao +
                "\nPlaca= " + placa +
                "\ntipoCombustivel= " + tipoCombustivel +
                "\nchassi= " + chassi +
                "\nmontadora= " + montadora;
    }

}
