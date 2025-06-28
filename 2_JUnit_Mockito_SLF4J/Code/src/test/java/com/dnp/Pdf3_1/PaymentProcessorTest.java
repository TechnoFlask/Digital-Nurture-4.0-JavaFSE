package com.dnp.Pdf3_1;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class PaymentProcessorTest {

     @Test
     void testProcessPaymentCalledWithSpecificArguments() {
          PaymentProcessor mockProcessor = mock(PaymentProcessor.class);

          mockProcessor.processPayment("user123", 250.0);

          verify(mockProcessor).processPayment(eq("user123"), eq(250.0));
     }
}
