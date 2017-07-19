package com.knoldus.kip.assignment.ds

/**
  * Created by knoldus on 7/19/17.
  */
class ContravariantQueue[-T](x:T){
  override def toString:String = x.toString
}
object ContravariantQueue extends App{
  var contraVariantQueue:ContravariantQueue[Father] = new ContravariantQueue[Father](new Father())
  //val cv:ContravariantQueue[GrandFather] = contraVariantQueue // it won't work
}
