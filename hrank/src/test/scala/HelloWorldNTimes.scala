object HelloWorldNTimes extends App
{


  def f(n: Int) =
  {
    var m = n
    do
    {
      m -= 1
      println("Hello World")
    }
    while (m > 0)
  }

var n = scala.io.StdIn.readInt

f(n)
}