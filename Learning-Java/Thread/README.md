# Thread

- It's an instance of java class ``java.lang.Thread``. like other classes in java, it has variables and methods, and it
  lives and die on the heap.
- The ``start()`` method will cause the JVM to spawn a new thread and make the newly spawned thread execute ``run()``
  method.
- There are 2 low level API to spawn a new thread
    - extends ``java.lang.Thread`` class.
    ````java
    public class TestThread extends Thread {
      
      public TestThread(String name) {
            super(name);
      }  
    
      @Override
      public void run() {
          System.out.println("Hello from : "+Thread.currentThread().getName()); // print -> Spawn-1  
      }
  
      public static void main(String[] args) {
          System.out.println("Hello from : "+Thread.currentThread().getName()); // print -> main
          new TestThread("Spawn-1").start();
      }
    }
  ````
    - implements ``java.lang.Runnable`` interface.
    ````java
    public class TestRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println("Hello from : " + Thread.currentThread().getName()); // print -> Thread-0
        }

        public static void main(String[] args) {
            System.out.println("Hello from : " + Thread.currentThread().getName()); // print -> main
            Runnable runnableThread = new TestRunnable();
            new Thread(runnableThread).start();
        }
    }
    ````  
- Generally, implementing ``java.lang.Runnable`` is prefer as compare to extends ``java.lang.Thread`` class. because
  composition(HAS-A) preferred over inheritance(IS-A).
