OutputAListOfBooksThatMeetTheConditions
    - SELECT BOOK_ID, date_format(PUBLISHED_DATE, '%Y-%m-%d') as "PUBLISHED_DATE"
    FROM BOOK
    WHERE category = '인문' AND year(published_date) = '2021'
    ORDER BY 2;

OutPutAListOfBooksAndAuthorsThatMeetTheConditions
    - SELECT BOOK_ID, AUTHOR_NAME, date_format(PUBLISHED_DATE, '%Y-%m-%d') as "PUBLISHED_DATE"
      FROM book natural join author
      WHERE category = '경제'
      ORDER BY published_date

AggregateBookSalesVolumeByCategory
    - SELECT CATEGORY, sum(sales) as "TOTAL_SALES"
      FROM book NATURAL JOIN book_sales
      WHERE date_format(sales_date, '%Y%m') = '202201'
      GROUP BY CATEGORY
      ORDER BY category;

ViewUncancelledCareAppointments
	- SELECT apnt_no, pt_name, p.pt_no, a.mcdp_cd, dr_name, apnt_ymd
		FROM patient p, doctor d, appointment a 
		WHERE p.pt_no = a.pt_no and d.dr_id = a.mddr_id 
   		 and a.mcdp_cd = 'CS' 
    		and (date_format(apnt_ymd, "%Y%m%d") = '20220413' and apnt_cncl_yn = 'N')
		ORDER BY apnt_ymd;

FindTheNumberOfMembersWithoutAgeInformation
	- SELECT count(*) as "USERS" FROM user_info WHERE age is null;

IdOfAnAnimalWithAName
	- SELECT animal_ID FROM animal_ins WHERE name is not null;

IdOfAnUnnamedAnimal
	- SELECT animal_id FROM animal_ins WHERE name is null ORDER BY animal_id;

OutputOfTheListOfProductionPlantsLocatedInX
	- SELECT factory_id, factory_name, address FROM food_factory WHERE address Like '강원도%' ORDER BY factory_id;
	
PrintOutTheListOfFoodWarehousesLocatedInX
	- SELECT warehouse_id, warehouse_name, address ,if(isnull(freezer_yn), 'N', freezer_yn)
    FROM food_warehouse where address Like '경기%' ORDER BY warehouse_id
    
PrintOutAListOfCardiothoracicSurgeonsOrGeneralSurgeons
	- SELECT DR_NAME, DR_ID, MCDP_CD, date_format(hire_ymd, '%Y-%m-%d') as "HIRE_YMD" FROM doctor 
		WHERE mcdp_cd = 'CS' or mcdp_cd = 'GS' ORDER BY hire_ymd desc, dr_name
		
GettingTheMostExpensiveProduct
	- SELECT max(price) as "MAX_PRICE" FROM product;
	
FindTheNumberOfMembersThatMeetTheRequirements
	- SELECT count(*) FROM user_info WHERE (age between 20 and 29) and year(joined) = 2021;

PopularIceCream
	- SELECT flavor FROM first_half ORDER BY total_order desc, shipment_id;
	
FindAnimalsWithelInTheirName
	- SELECT animal_id, name FROM animal_ins WHERE animal_type = 'dog' and name LIKE '%el%' ORDER BY name;
		
Handling Null
	- SELECT animal_type, IF(name is null, "No name", name) AS "name", sex_upon_intake 
		FROM animal_ins
		ORDER BY animal_id;
		
FindingOutIfYou''veBeenNeutered
	- SELECT animal_id, name, if(sex_upon_intake like '%Neutered%' or sex_upon_intake like '%Spayed%', 'O', 'X') as "중성화" 
		FROM animal_ins ORDER BY animal_id;
PrintInformationOnTheMostExpensiveFood
	- SELECT * FROM food_product WHERE price = (SELECT max(price) FROM food_product);
	
FindingTheNumberOfProductsPerCategory
	- SELECT substr(product_code, 1, 2) "category", count(*) "products" FROM product 
    GROUP BY substr(product_code, 1, 2)
    order by category;
    
FindingLucyAndElla
	- SELECT animal_id, name, sex_upon_intake FROM animal_ins WHERE name IN ('Lucy', 'Ella', 'Pickle', 'Rogan', 'Sabrina', 'Mitty');

OutputAListOfFemalePatientsUnderTheAgeOf12
	- SELECT pt_name, pt_no, gend_cd, age, if(tlno is null, "NONE", tlno) as "tlno" FROM patient WHERE gend_cd = 'W' and age <= 12 ORDER BY age desc, pt_name;

OutputAListOfFemaleMemberBornInMarch
	- SELECT member_id, member_name, gender, date_format(date_of_birth, '%Y-%m-%d') as "date_of_birth" 
		FROM member_profile 
		WHERE TLNO IS NOT NULL and gender = 'W' and date_format(date_of_birth, '%m') = '03' ORDER BY member_id;
		
