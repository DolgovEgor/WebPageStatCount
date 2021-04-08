package org.page.parse;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;

/**
 * Класс StatCounter содержит метод для подсчета статистики
 */
public class StatCounter {

    /**
     * Сформировать статистику из списка слов
     *
     * @param wordList - список слов
     * @return HashMap<String - слово, Integer - кол-во слов в исходном тексте> - статистика
     */
    @NotNull
    public static HashMap<String, Integer> countStatistics(String[] wordList) {
        HashMap<String, Integer> wordStat = new HashMap<>();
        for (String i : wordList) {
            try {
                wordStat.put(i, wordStat.get(i).intValue() + 1);
            } catch (NullPointerException e) {
                wordStat.put(i, 1);
            }
        }
        wordStat.remove("");
        return wordStat;
    }
}

