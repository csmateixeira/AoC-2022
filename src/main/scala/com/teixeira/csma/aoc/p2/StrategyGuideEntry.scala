package com.teixeira.csma.aoc
package com.teixeira.csma.aoc.p2

import Hands.Hand
import scalaz._, Scalaz._
case class StrategyGuideEntry(p1: Hand, p2: Hand) {
  def score(): (Int, Int) = {
    (p1.id, p2.id) |+| outcomeScore()
  }

  private def outcomeScore(): (Int, Int) = {
    Hands.whoWins(p1, p2) match {
      case 0 => (3, 3)
      case 1 => (6, 0)
      case 2 => (0, 6)
    }
  }
}
