package loadbalancer;

public interface Server {

    boolean accept(Request request);
}
