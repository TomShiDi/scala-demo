package com.tomshidi.scala.collection

import scala.collection.immutable.HashSet
import scala.collection.mutable


/**
 *
 * @author TomShiDi
 * @since 2024/3/22 14:08
 */
object SetTest {
  def main(args: Array[String]): Unit = {
    val set: Set[Int] = Set(1, 2, 3)
    val set1 = Set(1, 2, 3, 4, 2, 3, 8, 7)
    // set中元素不可重复
    println(set1)
    // 默认使用HashSet
    println(set1.getClass.getTypeName)
    // 元素格式少于等于4，会创建特定类型的Set
    println(set.getClass.getTypeName)

    val hashSet:HashSet[Int] = HashSet(1, 2, 3, 4, 5)

    val bool: Boolean = set.contains(2)

    val mutableSet:mutable.Set[Int] = mutable.Set(1, 2, 3, 4, 4, 5, 2, 1)

    val bool1 = mutableSet.add(10)

    // 使用元素删除
    mutableSet.remove(3)
    println(mutableSet)
  }

}
