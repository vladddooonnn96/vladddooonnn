package com.company.lesson10.clothesshop;

public enum Sizes {
    XXS(32) {
        @Override
        public String getDescription() {
            return "Детский размер!";
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);
    private int evroSize;

    Sizes(int evroSize) {
        this.evroSize = evroSize;
    }

    public String getDescription() {
        return "Взрослый размер!";
    }

}
