package com.company;
enum TrafficLight{
    RED("Stop"), YELLOW("Ready"), GREEN("Go");
    private String action;

    TrafficLight(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }
}
public class EnumsTest {
    static void main() {
        TrafficLight color = TrafficLight.RED;
        color = TrafficLight.GREEN;

        TrafficLight value = TrafficLight.RED;
        System.out.println(value);
    }
}
