import scala.util.control.Breaks._

object Solution {
    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
        val numToIndex = scala.collection.mutable.Map[Int, Int]()
        var result: Array[Int] = Array()
        
        breakable {
            for (i <- nums.indices) {
                val complement = target - nums(i)
                if (numToIndex.contains(complement)) {
                    result = Array(numToIndex(complement), i)
                    break
                }
                numToIndex(nums(i)) = i
            }
        }
        
        result
    }
}
