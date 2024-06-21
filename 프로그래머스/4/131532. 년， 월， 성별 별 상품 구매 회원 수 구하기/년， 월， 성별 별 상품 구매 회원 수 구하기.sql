SELECT YEAR(b.SALES_DATE) AS YEAR,
    MONTH(b.SALES_DATE) AS MONTH,
    a.GENDER AS GENDER,
    COUNT(DISTINCT a.USER_ID) AS USERS
FROM USER_INFO a INNER JOIN ONLINE_SALE b ON a.USER_ID = b.USER_ID
GROUP BY 1, 2, 3
HAVING GENDER IS NOT NULL 
ORDER BY 1, 2, 3