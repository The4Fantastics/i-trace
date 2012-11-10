CREATE OR REPLACE TYPE people AS OBJECT
(
  persons  NT_Ref_Person_type
) NOT FINAL INSTANTIABLE;
/

CREATE TABLE people OF people
(
  persons  NOT NULL 
)
NESTED TABLE persons STORE AS Ref_Person_type_Table;

CREATE OR REPLACE TYPE movies AS OBJECT
(
  movies  NT_Ref_movie_type
) NOT FINAL INSTANTIABLE;
/

CREATE TABLE movies OF movies
(
  movies  NOT NULL 
)
NESTED TABLE movies STORE AS Ref_movie_type_Table;

CREATE OR REPLACE TYPE movie_type AS OBJECT
(
  id  INTEGER,
  studio  CHARACTER VARYING,
  synopsis  CHARACTER VARYING,
  title  CHARACTER VARYING,
  website  CHARACTER VARYING,
  genre   ,
  ext_review   VARRAY_external_review_type,
  user_review  NT_user_review_type,
  products  NT_Ref_product_type,
  directors  NT_Ref_director_type,
  playwriters  NT_Ref_playwriter_type,
  casts  REF Ref_cast_type
  MEMBER FUNCTION numProductByYear ( year CHARACTERVARYING ) RETURN INTEGER
) NOT FINAL INSTANTIABLE;
/

CREATE TABLE movie_type OF movie_type
(
  id  PRIMARY KEY ,
  title  UNIQUE ,
  genre  NOT NULL ,
  title  NOT NULL ,
  directors  NOT NULL ,
  playwriters  NOT NULL ,
  casts  NOT NULL 
)
NESTED TABLE user_review STORE AS user_review_type_Table
NESTED TABLE products STORE AS Ref_product_type_Table
NESTED TABLE directors STORE AS Ref_director_type_Table
NESTED TABLE playwriters STORE AS Ref_playwriter_type_Table;

CREATE OR REPLACE TYPE cast_type AS OBJECT
(
  id  INTEGER,
  casting_order  INTEGER,
  role  CHARACTER VARYING,
  actor  REF Ref_actor_type,
  movie  REF Ref_movie_type
) NOT FINAL INSTANTIABLE;
/

CREATE TABLE cast_type OF cast_type
(
  id  PRIMARY KEY ,
  role  NOT NULL ,
  actor  NOT NULL ,
  movie  NOT NULL 
);

CREATE OR REPLACE TYPE castings AS OBJECT
(
  casts  NT_Ref_cast_type
) NOT FINAL INSTANTIABLE;
/

CREATE TABLE castings OF castings
NESTED TABLE casts STORE AS Ref_cast_type_Table;

CREATE OR REPLACE TYPE products AS OBJECT
(
  products  NT_Ref_product_type
) NOT FINAL INSTANTIABLE;
/

CREATE TABLE products OF products
NESTED TABLE products STORE AS Ref_product_type_Table;

CREATE OR REPLACE TYPE external_review_type AS OBJECT
(
  review_source  CHARACTER VARYING,
  review_url  CHARACTER VARYING
) NOT FINAL INSTANTIABLE;
/

CREATE TABLE external_review_type OF external_review_type;

CREATE OR REPLACE TYPE user_review_type AS OBJECT
(
  review_date  DATE,
  review_text  CHARACTER VARYING,
  reviewer  CHARACTER VARYING,
  score  INTEGER
) NOT FINAL INSTANTIABLE;
/

CREATE TABLE user_review_type OF user_review_type;

CREATE OR REPLACE TYPE director_type UNDER person_type() NOT FINAL INSTANTIABLE;
/

CREATE TABLE director_type OF director_type
(
  id  PRIMARY KEY ,
  name  NOT NULL 
);

CREATE OR REPLACE TYPE actor_type UNDER person_type
(
  casts  NT_Ref_cast_type
) NOT FINAL INSTANTIABLE;
/

CREATE TABLE actor_type OF actor_type
(
  id  PRIMARY KEY ,
  name  NOT NULL 
)
NESTED TABLE casts STORE AS Ref_cast_type_Table;

