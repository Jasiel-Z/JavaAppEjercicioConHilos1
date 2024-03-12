public class HiloDescendente extends Thread {


    public void run(){
        for(int i = 100; i >= 1; i--){
            System.out.println("HiloDescendente --> "+ i);
            try{
                Thread.sleep(100);
            }catch(InterruptedException ex){
                ex.printStackTrace();
            }
    }

    }
}
