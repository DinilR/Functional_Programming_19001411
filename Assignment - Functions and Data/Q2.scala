object Q2{
    def main(args:Array[String]):Unit = {
        val x = new Rational(3, 4)
        val y = new Rational(5, 8)
        val z = new Rational(2, 7)

        println(x.sub(y).sub(zcd ))
    }
}

class Rational(x:Int, y:Int){
  val numer = x
  val denom = y

  def sub(num:Rational):Rational = {
    new Rational(this.numer * num.denom - num.numer * this.denom, this.denom * num.denom)
  }

  override def toString = this.numer.toString + " / " + this.denom.toString
}
