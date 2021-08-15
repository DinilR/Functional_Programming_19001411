import scala.io.StdIn.readLine
object caesor{
  def main(args:Array[String]):Unit = {
    println("Enter the text you want to encrypt: ")
    val string1 = readLine()
//    val string1 = "Wewantphysicalexams"
    val skips = 6
    val text_encrypt = cipher(E,string1,skips,alphabet)
    println("Cipher Text = " + text_encrypt);

    val text_decrypt = cipher(D,text_encrypt,skips,alphabet)
    println("Decrypted text: " + text_decrypt);


    is_encrypted(string1,text_decrypt);





  }

  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  val E = (c:Char, key:Int, a:String) => a((a.indexOf(c.toUpper) + key) % a.size)

  val abs = (num:Int, a:String) => if(num >= 0) num else a.size + num

  val D = (c:Char, key:Int, a:String) => a(abs(((a.indexOf(c.toUpper) - key) % a.size), a))

  val cipher = (algo:(Char, Int, String) => Char, s:String, key:Int, a:String) => s.map(algo(_, key, a))

  def is_encrypted(original:String,decrypted:String):Unit =
  {
    if(original.toUpperCase == decrypted){
      println("Decrypted text equals to the original text")
      println("Encryption completed successfully")
    }else{

      println("Decrypted text is not equal to the original text");
    }
  }

}