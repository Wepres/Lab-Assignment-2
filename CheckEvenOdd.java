public class CheckEvenOdd {
    public String check(int n){
        if ( n < 0)
            throw new IllegalArgumentException("Weight must be greater than0!");
        if(n%2==0)
            return "Even";
        else
            return "Odd";
    }
}
