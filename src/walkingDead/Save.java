package walkingDead;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Save {
	int[] saveInfo = {Main.playerPick};
	
	public Save() {
		readPlayer("saveFile.txt");
		savePlayer("saveFile.txt");
	}
	
	public void readPlayer(String filePath) {
	  File inputFile;
      BufferedReader inputReader;

      try {
          inputFile = new File(filePath);
          inputReader = new BufferedReader(new FileReader(inputFile));

        
          for (int i = 0; i < saveInfo.length; i++) {
                  saveInfo[i] = Integer.parseInt(inputReader.readLine());
          }

          inputReader.close();

  } catch (Exception e) {
          e.printStackTrace();
  }

	}
	public void savePlayer(String filePath) {
        File outputFile;
        BufferedWriter outputWriter;
       
        try {
                outputFile = new File(filePath);
               
                outputWriter = new BufferedWriter(new FileWriter(outputFile));
                
                saveInfo[0] = Main.playerPick;
                
                for(int i = 0; i < saveInfo.length; i++){
                    outputWriter.write(Integer.toString(saveInfo[i]) + "\n");
            }
            outputWriter.close();
           
    } catch (Exception e) {
            e.printStackTrace();
    }

        }
	}
	