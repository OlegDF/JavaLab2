package com.company.billing.stocklist;

import com.company.billing.exceptions.ItemAlreadyExistsException;

import java.util.ArrayList;
import java.util.HashMap;

public class ItemCatalog {

    private HashMap<Integer, GenericItem> catalog = new HashMap<>();
    private ArrayList<GenericItem> ALCatalog = new ArrayList<>();

    public void addItem(GenericItem item) throws ItemAlreadyExistsException {
        if(catalog.containsKey(item.getId())) {
            throw new ItemAlreadyExistsException(item.getName());
        }
        catalog.put(item.getId(), item);
        ALCatalog.add(item);
    }

    public void printItems() {
        for(GenericItem item: ALCatalog){
            System.out.println(item);
        }
    }

    public GenericItem findItemByID (int id) {
        return catalog.getOrDefault(id, null);
    }

    public GenericItem findItemByIDAL (int id) {
        for(GenericItem item: ALCatalog) {
            if(item.getId() == id) {
                return item;
            }
        }
        return null;
    }

}
