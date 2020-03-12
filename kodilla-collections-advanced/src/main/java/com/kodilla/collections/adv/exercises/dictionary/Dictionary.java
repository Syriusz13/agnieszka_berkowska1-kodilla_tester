package com.kodilla.collections.adv.exercises.dictionary;

import java.util.*;

public class Dictionary {

    Map<String, List<EnglishWord>> dictionary = new HashMap<>();

    public void addWord(String polishWord, EnglishWord englishWord) {
    List<EnglishWord> englishWords = dictionary.getOrDefault(polishWord, new ArrayList<>()); //pobiera listę słów angelskich z mapy (odpowiadającą danemu słowu po polsku), jeżeli nie ma listy to tworzy  pustą
    englishWords.add(englishWord);
    dictionary.put(polishWord, englishWords);
    }
    public List<EnglishWord> findEnglishWords (String polishWord){
        return dictionary.getOrDefault(polishWord, Collections.emptyList());
    }
    public List<EnglishWord> findEnglishWord (String polishWord, PartOfSpeech partOfSpeech){    //metody przeciążone, overload
        List<EnglishWord> result = new ArrayList<>();
        for (EnglishWord englishWord: dictionary.getOrDefault(polishWord, Collections.emptyList())) {
            if (englishWord.getPartOfSpeech().equals(partOfSpeech))
                result.add(englishWord);
        }
            return result;
    }
    public int size(){
        return dictionary.size();
    }
}