GetOfflineSalesByProduct
	- SELECT p.product_code, (sum(o.sales_amount) * p.price) "sales" 
		FROM product p left join offline_sale o on p.product_id = o.product_id
		GROUP BY p.product_code
		ORDER BY sales desc, p.product_code;

OutputTheTotalNumberOfAppointmentsByClinicalDepartment
	- SELECT mcdp_cd as "진료과코드", count(apnt_no) as "5월예약건수"
	FROM appointment
	WHERE date_format(apnt_ymd, '%Y%m') = '202205'
	GROUP BY mcdp_cd
	ORDER BY 5월예약건수(=2), 진료과코드(=1);
	
OutputOrderStatusByClassifyingByConditions
	- SELECT order_id, product_id, date_format(out_date, '%Y-%m-%d') "out_date", case 
   	 	when (out_date is null) then "출고미정"
    	when (date_format(out_date, '%Y%m%d') <= '20220501') then "출고완료"
    	else "출고대기" END AS "출고여부"  
	FROM food_order
	ORDER BY order_id;

OutputTheRestaurantInformationWithTheMostFavorites
	- SELECT food_type, rest_id, rest_name, favorites 
	FROM rest_info a
	GROUP BY food_type, rest_id, rest_name, favorites
	HAVING favorites = (SELECT MAX(favorites) 
                  FROM rest_info b 
                  GROUP BY food_type
                  HAVING a.food_type = b.food_type)
	ORDER BY food_type desc;
	
	- SELECT A.food_type, A.rest_id, A.rest_name, A.favorites
		FROM rest_info A JOIN ( 
			SELECT food_type, max(favorites) as favorites
			FROM rest_info
			GROUP BY FOOD_TYPE) B On A.favorites = B.favorites AND A.food_type = B.food_type
		ORDER BY food_type desc; 
		
FindTheNumberOfProductsByPriceRange
	- SELECT truncate(price, -4) as "PRICE_GROUP", count(*) as "PRODUCTS" 
	FROM product
	GROUP BY price_group
	ORDER BY 1;
		
TotalIceCreamOrderQuantitySeparatedByIngredients
	- SELECT ingredient_type, sum(total_order) as "TOTAL_ORDER"
	FROM first_half f left join icecream_info i on f.flavor = i.flavor
	GROUP BY ingredient_type
	ORDER BY 2;

SeeTotalFoodSalesForMay
	- SELECT p.product_id, product_name, sum(price * amount) "total_sales"
		FROM food_product p left join food_order o on p.product_id = o.product_id
		WHERE date_format(produce_date, '%Y%m') = 202205
		GROUP BY p.product_id
		ORDER BY 3 desc, 1;
		
ViewInformationOnTheMostExpensiveFoodsByFoodCategory
	- SELECT category, price, product_name
		FROM food_product
		WHERE price in
  		  (select max(price)
  		  FROM food_product
   		 GROUP BY category) and category in ('과자', '국', '김치', '식용유')
		ORDER BY price desc;

GetRepurchasedProductsAndMemberList
	- SELECT user_id, product_id
		FROM online_sale
		GROUP BY user_id, product_id
		HAVING count(product_id) > 1
		ORDER BY user_id, product_id desc;
		
ShoppingCartWithMilkAndYogurt
	- SELECT cart_id
		FROM cart_products
		WHERE name in ('Milk', 'Yogurt')
		GROUP BY cart_id
		HAVING COUNT(Distinct(name)) > 1
		ORDER BY cart_id;
		
PlacesOwnedByheavyUsers
	- SELECT id, name, host_id
		FROM places
		WHERE host_id in (select b.host_id FROM places b GROUP BY b.host_id HAVING count(b.host_id) > 1) 
		ORDER BY id
		
OutputAListOfRestaurantsInSeoul
	-	SELECT i.REST_ID, i.REST_NAME, i.FOOD_TYPE, i.FAVORITES, i.ADDRESS, score
		FROM rest_info i 
    inner join (SELECT r.rest_id, round(avg(r.review_score), 2) "score"
                FROM rest_review r
                GROUP BY r.rest_id) c on i.rest_id = c.rest_id
		WHERE i.address like '서울%'
		ORDER BY score desc, favorites desc;
		
ChooseIceCreamMadeWithFruit
	- SELECT h.flavor FROM first_half h natural join icecream_info i
		WHERE h.total_order > 3000 and i.ingredient_type = 'fruit_based'
		ORDER BY h.total_order desc;
		
GetMembersWhoBuyProductsByYearMonthAndGender
	- SELECT year(sales_date) "year", month(sales_date) "month", gender, count(distinct user_id) as "users" 
		FROM user_info natural join online_sale
		WHERE gender is not null
		GROUP BY year(sales_date), month(sales_date), gender
		ORDER BY year, month, gender;
		
SeeTheMostOrderedIceCream
	- SELECT flavor
	FROM (SELECT flavor, total_order FROM first_half
  		  union 
     	select flavor, total_order from july) total
	GROUP BY flavor
	ORDER BY sum(total_order) desc
	limit 3;