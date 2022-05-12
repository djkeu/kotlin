// #5 Create a cake with the layers and candles
fun main() {
	val age = 24
    val layers = 5
    
    // printCakeCandles(age)
    printCakeTop(age)
    // printCakeBottom(age, layers)
}

fun printCakeTop(age : Int) {
    repeat(age + 2) {
        print("=")
    println()
    }
}
