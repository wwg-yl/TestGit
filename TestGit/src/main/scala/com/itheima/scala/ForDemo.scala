package com.itheima.scala

object ForDemo {
  def main(args: Array[String]): Unit = {
    //for(i<- 表达式)
 /*   for (i <- 1  to 10){
      println(i)
    }
    for(i <- 1 until 10){
      println(i)
    }
    for(i<-1 to 10;if i%3==0){
      println(i)
    }*/
    //嵌套for循环：
    /*for (i<- 1 to 5;j <- 6 to 10)
      {
        println(i+"\t"+j)
      }*/
    //九九乘法表
   for (i <- 1 to 9;j<- 1 to 9 if i>=j)
    {
      print(i+"*"+j+"="+(i*j)+"\t")
      if (i==j){
        println()
      }
    }
  }
}
