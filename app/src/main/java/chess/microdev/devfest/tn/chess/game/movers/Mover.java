package chess.microdev.devfest.tn.chess.game.movers;

import chess.microdev.devfest.tn.chess.game.Table;
import chess.microdev.devfest.tn.chess.game.pieces.Piece;

/**
 * Created by khaled on 26/11/16.
 */
public interface Mover
{
    String canMoveTo(Table table, Piece piece, char column, int line);
}
