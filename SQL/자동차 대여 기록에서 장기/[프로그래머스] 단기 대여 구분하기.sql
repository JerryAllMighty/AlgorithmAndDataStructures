SELECT
HISTORY_ID
, CAR_ID
, DATE_FORMAT(START_DATE, '%Y-%m-%d')
, DATE_FORMAT(END_DATE, '%Y-%m-%d')
, CASE WHEN DATEDIFF(END_DATE, START_DATE)+1 >= 30 THEN '장기 대여'
ELSE '단기 대여' 
END AS RENT_TYPE
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE MONTH(START_DATE) = '09'
ORDER BY HISTORY_ID DESC
