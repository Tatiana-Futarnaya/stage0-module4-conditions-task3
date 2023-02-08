package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        int[] arr={101,105,111,117,125,131,141,145,151,157,165,171};
        String result="Consonant";
        if((character>=65 && character<=90) || (character>=97 && character<=122)){
            for (int i=0; i<arr.length;i++){
                if(character==arr[i] ){
                    result="Vowel";
                    break;
                }
            }
            System.out.println(result);
        }else{
            System.out.println("wrong alphabet!");
        }
    }
}
