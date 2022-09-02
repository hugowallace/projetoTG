public class Main {
    public static void main(String[] args) {
        Carros c1 = new Carros("Corsa","2012", "Chevrolet","sim","manual", "sim", "não");
        Moto titan = new Moto("Titan 150", "2022", "Honda",  "sim", "160" );
        c1.setrCor("Rosa");
        Moto biz = new Moto("biz", "2022", "Honda",  "sim", "110" );
        biz.setrCor("Azul");
        titan.setrCor("Preta");
        titan.setTipoCombustivel("Diesel");
        System.out.println(c1.toString()+"\n");
        System.out.println(biz.toString()+"\n");
        System.out.println(titan.toString()+"\n");
        Carros c3 = new Carros("c3","2022", "citroen","sim","automatico", "sim", "sim");
        c3.setrCor("Rosinha");
        System.out.println(c3.toString());
    }

}
