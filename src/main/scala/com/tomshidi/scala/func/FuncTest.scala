package com.tomshidi.scala.func

/**
 *
 * @author TomShiDi
 * @since 2024/3/21 14:41
 */
object FuncTest {
  // 方法可以重载
  def main(): Unit = {

  }

  def add(x: Int, y: Int): Int = {
    x + y
  }

  def main(args: Array[String]): Unit = {
    val test = () => {
      println("无参，无返回值")
    }
    test()
    // 函数没有重载和重写的概念，这里会报错
    //    val test = (name: String) => {
    //      println(name)
    //    }
    // 函数嵌套定义
    val outer = () => {
      val inner = () => {
        println("函数内定义函数")
      }
    }

    // 方法转成函数
    val add2 = add _
  }
}
