fun main() {
    // #4: Print a birthday banner with a border
    printBorder()    
    println("Happy Birthday, Jhansi!")
    printBorder()
}

fun printBorder() {
	repeat(23) {
    	print("=")
	}
    println()
}
