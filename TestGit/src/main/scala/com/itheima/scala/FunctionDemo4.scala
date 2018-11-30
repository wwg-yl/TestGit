package com.itheima.scala

object FunctionDemo4 {
  def main(args: Array[String]): Unit = {
defaultParam("张三","女")
  }
  //函数的默认参数
  def defaultParam(name:String,sex:String="男"):Unit={
    println("姓名:"+name+",性别："+sex)
  }

}
