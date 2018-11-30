package com.itheima.scala

object FunctionDemo1 {
val sum=(num1:Int,num2:Int) =>{
  if(num1!=num2){
    num1+num2
  }
}
  //主方法
  def main(args: Array[String]): Unit = {
    println(sum(10,20))
  }
}
