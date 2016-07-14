package com.flp.ems.util;

public class Validate {
	//email validate
	package com.mkyong.regex;

	import java.util.regex.Matcher;
	import java.util.regex.Pattern;

	public class EmailValidator {

		private Pattern pattern;
		private Matcher matcher;

		private static final String EMAIL_PATTERN = 
			"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

		public EmailValidator() {
			pattern = Pattern.compile(EMAIL_PATTERN);
		}

		/**
		 * Validate hex with regular expression
		 * 
		 * @param hex
		 *            hex for validation
		 * @return true valid hex, false invalid hex
		 */
		public boolean validate(final String hex) {

			matcher = pattern.matcher(hex);
			return matcher.matches();

		}
	}

}
//date validation

package com.java2novice.regex;
 
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class MyDateFormat {
 
    private static Pattern dateFrmtPtrn =
            Pattern.compile("(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)");
     
    public static boolean validateDateFormat(String userName){
         
        Matcher mtch = dateFrmtPtrn.matcher(userName);
        if(mtch.matches()){
            return true;
        }
        return false;
    }
     
    public static void main(String a[]){
        System.out.println("Is '03/04/2012' a valid date format? "
                        +validateDateFormat("03/04/2012"));
        System.out.println("Is '12/23/2012' a valid date format? "
                        +validateDateFormat("12/23/2012"));
        System.out.println("Is '12/12/12' a valid date format? "
                        +validateDateFormat("12/12/12"));
        System.out.println("Is '3/4/2012' a valid date format? "
                        +validateDateFormat("3/4/2012"));
    }
}