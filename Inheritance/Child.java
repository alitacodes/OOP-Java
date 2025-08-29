// THIS CODE GIVES ERROR BECAUSE JAVA DOESN'T SUPPORT MULTIPLE INHERITANCE. WHEN THE SUBCLASS CHILD IS TRYING TO CALL FUN() FROM PARENT1 AND PARENT2, THE COMPILER IS CONFUSED FROM WHICH PARENT CLASS SHOULD IT CALL THE FUN() METHOD, THAT CREATES AN AMBIGUITY. 

// TO AVOID THIS COMPLICATIONS, JAVA DOESN'T ALLOW MULTIPLE INHERITANCE

// **** diamond problem ****
class GrandParent{
    void fun(){
        System.out.println ("Grandparent");
    }
}

class Parent1 extends GrandParent{
    void fun(){
        System.out.println ("Parent - 1");
    }
}

class Parent2 extends GrandParent{
    void fun(){
        System.out.println ("Parent - 2");
    }
}

class Child extends Parent1, Parent2 {
    public static void main(String args[]){
        Child c = new Child();
        c.fun();
    }
}