package com.grohvlad.ingredienPortions;

public class CreamPortion extends IngredientPortion {
    private final String ingredientName;
    private Integer portion;
    public CreamPortion(Integer portion){
        this.ingredientName = "Cream";
        if(portion>=0){
            this.portion = portion;
        } else{
            this.portion=0;
            System.out.println("Problem with portion size");
        }

    }

    @Override
    public String getName() {
        return ingredientName;
    }
    @Override
    public Integer getPortion() {
        return portion;
    }

    @Override
    public void setPortion(Integer newPortion) {
        portion = newPortion;
    }

    @Override
    protected IngredientPortion makePart(Integer partPortion) {
        return new CoffeePortion(partPortion);
    }
}
