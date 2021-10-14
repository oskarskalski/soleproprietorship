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

Example returned data:

```yml
[
    {
        "revenueGrossAmount": 111111.0,
        "revenueNetAmount": 88619.73,
        "zusAmount": 1380.18,
        "taxPercent": 0.19,
        "taxAmount": 21111.09,
        "date": "2021-10-14 14:52:33"
    },
    {
        "revenueGrossAmount": 222222.0,
        "revenueNetAmount": 178619.64,
        "zusAmount": 1380.18,
        "taxPercent": 0.19,
        "taxAmount": 42222.18,
        "date": "2021-10-14 14:52:38"
    },
    {
        "revenueGrossAmount": 3333333.0,
        "revenueNetAmount": 2698619.55,
        "zusAmount": 1380.18,
        "taxPercent": 0.19,
        "taxAmount": 633333.27,
        "date": "2021-10-14 14:52:42"
    },
    {
        "revenueGrossAmount": 4444444.0,
        "revenueNetAmount": 3598619.46,
        "zusAmount": 1380.18,
        "taxPercent": 0.19,
        "taxAmount": 844444.36,
        "date": "2021-10-14 14:52:46"
    },
    {
        "revenueGrossAmount": 5555555.0,
        "revenueNetAmount": 4498619.37,
        "zusAmount": 1380.18,
        "taxPercent": 0.19,
        "taxAmount": 1055555.45,
        "date": "2021-10-14 14:52:50"
    },
    {
        "revenueGrossAmount": 666666.0,
        "revenueNetAmount": 538619.28,
        "zusAmount": 1380.18,
        "taxPercent": 0.19,
        "taxAmount": 126666.54000000001,
        "date": "2021-10-14 14:52:53"
    },
    {
        "revenueGrossAmount": 7777777.0,
        "revenueNetAmount": 6298619.19,
        "zusAmount": 1380.18,
        "taxPercent": 0.19,
        "taxAmount": 1477777.6300000001,
        "date": "2021-10-14 14:52:56"
    },
]

```

Also there's another endpoint which on we can get data from start or end of the DB. We just have to send request with GET method on this url:

``` http://localhost:8080/api/revenue/range/{rangeValue}/{orderValue} ```

{rangeValue} is a parameter that is require to get number of data that is nessecary to return from the application. 
{orderValue} is a parameter that is require to get data from the start or end of the DB. It only has ASC and DESC values
Url example with result:

``` http://localhost:8080/api/revenue/range/5/asc ```

```yml

[
    {
        "revenueGrossAmount": 666666.0,
        "revenueNetAmount": 538619.28,
        "zusAmount": 1380.18,
        "taxPercent": 0.19,
        "taxAmount": 126666.54000000001,
        "date": "2021-10-14 14:52:53"
    },
    {
        "revenueGrossAmount": 7777777.0,
        "revenueNetAmount": 6298619.19,
        "zusAmount": 1380.18,
        "taxPercent": 0.19,
        "taxAmount": 1477777.6300000001,
        "date": "2021-10-14 14:52:56"
    }
    {
        "revenueGrossAmount": 8888.0,
        "revenueNetAmount": 5819.1,
        "zusAmount": 1380.18,
        "taxPercent": 0.19,
        "taxAmount": 1688.72,
        "date": "2021-10-14 15:04:59"
    },
    {
        "revenueGrossAmount": 9999999.0,
        "revenueNetAmount": 8098619.01,
        "zusAmount": 1380.18,
        "taxPercent": 0.19,
        "taxAmount": 1899999.81,
        "date": "2021-10-14 15:05:03"
    },
    {
        "revenueGrossAmount": 9999.0,
        "revenueNetAmount": 6719.01,
        "zusAmount": 1380.18,
        "taxPercent": 0.19,
        "taxAmount": 1899.81,
        "date": "2021-10-14 15:05:06"
    }
]

```

``` http://localhost:8080/api/revenue/range/5/desc ```

Result:

```yml
[
    {
        "revenueGrossAmount": 111111.0,
        "revenueNetAmount": 88619.73,
        "zusAmount": 1380.18,
        "taxPercent": 0.19,
        "taxAmount": 21111.09,
        "date": "2021-10-14 14:52:33"
    },
    {
        "revenueGrossAmount": 222222.0,
        "revenueNetAmount": 178619.64,
        "zusAmount": 1380.18,
        "taxPercent": 0.19,
        "taxAmount": 42222.18,
        "date": "2021-10-14 14:52:38"
    },
    {
        "revenueGrossAmount": 3333333.0,
        "revenueNetAmount": 2698619.55,
        "zusAmount": 1380.18,
        "taxPercent": 0.19,
        "taxAmount": 633333.27,
        "date": "2021-10-14 14:52:42"
    },
    {
        "revenueGrossAmount": 4444444.0,
        "revenueNetAmount": 3598619.46,
        "zusAmount": 1380.18,
        "taxPercent": 0.19,
        "taxAmount": 844444.36,
        "date": "2021-10-14 14:52:46"
    },
    {
        "revenueGrossAmount": 5555555.0,
        "revenueNetAmount": 4498619.37,
        "zusAmount": 1380.18,
        "taxPercent": 0.19,
        "taxAmount": 1055555.45,
        "date": "2021-10-14 14:52:50"
    }
]

```
