# 실험실 3

코틀린에서 수행할 수 있는 반복자의 성능 비교

- for
- for-each
- repeat
- map

어떤게 제일 빠를까?

# 실험 결과

| For   | For-Each | Repeat | map   |
|-------|----------|--------|-------|
| 80    | 341      | 231    | 475   |
| 213   | 227      | 385    | 273   |
| 235   | 167      | 165    | 193   |
| 239   | 287      | 56     | 450   |
| 230   | 229      | 152    | 133   |
| 199.4 | 250.2    | 197.8  | 304.8 |

map이 가장 느리고, 나머진 그때마다 다른 것 같다.

---

## 1회차

naturalFor startTime = 1693551938513 mills

naturalFor end = 1693551938593 mills

실행 시간 : 80 mills

-------------------------------------

for-each startTime = 1693551938816 mills

for-each end = 1693551939157 mills

실행 시간 : 341 mills

-------------------------------------

repeat startTime = 1693551939207 mills

repeat end = 1693551939438 mills

실행 시간 : 231 mills

-------------------------------------

map startTime = 1693551939492 mills

map end = 1693551939967 mills

실행 시간 : 475 mills

-------------------------------------

## 2회차

naturalFor startTime = 1693551940607 mills

naturalFor end = 1693551940820 mills

실행 시간 : 213 mills

-------------------------------------

for-each startTime = 1693551940992 mills

for-each end = 1693551941219 mills

실행 시간 : 227 mills

-------------------------------------
repeat startTime = 1693551941262 mills

repeat end = 1693551941647 mills

실행 시간 : 385 mills

-------------------------------------

map startTime = 1693551941763 mills

map end = 1693551942036 mills

실행 시간 : 273 mills

-------------------------------------

## 3회차

naturalFor startTime = 1693551942641 mills

naturalFor end = 1693551942876 mills

실행 시간 : 235 mills

-------------------------------------

for-each startTime = 1693551943001 mills

for-each end = 1693551943168 mills

실행 시간 : 167 mills

-------------------------------------

repeat startTime = 1693551943342 mills

repeat end = 1693551943507 mills

실행 시간 : 165 mills

-------------------------------------

map startTime = 1693551943638 mills

map end = 1693551943831 mills

실행 시간 : 193 mills

-------------------------------------

## 4회차

naturalFor startTime = 1693551944260 mills

naturalFor end = 1693551944499 mills

실행 시간 : 239 mills

-------------------------------------

for-each startTime = 1693551944547 mills

for-each end = 1693551944834 mills

실행 시간 : 287 mills

-------------------------------------

repeat startTime = 1693551944949 mills

repeat end = 1693551945005 mills

실행 시간 : 56 mills

-------------------------------------

map startTime = 1693551945046 mills

map end = 1693551945496 mills

실행 시간 : 450 mills

-------------------------------------

## 5회차

naturalFor startTime = 1693551945929 mills

naturalFor end = 1693551946159 mills

실행 시간 : 230 mills

-------------------------------------

for-each startTime = 1693551946278 mills

for-each end = 1693551946507 mills

실행 시간 : 229 mills

-------------------------------------

repeat startTime = 1693551946623 mills

repeat end = 1693551946775 mills

실행 시간 : 152 mills

-------------------------------------

map startTime = 1693551946939 mills

map end = 1693551947072 mills

실행 시간 : 133 mills

-------------------------------------