package com.tomshidi.scala.collection

/**
 *
 * @author TomShiDi
 * @since 2024/4/2 10:28
 */
object Reduce {
  def main(args: Array[String]) = {
    val arr = Array(1, 2, 3, 4, 5)
    println(reduce(arr, (a, b) => a * b))
    // 参数使用顺序与定义顺序一致，没有嵌套，使用_替代
    println(reduce(arr, _ * _))
  }

  def reduce(arr: Array[Int], func: (Int, Int) => Int) = {
    var temp = arr(0)
    for (i <- 1 until arr.length) {
      temp = func(temp, arr(i))
    }
    temp
  }
}
