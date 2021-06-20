# 리엑티브 프로그래밍
- 챕터 별 블로그 정리 내용 링크로 연결  
  
### 리엑티브 프로그래밍이란  [(설명 보기)](https://jade314.tistory.com/entry/%EB%A6%AC%EC%97%91%ED%8B%B0%EB%B8%8C-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8DReactive-programming)  
- 데이터 흐름 - pull 방식 vs push 방식
- 함수형(선언형) 프로그래밍 vs 명령형(절차형) 프로그래밍
- 마블 다이어그램  
  
  
### 리엑티브 스트림즈  [(설명 보기)](https://jade314.tistory.com/entry/%EB%A6%AC%EC%97%91%ED%8B%B0%EB%B8%8CReactive-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D-%EA%B8%B0%EB%B3%B8-%EA%B5%AC%EC%84%B1-%EC%9A%94%EC%86%8C)  
- Publisher, Subscriber, Subscription, Processor 4개 인터페이스
- Publisher와 Subscriber간의 프로세스 흐름  



### 함수형 프로그래밍  - Lambda, Functional interface, Method reference  [(설명 보기)](https://jade314.tistory.com/entry/%ED%95%A8%EC%88%98%ED%98%95-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8Dlambda-functional-interface-method-reference)  
- 함수형 인터페이스
- 익명 클래스
- 람다 표현식
- 메서드 레퍼런스

  
# 리엑티브 생산자 
  
### [리엑티브 생산자 1] - Cold Publisher vs Hot Publisher [(설명 보기)](https://jade314.tistory.com/entry/%EB%A6%AC%EC%97%91%ED%8B%B0%EB%B8%8C-%EC%83%9D%EC%82%B0%EC%9E%90Publisher-Cold-Publisher-Hot-Publisher)  
- Cold Publisher : 구독 할때마다 데이터 처음부터 새로 통지 
- Hot Publisher : 구독 시점부터 데이터 통지 (데이터는 한번만 통지됨)  
  
  
### [리엑티브 생산자 2] - Flowable & Observable (feat. 배압전략)  [(설명 보기)](https://jade314.tistory.com/entry/%EB%A6%AC%EC%97%91%ED%8B%B0%EB%B8%8C-%EC%83%9D%EC%82%B0%EC%9E%90-Publisher-2-Flowable-Observable-feat-%EB%B0%B0%EC%95%95%EC%A0%84%EB%9E%B5)  
- Flowable 생산자 vs Observable 생산자 특징 비교
- 배압전략 : MISSING 전략 / ERROR 전략 / BUFFER 전략 : DROP_LATEST / BUFFER 전략 : DROP_OLDEST / DROP 전략/ LATEST 전략
- Flowable, Observable 각각 데이터 통지/구독/처리 과정 보기  
  
  
### [리엑티브 생산자 3] - Single & Maybe & Completable  [(설명 보기)](https://jade314.tistory.com/entry/%EB%A6%AC%EC%97%91%ED%8B%B0%EB%B8%8C-%EC%83%9D%EC%82%B0%EC%9E%90-Publisher-3-Single-Maybe-Completable)  
- Single 
- Maybe
- Completable
  
  

  
  
# 리엑티브 연산자
   
### [리엑티브 연산자 1] - 생성, 필터링, 변환, 결합  [(설명 보기)](https://jade314.tistory.com/entry/%EB%A6%AC%EC%95%A1%ED%8B%B0%EB%B8%8C-%EC%97%B0%EC%82%B0%EC%82%ACReactive-Operator-%EC%86%8C%EA%B0%9C)  
  - **생성**: create(), interval(), range(), timer(), defer(), fromIterable(), fromFuture() 
  - **필터링**: filter(), distinct(), take(), takeUtil(), skip() 
  - **변환**: map(), flatMap(), concatMap(), switchMap()
  - **결합**: merge(), concat(), zip(), combineLatest()


### [리엑티브 연산자 2] - 에러, 유틸, 조건, 통지  [(설명 보기)](https://jade314.tistory.com/entry/%EB%A6%AC%EC%95%A1%ED%8B%B0%EB%B8%8C-%EC%97%B0%EC%82%B0%EC%9E%90-Operator-2-%EC%97%90%EB%9F%AC-%EC%9C%A0%ED%8B%B8-%EC%A1%B0%EA%B1%B4-%ED%86%B5%EC%A7%80)  
  - **에러**: onErrorReturn(),  onErrorResumeNext(),  retry() 
  - **유틸**: delay(),  delaySubscription(),  timeOut(),  timeInterval(),  materialize() / dematerialize()
  - **조건**: all(), amb(), contains(), defaultIfEmpty(), sequenceEqual() 
  - **통지**: count(), reduce() 


  
  
### Processor와 Subject


### 스케줄러(Scheduler)


### Rxjava 코드 디버깅


### RxJava에서 테스트 기본


### RxJava에서 테스트 assert 함수


