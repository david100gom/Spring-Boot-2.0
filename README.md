# Learning Spring Boot 2.0 - Second Edition

* 여기는 Learning Spring Boot 2.0 - Second Edition 한국어판 소스 리포지토리입니다. 원본 소스는 [Learning Spring Boot 2.0 - Second Edition](https://www.packtpub.com/application-development/learning-spring-boot-20-second-edition?utm_source=github&utm_medium=repository&utm_campaign=9781786463784) 또는 저자 [github](https://github.com/PacktPublishing/Learning-Spring-Boot-2.0-Second-Edition)에서 그리고,
최신 부트버전이 적용된 소스는 서적 [github](https://github.com/learning-spring-boot/learning-spring-boot-2nd-edition-code)에서 확인하실수 있습니다.

## 필요사양 및 프로그램

* Spring Boot 2.0 requires Java Developer Kit (JDK) 8 or higher

* A modern IDE (IntelliJ IDEA or Spring Tool Suite) is recommended - Intellij IDEA 추천

* RabbitMQ 3.6 or higher must be installed (check out https://www.rabbitmq.com/download.html, or, when using Mac Homebrew, brew install RabbitMQ)

* MongoDB 3.0 or higher must be installed (check out https://www.mongodb.com/download-center, or, when using Mac Homebrew, brew install MongoDB)

## 참고서적

* [Spring 5.0 Cookbook](https://www.packtpub.com/application-development/spring-50-cookbook?utm_source=github&utm_medium=repository&utm_campaign=9781787128316)

* [Spring 5.0 Microservices - Second Edition](https://www.packtpub.com/application-development/spring-50-microservices-second-edition?utm_source=github&utm_medium=repository&utm_campaign=9781787127685)

* [Mastering Spring 5.0](https://www.packtpub.com/application-development/mastering-spring-50?utm_source=github&utm_medium=repository&utm_campaign=9781787123175)


## 참고사항 

* 소스를 구동시키기 전에 IDE 에 Lombok Annotations 이 제대로 작동하도록 설정이 필요합니다.

* RabbitMQ 와 MongoDB 는 설치 후 구동이 되어 있어야 소스 실행시 에러가 발생하지 않습니다.

* 4장 chromedriver 는 실행권한이 있어야 구동이 됩니다.

* 5장 devtool + liveload 설정이 안되시는 분들은 구글에서 intellij devtool 로 검색하시면 관련 자료가 많이 나와 있으니 참고해 주세요.

* 5장 spring remote 참고

  https://intellij-support.jetbrains.com/hc/en-us/community/posts/206564169-Spring-Boot-DevTools-Remote-Debugging-not-Working
    
* 9장의 http://localhost:8080/application/trace 의 데이터가 안보이시는 분들은 8장 part3을 구동하신후 http://localhost:8080/actuator/httptrace 에 접속하세요.

* 8/9/10장의 각 애플리케이션은 구동시 github repo (config-server 에 설정된) 에서 yml 정보를 로딩하기 때문에 config-server 를 먼저 구동해야 합니다. 