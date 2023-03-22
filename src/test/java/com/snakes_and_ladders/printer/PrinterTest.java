package test.java.com.snakes_and_ladders.printer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class PrinterTest {
    @Test
    public void testPrinterStub() {
        PrinterStub printerStub = new PrinterStub();
        printerStub.println("Hello");

        Assertions.assertEquals(List.of("Hello"), printerStub.getOutputLines());
    }
}
