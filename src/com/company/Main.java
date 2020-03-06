package com.company;

import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        GenericItem item1 = new GenericItem();
        item1.id = 0;
        item1.name = "Blood of the Innocents";
        item1.price = 5;
        GenericItem item2 = new GenericItem();
        item2.id = 1;
        item2.name = "Infernal Contract";
        item2.price = 40;
        GenericItem item3 = new GenericItem();
        item3.id = 2;
        item3.name = "Robe of Ba'al Hammon";
        item3.price = 15;
        item1.printAll();
        item2.printAll();
        item3.printAll();
        FoodItem item4 = new FoodItem("Flesh of the Innocents");
        item4.id = 3;
        item4.price = 10;
        Calendar calendar = Calendar.getInstance();
        calendar.set(1666, Calendar.JUNE, 6);
        item4.dateOfIncome = calendar.getTime();
        item4.expires = 4444;
        TechnicalItem item5 = new TechnicalItem();
        item5.id = 4;
        item5.name = "Dark Satanic Mill";
        item5.price = 10000;
        item5.warrantyTime = 4;
        item4.printAll();
        item5.printAll();
        FoodItem item4_copy = new FoodItem("Flesh of the Innocents");
        item4_copy.id = 5;
        item4_copy.price = 10;
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
    }
}
