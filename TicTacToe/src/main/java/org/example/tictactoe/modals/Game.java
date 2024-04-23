package org.example.tictactoe.modals;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class Game {
    private Board board;
    List<Player> playerList;
    Integer[] nextPlayerMoveIndex;
    Player Winner;
    List<Move> moveList;
    GameState gameState;
}
