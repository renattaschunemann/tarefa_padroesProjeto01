package Mod15_primeiroPadraoProjeto;

public class CarPopular implements ICarFactory {
    @Override
    public IMotor criarMotor() {
        return new MotorPopular();

    }

    @Override
    public IPneu criarPneu() {
        return new PneuPopular();

    }
}
