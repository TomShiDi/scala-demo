package com.tomshidi.scala.collection

import java.util

/**
 *
 * @author TomShiDi
 * @since 2024/4/2 10:09
 */
object GroupBy {

  def main(args: Array[String]): Unit = {
    val arr = Array("zhangsan man beijing", "lisi woman shanghai", "zhaoliu man beijing", "hanmeimei woman shenzhhen")

    println(groupBy(arr, (str: String) => str.split(" ")(1)))
  }

  def groupBy(arr: Array[String], func: String => String) = {
    val resultMap = new util.HashMap[String, util.List[String]]()
    for (item <- arr) {
      val key = func(item)
      val list = resultMap.getOrDefault(key, new util.ArrayList[String]())
      list.add(item)
      resultMap.put(key, list)
      //      if (resultMap.containsKey(key)) {
      //        val list = resultMap.get(key)
      //        list.add(item)
      //      } else {
      //        val list = new util.ArrayList[String]()
      //        list.add(item)
      //        resultMap.put(key, list)
      //      }
    }
    resultMap
  }
}
