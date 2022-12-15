package com.teixeira.csma.aoc
package com.teixeira.csma.aoc.common

import scala.io.Source

object FileReader {
  def readFileLines(f: String): List[String] = {
    val bufferedSource = Source.fromFile(f)
    val lines: List[String] = bufferedSource.getLines.toList

    bufferedSource.close

    lines
  }
}
