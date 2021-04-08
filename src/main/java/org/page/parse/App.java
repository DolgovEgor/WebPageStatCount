package org.page.parse;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    // Variables
    private static String[] splittersList = new String[]
            {" ", ",", ".", "!", "?", "\"", ";", ":", "[", "]", "(", ")", "\n", "\t", "«", "»"};

    //Methods
    public static void main(String[] args) throws IOException {
        // Спросить адресс сайта у оператора
        HashMap<String, Integer> siteWordStat;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите адрес сайта: ");
        String siteAddress = in.nextLine();

        // Получить HTML-код страницы
        String siteHtmlText = WebPageDownloader.downloadWebPage(siteAddress);
        FileSaveLoader.saveTextToFile("siteText", siteHtmlText);

        // Получить текст без тегов HTML
        String sitePlainText = TextConverter.convertHtmlToPlainText(siteHtmlText);
        FileSaveLoader.saveTextToFile("siteTextAsPlainText", sitePlainText);

        // Получить статистику и распечатать ее в консоль
        String[] siteWordList = TextConverter.splitText(sitePlainText, splittersList);
        siteWordStat = StatCounter.countStatistics(siteWordList);
        for (Map.Entry<String, Integer> entry : siteWordStat.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        FileSaveLoader.saveSiteStatisticsToFile("siteStatistics", siteWordStat);
    }
}
