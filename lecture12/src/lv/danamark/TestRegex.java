package lv.danamark;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {

	
	public static void main(String[] args) {
		String inputStr = "1-10-2020";
		String regexStrExp = "[^[a-z][0-9]+";
		
		System.out.println(regexStrExp);
		
		System.out.println(inputStr.charAt(0));
		System.out.println(inputStr.charAt(1));
		
		Pattern pattern = Pattern.compile(regexStrExp);
		
		Matcher matcher = pattern.matcher(inputStr);
		
		
	while(matcher.find()){
			System.out.println("find() found substring "+matcher.group());
		
	}
		String replaceSymbols = "lv371";
		String outputStr = matcher.replaceFirst(replaceSymbols);
		System.out.println(outputStr);

	}

}
