// #4: Print a birthday banner with a border
fun main() {
    val border = "="

    printBorder(border)    
    println("Happy Birthday, Jhansi!")
    printBorder(border)
}

fun printBorder(border : String) {
	repeat(23) {
    	print(border)
	}
    println()
}
