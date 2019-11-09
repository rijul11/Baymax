mysql> create database baymax;
Query OK, 1 row affected (0.00 sec)

-----------------------------------------------------------------------------------------------------------------------------------------------------------
mysql> use baymax;
Database changed

mysql> create table patient(aadhaar int,name varchar(50),address varchar(100),sex varchar(10),mobile int,email varchar(50),doc date,PID varchar(50) primary key , password varchar(50));
Query OK, 0 rows affected (0.11 sec)

mysql> create table doctor(name varchar(50),qualification varchar(100),experience varchar(100),mobile int,field varchar(50) unique,DID varchar(50) primary key , password varchar(50));
Query OK, 0 rows affected (0.14 sec)

mysql> create table admin(AID varchar(50) primary key , password varchar(50));
Query OK, 0 rows affected (0.16 sec)

mysql> create table symptom(PID varchar(50) , field varchar(50),s1 varchar(50),s2 varchar(50),s3 varchar(50),other varchar(100),status varchar(50),Date date ,foreign key (PID) references patient(PID) on delete cascade on update cascade );
Query OK, 0 rows affected (1.20 sec)


mysql> CREATE TABLE patient_doctor(PID varchar(50), DID varchar(50),foreign key (PID) references patient(PID) on delete cascade on update cascade,foreign key (DID) references doctor(DID) on delete cascade on update cascade );
Query OK, 0 rows affected (0.18 sec)

mysql> create table medicine(mid varchar(50) primary key, name varchar(50) unique,mingredient varchar(100),mtype varchar(50));
Query OK, 0 rows affected (0.16 sec)

mysql> create table prescription(PID varchar(50) ,DID varchar(50),d1 varchar(50),d2 varchar(50),d3 varchar(50),diagnosis varchar(50),dosage varchar(100),foreign key (PID) references patient(PID) on delete cascade on update cascade,foreign key (DID) references doctor(DID) on delete cascade on update cascade );
Query OK, 0 rows affected (0.16 sec)

