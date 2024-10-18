package loadbalancer;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LoadBalancer {

    private final Set<Server> servers = new HashSet<>();

    private final ServerSelectionStrategy serverSelectionStrategy;

    public LoadBalancer(ServerSelectionStrategy serverSelectionStrategy) {
        this.serverSelectionStrategy = serverSelectionStrategy;
    }

    public void addServer(Server server) {
        if (!servers.contains(server) && servers.size() == 10) {
            throw new RuntimeException("Cannot add more than 10 servers");
        }

        servers.add(server);
    }

    public Collection<Server> getServers() {
        return Collections.unmodifiableSet(servers);
    }

    public void handleRequest(Request request) {
        Server server = serverSelectionStrategy.selectServer(servers, request);
        server.accept(request);
    }
}
