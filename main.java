//Write a program to create a class named shape. In this class we have three
//sub classes circle, triangle and square, each class has two member function
//named draw () and erase (). Create these using Runtime Polymorphism concepts. (10 Marks
class shape{
     void draw(){
    System.out.println("Draw shape");
}
void erase(){
    System.out.println(" erase shape");
}
} 
class circle extends shape{
      void draw(){
    System.out.println("draw circle shape");
}
void erase(){
    System.out.println(" erase cicle shape");
}}
class Triangle extends shape{
     void draw(){
   System.out.println("draw Triangle shape");
}
void erase(){
   System.out.println(" erase Triangle shape");
}}
class Square extends shape{
     void draw(){
   System.out.println("draw Square shape");
}
void erase(){
   System.out.println(" erase square shape");
}}
public class main { 
    public static void main(String args[]) {
        System.out.println(" Excuting runtime polymorphism");
        System.out.println(" Calling by Sub classes");
        // creating circle TRiangle obj and calling the same name
    circle c1=new circle();
    c1.draw();
    c1.erase();
    Triangle t1= new Triangle();
    t1.draw();
    t1.erase();
    Square s1= new Square();
    s1.draw();
    s1.erase();
}
    
}
