# demo 어플리케이션
```

1. 접속시 endpoint : localhost:8012 / client.taskoo.net
2. API 호출 시 localhost:8012/client
3. Gateway 호출 시 localhost:9001/client

```

- Rest api 호출
  -  Eureka Server를 호출하여 Client 정보들을 받을수 있는 api
  -  Gateway와 연결되어 호출 가능
  -  쿠버네티스와 연동하여 client.taskoo.net 도메인의 인그레스 도메인으로 연결됨


### Jenkins cicd 적용 
- URL 접속 시 : jenkins.taskoo.net:8080
- CLI 접속 시 : sudo ssh -i /home/ubuntu/koo-eks.pem ubuntu@3.128.254.203


```
insert
    into
        member
        (id, age, ex1, ex2, ex3, ex4, ex5, ex6, meber_desc, name)
    values
        (default, 30, 'bent over lateral raise', 'side lateral raise', 'machine shoulder press', 'dumbell shoulder press', 'smith machine babel press', 'rear delt machine', 20, 'KOO'),
        (default, 30, 'incline dumbell press', 'bench press', 'machine incline bench press', 'one arm pull down', 'smith machine babel row', 'push down', 20, 'KOO'),
        (default, 30, 'seated row', 'Cable push down ', 'babel row', 'Lat pull down', 'one arm pull down', 'babel curl', 20, 'KOO'),
        (default, 30, 'Leg extension', 'Leg press', 'Squat', 'Squat Machine', 'Leg raise', 'Heap thrust', 20, 'KOO'),
        (default, 30, 'bent over lateral raise', 'side lateral raise', 'machine shoulder press', 'dumbell shoulder press', 'smith machine babel press', 'rear delt machine', 20, 'KOO'),
        (default, 30, 'incline dumbell press', 'bench press', 'machine incline bench press', 'one arm pull down', 'smith machine babel row', 'push down', 20, 'KOO'),
        (default, 30, 'seated row', 'Cable push down ', 'babel row', 'Lat pull down', 'one arm pull down', 'babel curl', 20, 'KOO'),
        (default, 30, 'Leg extension', 'Leg press', 'Squat', 'Squat Machine', 'Leg raise', 'Heap thrust', 20, 'KOO')            
```