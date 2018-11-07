object HelloWorldNTimes extends App
{

//First Method ( my Naive solution)

//  def f(n: Int) =
//  {
//    var m = n
//    do
//    {
//      m -= 1
//      println("Hello World")
//    }
//    while (m > 0)
//  }

  //Second Method (From Discussions)
//  def f(n: Int) = println("Hello World\n" * n)


  //third Method (From Discussions)
//  def hello = println("Hello World")
//  def f(n : Int) = 1 to n map (i => hello)


  //fourth Method (From Discussions)
//  def f(n:Int):Unit = {
//    (1 to n).foreach (_ => println("Hello World"))
//  }


  //Fifth Solution ( My Recursive function)
  def f(n : Int): Int = n match
    {
    case 0 => 0
    case _ => println("Hello World")
      f(n-1)
  }



var n = scala.io.StdIn.readInt

f(n)
}