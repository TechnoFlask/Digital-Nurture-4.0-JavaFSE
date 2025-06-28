package com.dnp.Pdf3_1;

public interface AuditLogger {
     void logStart(String process);

     void logEnd(String process);
}
