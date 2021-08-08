//19001411
//q1
object q1 extends App{
  //recursive function prime(n) that returns true for a prime number and false for others
  def GCD(a:Int,x:Int):Int=x match{
    case 0=>a
    case x if x>a => GCD(x,a)
    case _=>GCD(x,a%x)
  }
  def prime(n:Int,a:Int=2):Boolean=a match{
    case a if(a==n)=>true
    case a if GCD(n,a)>1=>false
    case a=> prime(n,a+1)
  }
  println(prime(7))

}
