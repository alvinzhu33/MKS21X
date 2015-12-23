public class BarCode implements Comparable{
    private String _zip;
    private int _checkDigit;

    private static String[] key = new String[]{"||:::",":::||","::|:|","::||:",":|::|",":|:|:",":||::","|:::|","|::|:","|:|::"};

    // constructors
    //precondtion: zip.length() = 5 and zip contains only digits.
    //postcondition: throws a runtime exception zip is not the correct length
    //               or zip contains a non digit
    //               _zip and _checkDigit are initialized.
    public BarCode(String zip){
	if(zip.length()!=5){
	    throw new RuntimeException();
	}
	try{
	    int check = Integer.parseInt(zip);
	}
	catch(NumberFormatException e){
	    throw new RuntimeException();
	}
	_zip=zip;
	_checkDigit=checkSum();
    }

    // postcondition: Creates a copy of a bar code.
    public BarCode(BarCode x){
	_zip= ((BarCode)x)._zip;
	_checkDigit= ((BarCode)x)._checkDigit;
    }


    //post: computes and returns the check sum for _zip
    private int checkSum(){
	int sum=0;
	for(int x=0; x<5;x++){
	    sum+= Integer.parseInt(_zip.substring(x,x+1));
	}
	return sum%10;
    }

    //postcondition: format zip + check digit + barcode 
    //ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
    public String toString(){
	String barcoded="|";
	for(int x=0; x<_zip.length(); x++){
	    barcoded+=key[Integer.parseInt(_zip.substring(x,x+1))];
	}
	barcoded+=key[_checkDigit]+"|";
	return _zip + _checkDigit + " " + barcoded;
    }


    public boolean equals(Object other){
	return this==other ||
	    (other instanceof BarCode &&
	     _zip.equals(((BarCode)other)._zip));
    }
    // postcondition: false if the object is not a BarCode, 
    // false if it is a non-matching barcode
    // true when they match.


    public int compareTo(Object other){
	if(other instanceof BarCode){
	    if(equals(other) && ((BarCode)other)._checkDigit==_checkDigit){
		return 0;
	    }
	    else{
		return Integer.parseInt(_zip) - Integer.parseInt(((BarCode)other)._zip);
	    }
	}
	else{
	    return -1;
	}
    }
    // postcondition: compares the zip + checkdigit

    public static void main(String[]args){
	BarCode b1 = new BarCode("08451");
	BarCode b2 = new BarCode("08451");
	BarCode b3 = new BarCode("12345");
	try{
	    BarCode b4 = new BarCode("abcde");
	}
	catch(RuntimeException e){
	    System.out.println("Enter only numbers to BarCode!");
	}
	try{
	    BarCode b5 = new BarCode("1234e");
	}
	catch(RuntimeException e){
	    System.out.println("Enter only numbers to BarCode");
	}
	BarCode b6 = new BarCode("98765");
	BarCode b7 = new BarCode(b6);

	System.out.println(b1.checkSum());
	System.out.println(b1);
	System.out.println(b2.checkSum());
	System.out.println(b2);
	System.out.println(b3.checkSum());
	System.out.println(b3);
	System.out.println(b6.checkSum());
	System.out.println(b6);
	System.out.println(b7.checkSum());
	System.out.println(b7);
	System.out.println(b1.equals(b2));
	System.out.println(b1.compareTo(b2));
	System.out.println(b1.equals(b3));
	System.out.println(b1.compareTo(b3));
	System.out.println(b1.equals(b6));
	System.out.println(b1.compareTo(b6));
	System.out.println(b6.equals(b7));
	System.out.println(b6.compareTo(b7));
    }
}
