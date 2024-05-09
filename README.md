# Spring Security Sandbox

- initialized with [Spring Initializr](https://start.spring.io)
- Gradle - Kotlin, Java, Spring Boot 3.2.5, Jar packaging, Java 17
- Modules : Web, Security, Thymeleaf

*프로젝트의 목표*

- WWW-Authenticate 동작 방식 확인
- XHR 방식의 요청이 아닌 브라우저상 링크 이동시 AuthType : Basic, Digest Authorization Header 가 자동으로 지원되는 것을 확인하고 Bearer Header 가 자동 지원되는지 확인
- Bearer 는 자동지원되지 않고 Basic, Digest 가 자동지원된다면 JWT 토큰을 Digest 타입으로 태우면 브라우저의 자동 지원 혜택을 받을 수 있는지 확인

## 1. Authorization - Basic

## 2. Authorization - Digest

## 3. Authorization - Bearer,JWT

## 4. Authorization - Digeest,JWT