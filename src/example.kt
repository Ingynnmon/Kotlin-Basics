
fun main(args : Array<String>){
    println("Hello World")

    //dataTypes
    var myname:String="Ingynn"
    val myage:Int=21

    //Casting
    var bigInt:Int=Int.MAX_VALUE
    var smallInt:Int=Int.MIN_VALUE

    println("Biggest Int: "+bigInt)
    println("Smallest Int: "+smallInt)

    var bigLong:Long=Long.MAX_VALUE
    var smallLong:Long=Long.MIN_VALUE

    println("Biggest Long: "+bigLong)
    println("Smallest long: "+smallLong)

    var bigDouble: Double= Double.MAX_VALUE
    var smallDouble: Double= Double.MIN_VALUE

    println("Biggest Double: " +bigDouble)
    println("Smallest Double: " +smallDouble)

    var bigFloat:Float=Float.MAX_VALUE
    var smallFloat:Float= Float.MIN_VALUE

    println("Biggest Float: "+bigFloat)
    println("Smallest Float: "+smallFloat)

    var doubleNum:Double= 1.11111111111111
    var doubleNum1:Double=1.11111111111111

    println("Sum: "+(doubleNum+doubleNum1))

    //strings
    var letter:Char='I'
    println("I is a Char: ${letter is Char}")

    println("3.14 to Int: "+(3.14.toInt()))
    println("I to Int: "+('I'.toInt()))
    println("Hello, good afternoon!")
    println("73 to Stirng:"+ 73.toChar())

    val name="Ingynn"
    val longStr="""This is a long string"""
    var firstName:String="Ingynn"
    var lastName:String="Mon"

    firstName="Rei"
    var fullName:String=firstName+ " " +lastName

    println("1+2 = ${1+2}")
    println("String Length: ${longStr.length}")

    var str1="random string"
    var str2="random String"

    println("Strings Equal: ${str1.equals(str2)}")
    println("Compare A to B: ${"A".compareTo("B")}")

    println("2nd Index: ${str1.get(2)}")
    println("Index 2-7: ${str1.subSequence(2,8)}")
    println("Contains random: ${str1.contains("random")}")

    //arrays
    

}
