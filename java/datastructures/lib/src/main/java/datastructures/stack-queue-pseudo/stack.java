package datastructures.stack;

import datastructures.linkedlist.Node;

import java.util.NoSuchElementException;

public class Stack <T>{

  Node<T> top = null;

  int count;


  public void push (T value){
    Node<T> newNode = new Node<>(value);
    if(top != null) {
      newNode.next = top;
    }
    top = newNode;
  }

  public T pop(){
    Node<T> temp = top;
    top = top.next;
    temp.next = null;

    return temp.value;
  }

  public T peek(){
    if(top == null){
      throw new NoSuchElementException("Stack is empty");
    }

    return top.value;
  }
