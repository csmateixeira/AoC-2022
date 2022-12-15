package com.teixeira.csma.aoc
package com.teixeira.csma.aoc.p2

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class HandsTestSpec extends AnyFlatSpec with should.Matchers {
  "The result" should "be Rock defeats Scissors" in  {
    Hands.whoWins(Hands.Rock, Hands.Scissors) should be(1)
    Hands.whoWins(Hands.Scissors, Hands.Rock) should be(2)
  }

  it should "be Scissors defeats Paper" in {
    Hands.whoWins(Hands.Scissors, Hands.Paper) should be(1)
    Hands.whoWins(Hands.Paper, Hands.Scissors) should be(2)
  }

  it should "be Paper defeats Rock" in {
    Hands.whoWins(Hands.Paper, Hands.Rock) should be(1)
    Hands.whoWins(Hands.Rock, Hands.Paper) should be(2)
  }

  it should "be a draw" in {
    Hands.whoWins(Hands.Rock, Hands.Rock) should be(0)
    Hands.whoWins(Hands.Paper, Hands.Paper) should be(0)
    Hands.whoWins(Hands.Scissors, Hands.Scissors) should be(0)
  }
}
