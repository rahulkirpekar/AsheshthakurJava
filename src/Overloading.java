public class Overloading 
{
    public static void main(String[] args) 
    {
        Overloading o = new Overloading();
        System.out.println("Addition : " + o.add(1,2));
        System.out.println("Addition : " + o.add(1,2,3));
        System.out.println("Addition : " + o.add(1.1f,1.0f));
        System.out.println("Addition : " + o.add(1,2,3,4));
    }

    private int add(int a , int b){
        return a+b;
    }
    private int add(int a , int b, int c){
        return a+b+c;
    }
    private int add(int a , int b, int c, int d){
        return a+b+c+d;
    }
    private float add(float a , float b){
        return a+b;
    }
}
