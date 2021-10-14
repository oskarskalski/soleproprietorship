# soleproprietorship

## Runing application
There's two ways to run this application. 
1. 
Pull this project using git

```git pull https://github.com/oskarskalski/soleproprietorship```

Then open this project folder. Go to target folder. There's a .jar file named soleproprietorship-0.0.1-SNAPSHOT.jar. We can run this application in cmd using this command:

```java -jar soleproprietorship-0.0.1-SNAPSHOT.jar ```

2.
Another way to run this project is by using docker

Download docker for computers. Then open cmd and by using this commands:

``` docker pull oskarskalski/soleproprietorship:latest ```

``` docker run -it -p 8080:8080 oskarskalski/soleproprietorship:latest ```

If there's problem with hyper-v, it is nessecery to turn it off in BIOS system. 

After choosing first or second way, now you can send http requests to this application.

## Sending request to the application

### POST Requests

If we want to add revenue amount to this application, we have to send request with POST method on this url:

``` http://localhost:8080/api/revenue/add/{revenueAmount} ```

Where {revenueAmount} is a parameter which value has to be greater or equals 0

### GET Requests

If we want to get every information that are in the DB, we have to send request with GET method on this url:

``` http://localhost:8080/api/revenue/all ```

Also there's another endpoint which on we can get data from start or end of the DB. We just have to send request with GET method on this url:

``` http://localhost:8080/api/revenue/range/{rangeValue}/{orderValue} ```

{rangeValue} is a parameter that is require to get number of data that is nessecary to return from the application. 
{orderValue} is a parameter that is require to get data from the start or end of the DB. 
Url example with result:

``` http://localhost:8080/api/revenue/range/{5}/{desc} ```

```yml
{

}
```
