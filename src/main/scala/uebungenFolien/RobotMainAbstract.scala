package uebungenFolien

abstract class Robot2(val name: String = "Unknown") {
  def greeting(name : String): String
}

class ItalianRobot22(override val name: String = "Unknown") extends Robot2{
  override def greeting(name: String): String = {
    return "Benvenuto "+name+"! Il mio nome e' "+this.name+"."
  }
}
class EnglishRobot22(override val name: String = "Unknown", val country: String) extends Robot2{
  override def greeting(name: String): String = {
    return "Welcome "+name+"! My name is "+this.name+" and I'm from "+this.country+"."
  }
}

object RobotMain2 {
  def main(args: Array[String]): Unit = {
    val italRobo = new ItalianRobot22("Rachele")
    val englRobo = new EnglishRobot22("George", "USA")

    println(italRobo.greeting("Lina"))
    println(englRobo.greeting("Lina"))
  }


}
