final public class Example3 {

    static String name= "Shubz";


    static int global;
    static int nonGlobal;

    public static int getArea() {
        return area;
    }

    public static void setArea(int area) {
        Example3.area = area;
    }

    static int area=10000;

    Example3() {
        System.out.println("TopSpeed Global: " + area);
    }

    static {
        global = 500;
    }


    static long avg;

    public static void main(String[] args) {

        long avgSpeed;

        Example3 ex3 = new Example3();

        System.out.println("Name : " + name);


        int topSpeed = 200;
        int lowSpeed = 40;
        System.out.println("TopSpeed : " + topSpeed);

        topSpeed = topSpeed - lowSpeed;
        System.out.println("TopSpeed After : " + topSpeed);

        System.out.println("TopSpeed Global: " + global);
        System.out.println("TopSpeed Global: " + nonGlobal);

            System.out.println("TopSpeed Global: " + area);

        avgSpeed= (topSpeed - lowSpeed)/ 2;
        System.out.println("average speed : " + avgSpeed);

        System.out.println("avg : " + avg);




    }
   }

