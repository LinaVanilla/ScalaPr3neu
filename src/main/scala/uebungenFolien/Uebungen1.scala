package uebungenFolien

object Uebungen1 {

  def main(args: Array[String])= {
    println("HI")

    for (n<- -5 to 10) {
      printWert(n)
    }
    def printWert(n: Int) = {
      if (n == 0) {
        println("neutral")
      }
      else if (n < 0) {
        println("negative")
      }
      else {
        println("positive")
      }
    }

    for (i <- 1 to 7) {
      printWochentag(i)
    }

    def printWochentag(wochentag: Int) = {
      if (wochentag == 1 || wochentag == 7)
        println("Hoch die Hände Wochenende")
      else if (wochentag >= 8)
        println("fehlerhafte Eingabe")
      else if (wochentag == 4)
        println("Es ist Mittwoch meine Kerle.AHHHHH!")
      else
        println("Wochentag")

    }

    for(i <- 1 to 13){
      printMonat(i)
    }
    def printMonat(m: Int) = {
      val month = m match {
        case 1 => println("Januar")
        case 2 => println("Februar")
        case 3 => println("März")
        case 4 => println("April")
        case 5 => println("Mai")
        case 6 => println("Juni")
        case 7 => println("Juli")
        case 8 => println("August")
        case 9 => println("September")
        case 10 => println("Oktober")
        case 11 => println("November")
        case 12 => println("Dezember")
        case _ => println("Ungültiger Monat")
      }
    }
  }

}
