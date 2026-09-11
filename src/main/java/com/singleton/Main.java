package com.singleton;

public class Main {
    static void main() {
        ConfigManager configManagerInstance1 = ConfigManager.getInstance();
        ConfigManager configManagerInstance2 = ConfigManager.getInstance();

        configManagerInstance1.set("language", "portuguese");

        System.out.print(configManagerInstance2.get("language"));
    }
}
