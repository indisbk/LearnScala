object MultipleTable {
  def makeRowSeq(row: Int): IndexedSeq[String] =
    for (col <- 1 to 10) yield {
      val prod = (row * col).toString
      val padding = " " * (4 - prod.length)
      padding + prod
    }

  def makeRow(row: Int): String = makeRowSeq(row).mkString

  def multiTable(): String = {
    val tableSeq =
      for (row <- 1 to 10)
        yield makeRow(row)

    tableSeq.mkString("\n")
  }
}
