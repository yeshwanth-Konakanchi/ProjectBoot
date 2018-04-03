package practice;

interface Drawable{  
void draw();  
default void msg(){System.out.println("default method");}  
}  
class Rectangle implements Drawable{  
public void draw(){System.out.println("drawing rectangle");}  
public void msg(){System.out.println(" method");}  

}  
class InterfaceTest{  
public static void main(String args[]){  
Rectangle d=new Rectangle();  
d.draw();  
d.msg();  
}}  