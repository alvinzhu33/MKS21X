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
	_zip=zip;
	_checkDigit=checkSum();
    }

    // postcondition: Creates a copy of a bar code.
    public BarCode(BarCode x){
	_zip= ((BarCode) x)._zip;
	_checkDigit= ((BarCode)x)._checkDigit;
    }


    //post: computes and returns the check sum for _zip
    private int checkSum(){
	int sum=0;
	for(int x=1; x<(_zip.length());x++){
	    sum+= Integer.parseInt(_zip.substring(x-1,x));
	}
	return sum%10;
    }

    //postcondition: format zip + check digit + barcode 
    //ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
    public String toString(){
	String barcoded="|";
	for(int x=1; x<_zip.length(); x++){
	    barcoded+=key[Integer.parseInt(_zip.substring(x-1,x))];
	}
	barcoded+=key[_checkDigit]+"|";
	return barcoded;
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
	return 1;
    }
    // postcondition: compares the zip + checkdigit
}
