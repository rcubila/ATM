public class WaitTime {


    public void dots() throws InterruptedException {

        for(int i = 0; i < 20;i ++){
            Thread.sleep(400);
            System.out.print(".");

        }
    }

}



