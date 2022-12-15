package com.teixeira.csma.aoc.p1

import scala.annotation.tailrec

object P1a {
  def getListTotals(listOfLists: List[List[Int]]): List[Int] =
    listOfLists.map(list => list.sum)

  def maxFromList(list: List[Int]): Int = {

    @tailrec
    def maxFromListAcc(list: List[Int], max: Int): Int = {
      list match {
        case Nil => max
        case x :: xs => if (x > max) maxFromListAcc(xs, x) else maxFromListAcc(xs, max)
      }
    }

    maxFromListAcc(list, 0)
  }
}
