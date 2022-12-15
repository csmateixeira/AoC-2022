package com.teixeira.csma.aoc.p3

import com.teixeira.csma.aoc.common.FileReader

object Common {
  def getPriority(char: Char): Int = {
    if (char.isLower) char.toInt - 96
    else (char.toInt - 64) + 26
  }
}
