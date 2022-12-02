package com.teixeira.csma.aoc

import scala.annotation.tailrec
import scala.collection.mutable.ListBuffer
import scala.io.Source

object P1a {
  def readFileLines(f: String): List[List[Int]] = {
    val bufferedSource = Source.fromFile(f)
    val lines = bufferedSource.getLines

    var listOfListOfInts: ListBuffer[List[Int]] = ListBuffer[List[Int]]()
    var temp: ListBuffer[Int] = ListBuffer[Int]()

    for (line <- lines) {
      if (line.isEmpty) {
        listOfListOfInts = listOfListOfInts += temp.toList
        temp = ListBuffer[Int]()
      } else {
        temp = temp += line.toInt
      }
    }

    if (temp.nonEmpty) listOfListOfInts = listOfListOfInts += temp.toList

    bufferedSource.close

    listOfListOfInts.toList
  }

  def getListTotals(listOfLists: List[List[Int]]): List[Int] = {
    listOfLists.map(list => list.sum)
  }

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
