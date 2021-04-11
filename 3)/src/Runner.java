/*
Exercise 3 : (1) Create and test a SixTuple generic
 */
import javax.swing.*;

public class Runner {
    public static SixTuple returnSix() {
        return new SixTuple<String,Character,Integer,Double,Boolean,Boolean>("qwerty",'a',10,1000.1000,false,true);
    }
    public static void main(String[] args) {
        System.out.println(returnSix());
    }
}
