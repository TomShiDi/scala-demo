package com.tomshidi.scala.collection

import scala.collection.mutable

/**
 *
 * @author TomShiDi
 * @since 2024/3/22 14:30
 */
object MapTest {
  def main(args: Array[String]): Unit = {
    val map: Map[String, Int] = Map("name" -> 1, "age" -> 2)
    val map1 = Map(("hello", 1), ("world", 2))
    for (item <- map) {
      println(item)
    }
    val keys: Iterable[String] = map.keys
    val values: Iterable[Int] = map.values

    println(keys)
    println(values)

    val map2 = map + ("address" -> 3)
    println(map2)

    val mutableMap: mutable.Map[String, Int] = mutable.Map("name" -> 1, "age" -> 2)
    mutableMap.put("sex", 3)
    mutableMap("sex") = 4
    mutableMap.remove("age")
    println(mutableMap)
  }

}
