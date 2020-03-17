package com.company.billing.client;

import com.company.billing.exceptions.CatalogLoadException;
import com.company.billing.exceptions.ItemAlreadyExistsException;
import com.company.billing.stocklist.*;

import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        GenericItem item1 = new GenericItem("Blood of the Innocents", 5, Category.GENERAL);
        GenericItem item2 = new GenericItem("Infernal Contract", 40, Category.GENERAL);
        GenericItem item3 = new GenericItem("Robe of Ba'al Hammon", 15, Category.GENERAL);
        item1.printAll();
        item2.printAll();
        item3.printAll();
        Calendar calendar = Calendar.getInstance();
        calendar.set(1666, Calendar.JUNE, 6);
        FoodItem item4 = new FoodItem("Flesh of the Innocents", 10, null, calendar.getTime(), (short)4444);
        TechnicalItem item5 = new TechnicalItem("Dark Satanic Mill", 10000, null, (short)4);
        item4.printAll();
        item5.printAll();
        FoodItem item4_copy = new FoodItem("Flesh of the Innocents", 10, null, calendar.getTime(), (short)4444);
        System.out.println(item4.equals(item4_copy));
        FoodItem item4_real_copy = null;
        try {
            item4_real_copy = item4.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(item4.equals(item4_real_copy));
        String line = "Конфеты 'Маска';45;120";
        String[] itemFld = line.split(";");
        FoodItem newItem = new FoodItem(itemFld[0], Float.valueOf(itemFld[1]), Short.valueOf(itemFld[2]));
        newItem.printAll();
        ItemCatalog catalog = new ItemCatalog();
        try {
            catalog.addItem(item1);
            catalog.addItem(item2);
            catalog.addItem(item3);
            catalog.addItem(item4);
            catalog.addItem(item5);
            catalog.addItem(item5);
        } catch (ItemAlreadyExistsException e) {
            e.printStackTrace();
        }
        long begin = new Date().getTime();
        for(int i = 0; i < 100000; i++) {
            catalog.findItemByID(10);
        }
        long end = new Date().getTime();
        System.out.println("In HashMap: " + (end - begin));
        begin = new Date().getTime();
        for(int i = 0; i < 100000; i++) {
            catalog.findItemByIDAL(10);
        }
        end = new Date().getTime();
        System.out.println("In ArrayList: " + (end - begin));
        CatalogLoader loader = new CatalogStubLoader();
        try {
            loader.load(catalog);
        } catch (CatalogLoadException e) {
            e.printStackTrace();
        }
        catalog.printItems();
        CatalogFileLoader fileLoader = new CatalogFileLoader("items.lst");
        ItemCatalog catalog2 = new ItemCatalog();
        try {
            fileLoader.load(catalog2);
        } catch (CatalogLoadException e) {
            e.printStackTrace();
        }
        catalog2.printItems();
    }
}
