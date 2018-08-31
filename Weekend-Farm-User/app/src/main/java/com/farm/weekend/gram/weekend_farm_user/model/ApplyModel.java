package com.farm.weekend.gram.weekend_farm_user.model;

import android.widget.TextView;

public class ApplyModel {

    String ApplyRoomText;
    String FishKindText;
    int FishNum;
    public ApplyModel(String ApplyRoomText, int FishNum, String FishKindText) {
        this.ApplyRoomText = ApplyRoomText;
        this.FishNum = FishNum;
        this.FishKindText = FishKindText;
    }

    public String getApplyRoomText(){
        return ApplyRoomText;
    }
    public void setApplyRoomText(String ApplyRoomText){
        this.ApplyRoomText = ApplyRoomText;
    }
    public int getFishNum(){
        return FishNum;
    }
    public void setFishNum(int FishNum) {
        this.FishNum = FishNum;
    }
    public String getFishKindText(){
        return FishKindText;
    }
    public void setFishText(String FishKindText){
        this.FishKindText = FishKindText;
    }
}
