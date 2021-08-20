object Q3{
    def main(args:Array[String]):Unit = {
        val a1 = new Account("1061", 101, 10000)
        val a2 = new Account("1428", 102, 2500)

        println("BEFORE")
        println(a1)
        println(a2)

        println()
        a1.transfer(a2, 2500)

        println("AFTER")
        println(a1)
        println(a2)
    }
}

class Account(id:String, n:Int, b:Double){
  val nic:String = id
  val acnumber:Int = n
  var balance:Double = b

  def withdraw(a:Double) = this.balance = this.balance - a

  def deposit(a:Double) = this.balance = this.balance + a

  def transfer(a:Account, b:Double):Unit = {
    this.withdraw(b)
    a.deposit(b)
  }

  override def toString = "[" + this.nic + ": " + this.acnumber + ": " + this.balance + "]"
}
