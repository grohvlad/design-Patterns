package Task_hw3.grohvlad.coffeeMachineMaker;


import Task_hw3.grohvlad.coffee.Coffee;

public abstract class CoffeeMachineMaker {
    protected int cost;
    protected int servCost;
    protected int satisfactionCoef;

    public int getCost() {
        return this.cost;
    }

    public int getServCost() {
        return this.servCost;
    }

    public int getSatisfactionCoef() {
        return this.satisfactionCoef;
    }

    public CoffeeMachineMaker(int cost, int servCost, int satisfactionCoef) {
        this.cost = cost;
        this.servCost = servCost;
        this.satisfactionCoef = satisfactionCoef;
    }

    public abstract Coffee makeAmericano();
    public abstract Coffee makeCappuccino();
    public abstract Coffee makeEspresso();
    public abstract Coffee makeLatte();
}
