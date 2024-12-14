package com.tnsif.inheritance.multilevel;

/**
 *
 * @author sys
 */
public class MLInheritanceDemo {

    public static void main(String[] args) {
        /**
         * executor methods
         */

        Word word = new Word();
        System.out.println("Is text in Wordpad bold? " + word.isBold());
        word.write("Welcome to Java" + "");
        word.formatText(true);
        word.write("coding");
        word.displayContent();
        word.enableSpellCheck(true);

        System.out.println("Is text in Wordpad bold? " + word.isBold());
        System.out.println("Disabling spell check in Word.");
        System.out.println(word.content);
    }

}
