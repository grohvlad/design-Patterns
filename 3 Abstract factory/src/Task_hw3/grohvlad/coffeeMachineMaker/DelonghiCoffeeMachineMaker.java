package Task_hw3.grohvlad.coffeeMachineMaker;


import Task_hw3.grohvlad.coffeeMachine.delonghi.*;
import Task_hw3.grohvlad.coffee.Coffee;


public class DelonghiCoffeeMachineMaker extends CoffeeMachineMaker {
    public DelonghiCoffeeMachineMaker(int cost, int servCost, int satisfactionCoef) {
        super(cost, servCost, satisfactionCoef);
    }

    @Override
    public Coffee makeAmericano() {
        return new DelonghiAmericano();
    }

    @Override
    public Coffee makeCappuccino() {
        return new DelonghiCappuccino();
    }

    @Override
    public Coffee makeEspresso() {
        return new DelonghiEspresso();
    }

    @Override
    public Coffee makeLatte() {
        return new DelonghiLatte();
    }
}
