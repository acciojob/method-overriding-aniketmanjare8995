package com.driver;
class A{
    public String meth(){
      return "Invoking method from classA";
    }
}
class B extends A{


  public String meth(){
        return "Method is overridden in Extended classB";
    }
}
public class Main {
    public static void main(String[] args){
        B obj=new B();
        System.out.println(obj.meth());     //Invoking method from class A when we dont override
                                    //method is overridden in Extended class B when we override the method

    }

  
}