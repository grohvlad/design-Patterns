package Task_hw3.grohvlad.coffeeMachineMaker;


import Task_hw3.grohvlad.coffeeMachine.siemens.*;
import Task_hw3.grohvlad.coffee.Coffee;


public class SiemensCoffeeMachineMaker extends CoffeeMachineMaker {

    public SiemensCoffeeMachineMaker(int cost, int servCost, int satisfactionCoef) {
        super(cost, servCost, satisfactionCoef);
    }

    @Override
    public Coffee makeAmericano() {
        return new SiemensAmericano();
    }

    @Override
    public Coffee makeCappuccino() {
        return new SiemensCappuccino();
    }

    @Override
    public Coffee makeEspresso() {
        return new SiemensEspresso();
    }

    @Override
    public Coffee makeLatte() {
        return new SiemensLatte();
    }
}
