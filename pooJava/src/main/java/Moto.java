public class Moto extends Veiculos{

    public String freioAbs;
    public String cilindrada;

    public Moto(String modelo, String anoDeFabricacao, String montadora, String freioAbs, String cilindrada) {
        super(modelo, anoDeFabricacao, montadora);
        this.freioAbs = freioAbs;
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return getModelo() +
                "\nfreioAbs= " + freioAbs +
                "\ncilindrada= " + cilindrada +
                "\ncor= " + cor +
                "\nano De Fabricacao= " + anoDeFabricacao +
                "\nplaca= " + placa +
                "\ntipo Combustivel= " + tipoCombustivel +
                "\nchassi= " + chassi +
                "\nmontadora= " + montadora;
    }
}




