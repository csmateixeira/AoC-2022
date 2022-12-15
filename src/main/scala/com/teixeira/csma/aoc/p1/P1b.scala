package com.teixeira.csma.aoc
package com.teixeira.csma.aoc.p1

object P1b {

  def getTopThreeTotals(listOfLists: List[List[Int]]): Int =
    listOfLists.map(list => list.sum).sorted(Ordering[Int].reverse).slice(0, 3).sum
}
