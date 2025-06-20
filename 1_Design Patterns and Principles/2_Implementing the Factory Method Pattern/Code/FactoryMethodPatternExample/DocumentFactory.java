package FactoryMethodPatternExample;

interface DocumentFactory {
     Document createDocument();
}

final class WordDocumentFactory implements DocumentFactory {
     public Document createDocument() {
          return new WordDocument();
     }
}

final class PDFDocumentFactory implements DocumentFactory {
     public Document createDocument() {
          return new PDFDocument();
     }
}

final class ExcelDocumentFactory implements DocumentFactory {
     public Document createDocument() {
          return new ExcelDocument();
     }
}