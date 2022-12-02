import scala.collection.mutable.ListBuffer
import scala.io.Source

val bufferedSource = Source.fromFile("/Users/raccoon/IdeaProjects/AoC-2022-P1a/input/example")
val lines = bufferedSource.getLines

var listOfListOfInts: ListBuffer[ListBuffer[Int]] = ListBuffer[ListBuffer[Int]]()
var temp: ListBuffer[Int] = ListBuffer[Int]()

for (line <- lines) {
  if (line.isEmpty) {
    listOfListOfInts = listOfListOfInts += temp
    temp = ListBuffer[Int]()
  } else {
    temp = temp += line.toInt
  }
}

bufferedSource.close

println(listOfListOfInts)