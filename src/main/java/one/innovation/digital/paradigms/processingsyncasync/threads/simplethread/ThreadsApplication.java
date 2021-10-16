package one.innovation.digital.paradigms.processingsyncasync.threads.simplethread;

import one.innovation.digital.paradigms.processingsyncasync.threads.simplethread.auxclasses.LoadingBar;
import one.innovation.digital.paradigms.processingsyncasync.threads.simplethread.auxclasses.PdfFileGenerator;

public class ThreadsApplication {
    public static void main(String[] args) {
        PdfFileGenerator startPdfFileGenerator = new PdfFileGenerator();
        LoadingBar startLoadingBar = new LoadingBar(startPdfFileGenerator);
        // Run both Threads
        startPdfFileGenerator.start();
        startLoadingBar.start();

    }
}
