package chess.unit

class Queen : Chessmen {
    override var life: Boolean = true
    override val score: Int = 9
    override val initial: String = "Q"
}