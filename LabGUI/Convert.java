public class Convert{
    public static double CtoF(double t){
	return t*9.0/5.0+32.0;
    }
    public static double FtoC(double t){
	return (t-32.0)*5.0/9.0;
    }

    /*TEST
    public static void main(String[]args){
	System.out.println(CtoF(-40.0));
	System.out.println(CtoF(100.0));
	System.out.println(CtoF(100));
	System.out.println(FtoC(212.0));
	System.out.println(FtoC(-40));
	
	System.out.println(FtoC(0));
	System.out.println(FtoC(60));
	System.out.println(CtoF(70));
	System.out.println(FtoC(119));
	}*/
}
