package com.sdeSheet;

enum Day{
    SUNDAY("Weekend"), MONDAY("Weekday"), TUESDAY("Weekday"), WEDNESDAY("Weekday"), THURSDAY("Weekday"), FRIDAY("Weekday"), SATURDAY("Weekend");

    private String type;

    Day(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
public class DaysEnum {
    static void main() {
        for(Day day : Day.values()){
            System.out.println(day+" "+day.getType());
        }
    }
}
