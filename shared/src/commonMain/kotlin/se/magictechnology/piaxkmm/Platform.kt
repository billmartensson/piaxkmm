package se.magictechnology.piaxkmm

expect class Platform() {
    val platform: String
}

expect class SparaSiffra() {
    fun spara(siffra : Int)
    fun ladda() : Int
}