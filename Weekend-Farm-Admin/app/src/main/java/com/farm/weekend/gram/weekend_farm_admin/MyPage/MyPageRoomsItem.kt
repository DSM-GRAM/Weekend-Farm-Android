package com.farm.weekend.gram.weekend_farm_admin.MyPage

class MyPageRoomsItem {
    var roomName: String = ""
    var roomCost: String = ""
    var roomFishNumber: String = ""
    var roomWaterTemperature: String = ""

    constructor(roomName: String, roomCost: String, roomFishNumber: String, roomWaterTemparature: String) {
        this.roomName = roomName
        this.roomCost = roomCost
        this.roomFishNumber = roomFishNumber
        this.roomWaterTemperature = roomWaterTemparature
    }
}