package com.tomshidi.scala.collection

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
 *
 * @author TomShiDi
 * @since 2024/3/22 10:09
 */
object ArrayTest {
  def main(args: Array[String]): Unit = {
    // 构造方法创建不可变数组
    var array1 = new Array[Int](10)
    // 伴生对象apply方法创建不可变数组
    array1 = Array(1, 2, 3, 4)
    // 数组遍历
    // array1.foreach(e => println(e))
    array1.foreach(println)

    println("修改前: " + array1(0))
    array1(0) = 10
    println("修改后: " + array1(0))
    // 不可变数组添加元素会生成新对象
    val array2: Array[Int] = array1 :+ 1
    val array3: Array[Int] = Array(1, 2, 3, 4)
    println(array1 eq array2)
    println(array1 eq array3)
    println(array1 sameElements array3)

    println("********** 分割线 以下是可变数组 **********")
    var arrayBuffer1: ArrayBuffer[String] = new ArrayBuffer[String](10)
    arrayBuffer1 = ArrayBuffer("1", "2", "3", "4")

    arrayBuffer1.append("10")
    arrayBuffer1.update(0, "1000")
    arrayBuffer1(1) = "200"
    println(arrayBuffer1)
    // 可变转不可变，原对象本身没变化
    val arr: Array[String] = arrayBuffer1.toArray
    // 不可变转可变，原对象本身没变化
    val arrBuf: mutable.Buffer[String] = arr.toBuffer

    println("********** 分割线 以下是多维不可变数组 **********")

    // 多维数组定义
    // 定义一个三行四列的二维数组，由三个包含四个元素的一维数组组成
    val multiArr = Array.ofDim[Int](3, 4)
    multiArr(0) = Array(0, 0, 0, 0)
    multiArr(1) = Array(1, 1, 1, 1)
    multiArr(2) = Array(2, 2, 2, 2)
    for (line <- multiArr) {
      line.foreach(e => printf("%d\t", e))
      println()
    }
  }
}
