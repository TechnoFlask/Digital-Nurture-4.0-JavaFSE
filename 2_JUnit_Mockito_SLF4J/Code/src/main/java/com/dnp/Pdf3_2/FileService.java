package com.dnp.Pdf3_2;

public class FileService {
     private final MyFileReader fileReader;
     private final MyFileWriter fileWriter;

     public FileService(MyFileReader fileReader, MyFileWriter fileWriter) {
          this.fileReader = fileReader;
          this.fileWriter = fileWriter;
     }

     public void processFile(String inputPath, String outputPath) {
          String content = fileReader.readFile(inputPath);
          String upperContent = content.toUpperCase();
          fileWriter.writeFile(outputPath, upperContent);
     }
}
