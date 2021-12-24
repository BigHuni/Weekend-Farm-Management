# 🌻주말농장 관리 DB 설계

- 주말농장 이용에 관한 시민, 작물, 환경, 배송 데이터를 보관하는 관리 업무를 고려
## 🔸 목적
- 시민들에게 주말농장 관리에 대한 정보를 제공받을 수 있도록 농장 관리업무에 효율성과 성능 향상을 도모하기 위함
- 데이터베이스 시스템을 사용하여 파일 시스템이 가지는 관리 측면의 단점을 극복하기 위함
- 농장 관리 업무 처리에 편리하고 효율적인 환경을 제공하고자 함
<br>

## 🔸 필수 요소
- 시민(Citizen)
  - 농장 관리 서비스를 이용할 시민이 존재한다. 


- 작물(Crop)
  - 관리할 작물이 존재한다.


- 환경(Environment)
  - 작물에 관련된 정보를 제공할 환경이 존재한다. 


- 배송(Delivery)
  - 작물을 제공받을 장소가 존재한다.


<br>

## 🔸 사용자 요구사항 명세
- 시민(Citizen)
  - 시민에게 아이디(ID)를 부여하여 식별
  - 서비스를 제공받을 거주지(District) 선정


- 작물(Crop)
  - 작물의 이름(Name) 정보 제공
  - 작물의 기한(Expiration) 서비스 제공
  - 작물의 과일, 채소 분류(Division) 정보 제공


- 환경(Environment)
  - 작물의 이름(Name) 정보 제공
  - 작물의 최적 온도(Temperature) 정보 제공
  - 작물의 최적 습도(Humidity) 정보 제공


- 배송(Delivery)
  - 작물을 이름(Name) 정보 제공
  - 작물의 기한(Expiration) 서비스 제공
  - 배송할 거주지(District) 선정


<br>

