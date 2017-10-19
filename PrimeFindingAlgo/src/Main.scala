import Array._
import Math._
import Range._
import List._
import org.junit.Test
import org.junit.Assert._


object Main {
  
 
  def main(args: Array[String]): Unit ={
  
  println("Enter an integer for Sieve of Erathosthenes");
  
  val myNum = scala.io.StdIn.readInt()
  //Populating a list of all integers
  
  
  val initList = List.range(2, myNum)  
  
  //Number uptill which we need to traverse
  val sqrtToCheck = scala.math.sqrt(myNum).toInt
   
   val finalList = findPrimeNumbers(initList, sqrtToCheck)
 
   print("Here is the list of Prime Numbers")
   finalList.foreach(println)
   
   checkIfRight()  //Method defined for Unit Testing
  }
  
  def findPrimeNumbers(primeList: List[Int], upToCheck: Int): List[Int] = {
     
    def primeFinder(splittedList: List[Int],listIter: Int):List[Int] = {
      
      //Checking if current value is not greater than sqrt of total value i.e Base Case
      if(upToCheck< listIter) return splittedList
      else{  //Non base cases
        primeFinder(splittedList.filterNot(inIter => (inIter%listIter == 0 && inIter!= listIter)),listIter+1)
      }
    }
      return primeFinder(primeList, 2)
  }
  
  @Test
  def checkIfRight()={ //Test function
     
    val truePrimeList = List(2,3,5,7,11,13,17,19,23,29)
    val numList = List.range(2,30)
     println("Test for prime numbers till 30 successful")
   
     val sqrtTo = scala.math.sqrt(30).toInt
      assertEquals(truePrimeList, findPrimeNumbers(numList, sqrtTo))    
  }
}