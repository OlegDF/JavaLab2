package com.company.billing.stocklist;

public class TechnicalItem extends GenericItem {

    private short warrantyTime;

    public TechnicalItem() {}

    public TechnicalItem(String name, float price, TechnicalItem relatedItem, short warrantyTime) {
        super(name, price, relatedItem);
        super.setCategory(Category.GENERAL);
        this.warrantyTime = warrantyTime;
    }

    private TechnicalItem(GenericItem item) {
        super(item.getName(), item.getPrice(), item.getCategory());
        this.setId(item.getId());
        this.setRelatedItem(item.getRelatedItem());
    }

    @Override
    public void printAll() {
        super.printAll();
        System.out.println("Warranty ends in " + warrantyTime + " days");
    }

    public short getWarrantyTime() {
        return warrantyTime;
    }

    public boolean equals(TechnicalItem obj) {
        return super.equals(obj) && obj.warrantyTime == warrantyTime;
    }

    @Override
    public TechnicalItem clone() throws CloneNotSupportedException {
        TechnicalItem clone = new TechnicalItem(super.clone());
        clone.warrantyTime = warrantyTime;
        return clone;
    }

    @Override
    public String toString() {
        return super.toString() + "\nWarranty ends in " + warrantyTime + " days";
    }

    @Override
    public int hashCode() {
        return super.hashCode() * 31 + warrantyTime;
    }
}
