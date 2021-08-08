/*19001411
q4*/
object q4 extends App{
  //recursive function to determine even and odd numbers
  //iseven(3)->isOdd(2)->!(iseven(2)->isOdd(1)->!(isEven(1))->isOdd(0)->!(isEven(0))
//                   false<-            true<-                     False<-true
  def isEven(n:Int):Boolean= n match{
    case 0=>true
    case _=> isOdd(n-1)
  }
  def isOdd(n:Int):Boolean = !(isEven(n))

  def evorodd(n:Int):Unit={
      if(isEven(n))
        println("The number is even")
      else
        println("The number is odd")
  }


  evorodd(9)


}