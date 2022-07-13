package chess

enum class PlayStatus(val num: Int) {
    START(0),
    PAUSE(1),
    RESUME(2),
    FINISH(3)
}
