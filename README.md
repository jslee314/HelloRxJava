# RxJava 연습용
- 챕터 별 블로그 정리 내용 링크로 연결



### 리엑티브 프로그래밍이란  [(설명 보기)](https://jade314.tistory.com/entry/%EB%A6%AC%EC%97%91%ED%8B%B0%EB%B8%8C-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8DReactive-programming)  
- 데이터 흐름 - pull 방식 vs push 방식
- 함수형(선언형) 프로그래밍 vs 명령형(절차형) 프로그래밍
- 마블 다이어그램

리엑티브 스트림즈  [(설명 보기)](https://jade314.tistory.com/entry/%EB%A6%AC%EC%97%91%ED%8B%B0%EB%B8%8CReactive-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D-%EA%B8%B0%EB%B3%B8-%EA%B5%AC%EC%84%B1-%EC%9A%94%EC%86%8C)  
- Publisher, Subscriber, Subscription, Processor 4개 인터페이스
- Publisher와 Subscriber간의 프로세스 흐름

리엑티브 생산자 1 - Cold Publisher vs Hot Publisher [(설명 보기)](https://jade314.tistory.com/entry/%EB%A6%AC%EC%97%91%ED%8B%B0%EB%B8%8C-%EC%83%9D%EC%82%B0%EC%9E%90Publisher-Cold-Publisher-Hot-Publisher)  

리엑티브 생산자 2 - Flowable & Observable (feat. 배압전략)  [(설명 보기)]()  

리엑티브 생산자 3 - Single & Maybe & Completable  [(설명 보기)]()  



함수형 프로그래밍  - Lambda, Functional interface, Method reference  [(설명 보기)]()  


 
리엑티브 연산자 1 - 생성, 필터링, 변환, 결합  [(설명 보기)]()  
  - 생성: 
  - 필터링: 
  - 변환: 
  - 결합:   


리엑티브 연상자 2 - 에러, 유틸, 조건, 통지  [(설명 보기)]()  
  - 에러: onErrorReturn(),  onErrorResumeNext(),  retry() 
  - 유틸: delay(),  delaySubscription(),  timeOut(),  timeInterval(),  materialize() / dematerialize()
  - 조건: all(), amb(), contains(), defaultIfEmpty(), sequenceEqual() 
  - 통지: count(), reduce() 



