package uebungenFolien

object uebungen3 {
  def main(args: Array[String]): Unit = {
    def durchschnittInt(a:Double, b: Double, c:Double): Int = {
      return ((a+b+c)/3).toInt
    }
    println("Durchschnitt1:" + durchschnittInt(1.8,2,2.5))

    def durchschnittDouble(a: Double, b: Double, c: Double): Double = {
      return (a + b + c) / 3
    }

    println("Durchschnitt2:" + durchschnittDouble(1.8,2,2.5))
  }

}
