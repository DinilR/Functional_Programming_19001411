object Q4{
    def main(args:Array[String]):Unit = {
        val a1 = new Account("100", 10, 1300)
        val a2 = new Account("101", 20, 1500)
        val a3 = new Account("102", 30, -2030)
        val a4 = new Account("103", 40, 1200)
        val a5 = new Account("104", 50, 20900)
        val a6 = new Account("105", 60, -1800)

        var bank:List[Account] = List(a1, a2, a3, a4, a5, a6)

        println("Overdraft List")
        overdraft(bank).foreach(i => println(i))
        println()

        println("Sum of Accounts: Rs " + Netbalance(bank))
        println()

        println("Sum of Accounts(With Interest): Rs " + Netbalance(interest(bank)))
        println()
    }

    val overdraft = (b:List[Account]) => b.filter(x => x.balance < 0)

    val Netbalance = (b:List[Account]) => b.reduce((x, y) => new Account("", 0, x.balance + y.balance)).balance

    val interest = (b:List[Account]) => b.map(x => if(x.balance >=0) new Account(x.nic, x.acnumber, x.balance + x.balance * 0.005) else new Account(x.nic, x.acnumber, x.balance + x.balance * 0.01))
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
