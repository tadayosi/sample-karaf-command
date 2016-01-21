package com.redhat.samples.karaf.command;

import java.util.List;

import org.apache.karaf.shell.console.Completer;
import org.apache.karaf.shell.console.completer.StringsCompleter;

public class GreetCompleter implements Completer {

    @Override
    public int complete(String buffer, int cursor, List<String> candidates) {
        StringsCompleter completer = new StringsCompleter();
        completer.getStrings().add("hello");
        completer.getStrings().add("goodbye");
        return completer.complete(buffer, cursor, candidates);
    }

}
