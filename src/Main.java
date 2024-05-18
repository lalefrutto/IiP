import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Путь к файлу
        String strPath = "C:/Users/Ilnaz/Desktop/kr2/src/BirthsKingCounty2001.txt";
        Path path = Paths.get(strPath);

        List<HumanData> humanDataList = new ArrayList<>();


        try {
            File file = new File("C:/Users/Ilnaz/Desktop/kr2/src/BirthsKingCounty2001.txt");
            BufferedReader reader = new BufferedReader(new java.io.FileReader(file));

            humanDataList = reader.lines()
                    .map(line -> line.split("[,\\s]+"))
                    .map(splitData -> new HumanData(
                            splitData[0],
                            splitData[1],
                            splitData[2],
                            splitData[3],
                            splitData[4],
                            splitData[5],
                            splitData[6],
                            splitData[7],
                            splitData[8],
                            splitData[9],
                            splitData[10],
                            splitData[11],
                            splitData[12],
                            splitData[13],
                            splitData[14],
                            splitData[15],
                            splitData[16]
                    ))
                    .collect(Collectors.toList());

            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        Map<String, List<HumanData>> humansByRace = humanDataList.stream()
                .collect(Collectors.groupingBy(HumanData::getRace));

        Map<String, Double> averageBwtByRace = humansByRace.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> entry.getValue().stream()
                                .mapToDouble(HumanData::getBwt)
                                .average()
                                .getAsDouble()
                ));
        System.out.println(averageBwtByRace);

        //

        int totalSmokers = 0;
        int totalNSmokers = 0;
        int cSmokers = 0;
        int cNSmokers = 0;

        for (HumanData humanData : humanDataList) {
            if (humanData.getSmoker().equals("Y")) {
                totalSmokers += humanData.getGestation();
                cSmokers++;
            } else {
                totalNSmokers += humanData.getGestation();
                cNSmokers++;
            }
        }

        System.out.println((totalSmokers / cSmokers) == (totalNSmokers / cNSmokers));


        try (DataOutputStream dataOutputStream = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("mother_data.txt")))) {

            for (HumanData motherData : humanDataList) {
                dataOutputStream.writeChars(motherData.getRace() + " " + motherData.getEducation() + "\n");
            }

            dataOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


в

    }
}


