import scala.collection.mutable.ListBuffer
import scala.io.Source

//val bufferedSource = Source.fromFile("/Users/raccoon/IdeaProjects/AoC-2022/input/p1/example")
//val lines = bufferedSource.getLines

val bufferedSource2 = Source.fromFile("/Users/raccoon/IdeaProjects/AoC-2022/input/p2/example")
val lines2 = bufferedSource2.getLines

val linesToTuple = lines2.toList
  .map(line => line.split(' '))
  .map(line => (line(0), line(1)))

println(linesToTuple)

//var listOfListOfInts: ListBuffer[ListBuffer[Int]] = ListBuffer[ListBuffer[Int]]()
//var temp: ListBuffer[Int] = ListBuffer[Int]()
//
//for (line <- lines) {
//  if (line.isEmpty) {
//    listOfListOfInts = listOfListOfInts += temp
//    temp = ListBuffer[Int]()
//  } else {
//    temp = temp += line.toInt
//  }
//}
//
//bufferedSource.close

bufferedSource2.close

//println(listOfListOfInts)