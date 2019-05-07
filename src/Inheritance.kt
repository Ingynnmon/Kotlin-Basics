fun main(args: Array<String>){
    val bowser = Animal("Spike",12.0,13.5)
    bowser.getInfo()

    val spot=Dog("Spot",20.0,14.3,"Paul Smith")
    spot.getInfo()
}
open class Animal1(val name:String,
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
class Dog(name: String,
          height: Double,
          weight: Double,
          var owner: String):Animal1(name,height,weight){
    override fun getInfo(): Unit{
        println("$name is $height tall and weighs $weight and is owned by $owner")

    }
}