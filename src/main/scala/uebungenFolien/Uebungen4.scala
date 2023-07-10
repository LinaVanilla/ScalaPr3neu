package uebungenFolien

object Uebungen4 {

  def main(args: Array[String]): Unit = {
    val mySet = Set(1,2,4,4,4)
    println(mySet)
    val myMSet = collection.mutable.Set(1,2,3,3,3)
    println(myMSet)
    myMSet.add(5)
    println(myMSet)
    val myTuple = Tuple2("Hallo", 8)
    println(myTuple)
    val myRange1 = 1 to 10
    println(myRange1)
    val myRange2 = 1 until 10
    println(myRange2)
    val myRange3 = 1 to 10 by 3
    println(myRange3)
    val myRange4 = 'a' to 'd'
    println(myRange4)
    val myRangeList = (1 to 10).toList
    println(myRangeList)

    def returnNoneFunction(): Option[String] = None
    println(returnNoneFunction())
    def returnSomeFunction(): Option[String] = Some("Option logic works")
    println(returnSomeFunction())
    val obtainInformation1 = returnNoneFunction() orElse returnSomeFunction()
    println(obtainInformation1)
    val obtainInformation2 = returnSomeFunction() orElse returnNoneFunction()
    println(obtainInformation2)
  }

}
