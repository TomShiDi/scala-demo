package com.tomshidi.scala.collection

import scala.collection.mutable.ListBuffer

/**
 *
 * @author TomShiDi
 * @since 2024/3/22 13:39
 */
object ListTest {
  def main(args: Array[String]): Unit = {
    val list1: List[Any] = List(1, 1, 1.0, "hello", 'c')

    val list2: List[Any] = list1 :+ 1
    println(list2)

    val list3: List[Any] = 2 :: list1
    println(list3)

    // list1作为整体添加到list2头部
    val list4: List[Any] = list1 :: list2
    println(list4)

    // list1、list2元素拆成个体，并重新组成一个集合
    val list5: List[Any] = list1 ::: list2
    println(list5)

    // 空集合Nil
    val list6: List[Int] = 1 :: 2 :: 3 :: 4 :: Nil
    println(list6)

    var listBuffer = new ListBuffer[Int]
    listBuffer = ListBuffer(1, 2, 3, 4)
    listBuffer(1) = 2000
    listBuffer.append(5)
    listBuffer.prepend(0)
    println(listBuffer)
  }

}
