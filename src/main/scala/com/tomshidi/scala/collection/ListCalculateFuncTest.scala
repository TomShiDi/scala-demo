package com.tomshidi.scala.collection

import scala.collection.mutable.ListBuffer

/**
 *
 * @author TomShiDi
 * @since 2024/3/22 15:09
 */
object ListCalculateFuncTest {
  def main(args: Array[String]): Unit = {
    senior()
  }

  def juniorFunc(): Unit = {
    val list: List[Int] = List(1, 5, -3, 4, 2, -7, 6)
    val listBuffer: ListBuffer[Int] = ListBuffer(1, 5, -3, 4, 2, -7, 6)

    println("求和: " + list.sum)
    println("求乘积: " + list.product)
    println("最大值: " + list.max)
    println("排序: " + list.sorted)
    val ints: List[Int] = list.sorted(Ordering[Int].reverse)
    println("排序，规则变更: " + ints)

    val tuples = List(("hello", 10), ("world", 2), ("scala", 9), ("haha", 4), ("hello", 1))
    println("元组默认字典序: " + tuples.sorted)

    val tuples1: List[(String, Int)] = tuples.sortBy((tuple: (String, Int)) => tuple._2)(Ordering[Int].reverse)
    println("元组按照第二个元素排序，并指定倒序: " + tuples1)

    val tuple2: List[(String, Int)] = tuples.sortWith((t1: (String, Int), t2: (String, Int)) => t1._2 > t2._2)
    println("完全自定义元组排序规则: " + tuple2)

    val tuple3: List[(String, Int)] = tuples.sortWith(_._2 > _._2)
  }

  def senior(): Unit = {
    var list: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val nestedList: List[List[Int]] = List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9))
    val wordList: List[String] = List("hello world", "hello atguigu", "hello scala")

    println("过滤: " + list.filter(e => e % 2 == 0))
    println("转化: " + list.map(e => e * 10))
    println("扁平化: " + nestedList.flatten)
    println("转换+扁平化: " + wordList.flatMap(x => x.split(" ")))
    //    wordList.map(x=>x.split(" ")).flatten
    println("分组: " + list.groupBy(x => x % 3))
    list = List(1, 2, 3, 4, 5)
    println("Reduce: " + list.reduce((x, y) => x - y))
    println("Reduce(反向): " + list.reduceRight((x, y) => x - y))
    println("提供初始值的Reduce: "+ list.foldLeft(100)(_ - _))
  }
}
