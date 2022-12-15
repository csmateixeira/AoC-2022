package com.teixeira.csma.aoc.p3

import com.teixeira.csma.aoc.common.FileReader

object P3b {

  def readFileLinesAsRucksacks(f: String): List[List[Char]] =
    FileReader.readFileLines(f)
      .map(item => item.toList)

  def calculateSumOfDuplicates(rucksacks: List[List[Char]]): Int = {
    rucksacks
      .map(rucksack => rucksackToPriorityRucksack(rucksack))
      .grouped(3).toList
      .map(rucksackTrio => getDuplicate(rucksackTrio))
      .sum
  }

  private def rucksackToPriorityRucksack(rucksack: List[Char]): List[Int] =
    rucksack.map(char => Common.getPriority(char))

  private def getDuplicate(trioOfRucksacks: List[List[Int]]): Int = {
    val rucksack1: List[Int] = trioOfRucksacks(0)
    val rucksack2: List[Int] = trioOfRucksacks(1)
    val rucksack3: List[Int] = trioOfRucksacks(2)

    rucksack1
      .filter(rucksack2.contains)
      .find(rucksack3.contains)
      .get
  }
}
