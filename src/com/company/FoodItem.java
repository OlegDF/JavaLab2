package com.company;

import java.util.Date;

public class FoodItem extends GenericItem {

    Date dateOfIncome;
    short expires;

    public FoodItem() {}

    private FoodItem(GenericItem item) {
        this.id = item.id;
        this.name = item.name;
        this.price = item.price;
        this.category = item.category;
        this.relatedItem = item.relatedItem;
    }

    @Override
    void printAll() {
        super.printAll();
        System.out.println("Date of Income: " + dateOfIncome + "; Expires in " + expires + " days");
    }

    public boolean equals(FoodItem obj) {
        return super.equals(obj);
    }

    @Override
    protected FoodItem clone() throws CloneNotSupportedException {
        FoodItem clone = new FoodItem(super.clone());
        clone.dateOfIncome = dateOfIncome;
        clone.expires = expires;
        return clone;
    }

    @Override
    public String toString() {
        return super.toString() + "\nnDate of Income: " + dateOfIncome + "; Expires in " + expires + " days";
    }
}
