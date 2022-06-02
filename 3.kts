import java.util.*

fun main() {
    val chisla = Stack<Int>()

    while (true){
        var n = readLine()?.toIntOrNull();
        if (n != null) chisla.push(n);
        else {
            while (!chisla.empty()) {
                println(chisla.pop())
            }
            break
        }
    }
}