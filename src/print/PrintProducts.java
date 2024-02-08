package print;

public class PrintProducts extends Thread{
    public void  print (String[] products){
        for (String product : products){
            System.out.println(product);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    }
}
