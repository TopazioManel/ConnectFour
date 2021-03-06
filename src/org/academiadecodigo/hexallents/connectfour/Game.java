package org.academiadecodigo.hexallents.connectfour;

import org.academiadecodigo.simplegraphics.graphics.Color;

/**
 * Created by codecadet on 24/02/2018.
 */
public class Game {

    private Grid grid;
    private Cursor cursor;
    private InputHandler keyboard;

    public Game() {
    }

    public void startGame() {
        grid = new Grid(7, 7);

        grid.createGrid();

        Player player1 = new Player(Color.RED);
        Player player2 = new Player(Color.BLUE);

        cursor = new Cursor(grid);

        keyboard = new InputHandler(cursor);

        initGame(player1, cursor, grid);
    }

    public void initGame(Player player, Cursor cursor, Grid grid) {

        cursor.setColor(player.getColor());

        // temos de receber instrução que o jogador fez o seu move já validado

        grid.checkVictory();
    }
}
