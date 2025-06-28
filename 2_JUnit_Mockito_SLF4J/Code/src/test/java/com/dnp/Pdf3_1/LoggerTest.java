package com.dnp.Pdf3_1;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class LoggerTest {
     @Test
     void testLogMethodCalled() {
          Logger mockLogger = mock(Logger.class);

          mockLogger.log("Mockito");
          verify(mockLogger).log("Mockito");
     }
}
