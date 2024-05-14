SELECT ANIMAL_ID, NAME, IF(SEX_UPON_INTAKE LIKE '%Neutered%'
                          OR SEX_UPON_INTAKE LIKE '%Spayed%', 'O','X')
                          AS '중성화'
FROM ANIMAL_INS
GROUP BY ANIMAL_ID;
