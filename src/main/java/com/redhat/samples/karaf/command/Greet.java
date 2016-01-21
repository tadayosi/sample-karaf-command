package com.redhat.samples.karaf.command;

import org.apache.felix.gogo.commands.Argument;
import org.apache.felix.gogo.commands.Command;
import org.apache.karaf.shell.console.OsgiCommandSupport;

@Command(scope = "sample", name = "greet", description = "This is a greeting command.")
public class Greet extends OsgiCommandSupport {

    @Argument(index = 0, name = "arg", description = "The command argument", required = false, multiValued = false)
    String arg = null;

    @Override
    protected Object doExecute() throws Exception {
        if ("hello".equals(arg)) {
            System.out.println("Hello!");
        } else if ("goodbye".equals(arg)) {
            System.out.println("Goodbye!");
        } else {
            System.out.println("This is a greeting command.");
        }
        return null;
    }

}
