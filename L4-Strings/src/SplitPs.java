import javax.swing.*;

public class SplitPs {

    /*
    Assuming a String has a P, return a String containing the first p and the next 3 letters.

    "Hippopotamus" -> ppop
     */

    /*
    1. Get Input - a word hopefully with a p and letters
    2. Isolate the p
    3. Isolate the three letters AFTER the p
    4. Output
     */

    public static void main(String[] args) {
        String word = JOptionPane.showInputDialog("Enter a word that has a p, and three letters after it: ");
        JOptionPane.showMessageDialog(null, splitP(word));

        System.exit(0);
    }

    public static String splitP(String word){
        int pIndex = word.indexOf('p');

        String split = word.substring(pIndex + 1, pIndex + 4);

        return split;
    }
}
