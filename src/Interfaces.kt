fun main(args: Array<String>){
    val spot=Cat("Spot",20.0,14.3,"Paul Smith")
    spot.getInfo()

    val fish=Fish("fish",true)
    fish.swim(10.0)
}
open class Animal2(val name:String,
                   var height:Double,
                   var weight: Double){
    init{
        val regex = Regex(".*\\d+.*")

        require(!name.matches(regex)){"Animal name can't contain number"}

        require(height>0){"Height must be greater than 0"}
        require(weight>0){"Weight must be greater than 0"}

    }
    open fun getInfo(): Unit{
        println("$name is $height tall and weights $weight")
    }
}
class Cat(name: String,
          height: Double,
          weight: Double,
          var owner: String):Animal2(name,height,weight){
    override fun getInfo(): Unit{
        println("$name is $height tall and weighs $weight and is owned by $owner")

    }
}
interface Aquatic{
    var swims:Boolean
    fun swim(disMile: Double):Unit
}
class Fish constructor(val name:String, override var swims:Boolean=true)
    :Aquatic{
    override fun swim(disMile: Double):Unit
    {
        if(swims){
            println("$name swims $disMile miles")
        }
    }
}