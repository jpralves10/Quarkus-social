package io.github.dougllasfps;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.stream.Stream;

@QuarkusMain
public class MainDoQuarkus implements QuarkusApplication {

    /*@Inject
    @Channel("parametros")
    Emitter<String> emitter;*/

    @Override
    public int run(String... args) throws Exception {
        System.out.println("MainDoQuarkus.run()" + Arrays.toString(args));
        //Stream.of(args).forEach(s -> emitter.send(s));
        Quarkus.waitForExit();
        return 0;
    }
}
