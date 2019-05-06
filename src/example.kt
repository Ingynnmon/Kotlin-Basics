import java.util.Random
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
    var myArray= arrayOf(1,1.23,"Dog")

    println(myArray[2])

    myArray[1]=3.14

    println("Array Length: ${myArray.size}")
    println("Dog in Array: ${myArray.contains("Dog")}")

    var partArray=myArray.copyOfRange(0,1)
    println("First: ${str1.first()}")
    println("Dog Index: ${myArray.indexOf("Dog")}")

    var squareArr=Array(5,{x-> x*x})
    println(squareArr[2])

    var arr2:Array<Int> = arrayOf(1,2,3);

    //ranges
    val oneToten=1..10
    val alpha="A".."Z"
    println("R in Alpha: ${"R" in alpha}")
    val tenToOne=10.downTo(1)
    val twoTo20=2.rangeTo(20)
    val range3=oneToten.step(3)
    for(x in range3) println("range3 : $x")
    for(x in tenToOne.reversed()) println("Reverse: $x")

    //conditionals
    val mAge=8
    if(mAge<5){
        println("Go to Preschool")
    }else if(mAge==5){
        println("Go to Kindergarten")
    }else if((mAge>5)&&(mAge<=17)){
        val grade=mAge-5
        println("Go to Grade: $grade")
    }else{
        println("Go to College")
    }

    when(mAge){
        0,1,2,3,4 -> println("Go to Preschool")
        5 -> println("Go to Kindergarten")
        in 6..17 ->{
            val grade=mAge-5
            println("Go to Grade: $grade")
        }
        else -> println("Go to collage")
    }

    //looping
    for(x in 1..10){
        println("Loop: $x")
    }
    val rand=Random()
    val magicNum=rand.nextInt(50)+1

    var guess=0
    while(magicNum !=guess){
        guess +=1
    }
    println("Magic Number was $guess")

    for(x in 1..20){
        if(x%2==0){
            continue
        }
        println("Odd: $x");
        if(x==15) break
    }
    var arr3:Array<Int> = arrayOf(3,6,9)
    for(i in arr3.indices){
        println("Multi 3: ${arr3[i]}")
    }
    for((index,value)in arr3.withIndex()){
        println("Index : $index Value: $value")
    }

    //functions
    fun add(num1:Int,num2:Int):Int=num1+num2
    println("5+4 is ${add(5,4)}")
    fun subtract(num1:Int,num2:Int):Int=num1-num2
    println("5-4 is ${subtract(5,4)}")

    println("4-5 = ${subtract(num2=5,num1=4)}")

    fun Hello(name:String):Unit=println("Hello $name")
    Hello("Ingynn")
    val (two,three)=nextTwo(1)
    println("1 $two $three")

    println("Sum = ${getSum(1,2,3,4)}")

    val multiply={num1:Int,num2:Int->num1*num2}

    println("5 * 3 = ${multiply(5,3)}")

    println("5! = ${fact(5)}")

}
fun nextTwo(num:Int):Pair<Int,Int>{
    return Pair(num+1,num+2)
}

fun getSum(vararg nums:Int):Int{
    var sum=0
    nums.forEach { n-> sum+=n}
    return sum
}

fun fact(x:Int):Int{
    tailrec fun factTail(y:Int,z:Int):Int{
        if(y==0) return z
        else return factTail(y-1,y*z)
    }
    return factTail(x,1)
}
