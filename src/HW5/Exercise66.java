package HW5;

public class Exercise66 {

    public static boolean canSpell(String word, String tiles) {


        for(int i=0; i < word.length(); i++) {

            // test if the character in the word is in the tiles
            if(tiles.indexOf(word.charAt(i)) == -1) {
                return false;
            }

            // remove character from tiles string
            else {
                // index of character to remove from tiles
                int ch = tiles.indexOf(word.charAt(i));
                tiles = tiles.substring(0, ch)
                        + tiles.substring(ch + 1);

            }
        }
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


    }

}

