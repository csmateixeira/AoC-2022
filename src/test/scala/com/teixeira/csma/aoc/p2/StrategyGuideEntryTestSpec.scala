package com.teixeira.csma.aoc.p2

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class StrategyGuideEntryTestSpec extends AnyFlatSpec with should.Matchers {
  "The score" should "be correct when P1 wins" in  {
    StrategyGuideEntry(Hands.Rock, Hands.Scissors).score() should be (7, 3)
    StrategyGuideEntry(Hands.Scissors, Hands.Paper).score() should be (9, 2)
    StrategyGuideEntry(Hands.Paper, Hands.Rock).score() should be (8, 1)
  }

  it should "be correct when P2 wins" in {
    StrategyGuideEntry(Hands.Scissors, Hands.Rock).score() should be(3, 7)
    StrategyGuideEntry(Hands.Paper, Hands.Scissors).score() should be(2, 9)
    StrategyGuideEntry(Hands.Rock, Hands.Paper).score() should be(1, 8)
  }

  it should "be correct when there is a draw" in {
    StrategyGuideEntry(Hands.Rock, Hands.Rock).score() should be(4, 4)
    StrategyGuideEntry(Hands.Scissors, Hands.Scissors).score() should be(6, 6)
    StrategyGuideEntry(Hands.Paper, Hands.Paper).score() should be(5, 5)
  }
}
