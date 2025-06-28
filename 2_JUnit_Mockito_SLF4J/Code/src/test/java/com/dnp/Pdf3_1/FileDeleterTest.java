package com.dnp.Pdf3_1;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class FileDeleterTest {

     @Test
     void testDeleteFileThrowsException() {
          FileDeleter mockDeleter = mock(FileDeleter.class);

          doThrow(new RuntimeException("File not found"))
                    .when(mockDeleter)
                    .deleteFile("important.txt");

          RuntimeException thrown = assertThrows(
                    RuntimeException.class,
                    () -> mockDeleter.deleteFile("important.txt"));
          assertEquals("File not found", thrown.getMessage());

          verify(mockDeleter).deleteFile("important.txt");
     }
}
