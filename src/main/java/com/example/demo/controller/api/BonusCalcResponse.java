package com.example.demo.controller.api;

public class BonusCalcResponse {

    private final int bonusPoints;

    public BonusCalcResponse(int bonusPoints) {
        this.bonusPoints = bonusPoints;
    }

    public int getBonusPoints() {
        return bonusPoints;
    }

}
