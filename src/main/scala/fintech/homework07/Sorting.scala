package fintech.homework07
import scala.collection.mutable
import scala.collection.mutable.ListBuffer
/**
  * Реализовать алгоритмы quick-sort и merge-sort
  *  использую *подходящие* *мутабельные* коллекции
  */

object Sorting {

  def mergeSort[T](collection: mutable.ListBuffer[T])(implicit ord: T => Ordered[T]): mutable.ListBuffer[T] = {
    def merge(right:mutable.ListBuffer[T], left:mutable.ListBuffer[T]): mutable.ListBuffer[T] = {
      val res = ListBuffer[T]()
      val size = right.length + left.length
      while (res.length < size) {
        if (left.isEmpty) {
          res ++= right
        }
        if (right.isEmpty) {
          res ++= left
        }
        if (left.nonEmpty && right.nonEmpty) {
          if (left.head < right.head){
          res += left.head
          left.remove(0)
        } else {
          res += right.head
          right.remove(0)
        }
      }}
      res
    }

    if (collection.length > 1) {
      val split = collection.splitAt(collection.length/2)
      val left = mergeSort(split._1)
      val right = mergeSort(split._2)
      val res = merge(left, right)
      res
    }
    else
    {
      collection
    }
  }

  def quickSort[T](collection: mutable.ListBuffer[T])(implicit ord: T => Ordered[T]): mutable.ListBuffer[T] = {
      if (collection.length <= 1) {
        collection
      }
      else {
        val elem = collection(collection.length / 2)
        quickSort(collection.filter((x)=> x < elem)) ++
          collection.filter(elem ==) ++
          quickSort(collection.filter((x)=> x > elem))
      }
    }


  def main(args: Array[String]): Unit = {
    println(mergeSort(mutable.ListBuffer(2,1,6,4,5,3)))
    println(quickSort(mutable.ListBuffer(2,1,6,4,5,3)))
  }
}
