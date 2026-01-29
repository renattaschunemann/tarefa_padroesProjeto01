package Mod15_primeiroPadraoProjeto;

public class Main {
    public static void main(String[] args) {

        System.out.println("Carro Popular");

        ICarFactory carPopular = new CarPopular();
        Car meuFiatUno = new Car (carPopular);
        meuFiatUno.exibirInformacao();

        System.out.println("-----------------");
        System.out.println("Carro Luxuoso");

        ICarFactory carLuxuoso = new CarLuxuoso();
        Car minhaBMW = new Car(carLuxuoso);
        minhaBMW.exibirInformacao();

        System.out.println("-----------------");
        System.out.println("Carro Esportivo");

        ICarFactory carEsportivo = new CarEsportivo();
        Car meuPorche = new Car(carEsportivo);
        meuPorche.exibirInformacao();
    }
}
