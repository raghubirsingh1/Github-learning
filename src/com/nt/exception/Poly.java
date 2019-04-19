package com.nt.exception;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Parent {
	 public void m1(){
		 System.out.println("Parent object");
	 }
}
 class Child extends Parent{
	 public void m1(){
		 System.out.println("child object");
	 }
 }
 public class Poly{
	 public static void main(String[] args) {
		List l=new ArrayList();
		Map m=new HashMap();
	}
 }
