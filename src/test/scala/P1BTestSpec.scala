package com.teixeira.csma.aoc

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class P1BTestSpec extends AnyFlatSpec with should.Matchers {
  "The top 3 total" should "be correct for a normally filled list" in {
    // 9200 / 11150 / 30 / 8000 / 9050
    val listofLists = List(List(200, 9000), List(100, 50, 11000), List(10, 20), List(8000), List(7000, 2000, 50))
    P1b.getTopThreeTotals(listofLists) should be(29400)
  }
}
