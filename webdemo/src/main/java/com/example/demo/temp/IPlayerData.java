package com.example.demo.temp;

public interface IPlayerData<C> {
    default C getPlayerData(int playerId, int activityId){
        return null;
    }
}
