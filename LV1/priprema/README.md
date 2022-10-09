Laboratorijske vježbe iz kolegija “Programiranje u jeziku Java” 2021/2022
Stručni studij – smjer računarstvo
Tehničko veleučilište u Zagrebu
Stranica 1 od 3
© Autor: dr.sc. Aleksander Radovan, v.pred.
1. Prva laboratorijska vježba
1.1. TEMA VJEŽBE
Svrha laboratorijske vježbe je usvajanje osnovnih principa objektno
orijentiranog programiranja, kao što su kreiranje vlastitih klasa te
kreiranje objekata tih klasa. Osim toga, ističu se i principi postavljanja
i dohvaćanja vrijednosti polja (varijabli) unutar klasa, te korištenje
različitih modifikatora za ograničavanje pristupa tim poljima.
1.2. ZADATAK ZA PRIPREMU
Napisati Java program koji će se sastojati od nekoliko klasa
pohranjenih u različitim paketima. Klase simuliraju strukturu za
implementaciju aplikacije za organiziranje proizvodnje različitih
dobara. Program je potrebno implementirati prema sljedećim koracima:
1. Preuzeti najnoviju verziju Jave 17 sa stranica
https://www.oracle.com/java/technologies/downloads/#jdk17-
windows i instalirati je na željenu lokaciju.
2. Preuzeti najnoviju inačicu IntelliJ IDEA Ultimate razvojnog
okruženja s poveznice:
https://www.jetbrains.com/idea/download/#section=windows. Na
stranici https://www.jetbrains.com/community/education/#students
je potrebno kreirati JetBrains korisnički račun korištenjem e-maila
od TVZ-a. Nakon aktivacije korisničkog računa potrebno je
aktivirati Intellij IDEA licencu korištenjem ovih uputa:
https://www.jetbrains.com/help/idea/register.html.
3. Kreirati projekt s nazivom koji odgovara Vašem prezimenu i rednom
broju vježbe (npr. „Radovan-1“) korištenjem sljedećih uputa:
https://www.jetbrains.com/help/idea/creating-and-running-yourfirst-java-application.html.
4. Unutar projekta iz prošlog zadatka unutar „src“ mape kreirati paket
pod nazivom „hr.java.production.model“.
Laboratorijske vježbe iz kolegija “Programiranje u jeziku Java” 2021/2022
Stručni studij – smjer računarstvo
Tehničko veleučilište u Zagrebu
Stranica 2 od 3
© Autor: dr.sc. Aleksander Radovan, v.pred.
5. U paketu iz četvrtog zadatka kreirati klasu „Category“ koja sadrži
dvije „String“ varijable pod nazivom „name“ i „description“.
Korištenjem uputa sa stranica
https://www.jetbrains.com/help/idea/generatingcode.html#generate-constructors i
https://www.jetbrains.com/help/idea/generatingcode.html#generate-getters-setters generirati konstruktor koji
prima oba ulazna parametra, te „getter“ i „setter“ metode za te
varijable.
6. U paketu iz četvrtog zadatka kreirati klasu „Item“ koja sadrži objekt
klase „String“ pod nazivom „name“, object „category“ tipa
„Category“ te pet objekta klase „BigDecimal“ pod nazivima „width“,
„height“, „length“, „productionCost“ i „sellingPrice“. Na sličan način
kao što je opisano u prošlom zadatku je potrebno generirati
konstruktor koji prima sve ulazne parametre, te „getter“ i „setter“
metode za te varijable.
7. U paketu iz četvrtog zadatka kreirati Java klasu pod nazivom
„Address“ koja sadrži četiri varijable tipa „String“: „street“,
„houseNumber“, „city“ i „postalCode“. Na sličan način kao što je
opisano u prošlom zadatku je potrebno generirati konstruktor koji
prima sve ulazne parametre, te „getter“ i „setter“ metode za te
varijable.
8. U paketu iz četvrtog zadatka kreirati Java klasu pod nazivom
„Factory“ koja sadrži varijable „name“ (tipa String), „address“ (tipa
„Address“) i „items“ (tipa polje objekata klase „Item“). Na sličan
način kao što je opisano u prošlom zadatku je potrebno generirati
konstruktor koji prima sve ulazne parametre, te „getter“ i „setter“
metode za te varijable.
9. U paketu iz četvrtog zadatka kreirati Java klasu pod nazivom
„Store“ koja sadrži varijable „name“ i „webAddress“ (tipa „String“) te
„items“ (tipa polje objekata klase „Item“). Na sličan način kao što je
opisano u prošlim zadacima je potrebno generirati konstruktor koji
prima sve ulazne parametre, te „getter“ i „setter“ metode za te
varijable.
10. Kreirati novi paket pod nazivom „hr.java.production.main“.
Laboratorijske vježbe iz kolegija “Programiranje u jeziku Java” 2021/2022
Stručni studij – smjer računarstvo
Tehničko veleučilište u Zagrebu
Stranica 3 od 3
© Autor: dr.sc. Aleksander Radovan, v.pred.
11. U paketu iz prošlog zadatka kreirati klasu „Main“ koja sadrži
„main“ metodu. U toj metodi je potrebno zatražiti unos podataka za
tri kategorije artikala (objekata klase „Category“), pet artikala
(objekata klase „Item“), dvije tvornice (objekta klase „Factory“) s
odabranim artiklima te dvije trgovine (objekta klase „Store“) s
odabranim artiklima. U slučaju neispravnog unosa, korisniku je
potrebno prijaviti pogrešku i zatražiti novi unos.
12. Pronaći tvornicu koja proizvodi artikl koji ima najveći volumen i
trgovinu koja prodaje najjeftiniji artikl.
13. Logiku unosa svakog od entiteta je potrebno izdvojiti u zasebnu
metodu.
14. Projekt iz trećeg zadatka je potrebno pretvoriti u Maven projekt
korištenjem uputa s ove poveznice:
https://www.jetbrains.com/help/idea/convert-a-regular-project-intoa-maven-project.html.
NAPOMENE:
1. Osim implementacija vježbe prema uputama, dozvoljeno je uvoditi i
promjene ako su opravdane i ne narušavaju koncepte objektnoorijentiranog programiranja.
2. Nakon naredbi za unos numeričkih podataka (BigDecimal ili Integer)
izvršiti metodu „nextLine“ nad objektom klase Scanner koji se
koristi. Proučiti odgovore na sljedećem linku:
http://stackoverflow.com/questions/13102045/skipping-nextlineafter-using-next-nextint-or-other-nextfoo-methods.
