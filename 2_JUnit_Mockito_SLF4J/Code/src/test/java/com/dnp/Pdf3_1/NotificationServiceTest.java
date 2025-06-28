package com.dnp.Pdf3_1;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class NotificationServiceTest {

     @Test
     void testSendEmailCalledWithSpecificArguments() {
          NotificationService mockService = mock(NotificationService.class);

          mockService.sendEmail("john@example.com", "Hello John!");

          verify(mockService).sendEmail("john@example.com", "Hello John!");
     }
}
