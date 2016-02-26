package ru.lesson.lessons.lesson13.logic;


import ru.lesson.lessons.lesson13.Cell;
import ru.lesson.lessons.lesson13.SaperLogic;

/**
 * Created by user on 19.02.2016.
 */
public class Easy implements SaperLogic {
    private Cell[][] cells;

    @Override
    public void loadBord(Cell[][] cells) {
        this.cells = cells;
    }

    @Override
    public boolean shouldBang(int x, int y) {
        final Cell selected = this.cells[x][y];
        return selected.isBomb()&&!selected.isSuggestBomb();
    }

    @Override
    public boolean finish() {
        boolean finish = false;
        for (Cell[] raw: cells){
            for (Cell cell: raw){
                finish = cell.isSuggestBomb() && cell.isBomb() || cell.isSuggestEmpty() && !cell.isBomb();
            }
        }
        return finish;
    }

    @Override
    public void suggest(int x, int y, boolean bomb) {
        if(bomb){
            this.cells[x][y].suggestBomb();
        }else {
            this.cells[x][y].suggestEmpty();
        }
    }
}
