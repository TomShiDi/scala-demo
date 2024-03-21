package com.tomshidi.scala.func

/**
 *
 * @author TomShiDi
 * @since 2024/3/21 14:51
 */
object HighFuncTest {
  def main(args: Array[String]): Unit = {
    // 高阶方法
    def calculator(a: Int, b: Int, operator: (Int, Int) => Int): Int = {
      operator(a, b)
    }

    // 相加方法
    def plus(x: Int, y: Int): Int = {
      x + y
    }

    // 相减方法
    def sub(x: Int, y: Int): Int = {
      x - y
    }

    // 乘积方法
    def multiply(x: Int, y: Int): Int = {
      x * y
    }

    println(calculator(1, 2, plus))
    println(calculator(1, 2, multiply))
  }
}
