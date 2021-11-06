package day53_inharitance.rules;

public class C extends  A{

    @Override
    public  int getNum(){
        return  6;
    }
    // getNum method cannot change access
    @Override
    String getName(){
        return "str";
    }
}