CREATE OR REPLACE TYPE playwriter_type UNDER person_type() NOT FINAL INSTANTIABLE;
/

CREATE TABLE playwriter_type OF playwriter_type
(
  id  PRIMARY KEY ,
  name  NOT NULL 
);

CREATE OR REPLACE TYPE person_type AS OBJECT
(
  id  INTEGER,
  country  CHARACTER VARYING,
  dob  DATE,
  name  CHARACTER VARYING,
  sex  CHARACTER
) NOT FINAL INSTANTIABLE;
/

CREATE OR REPLACE TYPE MERGE_playwriter_type_director_type_actor_type UNDER person_type() NOT FINAL INSTANTIABLE;
/

CREATE TABLE MERGE_playwriter_type_director_type_actor_type OF MERGE_playwriter_type_director_type_actor_type
(
  id  PRIMARY KEY ,
  name  NOT NULL 
);

CREATE OR REPLACE TYPE product_type AS OBJECT
(
  type_of_product_type  CHARACTER VARYING,
  codeState  INTEGER,
  id  INTEGER,
  availability  CHARACTER VARYING,
  list_price  REAL,
  production_company  CHARACTER VARYING,
  release_date  DATE,
  runtime  INTEGER,
  format  CHARACTER VARYING,
  aspect_ratio  CHARACTER VARYING,
  dvd_encoding  CHARACTER VARYING,
  number_of_discs  INTEGER,
  our_price  REAL,
  movie  REF Ref_movie_type
  MEMBER FUNCTION getRating RETURN CHARACTERVARYING
) NOT FINAL INSTANTIABLE;
/

CREATE TABLE product_type OF product_type
(
  codeState  PRIMARY KEY   id  PRIMARY KEY ,
  CHECK Check_Discriminant_type_of_product_type (),
  type_of_product_type  NOT NULL ,
  availability  NOT NULL ,
  movie  NOT NULL 
);

CREATE OR REPLACE TRIGGER getOur_price_insert AFTER [INSERT] OF our_price
ON product_type
;

CREATE OR REPLACE TRIGGER getOur_price_update AFTER [UPDATE] OF our_price
ON product_type
;

CREATE OR REPLACE TYPE Ref_cast_type AS OBJECT (ref  REF cast_type);
/
CREATE OR REPLACE TYPE Ref_product_type AS OBJECT (ref  REF product_type);
/
CREATE OR REPLACE TYPE Ref_actor_type AS OBJECT (ref  REF actor_type);
/
CREATE OR REPLACE TYPE Ref_movie_type AS OBJECT (ref  REF movie_type);
/
CREATE OR REPLACE TYPE Ref_director_type AS OBJECT (ref  REF director_type);
/
CREATE OR REPLACE TYPE Ref_playwriter_type AS OBJECT (ref  REF playwriter_type);
/
CREATE OR REPLACE TYPE Ref_Person_type AS OBJECT (ref  REF person_type);
/
CREATE OR REPLACE TYPE VARRAY_genre AS VARRAY(4) OF CHARACTERVARYING;
/
CREATE OR REPLACE TYPE VARRAY_external_review_type AS VARRAY(5) OF external_review_type;
/
CREATE OR REPLACE TYPE NT_Ref_cast_type AS TABLE OF Ref_cast_type;
/
CREATE OR REPLACE TYPE NT_Ref_product_type AS TABLE OF Ref_product_type;
/
CREATE OR REPLACE TYPE NT_user_review_type AS TABLE OF user_review_type;
/
CREATE OR REPLACE TYPE NT_Ref_director_type AS TABLE OF Ref_director_type;
/
CREATE OR REPLACE TYPE NT_Ref_playwriter_type AS TABLE OF Ref_playwriter_type;
/
CREATE OR REPLACE TYPE NT_Ref_Person_type AS TABLE OF Ref_Person_type;
/
CREATE OR REPLACE TYPE NT_Ref_movie_type AS TABLE OF Ref_movie_type;
/
CREATE OR REPLACE VIEW GET ALL person_type AS
 SELECT * FROM director_type, actor_type, playwriter_type, MERGE [playwriter_type_director_type_actor_type];;

