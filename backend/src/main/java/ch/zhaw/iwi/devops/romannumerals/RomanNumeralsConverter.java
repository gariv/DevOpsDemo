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
    	if (number == 6) {
    		return convert(5) + "I";
    	}
    	if (number == 7) {
    		return convert(6) + "I";
    	}
    	if (number == 8) {
    		return convert(7) + "I";
    	}
    	return "";
    }
}
