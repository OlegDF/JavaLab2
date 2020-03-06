package com.company;

import java.util.Date;

public class FoodItem extends GenericItem {

    Date dateOfIncome;
    short expires;

    public FoodItem(String name, float price, FoodItem relatedItem, Date date, short expires) {
        super(name, price, relatedItem);
        super.category = Category.FOOD;
        this.dateOfIncome = date;
        this.expires = expires;
    }

    public FoodItem(String name, float price, short expires) {
        this(name, price, null, new Date(), expires);
    }

    public FoodItem(String name) {
        this(name, 0, (short)0);
    }

    private FoodItem(GenericItem item) {
        super(item.name, item.price, item.category);
        this.id = item.id;
        this.relatedItem = item.relatedItem;
    }

    @Override
    void printAll() {
        super.printAll();
        System.out.println("Date of Income: " + dateOfIncome + "; Expires in " + expires + " days");
    }

    public boolean equals(FoodItem obj) {
        return super.equals(obj) && obj.dateOfIncome.equals(dateOfIncome) && obj.expires == expires;
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
        return super.toString() + "\nDate of Income: " + dateOfIncome + "; Expires in " + expires + " days";
    }

    @Override
    public int hashCode() {
        return (super.hashCode() * 31 + (name == null ? 0 : name.hashCode())) * 31 + expires;
    }

}
