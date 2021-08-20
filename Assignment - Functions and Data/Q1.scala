object Q1{
    def main(args:Array[String]):Unit = {
        val num = new Rational(1, 3)

        println(num)
        println(num.neg)
    }
}

class Rational(x:Int, y:Int){
  val numer = x
  val denom = y

  def neg = new Rational(- this.numer, this.denom)

  override def toString = this.numer.toString + " / " + this.denom.toString
}
