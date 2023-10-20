package org.example.Logger;
import java.io.*;

public class CalculatorLogger {
    String fileName = "logs.txt";
    File file = new File(fileName);

    public CalculatorLogger() {}

    /**
     * Метод для записи информации в лог файл
     * @param log Лог информация. В нашем случае, результаты операций.
     */
    public void write(String log) {
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(log + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Считывание лог файла
     * @return Информация из log.txt
     */
    public String read() {
        StringBuilder result = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                result.append(line).append("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result.toString();
    }
}