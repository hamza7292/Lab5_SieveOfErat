package mainPack

import org.junit.Test
import org.junit.Assert._
import Math._

class testerClass {
   @Test
    def checkIfRight()={
     val truePrimeList = List(2,3,5,7,9,11,13,17,19,23,29)
   
   println("Test for prime numbers till 30")
   
   val sqrtTo = scala.math.sqrt(30).toInt
   
   //assertEquals(truePrimeList, findPrimeNumbers(truePrimeList, sqrtTo))
 }

}