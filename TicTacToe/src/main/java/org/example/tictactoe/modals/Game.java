package org.example.tictactoe.modals;

import java.util.List;

public class Game {
    private Board board;
    List<Player> playerList;
    Integer[] nextPlayerMoveIndex;
    Player Winner;
    List<Move> moveList;
    GameState gameState;
}
