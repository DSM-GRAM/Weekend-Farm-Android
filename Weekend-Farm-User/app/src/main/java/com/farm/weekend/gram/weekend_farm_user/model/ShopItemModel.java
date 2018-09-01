package com.farm.weekend.gram.weekend_farm_user.model;

public class ShopItemModel {
    public String cItemName;
    public int cItemNum;
    public int money;

    ShopItemModel(){}

    public ShopItemModel(String cItemName, int cItemNum, int money){
        this.cItemName = cItemName;
        this.cItemNum = cItemNum;
        this.money = money;
    }

    public String getBuyItemName(){
        return cItemName;
    }

    public int getBuyItemNum(){
        return cItemNum;
    }

    public int getBuyItemMoney(){
        return money;
    }
}
