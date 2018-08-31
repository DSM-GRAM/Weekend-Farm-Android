package com.farm.weekend.gram.weekend_farm_user.model;

public class ShopItemModel {
    public String buyItemName;
    public int buyItemNum;
    public int buyItemMoney;

<<<<<<< HEAD
    public ShopItemModel(String buyItemName, int buyItemNum, int buyItemMoney) {
=======
    ShopItemModel(){}

    public ShopItemModel(String buyItemName, int buyItemNum, int buyItemMoney){
>>>>>>> 31eb58da22ec819c9d3013c67511b3baeb94f8e0
        this.buyItemName = buyItemName;
        this.buyItemNum = buyItemNum;
        this.buyItemMoney = buyItemMoney;
    }

    public String getBuyItemName(){
        return buyItemName;
    }

    public int getBuyItemNum(){
        return buyItemNum;
    }

    public int getBuyItemMoney(){
        return buyItemMoney;
    }

    public void setBuyItemName(String buyItemName){
        this.buyItemName = buyItemName;
    }

    public void setBuyItemMoney(int buyItemMoney){
        this.buyItemMoney = buyItemMoney;
    }

    public void setBuyItemNum(int buyItemNum){
        this.buyItemNum = buyItemNum;
    }
}
