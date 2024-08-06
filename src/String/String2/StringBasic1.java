package String.String2;

public interface StringBasic1 {


    public static void main(String[] args) {
        //Assignment and creation of string using Literal
        String str = "Shubham";
        str= str + " Gawade";

        //Assignment and creation of string using new keyword
        String str1= new String("Shubham").intern();

        System.out.println(str == str1);

        System.out.println(str);
        System.out.println(str == str1);

        String num = "0123456789";
        String Sym= "!@#$%^&*()";
        String ch = "QWERTYUIOPASDFGHJKLZXCVBNM";



    }
}
