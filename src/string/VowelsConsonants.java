package string;

public class VowelsConsonants {

    public static void vowelsConsonants(String slovo) {
        int Vowels = 0;
        int Consonants = 0;
        slovo = slovo.toLowerCase();
        for (int i = 0; i < slovo.length(); i++) {
            if (slovo.charAt(i) == 'a' || slovo.charAt(i) == 'e' || slovo.charAt(i) == 'i' || slovo.charAt(i) == 'o' || slovo.charAt(i) == 'u') {
                Vowels = Vowels + 1;
            }
            else {
                Consonants = Consonants + 1;
            }
        }
        System.out.println("Гласных: " + Vowels + " Согласных:" + Consonants);
    }
}

