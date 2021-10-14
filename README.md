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
