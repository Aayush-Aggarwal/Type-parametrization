package com.knoldus.kip.assignment.ds

/**
  * Created by knoldus on 7/19/17.
  */
class InvariantQueue[T](private val popList:List[T],private val addList:List[T]){

  private def updatestructure = {
    if(popList.isEmpty) new InvariantQueue[T](addList.reverse,Nil) else this
  }

  def enqueue(element:T): InvariantQueue[T] ={
    new InvariantQueue[T](popList,element::addList)
  }

  def tail : InvariantQueue[T] = {
    val queue = updatestructure
    queue.popList match{
      case h::t => new InvariantQueue[T](t,addList)
      case _ => throw new Exception("queue empty")
    }
  }
}

object InvariantQueue extends App{
  val invariantQueue = new InvariantQueue[GrandFather](Nil,Nil)
  //val iv :InvariantQueue[GrandFather] = new InvariantQueue[B](Nil,Nil) // it  won't work
}