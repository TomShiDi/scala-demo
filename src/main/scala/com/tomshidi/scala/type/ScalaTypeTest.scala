package scala.`type`

/**
 *
 * @author TomShiDi
 * @since 2024/3/21 10:09
 */
object ScalaTypeTest {
  def main(args: Array[String]): Unit = {
    // 所有的代码都是代码块
    // 表示运行一段代码  同时将最后一行的结果作为返回值
    // 千万不要写return
    var i1: Int = {
      println("代码块运行")
      1 + 1
    }
    println(i1)
    // 代码块只有一行时，大括号可以省略
    val i2: Int = 10 + 10
    println(i2)
    // 如果代码块没有计算结果，返回类型是Unit
    var unit: Unit ={
      println("无返回值的代码块")
    }
    println(unit)

    val `null` = null
    println(`null`)

    // 代码块没办法完成时，返回值类型为Nothing
//    val value : Nothing ={
//      println("抛出异常")
//      throw new RuntimeException("异常")
//    }

    val int1 = 1
    val long1 = 1L
    val byte1:Byte = 2
    // Scala各整数类型有固定的存储值范围，超过对应存储范围时编译器报错
//    val byte2:Byte = 128
//    val byte3:Byte = int1

    val d1: Double = 3.14
    // 直接浮点数默认类型为Double，Float类型需要在数值后加上'F'或者'f'
    val f1: Float = 3.14F

    // 字符类型与Java中保持一致
    val c1: Char = 'a'
    val c2: Char = 65515
    val c3: Char = '\t'
    val c4: Char = '\n'
    // 表示 \
    val c5: Char = '\\'

    // Boolean类型
    val bool1: Boolean = true

    // 强制类型转换
    val num: Int = 2.7.toInt
    // 130的二进制码为 00000000 00000000 00000000 10000010
    printf("130转换成Byte类型为：%d\n",130.toByte)

    // Scala中的 == 与 eq
    val s1 = "hello"
    val s2 = new String("hello")
    printf("s1 == s2: %s\n", s1 == s2)
    printf("s1.eq(s2): %s\n", s1.eq(s2))

    // 标准加法运算语句
    val i: Int = 1.+(2)
    val j: Int = 1 + (2)
    val k: Int = 1 + 2
    // 函数参数只有一个，或没有参数时，() 可以省略
    println(1.toString())
    println(1.toString)
    println(1 toString)
  }
}
