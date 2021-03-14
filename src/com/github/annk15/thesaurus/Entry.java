package com.github.annk15.thesaurus;

import java.util.List;
import java.util.ArrayList;
import java.util.Vector;

public class Entry {

    private String synonym;
    private List<Entry> references;

    public Entry(String synonym) {
        this.synonym = synonym;
        this.references = new ArrayList<>();
    }

    public void Update(List<Entry> references) {

        references.remove(this);
        this.references.addAll(references);

    }

    public Iterable<String> GetSynonyms() {

        Vector<String> synonyms = new Vector<>(references.size());
        for (Entry reference: references) {
            synonyms.add(reference.toString());
        }

        return synonyms;
    }

    @Override
    public String toString() {
        return synonym;
    }
}