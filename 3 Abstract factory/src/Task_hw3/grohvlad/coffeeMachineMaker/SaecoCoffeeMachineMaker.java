package Task_hw3.grohvlad.coffeeMachineMaker;


import Task_hw3.grohvlad.coffeeMachine.saeco.*;
import Task_hw3.grohvlad.coffee.Coffee;


public class SaecoCoffeeMachineMaker extends CoffeeMachineMaker {

    public SaecoCoffeeMachineMaker(int cost, int servCost, int satisfactionCoef) {
        super(cost, servCost, satisfactionCoef);
        this.name = "Saeco";
    }

    @Override
    public Coffee makeAmericano() {
        return new SaecoAmericano();
    }

    @Override
    public Coffee makeCappuccino() {
        return new SaecoCappuccino();
    }

    @Override
    public Coffee makeEspresso() {
        return new SaecoEspresso();
    }

    @Override
    public Coffee makeLatte() {
        return new SaecoLatte();
    }
}
