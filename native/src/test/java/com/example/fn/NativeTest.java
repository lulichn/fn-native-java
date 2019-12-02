package com.example.fn;

import com.fnproject.fn.testing.*;
import org.junit.*;

import static org.junit.Assert.*;

public class NativeTest {

    @Rule
    public final FnTestingRule testing = FnTestingRule.createDefault();

    @Test
    public void shouldReturnGreeting() {
        testing.givenEvent().enqueue();
        testing.thenRun(Native.class, "handleRequest");

        // FnResult result = testing.getOnlyResult();
        // assertEquals("Hello, world!", result.getBodyAsString());
    }

}