package com.teixeira.csma.aoc

import scala.collection.mutable.ListBuffer
import scala.io.Source

object Common {
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

}
