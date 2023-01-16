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


{
"id": 1,
"username": "KOO",
"exercise1": "bent over lateral raise",
"exercise2": "side lateral raise",
"exercise3": "dumbell press",
"exercise4": "smith machine babel press",
"exercise5": "push down triceps",
"exercise6": "babel curl",
"meberDesc": 20,
"age": 30
}

{
"id": 2,
"username": "KOO",
"exercise1": "incline dumbell press",
"exercise2": "bench press",
"exercise3": "machine incline bench press",
"exercise4": "One arm pull down",
"exercise5": "smith machine babell row",
"exercise6": "push down",
"meberDesc": 20,
"age": 30
}



{
"id": 3,
"username": "KOO",
"exercise1": "lat pull down",
"exercise2": "seated row",
"exercise3": "babel row",
"exercise4": "push down lat",
"exercise5": "hammer curl" ,
"exercise6": "babel curl",
"meberDesc": 20,
"age": 30
}

{
"id": 4,
"username": "KOO",
"exercise1": "Leg extension",
"exercise2": "Leg press",
"exercise3": "SQUAT",
"exercise4": "SQUAT Machine",
"exercise5": "Steep Deadlift" ,
"exercise6": "Leg raise",
"meberDesc": 20,
"age": 30
}