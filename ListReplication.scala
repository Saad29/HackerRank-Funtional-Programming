object ListReplication extends App
{

  def f(num:Int, arr:List[Int]):List[Int] =
  {
   arr.flatMap { List.fill(num)(_) }

    //the above does the same thing as
   //arr.flatMap { x => List.fill(num)(x)}
    
  }

}
