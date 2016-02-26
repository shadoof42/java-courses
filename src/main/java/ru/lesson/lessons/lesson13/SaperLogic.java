package ru.lesson.lessons.lesson13;

/**
 * Created by user on 19.02.2016.
 */
public interface SaperLogic {
    void loadBord(Cell[][] cells);

    boolean shouldBang(int x, int y);

    boolean finish();

    void suggest(int x, int y, boolean bomb);
}
