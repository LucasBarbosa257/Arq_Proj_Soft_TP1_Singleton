package com.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class ConfigManagerTest {

    @Test
    void shouldReturnSameInstance() {
        ConfigManager config1 = ConfigManager.getInstance();
        ConfigManager config2 = ConfigManager.getInstance();

        assertSame(config1, config2);
    }

    @Test
    void shouldStoreAndRetrieveConfiguration() {
        ConfigManager config = ConfigManager.getInstance();

        config.set("language", "portuguese");

        assertEquals("portuguese", config.get("language"));
    }

    @Test
    void shouldAllowConfigurationToBeChanged() {
        ConfigManager config = ConfigManager.getInstance();

        config.set("mode", "development");
        config.set("mode", "production");

        assertEquals("production", config.get("mode"));
    }
}