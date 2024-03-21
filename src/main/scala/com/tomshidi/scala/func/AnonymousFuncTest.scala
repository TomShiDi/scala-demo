package com.tomshidi.scala.func

/**
 *
 * @author TomShiDi
 * @since 2024/3/21 15:07
 */
object AnonymousFuncTest {
  def main(args: Array[String]): Unit = {
    val f0: (Int, Int) => Int = (x: Int, y: Int) => x + y
    println(f0(1, 2))

    // 参数类型可以省略
    val f1: (Int, Int) => Int = (x, y) => x + y
    println(f1(1, 2))

    // 只有一个参数时，圆括号可以省略
    val f2: Int => Int = x => x + 10

    // 参数只使用一次，且使用顺序与入参顺序一致，则方法实现中可以使用_替代参数变量
    val f3: (Int, Int) => Int = _ + _
    // 方法实现里只剩一个_时会报错
    // val f4: (Int) => Int = _
    val f4: (Int) => String = "" + _
    // _出现在函数里会报错
//    val f5: (Int) => Unit = println("" + _)
  }
}
