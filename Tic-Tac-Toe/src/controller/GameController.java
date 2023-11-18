package controller;

import model.Game;
import model.GameState;
import model.Player;

public class GameController {

    public Game startGame() {
        return new Game();
    }

    private void makeMove(Game game) {

    }

    private void displayBoard(Game game) {

    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }

    public GameState checkGameState(Game game) {
        return game.getGameState();
    }

    public void undo (Game game) {

    }
}
