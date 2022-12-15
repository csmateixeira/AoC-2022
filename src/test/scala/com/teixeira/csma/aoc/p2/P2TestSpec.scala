package com.teixeira.csma.aoc.p2

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class P2TestSpec extends AnyFlatSpec with should.Matchers {
  "The total scores" should "be correct for the first part" in {
    val lines: List[(String, String)] = List(("A", "Y"), ("B", "X"), ("C", "Z"))

    P2a.calculateTotalScores(lines) should be((15, 15))
  }

  it should "be correct for the second part" in {
    val lines: List[(String, String)] = List(("A", "Y"), ("B", "X"), ("C", "Z"))

    P2b.calculateTotalScores(lines) should be((15, 12))
  }
}
