package PracticeCode1;

// procducer consumer
public class Company {

    int n;
    boolean f = false;
    // if f = false then chance for producer
    // if f = true then chance for consumer

    synchronized public void produce_item(int n){
        if(f){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.n = n;
        System.out.println("Produced item: " + this.n);
        f= true;
        notify();
    }
    synchronized public int consume_item(){

        if(!f){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Consumed item: " + this.n);
        f= false;
        notify();
        return this.n;


    }

}
