package org.example.tictactoe.controllers;

import org.example.tictactoe.exceptions.InvalidMoveException;
import org.example.tictactoe.modals.Game;
import org.example.tictactoe.modals.GameState;
import org.example.tictactoe.modals.Player;

import java.util.List;

public class GameController {
    public Game startGame(int dimension, List<Player> players){
        return new Game(dimension, players);
    }
    public void makeMove(Game game) throws InvalidMoveException {
        game.makeMove();
    }

    public GameState checkState(Game game) {
        return game.getGameState();
    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }

    public void printBoard(Game game) {
        game.printBoard();
    }
}
