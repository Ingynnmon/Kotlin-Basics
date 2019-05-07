fun main(args : Array<String>)
{
    val map = mutableMapOf<Int,Any?>()

    //val map2 = mutableMapOf(1 to "Dog", 2 to 25)

    map[1]="Derek"
    map[2]="dk"
    println("Map Size: ${map.size}")

    map.put(3,"Cat")

    map.remove(2)

    for((x,y) in map) {
        println("Key: $x Value: $y")
    }
}