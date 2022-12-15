package com.teixeira.csma.aoc
package com.teixeira.csma.aoc.p2

import com.teixeira.csma.aoc.common.FileReader
import com.teixeira.csma.aoc.p2.Hands.Hand

object Common {
  def readFileLinesWithTuples(f: String): List[(String, String)] = {
    val lines: List[String] = FileReader.readFileLines(f)

    lines
      .map(line => line.split(' '))
      .map(line => (line(0), line(1)))
  }

  def calculateTotalScores(fileLines: List[(String, String)], parser: List[(String, String)] => List[StrategyGuideEntry]): (Int, Int) =
    parser(fileLines)
      .map(entry => entry.score())
      .foldLeft(0, 0) { (sum, scores) => (sum._1 + scores._1, sum._2 + scores._2) }
}

