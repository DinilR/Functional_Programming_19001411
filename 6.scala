//19001411
//q6
object q6 extends App{
  //recursive function print fist n Fibonacci numbers for given n.
    def fibbonacci(n:Int):Int = n match{
      case 0=>0
      case x if n==1=>1      //case 1
      case _ => fibbonacci(n-1)+fibbonacci(n-2)
    }

   def fibList(n:Int):Unit={
     if(n>0) fibList(n-1)
     println(fibbonacci(n))
   }

    fibList(10)
}