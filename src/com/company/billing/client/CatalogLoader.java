package com.company.billing.client;

import com.company.billing.exceptions.CatalogLoadException;
import com.company.billing.stocklist.ItemCatalog;

public interface CatalogLoader {

    public void load(ItemCatalog cat) throws CatalogLoadException;

}
