package com.knoldus.kip.assignment.ds

/**
  * Created by knoldus on 7/19/17.
  */
class UpperBoundQueue[T <: Father ](x:T) {
  override def toString: String = x.toString
}

object UpperBoundQueue extends App{
  val upperBoundQueue = new UpperBoundQueue[Father](new Father())
  // val ubq : UpperBoundQueue[GrandFather] = upperBoundQueue       //it won't work
}
