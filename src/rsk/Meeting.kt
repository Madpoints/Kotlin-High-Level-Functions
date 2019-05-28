package rsk

import java.util.*

class Meeting {
    var Title: String = ""
    var When: Date = Date()
    var Who = mutableListOf<String>()

    fun create(){}
}

fun main(args: Array<String>) {
    val m = Meeting()
    m.Title = "Board meeting"
    m.When = Date(2019, 6, 4)
    m.Who.add("Sam")

    with(m) {
        Title = "Board meeting"
        When = Date(2019, 6, 4)
        Who.add("Sam")
    }

    m.apply {
        Title = "Board meeting"
        When = Date(2019, 6, 4)
        Who.add("Sam")
    }.create()
}