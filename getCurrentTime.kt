import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {
	val getCurrentTime = LocalDateTime.now()
    val formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SS")
    val currentTime = getCurrentTime.format(formatter)
    println(currentTime)

    
}
