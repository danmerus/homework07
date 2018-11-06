package fintech.homework07
import org.scalatest.{FlatSpec, Matchers}

import scala.collection.mutable

class SortingSpec extends FlatSpec with Matchers {
  it should "merge sort orrectly 1" in {
    Sorting.mergeSort(mutable.ListBuffer(2,1,6,4,5,3)) shouldEqual mutable.ListBuffer(1,2,3,4,5,6)
  }
  it should "merge sort orrectly 2" in {
    Sorting.mergeSort(mutable.ListBuffer('c','a','b')) shouldEqual mutable.ListBuffer('a','b','c')
  }
  it should "quick sort orrectly 1" in {
    Sorting.quickSort(mutable.ListBuffer(2,1,6,4,5,3)) shouldEqual mutable.ListBuffer(1,2,3,4,5,6)
  }
  it should "quick sort orrectly 2" in {
    Sorting.quickSort(mutable.ListBuffer('c','a','b')) shouldEqual mutable.ListBuffer('a','b','c')
  }
}
