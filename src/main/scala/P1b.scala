package com.teixeira.csma.aoc

object P1b {

  def getTopThreeTotals(listOfLists: List[List[Int]]): Int = {
    val listOfSums = listOfLists.map(list => list.sum).sorted(Ordering[Int].reverse)
    val sliced = listOfSums.slice(0, 3)

    sliced.sum
  }
}
