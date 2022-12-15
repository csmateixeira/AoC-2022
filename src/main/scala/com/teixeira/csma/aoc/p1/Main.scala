package com.teixeira.csma.aoc
package com.teixeira.csma.aoc.p1


object Main {
  def main(args: Array[String]) {
    val exampleFile = "/Users/raccoon/IdeaProjects/AoC-2022/input/p1/example"
    val inputFile = "/Users/raccoon/IdeaProjects/AoC-2022/input/p1/input"

    val exampleInput: List[List[Int]] = Common.readFileLinesWithInts(exampleFile)
    val inputInput: List[List[Int]] = Common.readFileLinesWithInts(inputFile)

    println("Total calories for 1 Elf")
    println(P1a.maxFromList(P1a.getListTotals(exampleInput)))
    println(P1a.maxFromList(P1a.getListTotals(inputInput)))

    println("Total calories for top 3 Elves")
    println(P1b.getTopThreeTotals(exampleInput))
    println(P1b.getTopThreeTotals(inputInput))
  }
}