mysql> create  table field_symptom(field varchar(50),symptom varchar(100),foreign key(field) references doctor(field));
-----------------------------------------------------------------------------------------------------------------------------
mysql> INSERT INTO doctor(name,qualification,experience,mobile,field,DID,password)
VALUES ('Dr Jagrati Laad','Gynecologist/Obstetrician','15 years',982345643,'Womens Health','D_01','D_@01'),
('Dr Nitin Jain','Dermatologist','17 years',996532456,'Skin and Hair','D_02','D_@02'),
('Dr S R Agarkhedkar','Pediatrician','38 years',987654321,'Child Specialist','D_03','D_@03'),
('Dr Hemant Patil','Dentist','12 years',987754301,'Dental Care','D_04','D_@04'),
('Dr Ajay Kothadiya','Otorhinolaryngologist','20 years',890754301,'Ear Nose and Throat','D_05','D_@05'),
('Dr B A Kadam','Orthopedist','43 years',923451232,'Bone and joints','D_06','D_@06'),
('Dr Savita Bhat','Ophthalmologist','22 years',927651232,'Eye Specialist','D_07','D_@07'),
('Dr Nitin Pai','Gastroenterologist','22 years',999667788,'Digestive Issues','D_08','D_@08'),
('Dr Prakash Bhambure','Psychiatrist','13 years',999667238,'Mental Wellness','D_09','D_@09'),
('Dr Priyanka Kumbhare','Physiotherapist','10 years',999663849,'Physiotherapy','D_10','D_@10'),
('Dr A G Unnikrishnan','Endrocrinologist','16 years',993463849,'Diabetes Management','D_11','D_@11'),
('Dr Sunil Bandishti','Neurologst','18 years',993422389,'Brain And Nerves','D_12','D_@12'),
('Dr Mhaskar Shrikant','Urologist','21 years',823422389,'Kidney And Urinary Issues','D_13','D_@13'),
('Dr K H Giri','General Surgery','38 years',822322334,'General Surgery','D_14','D_@14'),
('Dr S K Toke','Pulmonogist','16 years',822321434,'Lungs And Breathing','D_15','D_@15'),
('Dr Dnyanesh Gaware','Cardiologist','28 years',972378434,'Heart','D_16','D_@16'),
('Dr Gajanan A Kanitkar','Oncologist','19 years',972378567,'Cancer','D_17','D_@17');
----------------------------------------------------------------------------------------------------------------------------------------
mysql-> insert into field_symptom (field,symptom)
values('Eye Specialist','redness'),
('Eye Specialist','itching'),
('Eye Specialist','tearing of eye'),
('Eye Specialist','blurry vision'),
('Eye Specialist','cloudy window in the eye'),
('Eye Specialist','swelling in the eye'),
('Eye Specialist','eye pain'),
('Eye Specialist','head ache'),
('Eye Specialist','cloudy vision'),
('Eye Specialist','sensitivity to light'),
('Digestive Issues','abdominal pain'),
('Digestive Issues','dark urine'),
('Digestive Issues','vomiting'),
('Digestive Issues','cramps'),
('Digestive Issues','low grade fever'),
('Digestive Issues','diarrhoea'),
('Digestive Issues','nausea'),
('Digestive Issues','loss of appetite'),
('Digestive Issues','pain near the belly button'),
('Brain And Nerves','head ache'),
('Brain And Nerves','still neck'),
('Brain And Nerves','string headache'),
('Brain And Nerves','blurred vision'),
('Brain And Nerves','loss of balance'),
('Brain And Nerves','confusion'),
('Brain And Nerves','limited social skills'),
('Brain And Nerves','forgetfulness'),
('Kidney and Urinary Issues','severe pain in side abdomen'),
('Kidney and Urinary Issues','nausea'),
('Kidney and Urinary Issues','decreased urine output'),
('Kidney and Urinary Issues','urine retention'),
('Kidney and Urinary Issues','swelling in leg and ankles'),
('Kidney and Urinary Issues','pelvic pain'),
('Kidney and Urinary Issues','pain with urination'),
('Kidney and Urinary Issues','blood in urine'),
('Lungs And Breathing','difficulty breathing'),
('Lungs And Breathing','shortness of breath'),
('Lungs And Breathing','chest pressure'),
('Lungs And Breathing','coughing of thickened mucus'),
('Lungs And Breathing','clammy skin'),
('Lungs And Breathing','dehydration'),
('Lungs And Breathing', 'palpitations'),
('Heart', 'palpitations'),
('Heart', 'chest pressure'),
('Heart', 'tightness and pain'),
('Heart', 'abnormal heart rhythm'),
('Heart', 'swelling of organs'),
('Heart','dizziness'),
('Cancer','swollen lymph nodes'),
('Cancer','skin puckering'),
('Cancer','inverted nipples'),
('Cancer','weak urinary stream'),
('Cancer','frequent urination'),
('Cancer','wollen lymph nodes'),
('Cancer','weight loss'),
('Cancer','chronic cough'),
('Cancer','fatigue'),
('Skin and Hair','receding hairline'),
('Skin and Hair','hair thinning'),
('Skin and Hair','hair loss is patches'),
('Skin and Hair','sudden loss of hair'),
('Skin and Hair','pimple'),
('Skin and Hair','redness'),
('Skin and Hair','tenderness'),
('Dental Care','tooth pain'),
('Dental Care','sensitivity'),
('Dental Care','visible holes'),
('Dental Care','bleeding of gums'),
('Dental Care','swollen gums'),
('Dental Care','bad breath'),
('Ear Nose and Throat','blocked nose '),
('Ear Nose and Throat','nasal congestion'),
('Ear Nose and Throat','facial pain'),
('Ear Nose and Throat','ear pain'),
('Ear Nose and Throat','ear drainage'),
('Ear Nose and Throat','muffled hearing'),
('Ear Nose and Throat','starchy throat'),
('Ear Nose and Throat','muffled voice'),
('Ear Nose and Throat','difficulty swallowing'),
('Bone and joints ','swelling'),
('Bone and joints ','restricted movement'),
('Bone and joints ','back pain'),
('Bone and joints ','stooped posture'),
('Bone and joints ','reduced range of motion'),
('Bone and joints ','stiffness'),
('Bone and joints ','pain'),
('Mental Wellness','binge eating'),
('Mental Wellness','vomiting'),
('Mental Wellness','anxiety'),
('Mental Wellness','hypervigilance'),
('Mental Wellness','irritablity'),
('Mental Wellness','fatigue'),
('Mental Wellness','excessive sleep'),
('Mental Wellness','insomnia'),
('Mental Wellness','depression'),
('Physiotherapy','swelling'),
('Physiotherapy','restricted movement'),
('Physiotherapy','pain'),
('Physiotherapy','restricted movement'),
('Physiotherapy','tenderness'),
('Physiotherapy','leg numbness'),
('Physiotherapy','muscle spasm'),
('Diabetes Management','mouth dryness'),
('Diabetes Management','sweating'),
('Diabetes Management','mental confusion'),
('Diabetes Management','nausea'),
('Diabetes Management','palpitation'),
('Womens Health','irregular periods'),
('Womens Health','increased vaginal discharge'),
('Womens Health','abnormal vaginal bleeding'),
('Womens Health','lumps in genital area'),
('Womens Health','pregnancy issue'),
('Womens Health','Blister'),
('Womens Health','pain during urination'),
('Child Specialist ','rash on the skin'),
('Child Specialist ','vomiting'),
('Child Specialist ','fever'),
('Child Specialist ','pain or cramping in the abdomen '),
('Child Specialist ','swollen lips and throat'),
('Child Specialist ','sore,red and itchy eyes'),
('Child Specialist ','vomiting after coughing'),
('General Surgery','mole');


