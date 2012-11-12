CREATE OR REPLACE TYPE OID AS OBJECT() NOT FINAL INSTANTIABLE;
/

CREATE OR REPLACE TYPE Person_type AS OBJECT
(
  country  CHARACTER VARYING,
  dob  DATE,
  name  CHARACTER VARYING,
  sex  CHARACTER
) NOT FINAL INSTANTIABLE;
/

CREATE TABLE Person_type_table OF Person_type;

CREATE OR REPLACE TYPE product_type AS OBJECT
(
  availability  CHARACTER VARYING,
  list_price  REAL,
  our_price  REAL,
  production_company  CHARACTER VARYING,
  rating  CHARACTER VARYING,
  release_date  DATE,
  runtime  INTEGER,
  movie  REF Ref_movie_type
) NOT FINAL INSTANTIABLE;
/

CREATE TABLE product_type_table OF product_type
(
  movie  NOT NULL 
);

CREATE OR REPLACE TYPE people AS OBJECT
(
  id  OID,
  persons  NT_Ref_Person_type
) NOT FINAL INSTANTIABLE;
/

CREATE TABLE people_table OF people
(
  persons  NOT NULL 
)
NESTED TABLE persons STORE AS Ref_Person_type_Table;

CREATE OR REPLACE TYPE movies AS OBJECT
(
  id  OID,
  movies  NT_Ref_movie_type
) NOT FINAL INSTANTIABLE;
/

CREATE TABLE movies_table OF movies
(
  movies  NOT NULL 
)
NESTED TABLE movies STORE AS Ref_movie_type_Table;

CREATE OR REPLACE TYPE movie_type AS OBJECT
(
  genre  CHARACTER VARYING,
  studio  CHARACTER VARYING,
  synopsis  CHARACTER VARYING,
  title  CHARACTER VARYING,
  website  CHARACTER VARYING,
  ext_review   VARRAY_external_review_type,
  user_review  NT_user_review_type,
  director  REF Ref_director_type,
  playwriter_ref  REF Ref_playwriter_type,
  cast  REF Ref_cast_type,
  products  NT_Ref_product_type
) NOT FINAL INSTANTIABLE;
/

CREATE TABLE movie_type_table OF movie_type
(
  director  NOT NULL ,
  playwriter_ref  NOT NULL ,
  cast  NOT NULL ,
  products  NOT NULL 
)
NESTED TABLE user_review STORE AS user_review_type_Table
NESTED TABLE products STORE AS Ref_product_type_Table;

CREATE OR REPLACE TYPE cast_type AS OBJECT
(
  casting_order  INTEGER,
  role  CHARACTER VARYING,
  movie  REF Ref_movie_type,
  actors  NT_Ref_actor_type
) NOT FINAL INSTANTIABLE;
/

CREATE TABLE cast_type_table OF cast_type
(
  actors  NOT NULL ,
  movie  NOT NULL 
)
NESTED TABLE actors STORE AS Ref_actor_type_Table;

CREATE OR REPLACE TYPE castings AS OBJECT
(
  id  OID,
  casts  NT_Ref_cast_type
) NOT FINAL INSTANTIABLE;
/

CREATE TABLE castings_table OF castings
(
  casts  NOT NULL 
)
NESTED TABLE casts STORE AS Ref_cast_type_Table;

CREATE OR REPLACE TYPE products AS OBJECT
(
  id  OID,
  products  NT_Ref_product_type
) NOT FINAL INSTANTIABLE;
/

CREATE TABLE products_table OF products
(
  products  NOT NULL 
)
NESTED TABLE products STORE AS Ref_product_type_Table;

CREATE OR REPLACE TYPE external_review_type AS OBJECT
(
  review_source  CHARACTER VARYING,
  review_url  CHARACTER VARYING
) NOT FINAL INSTANTIABLE;
/

CREATE TABLE external_review_type_table OF external_review_type;

CREATE OR REPLACE TYPE user_review_type AS OBJECT
(
  review_date  DATE,
  review_text  CHARACTER VARYING,
  reviewer  CHARACTER VARYING,
  score  INTEGER
) NOT FINAL INSTANTIABLE;
/

CREATE TABLE user_review_type_table OF user_review_type;

CREATE OR REPLACE TYPE director_type UNDER Person_type
(
  movies  NT_Ref_movie_type
) NOT FINAL INSTANTIABLE;
/

CREATE TABLE director_type_table OF director_type
(
  movies  NOT NULL 
)
NESTED TABLE movies STORE AS Ref_movie_type_Table;

CREATE OR REPLACE TYPE actor_type UNDER Person_type
(
  casts  NT_Ref_cast_type
) NOT FINAL INSTANTIABLE;
/

CREATE TABLE actor_type_table OF actor_type
(
  casts  NOT NULL 
)
NESTED TABLE casts STORE AS Ref_cast_type_Table;

CREATE OR REPLACE TYPE playwriter_type UNDER Person_type
(
  movies  REF Ref_movie_type
) NOT FINAL INSTANTIABLE;
/

CREATE TABLE playwriter_type_table OF playwriter_type
(
  movies  NOT NULL 
);

CREATE OR REPLACE TYPE video_type UNDER product_type
(
  format  CHARACTER VARYING
) NOT FINAL INSTANTIABLE;
/

CREATE TABLE video_type_table OF video_type
(
  movie  NOT NULL 
);

CREATE OR REPLACE TYPE dvd_type UNDER product_type
(
  acpect_ratio  CHARACTER VARYING,
  dvd_encoding  CHARACTER VARYING,
  number_of_disos  INTEGER
) NOT FINAL INSTANTIABLE;
/

CREATE TABLE dvd_type_table OF dvd_type
(
  movie  NOT NULL 
);

CREATE OR REPLACE TYPE Ref_director_type AS OBJECT (ref  REF director_type);
/
CREATE OR REPLACE TYPE Ref_movie_type AS OBJECT (ref  REF movie_type);
/
CREATE OR REPLACE TYPE Ref_playwriter_type AS OBJECT (ref  REF playwriter_type);
/
CREATE OR REPLACE TYPE Ref_cast_type AS OBJECT (ref  REF cast_type);
/
CREATE OR REPLACE TYPE Ref_Person_type AS OBJECT (ref  REF Person_type);
/
CREATE OR REPLACE TYPE Ref_product_type AS OBJECT (ref  REF product_type);
/
CREATE OR REPLACE TYPE Ref_actor_type AS OBJECT (ref  REF actor_type);
/
CREATE OR REPLACE TYPE VARRAY_external_review_type AS VARRAY(5) OF external_review_type;
/
CREATE OR REPLACE TYPE NT_user_review_type AS TABLE OF user_review_type;
/
CREATE OR REPLACE TYPE NT_Ref_Person_type AS TABLE OF Ref_Person_type;
/
CREATE OR REPLACE TYPE NT_Ref_cast_type AS TABLE OF Ref_cast_type;
/
CREATE OR REPLACE TYPE NT_Ref_movie_type AS TABLE OF Ref_movie_type;
/
CREATE OR REPLACE TYPE NT_Ref_product_type AS TABLE OF Ref_product_type;
/
CREATE OR REPLACE TYPE NT_Ref_actor_type AS TABLE OF Ref_actor_type;
/
