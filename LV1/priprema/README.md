Laboratorijske vježbe iz kolegija “Programiranje u jeziku Java” 2022/2023
Stručni studij – smjer računarstvo
Tehničko veleučilište u Zagrebu
@Autor: dr.sc. Aleksander Radovan, prof.v.š., dipl. ing.
1. Prva laboratorijska vježba
1.1. Tema vježbe
Svrha laboratorijske vježbe je usvajanje osnovnih principa objektno orijentiranog
programiranja kao što su kreiranje vlastitih klasa te kreiranje objekata tih klasa. Osim
toga, ističu se i principi postavljanja i dohvaćanja polja (varijabli) unutar klasa te korištenje
različitih modifikatora za ograničavanje pristupa tim poljima.
1.2. Zadatak za pripremu
Napisati Java program koji će se sastojati od nekoliko klasa pohranjenih u različitim
paketima. Klase simuliraju strukturu za implementaciju školskog informacijskih sustava.
Program je potrebno implementirati prema sljedećim koracima:
1. Preuzeti najnoviju verziju Jave 19 sa stranica https://jdk.java.net/19/ i raspakirati arhivu
na željenu lokaciju.
2. Preuzeti najnoviju inačicu IntelliJ IDEA Ultimate razvojnog okruženja s poveznice:
https://www.jetbrains.com/idea/download/#section=windows. Na stranici
https://www.jetbrains.com/community/education/#students je potrebno kreirati JetBrains
korisnički račun korištenjem e-maila od TVZ-a. Nakon aktivacije korisničkog računa
potrebno je aktivirati Intellij IDEA licencu korištenjem ovih uputa:
https://www.jetbrains.com/help/idea/register.html.
3. Kreirati projekt s nazivom koji odgovara Vašem prezimenu i rednom broju vježbe (npr.
„Radovan-1“) korištenjem sljedećih uputa: https://www.jetbrains.com/help/idea/creatingand-running-your-first-java-application.html.
4. Kreirati paket pod nazivom „hr.java.vjezbe.entitet“.
5. Kreirati klasu pod nazivom „Student“ unutar paketa „hr.java.vjezbe.entitet“ koja će
imati četiri privatne varijable: „ime“, „prezime“ i „jmbag“ koji će biti tipa „String“ i
„datumRodjenja“ koja će biti tipa „LocalDate“. Unutar klase je potrebno kreirati
konstruktor koji prima sve četiri varijable i sprema ih u privatne varijable te „getter“ i
„setter“ metodu za svaku od njih. Korištenjem uputa sa stranica
https://www.jetbrains.com/help/idea/generating-code.html#generate-constructors i
https://www.jetbrains.com/help/idea/generating-code.html#generate-getters-setters
generirati konstruktor koji prima oba ulazna parametra, te „getter“ i „setter“ metode za te
varijable.
6. Kreirati klasu pod nazivom „Profesor“ unutar paketa „hr.java.vjezbe.entitet“ koja će
sadržavati četiri privatne varijable tipa „String“: „sifra“, „ime“, „prezime“ i „titula“.
Unutar klase je potrebno kreirati konstruktor koji prima sve četiri varijable i sprema ih
u privatne varijable te „getter“ i „setter“ metodu za svaku od njih.
7. Kreirati klasu pod nazivom „Predmet“ unutar paketa „hr.java.vjezbe.entitet“ koja će
sadržavati pet varijabli: dvije „String“ varijable pod nazivom „sifra“ i „naziv“, jednu
„Integer“ varijablu pod nazivom „brojEctsBodova“, jednu „Profesor“ varijablu pod
imenom „nositelj“ i jednu varijablu koja će predstavlja polje objekata klase „Student“.
Unutar klase je potrebno kreirati konstruktor koji prima sve četiri varijable i sprema ih
u privatne varijable te „getter“ i „setter“ metodu za svaku od njih.
8. Kreirati klasu pod nazivom „Ispit“ unutar paketa „hr.java.vjezbe.entitet“ koja će
sadržavati četiri varijable: jednu varijablu tipa „Predmet“, jednu varijablu tipa
Laboratorijske vježbe iz kolegija “Programiranje u jeziku Java” 2022/2023
Stručni studij – smjer računarstvo
Tehničko veleučilište u Zagrebu
@Autor: dr.sc. Aleksander Radovan, prof.v.š., dipl. ing.
„Student“, jednu „Integer“ varijablu „ocjena“ i jednu varijablu tipa „datumIVrijeme“
tipa „LocalDateTime“. Unutar klase je potrebno kreirati konstruktor koji prima sve
četiri varijable i sprema ih u privatne varijable te „getter“ i „setter“ metodu za svaku
od njih.
9. Kreirati paket „hr.java.vjezbe.glavna“.
10. Unutar paketa „hr.java.vjezbe.glavna“ kreirati klasu „Glavna“ koja će se sastojati od
„main“ metode. Unutar nje je potrebno implementirati programski kod koji će od
korisnika tražiti unošenje podataka o barem dva profesora, barem tri predmeta,
barem dva studenta i barem jednim ispitnim rokom. Sve objekte je potrebno spremiti
u polje objekata. Konstruktore je potrebno pozvati tek kad se od korisnika prikupe svi
potrebni podaci (nije dozvoljeno koristiti „null“ vrijednosti prilikom inicijalizacije).
Unošenje više objekata istog tipa je potrebno obaviti korištenje „for“ petlje, a ne
kopiranjem jednog te istog programskog koda više puta. U cijelom programu je
dopušteno korištenje samo jednog objekta klase „Scanner“. Logiku unosa svakog od
objekata potrebno je izdvojiti u zasebne metode koje se pozivaju iz „main“ metode.
Svaka od tih metoda mora primati barem objekt klase „Scanner“ te po potrebi ostale
objekte kao što su polja koja sadrže ostale tipove objekata (na primjer, metoda za
unos podataka o ispitu mora osim objekta klase „Scanner“ primiti i polja koja sadrže
objekte klase „Student“ i „Predmet“).
11. Projekt iz trećeg zadatka je potrebno pretvoriti u Maven projekt korištenjem uputa s ove
poveznice: https://www.jetbrains.com/help/idea/convert-a-regular-project-into-a-mavenproject.html.
12. Unutar metode „main“ klase „Glavna“ potrebno je ispisati ime i prezime studenta koji
su na ispitnim rokovima ostvarili ocjenu „5“. Primjer informacija koje se ispisuju u
konzolu tijekom izvršavanja programa može izgledati kao u nastavku:
``
Unesite 1. profesora:
Unesite šifru profesora: 1
Unesite ime profesora: Darko
Unesite prezime profesora: Markota
Unesite titulu profesora: viši predavač
Unesite 2. profesora:
Unesite šifru profesora: 2
Unesite ime profesora: Ivica
Unesite prezime profesora: Krešić
Unesite titulu profesora: profesor visoke škole
Unesite 1. predmet:
Unesite šifru predmeta: 1
Unesite naziv predmeta: Programiranje u jeziku Java
Unesite broj ECTS bodova za predmet 'Programiranje u jeziku Java':6
Odaberite profesora:
1. Darko Markota
2. Ivica Krešić
Odabir >> 1
Unesite broj studenata za predmetu 'Programiranje u jeziku Java':1
Unesite 2. predmet:
Unesite šifru predmeta: 2
Unesite naziv predmeta: Web aplikacije u Javi
Unesite broj ECTS bodova za predmet 'Web aplikacije u Javi':7
Odaberite profesora:
Laboratorijske vježbe iz kolegija “Programiranje u jeziku Java” 2022/2023
Stručni studij – smjer računarstvo
Tehničko veleučilište u Zagrebu
@Autor: dr.sc. Aleksander Radovan, prof.v.š., dipl. ing.
1. Darko Markota
2. Ivica Krešić
Odabir >> 2
Unesite broj studenata za predmetu 'Web aplikacije u Javi':1
Unesite 3. predmet:
Unesite šifru predmeta: 3
Unesite naziv predmeta: Napredna interoperabilnost u Javi
Unesite broj ECTS bodova za predmet 'Napredna interoperabilnost u Javi':8
Odaberite profesora:
1. Darko Markota
2. Ivica Krešić
Odabir >> 2
Unesite broj studenata za predmetu 'Napredna interoperabilnost u Javi':1
Unesite 1. studenta:
Unesite ime studenta: Pero
Unesite prezime studenta: Perić
Unesite datum rođenja studenta Perić Pero u formatu (dd.MM.yyyy.):03.06.1998.
Unesite JMBAG studenta: Perić Pero:38475930459
Unesite 2. studenta:
Unesite ime studenta: Ivo
Unesite prezime studenta: Ivić
Unesite datum rođenja studenta Ivić Ivo u formatu (dd.MM.yyyy.):17.11.1999.
Unesite JMBAG studenta: Ivić Ivo:85439458943
Unesite 3. studenta:
Unesite ime studenta: Jadranko
Unesite prezime studenta: Marić
Unesite datum rođenja studenta Marić Jadranko u formatu (dd.MM.yyyy.):18.10.1997.
Unesite JMBAG studenta: Marić Jadranko:9430454380348
Unesite 1. ispitni rok:
Odaberite predmet:
1. Programiranje u jeziku Java
2. Web aplikacije u Javi
3. Napredna interoperabilnost u Javi
Odabir >> 1
Odaberite studenta:
1. Pero Perić
2. Ivo Ivić
3. Jadranko Marić
Odabir >> 3
Unesite ocjenu na ispitu (1-5): 5
Unesite datum i vrijeme ispita u formatu (dd.MM.yyyy.THH:mm):12.10.2022.T17:00
Student Jadranko Marić je ostvario ocjenu 'izvrstan' na predmetu 'Programiranje u
jeziku Java'``
NAPOMENE
1. Osim implementacija vježbe prema uputama, dozvoljeno je uvoditi i promjene ako su
opravdane i ne narušavaju koncepte objektno-orijentiranog programiranja.
2. Nakon naredbi za unos numeričkih podataka (BigDecimal ili Integer) izvršiti metodu „nextLine“
nad objektom klase Scanner koji se koristi. Proučiti odgovore na sljedećem linku:
http://stackoverflow.com/questions/13102045/skipping-nextline-after-using-next-nextint-orother-nextfoo-methods.
