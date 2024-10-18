package loadbalancer;

import java.util.Set;

public interface ServerSelectionStrategy {

    Server selectServer(Set<Server> servers, Request request);
}
