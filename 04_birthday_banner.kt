// #4: Print a birthday banner with a border
fun main() {
    val border = "'-._,-'"

    printBorder(border)    
    println("Happy Birthday, Jhansi!")
    printBorder(border)
}

fun printBorder(border : String) {
    val timesToRepeat = 4

    repeat(timesToRepeat) {
    	print(border)
	}
    println()
}
