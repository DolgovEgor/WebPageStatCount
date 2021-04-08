package org.page.parse;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

/**
 * Класс FileSaveLoader содержит медоты для сохранения текстовых данных, в файлы на жестком диске
 */
public class FileSaveLoader {
    private static String folderPath = ".//temp//";
    private static String fileType = ".html";

    public static void saveTextToFile(String fileName, String containString) throws IOException {
        String fullPath = folderPath.concat(fileName).concat(fileType);
        try {
            Files.writeString(Paths.get(fullPath), containString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveSiteStatisticsToFile(String fileName, Map<String, Integer> wordStat) throws IOException {
        StringBuilder statText = new StringBuilder(new String());
        for (Map.Entry<String, Integer> entry : wordStat.entrySet()) {
            statText.append(entry.getKey()).append(" ").append(entry.getValue()).append("\n");
        }
        try {
            FileSaveLoader.saveTextToFile(fileName, statText.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String loadTextFromFile(String fileName) {
        String fullPath = folderPath.concat(fileName).concat(fileType);
        String content = new String();
        try {
            content = content.concat(Files.readString(Paths.get(fullPath)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
}
