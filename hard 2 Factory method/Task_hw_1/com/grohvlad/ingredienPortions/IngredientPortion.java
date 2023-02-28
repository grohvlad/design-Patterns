package com.grohvlad.ingredienPortions;

public abstract class IngredientPortion {
    public abstract String getName();
    public abstract Integer getPortion();
    protected abstract void setPortion(Integer newPortion);
    protected abstract IngredientPortion makePart(Integer partPortion);


    public IngredientPortion takePartOfPortion(Integer portionDifference) {
        Integer subtractPortion = - portionDifference;
        changeIngredientPortion(subtractPortion);
        return makePart(portionDifference);
    }

    private void changeIngredientPortion(Integer portionDifference){
        int newPortion = this.getPortion() + portionDifference;
        if(newPortion >= 0){
            this.setPortion(newPortion);
        }else{
            System.out.println("You tried to take more then portion itself");
            System.out.println(this.getPortion());
            System.out.println(portionDifference);
        }
    }
    public void combineWithPortion(IngredientPortion portionToCombine) {
        Integer combinePortion = portionToCombine.getPortion();
        changeIngredientPortion(combinePortion);
        portionToCombine = null;
    }

}
