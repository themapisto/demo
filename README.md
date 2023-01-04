# demo 어플리케이션
- Rest api 호출
  -  Eureka Server를 호출하여 Client 정보들을 받을수 있는 api
  -  Gateway와 연결되어 호출 가능
  -  쿠버네티스와 연동하여 client.taskoo.net 도메인의 인그레스 도메인으로 연결됨
  
### Spring Eureka 서버와의 연결
- Eurkea server url : "eureka.taskoo.net"
- service31 (name) url : "client.taskoo.net"


### Jenkins cicd 적용 
- URL 접속 시 : jenkins.taskoo.net:8080
- CLI 접속 시 : sudo ssh -i /home/ubuntu/koo-eks.pem ubuntu@3.128.254.203



