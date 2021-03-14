package com.github.annk15.thesaurus;

interface IThesaurus {

    /// <summary>
    /// Represents a thesaurus.
    /// </summary>

    /// <summary>
    /// Adds the given synonyms to the thesaurus
    /// </summary>
    /// <param name="synonyms">The synonyms to add.</param>
    void AddSynonyms(Iterable<String> synonyms);

    /// <summary>
    /// Gets the synonyms for a given word.
    /// </summary>
    /// <param name="word">The word the synonyms of which to get.</param>
    /// <returns>A <see cref="string"/> with all synonyms for the given
    /// word.</returns>
    Iterable<String> GetSynonyms(String word);

    /// <summary>
    /// Gets all words from the thesaurus.
    /// </summary>
    /// <returns>An <see cref="IEnumerable<string>"/> containing
    /// all the words in the thesaurus.</returns>
    Iterable<String> GetWords();

}