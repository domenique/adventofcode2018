package io.tripled.adventofcode2018.dayone;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Application {

    public static void main(String[] args) throws URISyntaxException, IOException {
        var tool = new TardisCaliberationTool();

        var resource = Application.class.getClassLoader().getResource("input.txt");
        var input = Files.readString(Paths.get(resource.toURI()));

        do {
            tool.changeFrequency(input);
        } while (tool.firstDuplicateFrequency() == null);

        System.out.println("Frequency: " + tool.currentFrequency());
        System.out.println("First duplicate: " + tool.firstDuplicateFrequency());
    }
}
