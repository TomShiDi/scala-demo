package com.tomshidi.scala.flow

import scala.io.StdIn
import scala.util.control.Breaks

/**
 *
 * @author TomShiDi
 * @since 2024/3/21 11:00
 */
object FlowControlTest {
  def main(args: Array[String]): Unit = {
    forFlow()
  }

  private def ifFlow(): Unit = {
    println("输入年龄：")
    val age = StdIn.readInt()
    val result: String = if (age < 18) {
      "未成年"
    } else if (age >= 18 && age < 60) {
      "成年"
    } else {
      "老年"
    }
    println("结果：" + result)
  }

  private def forFlow(): Unit = {
    // 包含5
    for (i <- 0 to 5) {
      println(i)
    }
    println("*" * 10)
    // 不包含5
    for (i <- 0 until 5) {
      println(i)
    }

    println("*" * 10)

    // for循环的本质
    // to是整数的方法  返回结果是一个集合
    // 使用变量i 循环遍历一遍 后面集合的内容
    val inclusive: Range.Inclusive = 0.to(5)
    println(inclusive)

    println("*" * 10)

    for (i <- 0.to(10)) {
      if (i > 5) {
        println(i)
      }
    }
    println("*" * 10)
    // 循环守卫
    for (i <- 0 to 10 if i > 5) {
      println(i)
    }
    println("*" * 10)
    // 循环返回值
    val ints: IndexedSeq[Int] = for (i <- 0 to 3) yield {
      10
    }
    println(ints)
    println("*" * 10)
    // 循环跳出
    Breaks.breakable {
      for (i <- 0 to 10) {
        println(i)
        if (i > 5) {
          Breaks.break()
        }
      }
    }
  }
}
