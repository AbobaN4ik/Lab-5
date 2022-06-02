fun main() {
    var chisla = mutableListOf<Int>();
    while (true){
        var n = readLine()?.toIntOrNull();
        if (n != null) chisla.add(n);
        else {
            for (i in 0..chisla.last()-1){
                println(chisla.removeAt(0));
            }
            break
        }
    }
}