import java.util.ArrayList;

public class countSpecialWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "LINE MELODY provides ringtones, ringback tones for LINE Call colorize your LINE "
				+ "Call experience and express your feelings through LINE MELODY.";
		String lineMelodyText = "LINE MELODY";
		String lineText = "LINE";
		String callText = "Call";
		String expressSentence = "express your feelings";
		String countWord = "COUNT";
		ArrayList<String> special = new ArrayList<String>();
		special.add(",");
		special.add(".");
		int countlineMelodyText = 0;
		int countlineAndCallText = 0;
		
		//LINE MELODY
		String temp = sentence.replace(lineMelodyText, "COUNT");
		String splitTemp[] = temp.split(" ");
		
		for(int i = 0; i < splitTemp.length; i++) {
			if(splitTemp[i].contains(countWord)) {
				countlineMelodyText++;
			}
		}
		System.out.println("Count line melody word:" + countlineMelodyText);
		
		//LINE AND CALL
		temp = sentence.replace(lineText, countWord);
		temp = temp.replace(callText, countWord);
		
		splitTemp = temp.split(" ");
		
		for(int i = 0; i < splitTemp.length; i++) {
			if(splitTemp[i].contains("COUNT")) {
				countlineAndCallText++;
			}
		}
		System.out.println("Count line and call word:" + countlineAndCallText);
		
		//FIND express your feelings
		if(sentence.contains(expressSentence)) {
			System.out.println(expressSentence + " !!");
		}
		
		//REVERSE
		String[] splitTempWords = sentence.split(" ");
		String reversedString = "";
		for (int i = 0; i < splitTempWords.length; i++) {
	           String word = splitTempWords[i]; 
	           String reverseWord = "";
	           String tempSpecial = "";
	           for (int j = word.length()-1; j >= 0; j--) {
	        	   	String tempSpecialChar = Character.toString(word.charAt(j));
	        	   	int specialFlag = 0;
	        	   	for(int k = 0; k < special.size(); k++) {
	        	   		if(special.get(k).equals(tempSpecialChar)) {
	        	   			tempSpecial = tempSpecial + tempSpecialChar;
	        	   			specialFlag = 1;
	        	   			break;
	        	   		}
	        	   	}
					if(specialFlag != 1) {
						reverseWord = reverseWord + word.charAt(j);
					}
	           }
		   reversedString = reversedString + reverseWord + tempSpecial + " ";
		}
		System.out.println("Real sentence: " + sentence);
		System.out.println("Reverse sentence: " + reversedString);
		
	}

}
