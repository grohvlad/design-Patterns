package Task_hw3.grohvlad.coffeeMachineMaker;


import Task_hw3.grohvlad.coffeeMachine.philips.*;
import Task_hw3.grohvlad.coffee.Coffee;


public class PhilipsCoffeeMachineMaker extends CoffeeMachineMaker {

    public PhilipsCoffeeMachineMaker(int cost, int servCost, int satisfactionCoef) {
        super(cost, servCost, satisfactionCoef);
        this.name = "Philips";
    }

    @Override
    public Coffee makeAmericano() {
        return new PhilipsAmericano();
    }

    @Override
    public Coffee makeCappuccino() {
        return new PhilipsCappuccino();
    }

    @Override
    public Coffee makeEspresso() {
        return new PhilipsEspresso();
    }

    @Override
    public Coffee makeLatte() {
        return new PhilipsLatte();
    }
}
