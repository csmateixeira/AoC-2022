package com.teixeira.csma.aoc.p2

object Hands extends Enumeration {
  type Hand = Value

  val Rock: Hands.Value = Value(1)
  val Paper: Hands.Value = Value(2)
  val Scissors: Hands.Value = Value(3)

  def whoWins(hand1: Hand, hand2: Hand): Int = {
    hand1 match {
      case Rock => hand2 match {
        case Rock => 0
        case Paper => 2
        case Scissors => 1
      }
      case Paper => hand2 match {
        case Rock => 1
        case Paper => 0
        case Scissors => 2
      }
      case Scissors => hand2 match {
        case Rock => 2
        case Paper => 1
        case Scissors => 0
      }
    }
  }

  def handThatDefeats(hand: Hand): Hand = {
    hand match {
      case Rock => Paper
      case Paper => Scissors
      case Scissors => Rock
    }
  }

  def handThatLosesTo(hand: Hand): Hand = {
    hand match {
      case Paper => Rock
      case Scissors => Paper
      case Rock => Scissors
    }
  }
}
