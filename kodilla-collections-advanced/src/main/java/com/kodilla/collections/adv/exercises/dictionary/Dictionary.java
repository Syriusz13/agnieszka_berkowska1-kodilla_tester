package com.kodilla.collections.adv.exercises.dictionary;

import java.util.*;

public class Dictionary {

    Map<String, List<EnglishWord>> dictionary = new HashMap<>();

    public void addWord(String polishWord, EnglishWord englishWord) {
    }

    public List<EnglishWord> findEnglishWords (String polishWord){
        return Collections.emptyList();
    }

    public List<EnglishWord> findEnglishWord (String polishWoed, PartOfSpeech partOfSpeech){
        return Collections.emptyList();
    }

    public int size(){
        return dictionary.size();
    }
}
