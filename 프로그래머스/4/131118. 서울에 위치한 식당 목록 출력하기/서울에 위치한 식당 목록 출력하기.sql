-- 코드를 입력하세요
SELECT I.REST_ID AS REST_ID, I.REST_NAME AS REST_NAME, I.FOOD_TYPE AS FOOD_TYPE, I.FAVORITES AS FAVORITES, I.ADDRESS AS ADDRESS, ROUND(AVG(R.REVIEW_SCORE), 2) AS SCORE
FROM REST_INFO I JOIN REST_REVIEW R
ON I.REST_ID = R.REST_ID
WHERE SUBSTR(I.ADDRESS, 1, 2) LIKE '서울'
GROUP BY REST_ID
ORDER BY SCORE DESC, FAVORITES DESC