public class Main {

    public static void printName(){

        System.out.println("Hello\nBogdana\n");

    }
    public static void sumNumbers(){

        System.out.println("12.5+23.9="+(12.5+23.9));

    }


    public static void divNumbers(){

        System.out.println("29/6="+((float)29/6));

    }
    public static void pointA(){

        System.out.println("-5+8*6="+(-5+8*6));

    }
    public static void pointB(){

        System.out.println("(55+9)%9="+((55+9)%9));

    }

    public static void pointC(){

        System.out.println("20+(-3)*5/8="+(20+(float)-3*5/8));


    }
    public static void pointD(){

        System.out.println("5+15/3*2-8%3="+(5+(float)15/3*2-8%3));

    }

    public static int addition(int number1, int number2){
        return number1+number2;
    }

    public static int subtraction(int number1, int number2){
        return number1-number2;
    }

    public static int multiplication(int number1, int number2){
        return number1*number2;
    }

    public static float division(int number1, int number2){
        return (float)number1/number2;
    }

    public static void printModel(){
        String result="";

        result+= """
                 +""\"""+
                [| o o |]
                 |  ^  |
                 | '-' |\s
                 +-----+""";
        System.out.println(result);
    }

    public static int remainder(int number1,int number2){
        return number1%number2;
    }

    public static float average(int number1, int number2,int  number3){
        return (float)(number1+number2+number3)/3;
    }

    public static float convertTemp(int number){
        return (float) 5/9 * (number -32) ;
    }

    public static double convertMeters(int number){
        return number*0.0254;
    }

    public static void speed(double distance,int hour, int min, int sec){
        double d1=distance/1000,d2=distance/1609;
        double time=sec+min*60+hour*3600;
        double v1=distance/time;
        double v2=d1/(time/3600);
        double v3=d2/(time/3600);
        System.out.println("Distance="+distance+"; Hour="+hour+"; Minutes="+min+"; Seconds="+sec+";");
        System.out.println("Speed in m/s is: "+v1);
        System.out.println("Speed in km/h is: "+v2);
        System.out.println("Speed in miles/h is: "+v3);
    }

    public static void perAndArea(double r){
        double p=2*Math.PI*r;
        double a=Math.pow(r,2)*Math.PI;
        System.out.println("Radius: "+r);
        System.out.println("Perimeter: "+p);
        System.out.println("Area: "+a);
    }
    public static void main(String[] args) {

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("1.\n");
        //1.
        printName();
        sumNumbers();
        divNumbers();
        pointA();
        pointB();
        pointC();
        pointD();

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("2.\n");
        //2.
        System.out.println("15+98="+addition(15,98));
        System.out.println("3-27="+subtraction(3,27));
        System.out.println("50*48="+multiplication(50,48));
        System.out.println("122/17="+division(122,17));

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("3.\n");
        //3.
        printModel();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("4.\n");
        //4.
        System.out.println("Average of 27,79 and 100 is: "+average(23,79,100));

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("5.\n");
        //5.
        System.out.println("Remainder of 134/22 is: "+remainder(134,22));

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("6.\n");
        //6.
        System.out.println("Temperature of 345 F is:"+convertTemp(345)+" C");

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("7.\n");
        //7.
        System.out.println("Distance of 194 inches is:"+convertMeters(194)+" meters");

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("8.\n");
        //8.
        speed(1482.98,3,12,55);

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("9.\n");
        //9.
        perAndArea(36.921);

    }
}
