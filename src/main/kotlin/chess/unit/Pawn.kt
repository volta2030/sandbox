package chess.unit

class Pawn : Chessmen {
    override var life: Boolean = true
    override val score: Int = 1
    override val initial: String = "P"
}