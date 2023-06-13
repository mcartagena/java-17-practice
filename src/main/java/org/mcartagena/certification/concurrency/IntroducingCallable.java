package org.mcartagena.certification.concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class IntroducingCallable {
    public static void main(String[] args) {
        var service = Executors.newSingleThreadExecutor();
        try {
            Future<Integer> result = service.submit(
                    () -> 30 + 11
            );
            System.out.println(result.get());  // 41
        } catch (ExecutionException | InterruptedException e){
            System.out.println("Interrupted!");
        } finally {
            service.shutdown();
        }
    }
}
