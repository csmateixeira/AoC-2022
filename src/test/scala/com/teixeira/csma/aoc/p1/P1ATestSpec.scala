package com.teixeira.csma.aoc.p1

import org.scalatest.flatspec._
import org.scalatest.matchers._

class P1ATestSpec extends AnyFlatSpec with should.Matchers {
  "The list max" should "be correct for a normally filled list" in {
    val list = List(100, 2000, 50, 0, 9000, 200)
    P1a.maxFromList(list) should be(9000)
  }

  it should "be 0 for an empty list" in {
    val list = List()
    P1a.maxFromList(list) should be(0)
  }

  it should "be correct for a single value list" in {
    val list = List(10000)
    P1a.maxFromList(list) should be(10000)
  }

  "The list totals" should "be correct for a normally filled list of lists" in {
    val list = List(List(100, 2000, 50), List(100))
    P1a.getListTotals(list) should be(List(2150, 100))
  }
}
