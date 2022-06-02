import java.util.*

fun main() {
    println("Кол-во товаров первого :")
    var n = readLine()!!.toInt();
    println("Кол-во товаров второго :")
    var k = readLine()!!.toInt();

    val first = mutableSetOf<String>()
    val second = mutableSetOf<String>()

    println("Введите товары первого: ")
    for(i in 0..n)
    {
        var a = readLine().toString();
        first.add(a)
    }

    println("Введите товары второго: ")
    for(i in 0..k)
    {
        var b = readLine().toString();
        second.add(b)
    }
    println("Все товары первого: ")
    println(first)
    println("Все товары второго: ")
    println(second)
    println("Общие товары: ");
    println(first.intersect(second))
    println("Уникальные товары первого: ")
    println(first - first.intersect(second))
    println("Уникальные товары второго: ")
    println(second - second.intersect(first))
}