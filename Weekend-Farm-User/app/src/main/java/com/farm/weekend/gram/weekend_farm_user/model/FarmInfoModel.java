package com.farm.weekend.gram.weekend_farm_user.model;

public class FarmInfoModel {

    String RoomText;
    int MoneyText;
    String FishText;
    int TemperatureText;
    public FarmInfoModel(String RoomText, int MoneyText, String FishText, int TemperatureText) {
        this.RoomText = RoomText;
        this.MoneyText = MoneyText;
        this.FishText = FishText;
        this.TemperatureText = TemperatureText;
    }

    public String getRoomText(){
        return RoomText;
    }
    public void setRoomText(String RoomText){
        this.RoomText = RoomText;
    }
    public int getMoneyText(){
        return MoneyText;
    }
    public void setMoneyText(int MoneyText){
        this.MoneyText = MoneyText;
    }
    public String getFishText(){
        return FishText;
    }
    public void setFishText(String FishText){
        this.FishText = FishText;
    }
    public int getTemperatureText() {
        return TemperatureText;
    }
    public void setTemperatureText(int TemperatureText) {
        this.TemperatureText = TemperatureText;
    }
}
