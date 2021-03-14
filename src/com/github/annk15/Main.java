package com.github.annk15;

import com.github.annk15.thesaurus.Thesaurus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Create a new thesaurus
        Thesaurus thesaurus = new Thesaurus();

        //First batch of synonyms
        ArrayList<String> batch1 = new ArrayList<String>(Arrays.asList("Gå","Vandra","promenera","spatsera", "passera", "lämna"));

        //Second batch of synonyms ("lämna" exist in both the first and second batch which means it has synonyms from both batches)
        ArrayList<String> batch2 = new ArrayList<String>(Arrays.asList("sluta","lämna","Svika","överge"));

        //Add batches of synonyms
        thesaurus.AddSynonyms(batch1);
        thesaurus.AddSynonyms(batch2);

        //Print all words rom the thesaurus
        System.out.println("\nDumping all words in the thesaurus:");
        thesaurus.GetWords().forEach(System.out::println);

        Scanner scanner = new Scanner(System.in);

        //Let the user enter a word and see it's synonyms
        while (true) {

            System.out.print("\nPlease enter a word to find synonyms for: ");

            for (String synonym: thesaurus.GetSynonyms(scanner.nextLine()))
                System.out.println(synonym);
        }
    }
}
