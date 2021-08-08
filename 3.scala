//19001411
//q3
object q4 extends App{
  //recursive function returns the addition of numbers from1 to n
  def sum(x:Int):Int= x match{

    case x if(x==1)=>1 //case 1
    case _ => x+sum(x-1)

  }
  println(sum(5))

}