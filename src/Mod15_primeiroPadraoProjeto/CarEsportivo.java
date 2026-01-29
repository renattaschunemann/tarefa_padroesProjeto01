package Mod15_primeiroPadraoProjeto;

public class CarEsportivo implements ICarFactory {
    @Override
    public IMotor criarMotor() {

        return new MotorEsportivo();

    }

    @Override
    public IPneu criarPneu() {
        return new PneuEsportivo();

    }
}
