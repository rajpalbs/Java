# Thread

- It's an instance of java class ``java.lang.Thread``. like other classes in java, it has variables and methods, and it
  lives and die on the heap.
- The ``start()`` method will cause the JVM to spawn a new thread and make the newly spawned thread execute ``run()``
  method. that spawned thread is an individual lightweight process that has own call stack.
- The `main()` method itself is one thread. so when we spawn a new thread then there are 2 thread(having separate method
  execution stack) are running.
- The JVM, which gets it turn by CPU from underlying OS, Operates like mini-OS and schedule its own thread, regardless
  of the underlying OS. **OS thread and JVM thread are different.** but in some JVM, java thread maps to OS thread.
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
- The ``Thread scheduler``, part of JVM, manages the ``threads`` to decide which thread should run at given moment of
  time and takes thread out of the ``run`` state.