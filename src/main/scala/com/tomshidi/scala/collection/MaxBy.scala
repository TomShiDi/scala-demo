package com.tomshidi.scala.collection

/**
 *
 * @author TomShiDi
 * @since 2024/4/2 10:38
 */
object MaxBy {
  def main(args: Array[String]): Unit = {
    val arr = Array("zhangsan 20 4500", "lisi 33 6800", "wangwu 18 10000")

    println(maxBy(arr, str => str.split(" ")(2).toInt))

    println(maxBy(arr, _.split(" ")(2).toInt))
  }

  def maxBy(array: Array[String], func: String => Int) = {
    var maxItem = array(0)
    var max = func(maxItem)
    for (item <- array) {
      val age = func(item)
      if (age > max) {
        max = age
        maxItem = item
      }
    }
    maxItem
  }
}
