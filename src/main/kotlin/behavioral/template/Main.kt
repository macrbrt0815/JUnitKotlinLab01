package behavioral.template

fun main(){
    val game: Game = Cricket()
    game.play();
    println()

    val game2: Game = Football()
    game2.play()
}