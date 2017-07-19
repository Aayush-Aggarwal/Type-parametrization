package com.knoldus.kip.assignment.ds

/**
  * Created by knoldus on 7/19/17.
  */
class ContraCovariantQueue[-S, +T] {

  def write(x: S): T = {
    x match {
      case res: T => res
    }
  }
}

object ContraCovariantQueue extends App{
  val contraCovariantQueue = new ContraCovariantQueue[Father,Father]
  val ccq:ContraCovariantQueue[Child,GrandFather] = contraCovariantQueue  // it will works
}