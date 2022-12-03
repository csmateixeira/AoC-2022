package com.teixeira.csma.aoc

object P1b {

  def getTopThreeTotals(listOfLists: List[List[Int]]): Int =
    listOfLists.map(list => list.sum).sorted(Ordering[Int].reverse).slice(0, 3).sum
}
