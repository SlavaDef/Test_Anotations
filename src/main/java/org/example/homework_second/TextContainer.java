package org.example.homework_second;


public class TextContainer {
    @Save(path = "./resources")
    private String text;

    public String getText() {
        return text;
    }
}
