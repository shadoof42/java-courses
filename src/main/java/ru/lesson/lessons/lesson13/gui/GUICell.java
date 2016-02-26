package ru.lesson.lessons.lesson13.gui;

import ru.lesson.lessons.lesson13.Cell;

import java.awt.*;

public class GUICell implements Cell<Graphics> {
    @Override
    public boolean isBomb() {
        return false;
    }

    @Override
    public boolean isSuggestBomb() {
        return false;
    }

    @Override
    public boolean isSuggestEmpty() {
        return false;
    }

    @Override
    public void suggestEmpty() {

    }

    @Override
    public void suggestBomb() {

    }

    @Override
    public void draw(Graphics paint, boolean real) {
        System.out.println("Вход в метод Draw");
//        this.
    }
}
