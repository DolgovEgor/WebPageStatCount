package org.page.parse;

import org.jsoup.Jsoup;

import java.util.Arrays;

/**
 * Класс TextConverter содержит методы для преобразования текстовых данных для нужд задачи
 */
public class TextConverter {
    /**
     * Пребразовать HTML-код в обычный текст
     * @param htmlString - HTML-код вэб-страницы
     * @return - обчыный текст без тэгов HTML
     */
    public static String convertHtmlToPlainText(String htmlString) {
        String plainText = Jsoup.parse(htmlString).text();
        return plainText;
    }

    /**
     * Разделить текст на массив строк
     * @param text - текст для разделения
     * @param splittersArray - массив разделителей
     * @return - масстив строк
     */
    public static String[] splitText(String text, String[] splittersArray) {
        return text.split(Arrays.toString(splittersArray));
    }
}
