package uebungenFolien

object Uebungen2 {

  def main(args:Array[String] ): Unit = {
    def increment(x: Int): Int= {
      return x+1
    }
    def getFirstCharacter(s:String): Character={
      return s.charAt(0)
    }
    def wordScore(word:String): Int ={
      return word.length
    }

    println(increment(2))
    println(getFirstCharacter("Brudi"))
    println(wordScore("Brudi"))

    def MyFuncTest1 = ???
    def myFuncTest2() = ???
    def myFuncTest3(a:Int) = ???
    def myFuncTest4(a:Int, b:String) = ???
    /*println(myFuncTest4(1, "Scala"))
    println(myFuncTest4(a=1,b= "Scala"))
    println(myFuncTest4(b="Scala", a =1))*/

    def myFuncTest5(a:Int, b:String = "Hello") = ???
    /*println(myFuncTest5(1,"Scala"))
    println(myFuncTest5(1))
    println(myFuncTest5(a=1))
    println(myFuncTest5(a=1,b="Scala"))
    println(myFuncTest5(b="Scala",a=1))*/

    
  }

}
