public class Main {

    public static void main(String[] args) {

        Calculator calculator=new Calculator();
        LogicalOp logicalOp=new LogicalOp();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("1.\n");
        //1.
        System.out.println("11+98="+calculator.addition(15,98));
        System.out.println("3-27="+calculator.subtraction(3,27));
        System.out.println("50*48="+calculator.multiplication(50,48));
        System.out.println("122/17="+calculator.division(122,17));

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("3.\n");
        //3.

        int max=logicalOp.checkBiggerNumber(111,431);
        System.out.println("The bigger number between 111 and 431 is: "+max);

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("4.\n");
        //4.

        System.out.println("Result for string \"Hello\": "+logicalOp.getStatus("Hello"));
        System.out.println("Result for string \"Evozon\": "+logicalOp.getStatus("Evozon"));


        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("5.\n");
        //5.
        System.out.println("Result for string \"Hello\" and number 1: "+logicalOp.getStatusAndNumber("Hello",1));
        System.out.println("Result for string \"Evozon\" and number 5: "+logicalOp.getStatusAndNumber("Evozon",5));
        System.out.println("Result for string \"Hi\" and number 6: "+logicalOp.getStatusAndNumber("Hi",6));
        System.out.println("Result for string \"Evozon\" and number 3: "+logicalOp.getStatusAndNumber("Evozon",3));

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("6.\n");
        //6.
        System.out.println("Result for number 6: "+logicalOp.getSnow(6));
        System.out.println("Result for number 8: "+logicalOp.getSnow(8));
        System.out.println("Result for number 10: "+logicalOp.getSnow(10));

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("7.\n");
        //7.

        System.out.println("Result for number 5: "+logicalOp.greaterNumber(5));
        System.out.println("Result for number 4: "+logicalOp.greaterNumber(4));
        System.out.println("Result for number 2: "+logicalOp.greaterNumber(2));
        System.out.println("Result for number 3: "+logicalOp.greaterNumber(3));


        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("8.\n");
        //8.
        System.out.println("Result for number 0: "+logicalOp.checkNumber(0));
        System.out.println("Result for number 5: "+logicalOp.checkNumber(5));
        System.out.println("Result for number 7: "+logicalOp.checkNumber(7));
        System.out.println("Result for number 10: "+logicalOp.checkNumber(10));

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("9.\n");
        //9.
        System.out.println("Result for number 2: "+logicalOp.isNumberEven(2));
        System.out.println("Result for number 3: "+logicalOp.isNumberEven(3));
        System.out.println("Result for number -1: "+logicalOp.isNumberEven(-1));

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("10.\n");
        //10.

        System.out.println("Result for a person who is 20 years old: "+logicalOp.isEligibleToVote(20));
        System.out.println("Result for a person who is 5 years old: "+logicalOp.isEligibleToVote(5));


        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("10.\n");
        //11.

        System.out.println("The greatest numbers between 15,200,31: "+logicalOp.greatestNumber3(15,200,31));
        System.out.println("The greatest numbers between 900,567,12: "+logicalOp.greatestNumber3(900,567,12));
        System.out.println("The greatest numbers between 40,78,110: "+logicalOp.greatestNumber3(40,78,110));
        System.out.println("The greatest numbers between 100,100,10: "+logicalOp.greatestNumber3(100,100,10));

    }
}
