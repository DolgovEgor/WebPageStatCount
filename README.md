# WebPageStatCount

Тестовое задание на курсы SimbirSoft.

Приложение запрашивает у пользователая адрес веб-станицы 
и формирует статистику по количеству уникальных слов в тексте сайта.

---

### Инструкция по запуску приложения 

Фреймвор для сборки проекта - Maven.  
Главный класс приложения - App.

После запуска приложение попросит пользователя 
ввести в консоль адресс веб-страницы. Когда оператор введет адрес и 
подтвердит его, через нажатие клавиши "Enter", в консоли отобразится 
статистика Уникальных слов сайта.

---

### Файлы, сохраняемые приложением

После завершения работы приложения в папке "temp" будут сохранены
 3 текстовых файла:

1. siteText - сохранныенный HTML-код страницы
2. siteTextAsPlainText - текст страницы
3. siteStatistics - статистика слов страницы