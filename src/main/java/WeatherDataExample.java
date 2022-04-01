import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WeatherDataExample {

        public static void main(String[] args) throws IOException {
            String[][] weatherData = new String[10][7];

            //read in file
            Path filePath = Path.of("austin_weather.csv");
            String fileContent = Files.readString(filePath);

            //separate out lines
            String[] fileLines = fileContent.split("\n");

            //ignore header
            int fileCounter = 1;

            //load multidimensional array

            for (int i = 0; i < weatherData.length  ; i++) {
                for (int j = 0; j <  weatherData[i].length  ; j++) {
                    //set the value of the current location to String in
                    weatherData[i][j] = fileLines[fileCounter];
                    fileCounter++;
                }
            }

            System.out.println("Done");

        }
    }
