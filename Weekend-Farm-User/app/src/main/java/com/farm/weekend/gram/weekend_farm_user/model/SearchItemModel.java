package com.farm.weekend.gram.weekend_farm_user.model;

public class SearchItemModel {
    public String farmName;
    public int farmMoney;

    public String getfarmName(){
        return farmName;
    }

    public int getfarmMoney(){
        return farmMoney;
    }

    public void setBuyItemName(String farmName){
        this.farmName = farmName;
    }

    public void setBuyItemNum(int farmMoney){
        this.farmMoney = farmMoney;
    }
}
