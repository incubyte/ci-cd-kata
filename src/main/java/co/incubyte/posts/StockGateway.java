package co.incubyte.posts;

import static io.micronaut.http.HttpRequest.GET;

import io.micronaut.core.type.Argument;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import java.util.List;

@Singleton
public class StockGateway {

  @Inject
  @Client("https://61bdb57a2a1dd4001708a0f3.mockapi.io/api/v1")
  private HttpClient httpClient;

  public List<Stock> getAllStocks() {
    return httpClient.toBlocking()
        .retrieve(GET("/stocks"), Argument.listOf(Stock.class));
  }
}
