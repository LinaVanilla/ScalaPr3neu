package uebungenFolien


class Robot(val name: String = "Unknown") {
  def greeting(name : String): String = {
    return "Welcome "+name+"! My name is "+this.name+"."
  }
}

class ItalianRobot(override val name: String = "Unknown") extends Robot{
  override def greeting(name: String): String = {
    return "Benvenuto "+name+"! Il mio nome e' "+this.name+"."
  }
}
class EnglishRobot(override val name: String = "Unknown", val country: String) extends Robot{
  override def greeting(name: String): String = {
    return "Welcome "+name+"! My name is "+this.name+" and I'm from "+this.country+"."
  }
}

object RobotMain {
  def main(args: Array[String]): Unit = {
    val robo1 = new Robot("Max")
    val robo2 = new Robot("Felix")
    val robo3 = new Robot()

    val italRobo = new ItalianRobot("Rachele")
    val englRobo = new EnglishRobot("George", "USA")

    println(robo1.name)
    println(robo2.name)
    println(robo3.name)

    println(robo1.greeting("Lina"))
    println(robo2.greeting("Lina"))
    println(robo3.greeting("Lina"))

    println(italRobo.greeting("Lina"))
    println(englRobo.greeting("Lina"))
  }


}
