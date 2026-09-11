package com.singleton;

import java.util.HashMap;
import java.util.Map;

public class ConfigManager {
    private static ConfigManager instance;

    private final Map<String, String> configs;

    private ConfigManager() {
        configs = new HashMap<>();
    }

    public static synchronized ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }

        return instance;
    }

    public void set(String key, String value) {
        configs.put(key, value);
    }

    public String get(String key) {
        return configs.get(key);
    }
}
