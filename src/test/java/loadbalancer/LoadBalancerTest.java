package loadbalancer;

import java.util.Collection;
import java.util.stream.IntStream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;

class LoadBalancerTest {

    @Mock
    private ServerSelectionStrategy serverSelectionStrategy;

    @Test
    public void shouldBeAbleToAddServer() {
        LoadBalancer loadBalancer = new LoadBalancer(serverSelectionStrategy);
        Server mockServer = Mockito.mock(Server.class);

        loadBalancer.addServer(mockServer);
        Collection<Server> servers = loadBalancer.getServers();

        assertThat(servers).hasSize(1);
    }

    @Test
    public void shouldNotAllowMoreThan10Servers() {
        LoadBalancer loadBalancer = new LoadBalancer(serverSelectionStrategy);

        IntStream.range(0, 10).forEach(index -> loadBalancer.addServer(Mockito.mock(Server.class)));

        Assertions.assertThatThrownBy(() -> {
            loadBalancer.addServer(Mockito.mock(Server.class));
        }).isInstanceOf(RuntimeException.class);

    }

    @Test
    public void shouldNotFailWhenAddingSameServerAgain() {
        LoadBalancer loadBalancer = new LoadBalancer(serverSelectionStrategy);

        IntStream.range(0, 9).forEach(index -> loadBalancer.addServer(Mockito.mock(Server.class)));


        Server mockServer = Mockito.mock(Server.class);
        loadBalancer.addServer(mockServer);
        loadBalancer.addServer(mockServer);

        assertThat(loadBalancer.getServers()).hasSize(10);

    }
}