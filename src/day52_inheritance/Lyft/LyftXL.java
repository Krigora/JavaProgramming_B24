package day52_inheritance.Lyft;

public class LyftXL extends Lyft{

    @Override
    public double calculateRate(int miles){
         return super.calculateRate(miles) * 1.1;
    }
}
