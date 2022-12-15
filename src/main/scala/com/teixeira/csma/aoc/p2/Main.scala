package com.teixeira.csma.aoc.p2

object Main {
  def main(args: Array[String]) {
    val exampleFile = "/Users/raccoon/IdeaProjects/AoC-2022/input/p2/example"
    val inputFile = "/Users/raccoon/IdeaProjects/AoC-2022/input/p2/input"

    val exampleInput: List[(String, String)] = Common.readFileLinesWithTuples(exampleFile)
    val inputInput: List[(String, String)] = Common.readFileLinesWithTuples(inputFile)

    println("Total score for each player (Part 1)")
    println(P2a.calculateTotalScores(exampleInput))
    println(P2a.calculateTotalScores(inputInput))

    println("Total score for each player (Part 2)")
    println(P2b.calculateTotalScores(exampleInput))
    println(P2b.calculateTotalScores(inputInput))

  }
}
