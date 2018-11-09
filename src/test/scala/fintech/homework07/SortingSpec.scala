package fintech.homework07
import org.scalatest.{FlatSpec, Matchers}

import scala.collection.mutable

class SortingSpec extends FlatSpec with Matchers {
  it should "merge sort orrectly 1" in {
    val lb = mutable.ListBuffer(2,1,6,4,5,3)
    Sorting.mergeSort(lb)
    lb shouldEqual mutable.ListBuffer(1,2,3,4,5,6)
  }
  it should "merge sort orrectly 2" in {
    val lb = mutable.ListBuffer('c','a','b')
    Sorting.mergeSort(lb)
    lb shouldEqual mutable.ListBuffer('a','b','c')
  }
  it should "quick sort orrectly 1" in {
    val lb = mutable.IndexedSeq(2,1,6,4,5,3)
    Sorting.quickSort2(lb,0,5)
    lb shouldEqual mutable.IndexedSeq(1,2,3,4,5,6)
  }
  it should "quick sort orrectly 2" in {
    val lb = mutable.IndexedSeq('c','a','b')
    Sorting.quickSort2(lb,0,2)
    lb shouldEqual mutable.IndexedSeq('a','b','c')
  }
}
