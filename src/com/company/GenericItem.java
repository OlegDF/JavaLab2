package com.company;

public class GenericItem {

    static int currentID = 0;

    public int id;
    public String name;
    public float price;
    public GenericItem relatedItem;
    public Category category;

    public GenericItem(String name, float price, Category category) {
        this.id = currentID++;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public GenericItem(String name, float price, GenericItem relatedItem) {
        this(name, price, Category.GENERAL);
        this.name = name;
        this.price = price;
        this.relatedItem = relatedItem;
    }

    public GenericItem() {
        this(null, 0, Category.GENERAL);
    }

    void printAll() {
        System.out.println("ID: " + id + "; Name: " + name + "; Price: " + price + " moneys; Category: " + category);
    }

    public boolean equals(GenericItem obj) {
        if(obj == null) {
            return false;
        }
        return obj.id == id && obj.name.equals(name) && obj.price == price && obj.category == category;
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
        int hash = 7;
        hash = 31 * hash + id;
        hash = 31 * hash + (name == null ? 0 : name.hashCode());
        hash = 31 * hash + (int)price;
        hash = 31 * hash + (category == null ? 0 : category.hashCode());
        return hash;
    }
}
