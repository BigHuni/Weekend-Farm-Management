# ๐ป์ฃผ๋ง๋์ฅ ๊ด๋ฆฌ DB ์ค๊ณ

- ์ฃผ๋ง๋์ฅ ์ด์ฉ์ ๊ดํ ์๋ฏผ, ์๋ฌผ, ํ๊ฒฝ, ๋ฐฐ์ก ๋ฐ์ดํฐ๋ฅผ ๋ณด๊ดํ๋ ๊ด๋ฆฌ ์๋ฌด๋ฅผ ๊ณ ๋ ค
## ๐ธ ๋ชฉ์ 
- ์๋ฏผ๋ค์๊ฒ ์ฃผ๋ง๋์ฅ ๊ด๋ฆฌ์ ๋ํ ์ ๋ณด๋ฅผ ์ ๊ณต๋ฐ์ ์ ์๋๋ก ๋์ฅ ๊ด๋ฆฌ์๋ฌด์ ํจ์จ์ฑ๊ณผ ์ฑ๋ฅ ํฅ์์ ๋๋ชจํ๊ธฐ ์ํจ
- ๋ฐ์ดํฐ๋ฒ ์ด์ค ์์คํ์ ์ฌ์ฉํ์ฌ ํ์ผ ์์คํ์ด ๊ฐ์ง๋ ๊ด๋ฆฌ ์ธก๋ฉด์ ๋จ์ ์ ๊ทน๋ณตํ๊ธฐ ์ํจ
- ๋์ฅ ๊ด๋ฆฌ ์๋ฌด ์ฒ๋ฆฌ์ ํธ๋ฆฌํ๊ณ  ํจ์จ์ ์ธ ํ๊ฒฝ์ ์ ๊ณตํ๊ณ ์ ํจ
<br>

## ๐ธ ํ์ ์์
- ์๋ฏผ(Citizen)
  - ๋์ฅ ๊ด๋ฆฌ ์๋น์ค๋ฅผ ์ด์ฉํ  ์๋ฏผ์ด ์กด์ฌํ๋ค. 


- ์๋ฌผ(Crop)
  - ๊ด๋ฆฌํ  ์๋ฌผ์ด ์กด์ฌํ๋ค.


- ํ๊ฒฝ(Environment)
  - ์๋ฌผ์ ๊ด๋ จ๋ ์ ๋ณด๋ฅผ ์ ๊ณตํ  ํ๊ฒฝ์ด ์กด์ฌํ๋ค. 


- ๋ฐฐ์ก(Delivery)
  - ์๋ฌผ์ ์ ๊ณต๋ฐ์ ์ฅ์๊ฐ ์กด์ฌํ๋ค.


<br>

## ๐ธ ์ฌ์ฉ์ ์๊ตฌ์ฌํญ ๋ช์ธ
- ์๋ฏผ(Citizen)
  - ์๋ฏผ์๊ฒ ์์ด๋(ID)๋ฅผ ๋ถ์ฌํ์ฌ ์๋ณ
  - ์๋น์ค๋ฅผ ์ ๊ณต๋ฐ์ ๊ฑฐ์ฃผ์ง(District) ์ ์ 


- ์๋ฌผ(Crop)
  - ์๋ฌผ์ ์ด๋ฆ(Name) ์ ๋ณด ์ ๊ณต
  - ์๋ฌผ์ ๊ธฐํ(Expiration) ์๋น์ค ์ ๊ณต
  - ์๋ฌผ์ ๊ณผ์ผ, ์ฑ์ ๋ถ๋ฅ(Division) ์ ๋ณด ์ ๊ณต


- ํ๊ฒฝ(Environment)
  - ์๋ฌผ์ ์ด๋ฆ(Name) ์ ๋ณด ์ ๊ณต
  - ์๋ฌผ์ ์ต์  ์จ๋(Temperature) ์ ๋ณด ์ ๊ณต
  - ์๋ฌผ์ ์ต์  ์ต๋(Humidity) ์ ๋ณด ์ ๊ณต


- ๋ฐฐ์ก(Delivery)
  - ์๋ฌผ์ ์ด๋ฆ(Name) ์ ๋ณด ์ ๊ณต
  - ์๋ฌผ์ ๊ธฐํ(Expiration) ์๋น์ค ์ ๊ณต
  - ๋ฐฐ์กํ  ๊ฑฐ์ฃผ์ง(District) ์ ์ 


<br>

