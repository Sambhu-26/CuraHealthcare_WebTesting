public class outerClass {

    //inner class
    class innerClass{
        void display(){
            System.out.println("Kya re lodu insaaann???");
        }
    }

    public static void main(String[] args) {
        //creating intance of outer class
        outerClass outerclass=new outerClass();

        //creating instance of inner class
        outerClass.innerClass innnerClass=outerclass.new innerClass();
        innnerClass.display();

        outerClass.conditionalStatement(10);
        outerClass.Loopingstatement("banana",7);
    }


    public static void conditionalStatement(int age){

        if(age<=2){
            System.out.println("Age is infant");
        }
        else if (age>2){
            System.out.println("Age is adult");
        }


    }


    public static void Loopingstatement(String fruit, int count) {

        for (int i=0;i<count;i++){
            System.out.println("The Fruit is"+fruit+"for times"+i);
        }

    }


}

