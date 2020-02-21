package com.company;

public class TechnicalItem extends GenericItem {

    short warrantyTime;

    public TechnicalItem() {}

    private TechnicalItem(GenericItem item) {
        this.id = item.id;
        this.name = item.name;
        this.price = item.price;
        this.category = item.category;
        this.relatedItem = item.relatedItem;
    }

    @Override
    void printAll() {
        super.printAll();
        System.out.println("Warranty ends in " + warrantyTime + " days");
    }

    public boolean equals(TechnicalItem obj) {
        return super.equals(obj);
    }

    @Override
    protected TechnicalItem clone() throws CloneNotSupportedException {
        TechnicalItem clone = new TechnicalItem(super.clone());
        clone.warrantyTime = warrantyTime;
        return clone;
    }

    @Override
    public String toString() {
        return super.toString() + "\nWarranty ends in " + warrantyTime + " days";
    }
}
