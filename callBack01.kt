import java.text.SimpleDateFormat
import java.util.*

object CallbackExample {

    fun playKukuOnce() {
        // val resId = resources.getIdentifier("keukuk", "raw", packageName)
        // val mediaPlayer = MediaPlayer.create(this, resId)
        // mediaPlayer.start()
        println("Kukuk!")
    }
    
    fun minutelyCall() {
        val getCurrentTime = Calendar.getInstance().time
        val formatter = SimpleDateFormat("ss", Locale.getDefault())
        val currentTime = formatter.format(getCurrentTime)

        println(currentTime)

        if (currentTime == "00") {
            playKukuOnce()
        }
    }
}

fun main() {
    CallbackExample.minutelyCall()
}