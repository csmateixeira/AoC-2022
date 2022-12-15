
import scala.io.Source

val bufferedSource = Source.fromFile("/Users/raccoon/IdeaProjects/AoC-2022/input/p3/example")
val lines = bufferedSource.getLines()

//println('a'.toInt - 96)
//println(('A'.toInt - 64) + 26)
//println('z'.toInt - 96)
//println(('Z'.toInt - 64) + 26)

println(List('A', 'b', 'c', 'Z').filter(List('Z', 'b', 'd', 'd', 'f').contains))
