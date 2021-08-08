//19001411
//q2
object q2 extends App{
  //primeSeq(n) that prints all prime number which less than n

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
  def primeseq(n:Int, a:Int=2):Unit= n match{
    case x if (a == x)=>{
  return;
  }
    case _=>
  {
    if(prime(a))
  {
    println(a)
  }
  primeseq(n,a+1)

  }



  }
  primeseq(10)
}