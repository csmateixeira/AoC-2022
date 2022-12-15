package com.teixeira.csma.aoc.p3

import com.teixeira.csma.aoc.common.FileReader

object P3a {

  def calculateSumOfDuplicates(rucksacks: List[Rucksack]): Int = {
    rucksacks.map(rucksack => rucksackToPriorityRucksack(rucksack))
      .map(rucksack => findDuplicatedItem(rucksack))
      .sum
  }

  def readFileLinesAsRucksacks(f: String): List[Rucksack] =
    FileReader.readFileLines(f)
      .map(line => line.grouped(line.length / 2).toList)
      .map(list => list.map(item => item.toList))
      .map(list => Rucksack(list(0), list(1)))

  private def rucksackToPriorityRucksack(rucksack: Rucksack): PriorityRucksack =
    PriorityRucksack(compartmentToPriorityCompartment(rucksack.compartment1),
      compartmentToPriorityCompartment(rucksack.compartment2))

  private def compartmentToPriorityCompartment(compartment: List[Char]): List[Int] =
    compartment.map(char => Common.getPriority(char))



  private def findDuplicatedItem(priorityRucksack: PriorityRucksack): Int =
    priorityRucksack.compartment1.find(priorityRucksack.compartment2.contains).get
}
