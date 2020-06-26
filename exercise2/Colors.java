package exercise2;

import java.util.ArrayList;

public class Colors {
    String[] colorArr = {"blue", "red", "yellow", "black", "green", "pink"};
    String[] colorful(String[] strings) {
        ArrayList<String> placeholderArr = new ArrayList<String>();
        // For the given strings, keep all the strings that begin with a color ("red", "yellow", "green", "blue", etc.) return an array of strings that start with a color.  discard all the other strings.  If no strings start with a color in the input array, return an empty array.
        for(int i = 0; i< strings.length;i++){
            for(int j = 0; j<colorArr.length; j++){
                if(strings[i].contains(colorArr[j])){
                    placeholderArr.add(strings[i]);
                }
            }
        }
        System.out.println(placeholderArr.toString());
        String[] finalArr = new String[placeholderArr.size()];
        for(int f = 0; f < placeholderArr.size(); f++){
            finalArr[f] = placeholderArr.get(f);
        }
        return finalArr;
    }

    public static void main(String[] args) {
        Colors code = new Colors();
        code.colorful(new String[]{"bluebird","red herring", "yellow bumblebee","black spider", "green monkey","pink","great gatsby","feeding frenzy","black bird","widowmaker","quran","bible","torah"});
        System.out.println("This is the Colors class");
    }


}