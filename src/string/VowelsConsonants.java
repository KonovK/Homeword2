package string;

public class VowelsConsonants {

    public static void vowelsConsonants(String slovo) {
        int vowels = 0;
        int consonants = 0;
        slovo = slovo.toLowerCase();
        for (int i = 0; i < slovo.length(); i++) {
            if (slovo.charAt(i) == 'a' || slovo.charAt(i) == 'e' || slovo.charAt(i) == 'i' || slovo.charAt(i) == 'o' || slovo.charAt(i) == 'u') {
                vowels = vowels + 1;
            }
            else {
                consonants = consonants + 1;
            }
        }
        System.out.println("Гласных: " + vowels + " Согласных:" + consonants);
    }
}

