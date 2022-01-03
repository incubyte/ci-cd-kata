This application makes API call and based on a ticker name sent as a query parameter it returns
perticular stock information.<br><br>The source code for the application along with the test cases
is available in this repository.
<h4>Steps :-</h4>
<ul><li>To build the project use <code>./gradlew build</code></li>
<li>To run all test cases
use <code>./gradlew test</code></li>
<li>To run gradle task use <code>./gradlew run</code></li>
</ul>

###  Example

<ol>
<li>
<code>Request:$APP-HOST:PORT/tickers/HCC</code><br>
<code>Response:{"ticker":"HCC","name":"Hindustan Construction Company Limited","price":65.0}
</code></li>
<li>
<code>Request:$APP-HOST:PORT/tickers/TATAMOTORS</code><br>
<code>Response:{"ticker":"TATAMOTORS","name":"TATA MOTORS LIMITED","price":99}</code>
</li>
</ol>