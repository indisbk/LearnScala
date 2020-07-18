object Main extends App {

  /*def fibs(num: Int): Int = {
    if (num < 3)
      1
    else
      fibs(num - 1) + fibs(num - 2)
  }
  println(fibs(5))*/

  /*val searchOdd: List[Int] => List[Int] = LessonData.searchInArray(_ % 2 == 1, _: List[Int])
  println(searchOdd(List(8,11,12)))*/

  /*def greet(): Unit = {println("Hi")}
  println(() == greet)*/

  /*def numsOdd(nums: List[Int]) =
    for {
      num <- nums
      if num % 2 == 1
    } yield num

  println(numsOdd(List(1, 2, 3, 4, 5, 6, 7, 8)))*/

  /*def partition(num: Int) =
    try {
      num / 0
    } catch {
      case _: IllegalArgumentException => println("Exception caught 1")
    }

  val sum =
    try {
      partition(2)
    } catch {
      case _: ArithmeticException => println("Exception caught 2")
    }*/

  /*val arg = if (!args.isEmpty) args(0) else ""
  val friend = arg match {
    case "salt" => "pepper"
    case "chips" => "salsa"
    case _ => "huh?"
  }
  println(friend)*/

  //println(MultipleTable.multiTable())
}
