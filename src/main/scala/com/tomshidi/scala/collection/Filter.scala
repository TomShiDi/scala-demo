package com.tomshidi.scala.collection

/**
 *
 * @author TomShiDi
 * @since 2024/4/2 9:53
 */
object Filter {

  def main(args: Array[String]): Unit = {
    val arr: Array[Int] = Array(1, 2, 3, 4, 5, 6, 7)
    val func = (x: Int) => x % 2 == 0
    println(filter(arr, func).toList)
    // 直接传递函数定义
    println(filter(arr, (x: Int) => x % 2 == 0).toList)
    // 省略函数入参类型
    println(filter(arr, x => x % 2 == 0).toList)
    // 函数参数在函数体中只使用了一次，可以使用_简化
    println(filter(arr, _ % 2 == 0).toList)
  }

  def filter(arr: Array[Int], func: Int => Boolean) = {
    for (item <- arr if (func(item))) yield {
      item
    }
  }
}
