class Employee {
   void display(){

    System.out.println("Name of class is Employee")
   }
}

class Engineer extends Employee {
    // TODO: Override display() method
    // 1. Print "Name of class is Engineer"
    // 2. Call super.display() to print the parent's message
    void display(){

    System.out.println("Name of class is Engineer")
    super.display();
   }
   

}

public class MethodOverriding {
   public void main(String args[]){

        Engineer alwin=new Engineer();
        display();


   }
        // TODO: Create an Engineer object
        // TODO: Call the display() method
    
}