-------------------------------------------------------------------------------------------------------------------------------------
mysql>
insert into medicine values(101,"Bleph","sulfacetamide sodium");
insert into medicine values(102,"Moxeza", "moxifloxacin");
insert into medicine values(103,"Ciloxan","Ciprofloxacin ophthalmic");
insert into medicine values(104,"Besivance","Besifloxacin ophthalmic ");
insert into medicine values(105,"Mucomyst","N-acetylcysteine");
insert into medicine values(106,"Loperamide","Imodium");
insert into medicine values(107,"Zosyn","piperacillin ");
insert into medicine values(108,"Rosephyn","ceftriaxone");
insert into medicine values(109,"Claforan","cefotaxime");
insert into medicine values(110,"Afinitor","Everolimus");
insert into medicine values(111,"Tylenol","acetaminophen");
insert into medicine values(112,"Epo","Erythropoietin");
insert into medicine values(113,"Exelon","ivastigmine ");
insert into medicine values(115,"Bactrim","sulfamethoxazole");
insert into medicine values(116,"Symbicort","sulfamethoxazole");
insert into medicine values(117,"levofloxacin","quinolones");
insert into medicine values(118,"Mucinex","guaifenesin ");
insert into medicine values(119,"Tracleer","Bosentan");
insert into medicine values(120,"Emilase","Thrombolytics");
insert into medicine values(121,"Abraxane","Paclitaxel Albumin");
insert into medicine values(122,"Diuril","Diuretics");
insert into medicine values(123,"Casodex","Bicalutamide");
insert into medicine values(124,"Paraplatin","carboplatin ");
insert into medicine values(125,"Erleada","Apalutamide");
insert into medicine values(126,"Asticite","Tetracycline");
insert into medicine values(127,"Celestone","corticosteroids");
insert into medicine values(128,"Orajel","benzocaine");
insert into medicine values(129,"Arestine","minocycline");
insert into medicine values(130,"Advil","ibuprofen");
insert into medicine values(131,"Ambroxol","mucolytic");
insert into medicine values(132,"Prozac","fluoxetine");
insert into medicine values(133,"Flagyl","metronidazole");
insert into medicine values(134,"Clomid","Clomiphene  ");

----------------------------------------------------------------------------------------------------------------------------------------


/////select symptom.s1,symptom.s2,symptom.s3,symptom.field from symptom inner join patient_doctor on symptom.PID=patient_doctor.PID inner join doctor on doctor.field=symptom.field where doctor.DID="D_04" and symptom.status="Unresolved";


CREATE UNIQUE NONCLUSTERED INDEX ON patient_doctor( PID ASC, DID ASC) WITH (IGNORE_DUP_KEY = ON);
