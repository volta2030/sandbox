package chess

import chess.unit.*

class Player {

    private var chessmens: ArrayList<Chessmen> = ArrayList()

    init {
        setChessmen()
    }

    private fun setChessmen() {
        chessmens.add(King())
        chessmens.add(Queen())
        chessmens.add(Rook())
        chessmens.add(Rook())
        chessmens.add(Bishop())
        chessmens.add(Bishop())
        chessmens.add(Knight())
        chessmens.add(Knight())
        for (i in 0..7){
            chessmens.add(Pawn())
        }
    }
}