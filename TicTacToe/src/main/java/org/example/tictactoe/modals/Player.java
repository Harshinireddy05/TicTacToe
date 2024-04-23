package org.example.tictactoe.modals;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Player {
    private String name;
    private Symbol symbol;
    private PlayerType playerType;
}
