package br.com.command.core;

import br.com.command.TextFile;

public class Cut implements Command {

    private TextFile textFile;

    public Cut(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public void execute() {
        System.out.println("Cutting text file: " + textFile.getFileName());
    }
}