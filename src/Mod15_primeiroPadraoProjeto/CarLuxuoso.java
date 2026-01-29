package Mod15_primeiroPadraoProjeto;

public class CarLuxuoso implements ICarFactory {
    @Override
    public IMotor criarMotor() {
        return  new MotorLuxuoso();

    }

    @Override
    public IPneu criarPneu() {
        return new PneuLuxuoso();

    }
}
