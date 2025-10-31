package com.bhupesh.flowcontrol;

public class StudentArrayIterate {

      private String name;
      private int age;
      
      public StudentArrayIterate(String name , int age) {
    	  this.name = name;
    	  this.age = age;
      }
      
      public String getName() {
    	  return name;
      }
      
      public void setName(String name) {
    	  this.name = name;
      }
      
      public int getAge() {
    	  return age;
      }
      
      public void setAge(int age) {
    	  this.age = age;
      }
      
    	  public static void main(String[] args) {
    		  StudentArrayIterate[] s = new StudentArrayIterate[5];
    		  s[0] = new StudentArrayIterate("Yuvraj",25);
    		  s[1] = new StudentArrayIterate("Mahesh",28);
    		  s[2] = new StudentArrayIterate("Abhishek",38);
    		  s[3] = new StudentArrayIterate("Bhupesh",20);
    		  s[4] = new StudentArrayIterate("Deepak",40);
    		  
    		  int l = s.length;
    		  for(int i = 0; i<l; i++) {
    		  System.out.println("Name : "+s[i].getName()+" - Age : "+s[i].getAge());
    		  }
    		  
    	  }
      
      
}
