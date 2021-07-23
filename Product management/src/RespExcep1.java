import java.util.Scanner;

import Exception12.InvalidCodeException;
import Exception12.somewhereException;

class Repository1 {
	public String getCountryName(String countryCode)throws InvalidCodeException,somewhereException{
		String code=null;
		int cc=Integer.parseInt(countryCode);
		if (cc>=70 && cc<=99) {
			return code="India";}
		else if (cc==908) {
		return code="US";}
        else {
			try {
				if(countryCode.equals("011"))
				{throw new somewhereException ("Dial somewhere outside of USA");}
				else {
					throw new InvalidCodeException ("No country with given code found");}
			}
			catch (InvalidCodeException e)
			{
				throw e;
				}
			catch (somewhereException e1)
			{			throw e1;
		}
		}
	
	}

}

public  class RespExcep1 {
	
	public static void main(String[] args)throws InvalidCodeException,somewhereException {
		Repository1 r=new Repository1();
		Scanner sc = new Scanner(System.in);
		String countryCode=sc.nextLine();
		System.out.println(r.getCountryName("country code b/w 70 - 99")+" "+r.getCountryName(countryCode));
		System.out.println(r.getCountryName("country code of 908"+" "+r.getCountryName(countryCode)));
		System.out.println(r.getCountryName("countryCode"));
	
	}
}
