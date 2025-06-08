class ThreadExample extends Thread {
    private String name;
    
    public ThreadExample(String name) {
        this.name = name;
    }
    
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(name + " - Count: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class MultipleThreads {
    public static void main(String[] args) {
        ThreadExample t1 = new ThreadExample("Thread-1");
        ThreadExample t2 = new ThreadExample("Thread-2");
        
        // Using 10 thread methods
        System.out.println("Thread 1 name: " + t1.getName());
        System.out.println("Thread 1 ID: " + t1.getId());
        System.out.println("Thread 1 priority: " + t1.getPriority());
        System.out.println("Thread 1 state: " + t1.getState());
        System.out.println("Thread 1 is alive: " + t1.isAlive());
        
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        
        t1.start();
        t2.start();
        
        System.out.println("Thread 1 is alive after start: " + t1.isAlive());
        System.out.println("Thread 2 is daemon: " + t2.isDaemon());
        System.out.println("Current thread: " + Thread.currentThread().getName());
        System.out.println("Active threads: " + Thread.activeCount());
        
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}