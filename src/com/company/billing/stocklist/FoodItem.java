package com.company.billing.stocklist;

import java.util.Date;

public class FoodItem extends GenericItem {

    private Date dateOfIncome;
    private short expires;

    public FoodItem(String name, float price, FoodItem relatedItem, Date date, short expires) {
        super(name, price, relatedItem);
        super.setCategory(Category.FOOD);
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
        super(item.getName(), item.getPrice(), item.getCategory());
        this.setId(item.getId());
        this.setRelatedItem(item.getRelatedItem());
    }

    public Date getDateOfIncome() {
        return dateOfIncome;
    }

    public short getExpires() {
        return expires;
    }

    @Override
    public void printAll() {
        super.printAll();
        System.out.println("Date of Income: " + dateOfIncome + "; Expires in " + expires + " days");
    }

    public boolean equals(FoodItem obj) {
        return super.equals(obj) && obj.dateOfIncome.equals(dateOfIncome) && obj.expires == expires;
    }

    @Override
    public FoodItem clone() throws CloneNotSupportedException {
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
        return (super.hashCode() * 31 + (getName() == null ? 0 : getName().hashCode())) * 31 + expires;
    }

}
