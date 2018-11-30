package com.itheima.scala

object FunctionDmo3 {
  def main(args: Array[String]): Unit = {
    printStrings("hadoop","mapreduce","scala","python")
  }
  def printStrings(strs: String*): Unit ={
    for (str <- strs){
      println(str)
    }
  }
}
