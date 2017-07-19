package com.knoldus.kip.assignment.ds

/**
  * Created by knoldus on 7/19/17.
  */
class CovariantAndLowerBoundQueue[+T](private val popList:List[T],private val addList:List[T]){

  private def updatestructure = {
    if(popList.isEmpty) new CovariantAndLowerBoundQueue[T](addList.reverse,Nil) else this
  }

  def enqueue[U>:T](element:U): CovariantAndLowerBoundQueue[U] ={
    new CovariantAndLowerBoundQueue[U](popList,element::addList)
  }

  def tail : CovariantAndLowerBoundQueue[T] = {
    val queue = updatestructure
    queue.popList match{
      case h::t => new CovariantAndLowerBoundQueue[T](t,addList)
      case _ => throw new Exception("queue empty")
    }
  }
}

object CovariantAndLowerBoundQueue extends App{
  val covariantAndLowerBoundQueue = new CovariantAndLowerBoundQueue[Father](Nil,Nil)
  val iv :CovariantAndLowerBoundQueue[GrandFather] = new CovariantAndLowerBoundQueue[Father](Nil,Nil) //works
}
