package five.build_base_module;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * @ Author : kn
 * @ Description :
 * @ Date : 2024/5/25 16:30
 */
public class CyclicBarrierExample {
    public static int THREAD_COUNT=4;

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(THREAD_COUNT,() -> System.out.println(Thread.currentThread().getName()+"到达屏障点，执行相应任务"));
        for (int i = 0; i < THREAD_COUNT; i++) {
            new Thread(()->{

                try {
                    System.out.println("线程" + Thread.currentThread().getName() + "开始执行");
                    Thread.sleep(1000);
                    //等待其他线程
                    cyclicBarrier.await();
                    //设置超时时间，超过报超时异常
                    cyclicBarrier.await(1, TimeUnit.MINUTES);
                    System.out.println("线程" + Thread.currentThread().getName() + "执行完毕");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } catch (BrokenBarrierException e) {
                    throw new RuntimeException(e);
                } catch (TimeoutException e) {
                    throw new RuntimeException(e);
                }

            }).start();
        }

        System.out.println("主线程执行完毕");
    }
}
