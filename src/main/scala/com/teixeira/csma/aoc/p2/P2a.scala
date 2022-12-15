package com.teixeira.csma.aoc.p2

import com.teixeira.csma.aoc.p2.Hands.Hand

object P2a {
  def calculateTotalScores(fileLines: List[(String, String)]): (Int, Int) =
    Common.calculateTotalScores(fileLines, parseStrategyGuideEntries)

  private def parseStrategyGuideEntries(fileLines: List[(String, String)]): List[StrategyGuideEntry] =
    fileLines.map(line => StrategyGuideEntry(mapStringToHand(line._1), mapStringToHand(line._2)))

  private def mapStringToHand(line: String): Hand = line match {
    case "A" | "X" => Hands.Rock
    case "B" | "Y" => Hands.Paper
    case "C" | "Z" => Hands.Scissors
  }
}
