package PigLatinTranslator;

import java.util.Arrays;

public class PigLatinMethods {

	public static String vowelCheck(String s) {
		
		s = s.toLowerCase();
		
		switch (s.charAt(0)) {
		
		case 'a':
			//System.out.println("A");
			s = isVowel(s);
			return s;
			
			
		case 'e':
			//System.out.println("E");
			s = isVowel(s);
			return s;
			
			
		case 'i':
			//System.out.println("I");
			s = isVowel(s);
			return s;
			
			
		case 'o':
			//System.out.println("O");
			s = isVowel(s);
			return s;
			
			
		case 'u':
			//System.out.println("U");
			s = isVowel(s);
			return s;
			
			
		case 'y':
			//System.out.println("Y");
			s = isVowel(s);
			return s;
			
			
		default:
			//System.out.println("Not a vowel");
			s = isCons(s);
			return s;
			
		}
			
	}
	
	public static String isVowel(String v) {
		
		v = v + "way";
		return v;
	}
	 
	public static String isCons(String c) {
		
		int a = c.indexOf('a');
		int e = c.indexOf('e');
		int i = c.indexOf('i');
		int o = c.indexOf('o');
		int u = c.indexOf('u');
		int y = c.indexOf('y');
			
		int[] vowels = {a, e, i , o , u, y};
		Arrays.sort(vowels);
				
		int x = 0;
		
		if (vowels[0] > 0) {
			x = vowels[1];
		} else if (vowels[1] > 0) {
			x = vowels[1];
		} else if (vowels[2] > 0) {
			x = vowels[2];
		} else if (vowels[3] > 0) {
			x = vowels[3];
		} else if (vowels[4] > 0) {
			x = vowels[4];
		}else if (vowels[5] > 0) {
			x = vowels[5];
		}
		
		
		String firstLetter = c.substring(0, x);
		
		firstLetter += "ay";
		
		String restOfWord = c.substring(x);
		
		String newWord = restOfWord + firstLetter;
				
		return newWord;
	}	

	public static String sentenceBreaker(String userInput) {
		
		char a = ' ';
		
		String[] userInputArray = userInput.split(" ");
		
		String finishedSentence = "";
		
		for (int i = 0 ; i < userInputArray.length ; ++i) {
			
			a = userInputArray[i].charAt(0);
			
			if (Character.isUpperCase(a)) {
				finishedSentence += vowelCheckUC(userInputArray[i] + " ");
			} else {
			
				finishedSentence += vowelCheck(userInputArray[i]) + " ";
			}
		}
		
		return finishedSentence.toString();
	}

	public static String vowelCheckUC(String s) {
	
		s = s.toLowerCase();
		String sFirstLetterUC;
		String sRestOfWord;
		
		switch (s.charAt(0)) {
		
		case 'a':
			//System.out.println("A");
			s = isVowel(s);
			sFirstLetterUC = s.substring(0, 1).toUpperCase();
			sRestOfWord = s.substring(1);
			sRestOfWord = sRestOfWord.replace(" ", "");
			return sFirstLetterUC + sRestOfWord + " ";
			
			
		case 'e':
			//System.out.println("E");
			s = isVowel(s);
			sFirstLetterUC = s.substring(0, 1).toUpperCase();
			sRestOfWord = s.substring(1);
			sRestOfWord = sRestOfWord.replace(" ", "");
			return sFirstLetterUC + sRestOfWord + " ";
			
			
		case 'i':
			//System.out.println("I");
			s = isVowel(s);
			sFirstLetterUC = s.substring(0, 1).toUpperCase();
			sRestOfWord = s.substring(1);
			sRestOfWord = sRestOfWord.replace(" ", "");
			return sFirstLetterUC + sRestOfWord + " ";
			
			
		case 'o':
			//System.out.println("O");
			s = isVowel(s);
			sFirstLetterUC = s.substring(0, 1).toUpperCase();
			sRestOfWord = s.substring(1);
			sRestOfWord = sRestOfWord.replace(" ", "");
			return sFirstLetterUC + sRestOfWord + " ";
			
			
		case 'u':
			//System.out.println("U");
			s = isVowel(s);
			sFirstLetterUC = s.substring(0, 1).toUpperCase();
			sRestOfWord = s.substring(1);
			sRestOfWord = sRestOfWord.replace(" ", "");
			return sFirstLetterUC + sRestOfWord + " ";
			
			
		case 'y':
			//System.out.println("Y");
			s = isVowel(s);
			sFirstLetterUC = s.substring(0, 1).toUpperCase();
			sRestOfWord = s.substring(1);
			sRestOfWord = sRestOfWord.replace(" ", "");
			return sFirstLetterUC + sRestOfWord + " ";
			
			
		default:
			//System.out.println("Not a vowel");
			s = isCons(s);
			sFirstLetterUC = s.substring(0, 1).toUpperCase();
			sRestOfWord = s.substring(1);
			sRestOfWord = sRestOfWord.replace(" ", "");
			return sFirstLetterUC + sRestOfWord + " ";
		
	}

	}

}
	


