package com.teixeira.csma.aoc
package com.teixeira.csma.aoc.p1

import scala.collection.mutable.ListBuffer
import com.teixeira.csma.aoc.common.FileReader

object Common {
  def readFileLinesWithInts(f: String): List[List[Int]] = {
    val lines: List[String] = FileReader.readFileLines(f)

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

    listOfListOfInts.toList
  }
}

