package com.github.annk15;

import com.github.annk15.thesaurus.Thesaurus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Thesaurus thesaurus = new Thesaurus();

        ArrayList<String> batch1 = new ArrayList<String>(Arrays.asList("Gå","Vandra","promenera","spatsera", "passera", "lämna"));
        ArrayList<String> batch2 = new ArrayList<String>(Arrays.asList("sluta","lämna","Svika","överge"));

        thesaurus.AddSynonyms(batch1);
        thesaurus.AddSynonyms(batch2);

        System.out.println("\nDumping all words in the thesaurus:");
        thesaurus.GetWords().forEach(System.out::println);

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("\nPlease enter a word to find synonyms for: ");

            for (String synonym: thesaurus.GetSynonyms(scanner.nextLine()))
                System.out.println(synonym);
        }
    }
}
