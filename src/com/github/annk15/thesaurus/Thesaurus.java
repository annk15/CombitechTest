package com.github.annk15.thesaurus;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

public class Thesaurus implements IThesaurus {

    HashMap<Integer, Entry> records;

    public Thesaurus() {
        records = new HashMap<>();
    }

    public void AddSynonyms(Iterable<String> synonyms) {

        List<Entry> entries = new ArrayList<>();

        for (String synonym : synonyms) {

            synonym = synonym.toLowerCase();

            if (!records.containsKey(synonym.hashCode())) //The entry dosn't exist, create new
                records.put(synonym.hashCode(), new Entry(synonym));

            entries.add(records.get(synonym.hashCode()));
        }

        for (Entry ref : entries) //Update references in each entry
            ref.Update(new ArrayList<>(entries));

    }

    public Iterable<String> GetSynonyms(String word) {

        word = word.toLowerCase();

        if(!records.containsKey(word.hashCode())) //No entry exist for this word, return empty container
            return new ArrayList<>();

        return records.get(word.hashCode()).GetSynonyms();
    }

    public Iterable<String> GetWords() {

        if(records.isEmpty()) //No entries exist, return empty container
            return new ArrayList<>();

        Vector<String> words = new Vector<>(records.size());
        for(Entry record: records.values())
            words.add(record.toString());

        return words;
    }

}
