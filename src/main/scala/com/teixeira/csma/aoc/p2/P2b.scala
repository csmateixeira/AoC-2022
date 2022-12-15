package com.teixeira.csma.aoc.p2

import com.teixeira.csma.aoc.p2.Hands.Hand

object P2b {
  def calculateTotalScores(fileLines: List[(String, String)]): (Int, Int) =
    Common.calculateTotalScores(fileLines, parseStrategyGuideEntries)

  private def parseStrategyGuideEntries(fileLines: List[(String, String)]): List[StrategyGuideEntry] = {
    fileLines.map(line => StrategyGuideEntry(mapStringToHand(line._1), mapToWinOrLoseHand(line._1, line._2)))
  }

  private def mapStringToHand(line: String): Hand = line match {
    case "A" => Hands.Rock
    case "B" => Hands.Paper
    case "C" => Hands.Scissors
  }

  private def mapToWinOrLoseHand(line1: String, line2: String): Hand = {
    val hand: Hand = mapStringToHand(line1)
    line2 match {
      case "X" => Hands.handThatLosesTo(hand)
      case "Y" => hand
      case "Z" => Hands.handThatDefeats(hand)
    }
  }
}
