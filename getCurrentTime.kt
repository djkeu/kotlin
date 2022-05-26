import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {
	val currentTime = LocalDateTime.now()
    val formatter = DateTimeFormatter.ofPattern("HH:mm:ss")
    val formattedTime = currentTime.format(formatter)
    println(formattedTime)
}