## ๐ธ ERD ์ค๊ณ
![erd](https://user-images.githubusercontent.com/79084294/147271050-8028eade-4953-4006-97b8-e0919e595be0.PNG)
<br>

## ๐ธ DB ๋ด ์ต์ข ๋ฐ์ดํฐ ํ์ธ
<img width="540" alt="db1" src="https://user-images.githubusercontent.com/79084294/147271316-3a2b9b40-ac30-4358-aeb0-28589f5b5353.png">

<img width="540" alt="db2" src="https://user-images.githubusercontent.com/79084294/147271389-b134d570-6aca-43d2-ae7b-af7c30a29f82.png">
<br>

## ๐ธ ๋น์ฆ๋์ค ๋ก์ง SQL ์์ฑ (10๋ฌธ)
- 1. ์ฃผ๋ง ๋์ฅ์์ ์ด์ฉํ๋ ์ฑ์ ์๋ฌผ ์ด๋ฆ์ ์กฐํ
  <img width="245" alt="๋ก์ง1" src="https://user-images.githubusercontent.com/79084294/147303967-7dd27c6e-aaee-4420-9894-01bbb3d19495.png">

- 2. ์ฃผ๋ง ๋์ฅ์์ ์ด์ฉํ๋ ๊ณผ์ผ ์๋ฌผ ์ด๋ฆ์ ์กฐํ
  <img width="245" alt="๋ก์ง2" src="https://user-images.githubusercontent.com/79084294/147271777-65904618-e3bb-4173-bae6-c391eabfebd6.png">

- 3. ๊ฑฐ์ฃผ์ง๊ฐ ๋๊ณ์์ผ๋ก ๋ฑ๋ก๋ ์ฌ๋๋ค์ ID๋ฅผ ์กฐํ
  <img width="245" alt="๋ก์ง3" src="https://user-images.githubusercontent.com/79084294/147271886-1ba0cf00-ab4c-425c-84ee-385b783ea659.png">

- 4. ๊ฑฐ์ฃผ์ง๊ฐ ๋ง๋ฌ๋์ผ๋ก ๋ฑ๋ก๋ ์ฌ๋๋ค์ ID๋ฅผ ์กฐํ
  <img width="245" alt="๋ก์ง4" src="https://user-images.githubusercontent.com/79084294/147271998-c395c933-3626-499f-b7fe-2b6b24cd7acb.png">

- 5. ์๋ฌผ ์์ก ์จ๋๊ฐ 15โ ์ด์์ธ ์๋ฌผ์ ์ด๋ฆ์ ์กฐํ
  <img width="245" alt="๋ก์ง5" src="https://user-images.githubusercontent.com/79084294/147272330-5194614b-0ae1-4b61-ac96-68970ea60f97.png">

- 6. ์๋ฌผ ์์ก ์ต๋๊ฐ 75% ๋ฏธ๋ง์ธ ์๋ฌผ์ ์ด๋ฆ์ ์กฐํ
  <img width="245" alt="๋ก์ง6" src="https://user-images.githubusercontent.com/79084294/147272349-db19ae3a-fd96-4ce1-8a7e-90c66f47ebea.png">

- 7. ์ฑ์ ํน์ ๊ณผ์ผ์ ์ฌ๋ฐฐํ๋์ง ์๊ธฐ ์ํด ํ์(ID)๋ณ Division์ ์กฐํ [ํ์ด๋ธ JOIN]
  <img width="275" alt="๋ก์ง7" src="https://user-images.githubusercontent.com/79084294/147272365-a832dd76-2817-4dd1-b85d-e52655866805.png">

- 8. ํ์(ID)๋ณ ์์กํ๋ ์๋ฌผ ์ด๋ฆ์ ์กฐํ [ํ์ด๋ธ JOIN]
  <img width="275" alt="๋ก์ง8" src="https://user-images.githubusercontent.com/79084294/147272386-b7bb58d7-5c2e-4ab6-be22-f24e7ee4725e.png">

- 9. ํ์(ID)๋ณ ์์กํ๋ ์๋ฌผ ์ด๋ฆ์ ์ํ๋ฒณ ์ค๋ฆ์ฐจ์ ์ ๋ ฌ [ํ์ด๋ธ JOIN]
  <img width="275" alt="๋ก์ง9" src="https://user-images.githubusercontent.com/79084294/147272400-33e94392-811c-438b-935e-c807d2a35c2c.png">

- 10. ํ์(ID)๋ณ ์์กํ๋ ์๋ฌผ ์ด๋ฆ์ ์ํ๋ฒณ ๋ด๋ฆผ์ฐจ์ ์ ๋ ฌ [ํ์ด๋ธ JOIN]
  <img width="275" alt="๋ก์ง10" src="https://user-images.githubusercontent.com/79084294/147272412-bba724c2-9645-4074-8496-5a9997d64671.png">
<br>


## ๐ธ JDBC Handler&Mnt ๊ตฌํ ํ์ผ ๊ตฌ์ฑ
- FarmManagement Project
  - Citizen.java : Citizen ํ์ด๋ธ ์ ๋ณด(id, district)
  - Crop.java : Crop ํ์ด๋ธ ์ ๋ณด(name, expiration, division)
  - Environmnet.java : Environment ํ์ด๋ธ ์ ๋ณด(name, temperature, humidity)
  - Delivery.java : Delivery ํ์ด๋ธ ์ ๋ณด(id, expiration, district)
  - FarmHandler.java : ๊ฐ์ฒด๋ค ๊ฐ ์ ๋ณด๋ฅผ ์๋ ฅํ๊ธฐ์ํด ๋ณด๋ด๊ฑฐ๋ ๋ฐ์ ์ฒ๋ฆฌํ๋ ๊ฐ์ฒด(Object)
  - FarmMnt.java : Handler๋ฅผ ํ ๋๋ก ํ์ํ ์ ๋ณด๋ฅผ ๋ถ๋ฌ์ค๊ณ , ์ฌ์ฉ์(User)์๊ฒ ์ถ๋ ฅ(Print)
<br>

## ๐ธ ๋น์ฆ๋์ค ๋ก์ง๋ณ Handler&Mnt ๊ตฌํ ํ์ผ ๊ตฌ์ฑ
- FarmManagement Project
  - Vegetable.java : ๋น์ฆ๋์ค ๋ก์ง 1๋ฌธ
  - Fruit.java : ๋น์ฆ๋์ค ๋ก์ง 2๋ฌธ
  - Dogye.java : ๋น์ฆ๋์ค ๋ก์ง 3๋ฌธ
  - Madal.java : ๋น์ฆ๋์ค ๋ก์ง 4๋ฌธ
  - Temperature.java : ๋น์ฆ๋์ค ๋ก์ง 5๋ฌธ
  - Humidity.java : ๋น์ฆ๋์ค ๋ก์ง 6๋ฌธ
  - Division.java : ๋น์ฆ๋์ค ๋ก์ง 7๋ฌธ
  - IdName.java : ๋น์ฆ๋์ค ๋ก์ง 8๋ฌธ
  - IdNameA.java : ๋น์ฆ๋์ค ๋ก์ง 9๋ฌธ
  - IdNameD.java : ๋น์ฆ๋์ค ๋ก์ง 10๋ฌธ
<br>

## ๐ธ JSP&JSTL ๊ตฌํ ํ์ผ ๊ตฌ์ฑ
  - selectallcitizen.jsp : Citizen ํ์ด๋ธ 
  - selectallcrop.jsp : Crop ํ์ด๋ธ
  - selectallenvironment.jsp : Environment ํ์ด๋ธ
  - selectalldelivery.jsp : Delivery ํ์ด๋ธ

<br>

  - selectallvegetable.jsp : ๋น์ฆ๋์ค ๋ก์ง 1๋ฌธ
  - selectallfruit.jsp : ๋น์ฆ๋์ค ๋ก์ง 2๋ฌธ
  - selectalldogye.jsp : ๋น์ฆ๋์ค ๋ก์ง 3๋ฌธ
  - selectallmadal.jsp : ๋น์ฆ๋์ค ๋ก์ง 4๋ฌธ
  - selectalltemperature.jsp : ๋น์ฆ๋์ค ๋ก์ง 5๋ฌธ
  - selectallhumidity.jsp : ๋น์ฆ๋์ค ๋ก์ง 6๋ฌธ
  - selectalldivision.jsp : ๋น์ฆ๋์ค ๋ก์ง 7๋ฌธ
  - selectallidname.jsp : ๋น์ฆ๋์ค ๋ก์ง 8๋ฌธ
  - selectallidnamea.jsp : ๋น์ฆ๋์ค ๋ก์ง 9๋ฌธ
  - selectallidnamed.jsp : ๋น์ฆ๋์ค ๋ก์ง 10๋ฌธ

<br>

## ๐ธ JSP&JSTL ๊ฒฐ๊ณผ ์์
- ํ์ด๋ธ(Citizen) ์ ๋ณด JSP 
![1ํ์ด๋ธ](https://user-images.githubusercontent.com/79084294/147273470-60de1d70-346e-4f62-a075-3fd769b1b31d.png)


<br>

- ๋น์ฆ๋์ค ๋ก์ง(1๋ฌธ) JSP 
![๋น์ฆ1](https://user-images.githubusercontent.com/79084294/147274063-cb4d3399-298f-47b1-b073-5bef8e2e5640.png)

<br>

- ํ์ด๋ธ(Citizen) ๋ฐ์ดํฐ ๊ด๋ฆฌ JSTL (New) 
![jstl new](https://user-images.githubusercontent.com/79084294/147274620-183b94a2-e140-45f8-9126-b1cb1b700e64.png)

<br>

- ํ์ด๋ธ(Citizen) ๋ฐ์ดํฐ ๊ด๋ฆฌ JSTL (List) 
![jstl list](https://user-images.githubusercontent.com/79084294/147274665-9ca1bc8c-7f7a-45e6-9cd3-5a3bcc79570e.png)
