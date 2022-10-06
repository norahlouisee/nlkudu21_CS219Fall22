package HW5;

public class Exercise66 {

    public static boolean canSpell(String word, String tiles) {


        for(int i=0; i < word.length(); i++) {

            // declare variable to keep track of the current character index
            int ch = tiles.indexOf(word.charAt(i));

            // test if the current character in the word is in the tiles
            if(ch == -1) {
                // if character is -1 character is not in tiles
                return false;
            }

            // if character is in tiles remove character from tiles string
            else {
                // index of character to remove from tiles
                tiles = tiles.substring(0, ch)
                        + tiles.substring(ch + 1);
            }
        } // for
        return true;
    }

    public static void main(String [] args) {
        System.out.println(canSpell("boot", "axobasrto"));
        System.out.println(!canSpell("hippo", "haxobapsrito"));

        // Student: add more test cases
        System.out.println(canSpell("java", "uafrvajaw"));
        System.out.println(!canSpell("weekend", "wrbreoowdkcn"));
        System.out.println(canSpell("history", "urieoaishty"));
        System.out.println(!canSpell("water", "aojvndarert"));
        System.out.println(!canSpell("pqrc", "4308g2qj"));
    }

}

