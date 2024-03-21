package com.tomshidi.scala

import scala.beans.BeanProperty

/**
 * object中定义的虽有属性、方法、函数，除开private修饰的，都可以通过对象名直接引用
 * 可以理解为java中的static修饰
 *
 * @author TomShiDi
 * @since 2024/3/21 15:49
 */
object ClassTest {

  private val address: String = "阿鲁巴"

  def getName(): String = {
    // 创建伴生类对象，并访问私有属性
    val classTest = new ClassTest()
    classTest.name
  }

  def main(args: Array[String]): Unit = {
    val c1 = new ScalaClass1()
    println("name: " + c1.getName)

    val c2 = new ScalaClass2("tomshidi", 1, "M")
    println("构造器定义成员变量age：" + c2.age)
  }
}

class ScalaClass1(n: String) {

  println("调用主构造器")

  @BeanProperty
  val name: String = n

  @BeanProperty
  var age: Int = _

  // 辅助构造器第一行必须直接或间接调用主构造器
  def this() {
    this("tomshidi")
    println("调用辅助构造器1")
  }

  def this(n: String, a: Int) {
    // 间接调用主构造器
    this()
    this.age = a
    println("调用辅助构造器2")
  }
}

// 主构造器参数 分为3类:
// 没有修饰符 : 作为构造方法中的传入参数使用
// val 修饰 : 会自动生产同名的属性 并且定义为val
// var 修饰 : 会自动生产同名的属性 并且定义为var
class ScalaClass2(name1: String, val age: Int, var sex: String) {
  val name: String = name1
}

class ClassTest() {
  // 使用private修饰，只能在类或者伴生对象中使用
  private val name: String = "tomshidi"

}