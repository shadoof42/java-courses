package ru.lesson.lessons.lesson13.console;

import ru.lesson.lessons.lesson13.Board;
import ru.lesson.lessons.lesson13.Cell;

/**
 * Created by user on 19.02.2016.
 */
public class ConsoleBoard implements Board {
    private Cell[][] cells;


    public void drawBoard(Cell[][] cells) {
        this.cells = cells;
        this.redraw(false);
    }

    public void drawCell(int x, int y) {
        System.out.println("****    SELECT  ****");
        this.redraw(false);
    }

    public void drawBang() {
        System.out.println("****    BANG  ****");
        this.redraw(true);
    }

    public void drawCongratulate() {
        System.out.println("****    CONGRATULATE  ****");
        this.redraw(true);
    }

    private void redraw(boolean real){
        for (Cell[] raw : cells){
            for (Cell cell : raw){
                cell.draw(System.out, real);
            }
            System.out.println();
        }
        System.out.println();
    }
}
