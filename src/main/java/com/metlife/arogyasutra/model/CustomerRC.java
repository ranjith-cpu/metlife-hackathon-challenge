package com.metlife.arogyasutra.model;

public class CustomerRC {
    private int heartRateScore;
    private int diabetesScore;

    public CustomerRC() {
    }

    public CustomerRC(int heartRateScore, int diabetesScore) {
        this.heartRateScore = heartRateScore;
        this.diabetesScore = diabetesScore;
    }

    public int getDiabetesScore() {
        return diabetesScore;
    }

    public void setDiabetesScore(int diabetesScore) {
        this.diabetesScore = diabetesScore;
    }

    public int getHeartRateScore() {
        return heartRateScore;
    }

    public void setHeartRateScore(int heartRateScore) {
        this.heartRateScore = heartRateScore;
    }

    @Override
    public String toString() {
        return "CustomerRC{" +
                "heartRateScore=" + heartRateScore +
                ", diabetesScore=" + diabetesScore +
                '}';
    }
}
