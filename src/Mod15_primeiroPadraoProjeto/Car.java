package Mod15_primeiroPadraoProjeto;

class Car {

    private IMotor motor;
    private IPneu pneu;

    public Car(ICarFactory factory) {
        this.motor = factory.criarMotor();
        this.pneu = factory.criarPneu();
    }


    public void exibirInformacao(){
        motor.tipoMotor();
        pneu.tipoPneu();
    }
}
