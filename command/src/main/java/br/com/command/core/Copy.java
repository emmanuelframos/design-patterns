package br.com.command.core;

import br.com.command.TextFile;

public class Copy implements Command {

    private TextFile textFile;

    public Copy(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public void execute() {
        System.out.println("Copying text file: " + textFile.getFileName());
    }
}