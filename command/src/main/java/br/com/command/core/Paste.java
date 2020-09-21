package br.com.command.core;

import br.com.command.TextFile;

public class Paste implements Command {

    private TextFile textFile;

    public Paste(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public void execute() {
        System.out.println("Pasting text file: " + textFile.getFileName());
    }
}