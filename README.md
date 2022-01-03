This application makes API call and based on a ticker name sent as a query parameter it returns perticular stock information.The source code for the application along with the test cases is available in this repository.
You can build the project by ```./gradlew build``` and to run all test cases by ```./gradlew test```.

### Example
```Request:$APP-HOST:PORT/tickers/HCC```
```Response:{"ticker":"HCC","name":"Hindustan Construction Company Limited","price":65.0}```


```Request:$APP-HOST:PORT/tickers/TATAMOTORS```
```Response:{"ticker":"TATAMOTORS","name":"TATA MOTORS LIMITED","price":99}```


