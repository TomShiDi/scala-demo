package scala.string

/**
 *
 * @author TomShiDi
 * @since 2024/3/21 9:45
 */
object StringTest {
  def main(args: Array[String]): Unit = {
    System.out.println()
    // 字符串拼接
    println("hello" + "scala")
    // 重复生成字符串
    println("multi str " * 100)
    // 字符串格式化输出
    printf("name:%s age:%d\n", "tomshidi", 10)

    // 字符串模板，通过$获取变量值
    val name = "tomshidi"
    val age = 8
    val s1 = s"name: $name,age:${age}"
    println(s1)
    val s2 = s"name: ${name + 1},age:${age + 2}"
    println(s2)

    //多行字符串，在Scala中，利用三个双引号包围多行字符串就可以实现。
    // 输入的内容，带有空格、\t之类，导致每一行的开始位置不能整洁对齐。
    //应用scala的stripMargin方法，在scala中stripMargin默认是“|”作为连接符，
    // 在多行换行的行头前面加一个“|”符号即可。
    println(
      """
        |你
        |好
        |阿巴阿巴
        |""".stripMargin
    )

    println(
      s"""
         |${name}
         |${age}
         |""".stripMargin)
  }
}
