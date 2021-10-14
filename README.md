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

https://hub.docker.com/r/oskarskalski/soleproprietorship

If there's problem with hyper-v, it is nessecery to turn it off in BIOS system. 
After choosing first or second way, now you can send http requests to this application.

## Sending request to the application

After choosing first or second way, now you can send http requests to this application.

### POST Requests

If we want to add revenue amount to this application, we have to send request with POST method on this url:

``` http://localhost:8080/api/revenue/add/{revenueAmount} ```

Where {revenueAmount} is a parameter which value has to be greater or equals 0

### GET Requests

If we want to get every information that are in the DB, we have to send request with GET method on this url:

``` http://localhost:8080/api/revenue/all ```

Result:

```yml
[
    {
        "revenueGrossAmount": 0.0,
        "revenueNetAmount": -1380.18,
        "zusAmount": 1380.18,
        "taxPercent": 0.19,
        "taxAmount": 0.0,
        "date": "2021-10-14 15:11:16"
    },
    {
        "revenueGrossAmount": 11111.0,
        "revenueNetAmount": 7619.73,
        "zusAmount": 1380.18,
        "taxPercent": 0.19,
        "taxAmount": 2111.09,
        "date": "2021-10-14 15:11:19"
    },
    {
        "revenueGrossAmount": 22222.0,
        "revenueNetAmount": 16619.64,
        "zusAmount": 1380.18,
        "taxPercent": 0.19,
        "taxAmount": 4222.18,
        "date": "2021-10-14 15:11:21"
    },
    {
        "revenueGrossAmount": 33333.0,
        "revenueNetAmount": 25619.55,
        "zusAmount": 1380.18,
        "taxPercent": 0.19,
        "taxAmount": 6333.27,
        "date": "2021-10-14 15:11:23"
    },
    {
        "revenueGrossAmount": 4444.0,
        "revenueNetAmount": 2219.46,
        "zusAmount": 1380.18,
        "taxPercent": 0.19,
        "taxAmount": 844.36,
        "date": "2021-10-14 15:11:25"
    },
    {
        "revenueGrossAmount": 555.0,
        "revenueNetAmount": -930.63,
        "zusAmount": 1380.18,
        "taxPercent": 0.19,
        "taxAmount": 105.45,
        "date": "2021-10-14 15:11:27"
    },
    {
        "revenueGrossAmount": 666666.0,
        "revenueNetAmount": 538619.28,
        "zusAmount": 1380.18,
        "taxPercent": 0.19,
        "taxAmount": 126666.54000000001,
        "date": "2021-10-14 15:11:29"
    },
    {
        "revenueGrossAmount": 77777.0,
        "revenueNetAmount": 61619.19,
        "zusAmount": 1380.18,
        "taxPercent": 0.19,
        "taxAmount": 14777.630000000001,
        "date": "2021-10-14 15:11:31"
    },
    {
        "revenueGrossAmount": 88888.0,
        "revenueNetAmount": 70619.1,
        "zusAmount": 1380.18,
        "taxPercent": 0.19,
        "taxAmount": 16888.72,
        "date": "2021-10-14 15:11:33"
    },
    {
        "revenueGrossAmount": 99999.0,
        "revenueNetAmount": 79619.01,
        "zusAmount": 1380.18,
        "taxPercent": 0.19,
        "taxAmount": 18999.81,
        "date": "2021-10-14 15:11:35"
    }
]
```

Also there's another endpoint which on we can get data from start or end of the DB. We just have to send request with GET method on this url:

``` http://localhost:8080/api/revenue/range/{rangeValue}/{orderValue} ```

{rangeValue} is a parameter that is require to get number of data that is nessecary to return from the application. 

{orderValue} is a parameter that is require to get data from the start or end of the DB. Only values like "asc" and "desc" can be there

Url example with result:

``` http://localhost:8080/api/revenue/range/5/desc ```

```yml
{
[
    {
        "revenueGrossAmount": 0.0,
        "revenueNetAmount": -1380.18,
        "zusAmount": 1380.18,
        "taxPercent": 0.19,
        "taxAmount": 0.0,
        "date": "2021-10-14 15:11:16"
    },
    {
        "revenueGrossAmount": 11111.0,
        "revenueNetAmount": 7619.73,
        "zusAmount": 1380.18,
        "taxPercent": 0.19,
        "taxAmount": 2111.09,
        "date": "2021-10-14 15:11:19"
    },
    {
        "revenueGrossAmount": 22222.0,
        "revenueNetAmount": 16619.64,
        "zusAmount": 1380.18,
        "taxPercent": 0.19,
        "taxAmount": 4222.18,
        "date": "2021-10-14 15:11:21"
    },
    {
        "revenueGrossAmount": 33333.0,
        "revenueNetAmount": 25619.55,
        "zusAmount": 1380.18,
        "taxPercent": 0.19,
        "taxAmount": 6333.27,
        "date": "2021-10-14 15:11:23"
    },
    {
        "revenueGrossAmount": 4444.0,
        "revenueNetAmount": 2219.46,
        "zusAmount": 1380.18,
        "taxPercent": 0.19,
        "taxAmount": 844.36,
        "date": "2021-10-14 15:11:25"
    }
]
}
```


Url example with result:

``` http://localhost:8080/api/revenue/range/5/asc ```


```yml

[
    {
        "revenueGrossAmount": 555.0,
        "revenueNetAmount": -930.63,
        "zusAmount": 1380.18,
        "taxPercent": 0.19,
        "taxAmount": 105.45,
        "date": "2021-10-14 15:11:27"
    },
    {
        "revenueGrossAmount": 666666.0,
        "revenueNetAmount": 538619.28,
        "zusAmount": 1380.18,
        "taxPercent": 0.19,
        "taxAmount": 126666.54000000001,
        "date": "2021-10-14 15:11:29"
    },
    {
        "revenueGrossAmount": 77777.0,
        "revenueNetAmount": 61619.19,
        "zusAmount": 1380.18,
        "taxPercent": 0.19,
        "taxAmount": 14777.630000000001,
        "date": "2021-10-14 15:11:31"
    },
    {
        "revenueGrossAmount": 88888.0,
        "revenueNetAmount": 70619.1,
        "zusAmount": 1380.18,
        "taxPercent": 0.19,
        "taxAmount": 16888.72,
        "date": "2021-10-14 15:11:33"
    },
    {
        "revenueGrossAmount": 99999.0,
        "revenueNetAmount": 79619.01,
        "zusAmount": 1380.18,
        "taxPercent": 0.19,
        "taxAmount": 18999.81,
        "date": "2021-10-14 15:11:35"
    }
]

```
