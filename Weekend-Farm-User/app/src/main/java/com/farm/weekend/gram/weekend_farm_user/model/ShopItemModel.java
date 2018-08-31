package com.farm.weekend.gram.weekend_farm_user.model;

public class ShopItemModel {
    public String buyItemName;
    public int buyItemNum;
    public int buyItemMoney;

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
