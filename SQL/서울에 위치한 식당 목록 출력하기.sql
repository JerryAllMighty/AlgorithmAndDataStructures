-- 코드를 입력하세요
-- 식당 ID, 식당 이름, 음식 종류, 즐겨찾기수, 주소, 리뷰 평균 점수를 조회
SELECT T1.REST_ID
, T1.REST_NAME
, T1.FOOD_TYPE
, T1.FAVORITES
, T1.ADDRESS
, ROUND(AVG(REVIEW_SCORE), 2) AS SCORE
FROM REST_INFO T1
INNER JOIN REST_REVIEW T2 ON T1.REST_ID = T2.REST_ID 
WHERE ADDRESS LIKE '서울%'
GROUP BY T2.REST_ID
ORDER BY SCORE DESC, FAVORITES DESC
