package com.company.lesson10;

public enum Season {
    WINTER(0),
    SPRING(12),
    AUTUMN(14),
    SUMMER(35){
        @Override
        public String getDescription() {
            return "Теплое время года!";
        }
    };
    private double avgTemperature;

    Season(double avgTemperature) {
        this.avgTemperature = avgTemperature;
    }

    public double getAvgTemperature() {
        return avgTemperature;
    }
    public String getDescription(){
        return "Холодное время года!";
    }
}
