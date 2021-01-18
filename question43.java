package Remhomework;

public class question43 {
    void div(int x, int y) {

        try {
            System.out.println( x / y);

        } catch (ArithmeticException e) {
            System.out.println("number cannot be divided by zero");
            e.printStackTrace();
        }

    }
    public int [] IndexOrder(int [] array){
        for(int i = 0; i<=array.length; i++)
            try{
            System.out.println(array[i]);}
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("the index is invalid");
        }
        return array;

    }


    }
