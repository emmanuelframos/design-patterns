package br.com.command;

import br.com.command.core.Command;
import br.com.command.core.Copy;
import br.com.command.core.Cut;
import br.com.command.core.Paste;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CommandTest {

    @Test
    public void test_command(){

        TextFile textFile = new TextFile();
        textFile.setFileName("file_properties.txt");

        List<Command> commands = Arrays.asList(
                new Copy(textFile),
                new Cut(textFile),
                new Paste(textFile)
        );

        commands.forEach(Command::execute);
    }
}