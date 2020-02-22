package com.company;

public class GenericItem {

    public int id;
    public String name;
    public float price;
    public GenericItem relatedItem;
    public Category category = Category.GENERAL;

    public GenericItem() {}

    void printAll() {
        System.out.println("ID: " + id + "; Name: " + name + "; Price: " + price + " moneys; Category: " + category);
    }

    public boolean equals(GenericItem obj) {
        if(obj == null) {
            return false;
        }
        return obj.id == id;
    }

    @Override
    protected GenericItem clone() throws CloneNotSupportedException {
        GenericItem clone = new GenericItem();
        clone.id = id;
        clone.name = name;
        clone.price = price;
        clone.relatedItem = relatedItem;
        clone.category = category;
        return clone;
    }

    @Override
    public String toString() {
        return "ID: " + id + "; Name: " + name + "; Price: " + price + " moneys; Category: " + category;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
