package String;

public class EvenString {
    public static void main(String[] args) {
        String str1 = "Hai how are you, i am rama";
        String[] words = str1.split(" ");
        for(String word:words){
            if(word.length()%2==0){
                System.out.println(word);
            }
        }
    }
}
