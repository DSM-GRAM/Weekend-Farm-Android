package com.farm.weekend.gram.weekend_farm_user.model;

public class MyFarmFishModel {
    public String fishName;
    public int fishNum;

    public MyFarmFishModel(String fishName, int fishNum) {
        this.fishName = fishName;
        this.fishNum = fishNum;
    }

    public String getfishName(){
        return fishName;
    }

    public int getfishNum(){
        return fishNum;
    }

    public void setfishName(String fishName){
        this.fishName = fishName;
    }

    public void setfishName(int fishNum){
        this.fishNum = fishNum;
    }
}
