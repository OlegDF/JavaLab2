package com.company.billing.client;

import com.company.billing.exceptions.CatalogLoadException;
import com.company.billing.exceptions.ItemAlreadyExistsException;
import com.company.billing.stocklist.Category;
import com.company.billing.stocklist.FoodItem;
import com.company.billing.stocklist.GenericItem;
import com.company.billing.stocklist.ItemCatalog;

import java.util.Date;

public class CatalogStubLoader implements CatalogLoader {

    public void load(ItemCatalog cat) throws CatalogLoadException {
        GenericItem item1 = new GenericItem("SonyTV", 23000, Category.GENERAL);
        FoodItem item2 = new FoodItem("Bread", 12, null, new Date(), (short)10);
        try {
            cat.addItem(item1);
            cat.addItem(item2);
            cat.addItem(item2);
        } catch (ItemAlreadyExistsException e) {
            e.printStackTrace();
            throw new CatalogLoadException(e);
        }
    }

}
