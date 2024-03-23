package com.tomshidi.scala.collection

/**
 *
 * @author TomShiDi
 * @since 2024/3/22 14:49
 */
object TupleTest {
  def main(args: Array[String]): Unit = {
    val tuple1: (Int, String, Boolean) = (40, "foo", true)
    // 通过元素顺序访问
    println(tuple1._1)
    println(tuple1._2)
    println(tuple1._3)

    // 通过索引下标访问
    println(tuple1.productElement(0))

    for (item <- tuple1.productIterator) {
      println(item)
    }

    // Map中的键值对就是元组，只不过元组内元素个数为2，称之为对偶
    val map = Map("name" -> "tomshidi", "age" -> 1)
    map.foreach(tuple=> {
      println(tuple._1 + ":" + tuple._2)
    })
  }

}
