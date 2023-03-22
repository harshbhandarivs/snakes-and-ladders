package test.java.com.snakes_and_ladders.printer;

import main.java.com.snakes_and_ladders.printer.Printer;

import java.util.ArrayList;
import java.util.List;

class PrinterStub implements Printer {

    private final List<String> outputLines;

    public PrinterStub() {
        this.outputLines = new ArrayList<>();
    }

    @Override
    public void println(String output) {
        outputLines.add(output);
    }

    public List<String> getOutputLines() {
        return outputLines;
    }
}
