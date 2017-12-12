import io.vertx.core.Vertx;
import io.vertx.core.VertxOptions;

public class Launcher extends io.vertx.core.Launcher {
    public static void main(String[] args) {
        new Launcher().dispatch(args);
    }

    @Override
    public void beforeStartingVertx(VertxOptions options) {
        options.setClustered(true);
    }
}
