package com.platzi.functional._04_functional;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class CLIArgumentUtils {
    static void showHelp(CLIArguments cliArguments) {
        Consumer<CLIArguments> consumerHelp = cliArguments1 -> {
            if (cliArguments1.isHelp()) System.out.println("manual de ayuda soicitado");
        };

        consumerHelp.accept(cliArguments);
    }

    static CLIArguments generateCLI() {
        Supplier<CLIArguments> generator = () -> new CLIArguments();
        return generator.get();
    };
}

