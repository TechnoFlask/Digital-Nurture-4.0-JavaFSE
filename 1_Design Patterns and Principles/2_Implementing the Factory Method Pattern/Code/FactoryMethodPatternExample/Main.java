package FactoryMethodPatternExample;

public class Main {
     public static void main(String[] args) {
          DocumentFactory dfWord = new WordDocumentFactory();
          Document d = dfWord.createDocument();
          System.out.println(d.read());

          DocumentFactory dfPdf = new PDFDocumentFactory();
          d = dfPdf.createDocument();
          System.out.println(d.read());

          DocumentFactory dfExcel = new ExcelDocumentFactory();
          d = dfExcel.createDocument();
          System.out.println(d.read());

     }
}
