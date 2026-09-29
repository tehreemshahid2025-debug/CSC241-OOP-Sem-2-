public class FindMax{
    int max(int numb1, int numb2){
        /*int result = 0;
        if (numb1>numb2)
            result = numb1;
        else
            result = numb2;*/
        return numb1>numb2?numb1:numb2;
    }
    public double max(double numb1, double numb2){
        double result = 0;
        if (numb1>numb2)
            result = numb1;
        else
            result = numb2;
        return result;
    }
    public String max(String numb1, String numb2){
        String result = "";
        if (numb2.compareTo(numb1) > numb1.compareTo(numb2))
            result = numb1;
        else
            result = numb2;
        return result;
    }
    public byte max(byte numb1,byte numb2){
        byte result = 0;
        if (numb1>numb2)
            result = numb1;
        else
            result = numb2;
        return result;
    }
    
    
}