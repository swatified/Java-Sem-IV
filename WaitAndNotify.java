class SharedResource {
    private boolean available = false;
    
    public synchronized void produce() {
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Producer: Item produced");
        available = true;
        notify();
    }
    
    public synchronized void consume() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Consumer: Item consumed");
        available = false;
        notify();
    }
}

class Producer extends Thread {
    private SharedResource resource;
    
    public Producer(SharedResource resource) {
        this.resource = resource;
    }
    
    public void run() {
        for (int i = 0; i < 3; i++) {
            resource.produce();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class Consumer extends Thread {
    private SharedResource resource;
    
    public Consumer(SharedResource resource) {
        this.resource = resource;
    }
    
    public void run() {
        for (int i = 0; i < 3; i++) {
            resource.consume();
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class WaitAndNotify {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Producer producer = new Producer(resource);
        Consumer consumer = new Consumer(resource);
        
        producer.start();
        consumer.start();
        
        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}