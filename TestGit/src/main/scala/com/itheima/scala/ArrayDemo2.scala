package com.itheima.scala

object ArrayDemo2 {
  def main(args: Array[String]): Unit = {
    //数组的定义
    var array = Array(10, 5, 4, 8, 9, 3)
    //调用函数
    var max = getMax(array)
    println(max)
  }

  def getMax(ints: Array[Int]): Int = {
    var max = ints(0)
    for (i <- 1 until ints.length) {
      if (ints(i) > max) {
        max = ints(i)
      }
    }
    return max
  }
}

