package FactoryMethodPatternExample;

interface Document {
     String read();
}

final class WordDocument implements Document {
     WordDocument() {
          System.out.println("Creating Word Document");
     }

     @Override
     public String read() {
          return "Reading Word Document";
     }
}

final class PDFDocument implements Document {
     PDFDocument() {
          System.out.println("Creating PDF Document");
     }

     @Override
     public String read() {
          return "Reading PDF Document";
     }
}

final class ExcelDocument implements Document {
     ExcelDocument() {
          System.out.println("Creating Excel Document");
     }

     @Override
     public String read() {
          return "Reading Excel Document";
     }
}