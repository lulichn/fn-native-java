package com.example.fn;

import java.lang.management.ManagementFactory;
import com.fnproject.fn.api.FnConfiguration;

public class Native {
    private long initialize;
    private long count;

    @FnConfiguration
    public void setUp() {
        initialize = ManagementFactory.getRuntimeMXBean().getUptime();
    }

    public String handleRequest(String input) {
        long uptime = ManagementFactory.getRuntimeMXBean().getUptime();
        count += 1;
        return String.format("Uptime: %d (init: %d), Call: %d", uptime, initialize, count);
    }
}
