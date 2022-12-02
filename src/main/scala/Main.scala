package com.teixeira.csma.aoc

object Main {
  def main(args: Array[String]) {
    val exampleFile = "/Users/raccoon/IdeaProjects/AoC-2022-P1a/input/example"
    val inputFile = "/Users/raccoon/IdeaProjects/AoC-2022-P1a/input/input"

    println(P1a.maxFromList(P1a.getListTotals(P1a.readFileLines(exampleFile))))
    println(P1a.maxFromList(P1a.getListTotals(P1a.readFileLines(inputFile))))
  }
}
