fun main() {
    val dict = mapOf("skript" to "котлин", "class" to "котлин", "fun" to "котлин", "val" to "котлин");

    println("Введите слово: ")
    var word = readLine().toString();

    if (word in dict) println(dict[word])
    else println("Слова не в словаре.")
}