## 🔸 ERD 설계
![erd](https://user-images.githubusercontent.com/79084294/147271050-8028eade-4953-4006-97b8-e0919e595be0.PNG)
<br>

## 🔸 DB 내 최종 데이터 확인
<img width="540" alt="db1" src="https://user-images.githubusercontent.com/79084294/147271316-3a2b9b40-ac30-4358-aeb0-28589f5b5353.png">

<img width="540" alt="db2" src="https://user-images.githubusercontent.com/79084294/147271389-b134d570-6aca-43d2-ae7b-af7c30a29f82.png">
<br>

## 🔸 비즈니스 로직 SQL 작성 (10문)
- 1. 주말 농장에서 이용하는 채소 작물 이름을 조회
  <img width="245" alt="로직1" src="https://user-images.githubusercontent.com/79084294/147303967-7dd27c6e-aaee-4420-9894-01bbb3d19495.png">

- 2. 주말 농장에서 이용하는 과일 작물 이름을 조회
  <img width="245" alt="로직2" src="https://user-images.githubusercontent.com/79084294/147271777-65904618-e3bb-4173-bae6-c391eabfebd6.png">

- 3. 거주지가 도계읍으로 등록된 사람들의 ID를 조회
  <img width="245" alt="로직3" src="https://user-images.githubusercontent.com/79084294/147271886-1ba0cf00-ab4c-425c-84ee-385b783ea659.png">

- 4. 거주지가 마달동으로 등록된 사람들의 ID를 조회
  <img width="245" alt="로직4" src="https://user-images.githubusercontent.com/79084294/147271998-c395c933-3626-499f-b7fe-2b6b24cd7acb.png">

- 5. 작물 생육 온도가 15℃ 이상인 작물의 이름을 조회
  <img width="245" alt="로직5" src="https://user-images.githubusercontent.com/79084294/147272330-5194614b-0ae1-4b61-ac96-68970ea60f97.png">

- 6. 작물 생육 습도가 75% 미만인 작물의 이름을 조회
  <img width="245" alt="로직6" src="https://user-images.githubusercontent.com/79084294/147272349-db19ae3a-fd96-4ce1-8a7e-90c66f47ebea.png">

- 7. 채소 혹은 과일을 재배하는지 알기 위해 회원(ID)별 Division을 조회 [테이블 JOIN]
  <img width="275" alt="로직7" src="https://user-images.githubusercontent.com/79084294/147272365-a832dd76-2817-4dd1-b85d-e52655866805.png">

- 8. 회원(ID)별 생육하는 작물 이름을 조회 [테이블 JOIN]
  <img width="275" alt="로직8" src="https://user-images.githubusercontent.com/79084294/147272386-b7bb58d7-5c2e-4ab6-be22-f24e7ee4725e.png">

- 9. 회원(ID)별 생육하는 작물 이름을 알파벳 오름차순 정렬 [테이블 JOIN]
  <img width="275" alt="로직9" src="https://user-images.githubusercontent.com/79084294/147272400-33e94392-811c-438b-935e-c807d2a35c2c.png">

- 10. 회원(ID)별 생육하는 작물 이름을 알파벳 내림차순 정렬 [테이블 JOIN]
  <img width="275" alt="로직10" src="https://user-images.githubusercontent.com/79084294/147272412-bba724c2-9645-4074-8496-5a9997d64671.png">
<br>


## 🔸 JDBC Handler&Mnt 구현 파일 구성
- FarmManagement Project
  - Citizen.java : Citizen 테이블 정보(id, district)
  - Crop.java : Crop 테이블 정보(name, expiration, division)
  - Environmnet.java : Environment 테이블 정보(name, temperature, humidity)
  - Delivery.java : Delivery 테이블 정보(id, expiration, district)
  - FarmHandler.java : 객체들 간 정보를 입력하기위해 보내거나 받아 처리하는 객체(Object)
  - FarmMnt.java : Handler를 토대로 필요한 정보를 불러오고, 사용자(User)에게 출력(Print)
<br>

## 🔸 비즈니스 로직별 Handler&Mnt 구현 파일 구성
- FarmManagement Project
  - Vegetable.java : 비즈니스 로직 1문
  - Fruit.java : 비즈니스 로직 2문
  - Dogye.java : 비즈니스 로직 3문
  - Madal.java : 비즈니스 로직 4문
  - Temperature.java : 비즈니스 로직 5문
  - Humidity.java : 비즈니스 로직 6문
  - Division.java : 비즈니스 로직 7문
  - IdName.java : 비즈니스 로직 8문
  - IdNameA.java : 비즈니스 로직 9문
  - IdNameD.java : 비즈니스 로직 10문
<br>

## 🔸 JSP&JSTL 구현 파일 구성
  - selectallcitizen.jsp : Citizen 테이블 
  - selectallcrop.jsp : Crop 테이블
  - selectallenvironment.jsp : Environment 테이블
  - selectalldelivery.jsp : Delivery 테이블

<br>

  - selectallvegetable.jsp : 비즈니스 로직 1문
  - selectallfruit.jsp : 비즈니스 로직 2문
  - selectalldogye.jsp : 비즈니스 로직 3문
  - selectallmadal.jsp : 비즈니스 로직 4문
  - selectalltemperature.jsp : 비즈니스 로직 5문
  - selectallhumidity.jsp : 비즈니스 로직 6문
  - selectalldivision.jsp : 비즈니스 로직 7문
  - selectallidname.jsp : 비즈니스 로직 8문
  - selectallidnamea.jsp : 비즈니스 로직 9문
  - selectallidnamed.jsp : 비즈니스 로직 10문

<br>

## 🔸 JSP&JSTL 결과 예시
- 테이블(Citizen) 정보 JSP 
![1테이블](https://user-images.githubusercontent.com/79084294/147273470-60de1d70-346e-4f62-a075-3fd769b1b31d.png)


<br>

- 비즈니스 로직(1문) JSP 
![비즈1](https://user-images.githubusercontent.com/79084294/147274063-cb4d3399-298f-47b1-b073-5bef8e2e5640.png)

<br>

- 테이블(Citizen) 데이터 관리 JSTL (New) 
![jstl new](https://user-images.githubusercontent.com/79084294/147274620-183b94a2-e140-45f8-9126-b1cb1b700e64.png)

<br>

- 테이블(Citizen) 데이터 관리 JSTL (List) 
![jstl list](https://user-images.githubusercontent.com/79084294/147274665-9ca1bc8c-7f7a-45e6-9cd3-5a3bcc79570e.png)
