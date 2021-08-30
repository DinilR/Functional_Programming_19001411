object Question1 extends App{
  val p1 = point(3,5)
  val p2 = point(2,4)


  print("Point 1: ")
  println(p1)
  print("Point 2: ")
  println(p2)
  println()

  println("+ method")
  print("point 1 + point 2 = ")
  println(p1+p2)
  println()

  println("move method")
  println("moving P1 by (4,5)")
  val p3 = p1.move(4,5)
  println(p3)
  println()

  println("Invert method")
  println("Inverting point 2")
  val p4 = p2.invert()
  println(p4)
  println()

  println("Distance method")
  println("Distance between point 1 and 2")
  var p5 = p1.distance(p2)
  println(p5)







  }


  case class point(x:Int,y:Int){
    def +(that:point)=point(this.x+that.x,this.y+that.y)
    def move(dx:Int,dy:Int):point = point(this.x+dx,this.y+dy)
    def invert() = point(this.y,this.x)
    def distance(that:point) : Double = {
      var distanceX:Int = this.x - that.x
      var distanceY:Int = this.y - that.y
      var dist: Int = distanceX*distanceX + distanceY*distanceY
      scala.math.sqrt(dist)

  }
}