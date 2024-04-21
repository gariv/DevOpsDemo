package ch.zhaw.iwi.devops.romannumerals;

public class RomanNumeralsConverter {

    public String convert(int number) {
    	if (number == 1) {
    		return "I";
    	}
    	if (number == 2) {
    		return "I" + convert(1);
    	}
    	if (number == 3) {
    		return "I" + convert(2);
    	}
    	if (number == 4) {
    		return "IV";
    	}
    	if (number == 5) {
    		return "V";
    	}
    	return "";
    }
}
