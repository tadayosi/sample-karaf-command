package com.redhat.samples.karaf.command;

import org.junit.Test;

public class GreetTest {

    @Test
    public void command() throws Exception {
        Greet greet = new Greet();
        greet.doExecute();
    }

    @Test
    public void command_hello() throws Exception {
        Greet greet = new Greet();
        greet.arg = "hello";
        greet.doExecute();
    }

    @Test
    public void command_goodbye() throws Exception {
        Greet greet = new Greet();
        greet.arg = "goodbye";
        greet.doExecute();
    }

}
