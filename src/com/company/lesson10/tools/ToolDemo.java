package com.company.lesson10.tools;

public class ToolDemo {
    public static void main(String[] args) {
        Drum drum1 =new Drum(76.7);
        Guitar guitar1 = new Guitar(6);
        Trumpet trumpet1 = new Trumpet(12.7);
        Tool [] tools = {drum1,guitar1,trumpet1};
        for(Tool t : tools){
            t.play();
        }
    }
}
