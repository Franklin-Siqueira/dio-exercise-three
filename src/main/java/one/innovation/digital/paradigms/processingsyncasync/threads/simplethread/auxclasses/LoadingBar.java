package one.innovation.digital.paradigms.processingsyncasync.threads.simplethread.auxclasses;

public class LoadingBar extends Thread {
    private Thread startPdfFileGenerator;

    public LoadingBar(Thread startPdfFileGenerator) {
        this.startPdfFileGenerator = startPdfFileGenerator;
    }

    @Override
    public void run() {
        var execution = 0;
        while (true){
            try {
                Thread.sleep(500);

                if (!startPdfFileGenerator.isAlive()){
                    break;
                }
                if (execution == 0){
                    System.out.println("Loading ... ");
                    execution = 1;
                } else {
                    System.out.println("... ");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


    }
}
