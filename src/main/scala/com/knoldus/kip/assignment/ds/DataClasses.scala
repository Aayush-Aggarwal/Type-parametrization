package com.knoldus.kip.assignment.ds

/**
  * Created by knoldus on 7/19/17.
  */
class GrandFather{
  override def toString: String = "GrandFather"
}
class Father extends GrandFather{
  override def toString: String = "Father"
}
class Child extends Father{
  override def toString: String = "Child"
}
