package org.example.tictactoe.modals;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Cell {
    private Long row;
    private Long col;
    private Player player;
    private CellState cellState;
}
