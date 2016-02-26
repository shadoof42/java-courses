package ru.lesson.lessons.lesson13;


/**
 * Created by user on 19.02.2016.
 */
public class BaseAction implements UserAction {
    private final GeneratorBoard generator;
    private final Board board;
    private final SaperLogic logic;

    public BaseAction(final SaperLogic logic,final Board board,final GeneratorBoard generator) {
        this.generator =  generator;
        this.board = board;
        this.logic = logic;
    }

    @Override
    public void initGame() {
        final Cell[][] cells = generator.generate();
        this.board.drawBoard(cells);
        this.logic.loadBord(cells);
    }

    @Override
    public void select(int x, int y, boolean bomb) {
        this.logic.suggest(x, y, bomb);
        board.drawCell(x, y);
        if (this.logic.shouldBang(x,y)){
            this.board.drawBang();
        }
        if (this.logic.finish()){
            board.drawCongratulate();
        }
    }
}
