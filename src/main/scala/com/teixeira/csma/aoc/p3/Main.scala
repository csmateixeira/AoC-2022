package com.teixeira.csma.aoc.p3

import com.teixeira.csma.aoc.common.FileReader

object Main {
  def main(args: Array[String]) {
    val exampleFile = "/Users/raccoon/IdeaProjects/AoC-2022/input/p3/example"
    val inputFile = "/Users/raccoon/IdeaProjects/AoC-2022/input/p3/input"

    println("Part 1: get duplicate sum")
    println(P3a.calculateSumOfDuplicates(P3a.readFileLinesAsRucksacks(exampleFile)))
    println(P3a.calculateSumOfDuplicates(P3a.readFileLinesAsRucksacks(inputFile)))

    println("Part 2: get duplicate sum")
    println(P3b.calculateSumOfDuplicates(P3b.readFileLinesAsRucksacks(exampleFile)))
    println(P3b.calculateSumOfDuplicates(P3b.readFileLinesAsRucksacks(inputFile)))

  }
}
