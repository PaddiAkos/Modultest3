/*
Adatbázis létrehozása feladat

Készíts adatbázis-táblákat a feladat leírása alapján!
(Magát az adatbázist nem kell létrehoznod.)

Amit be kell adnod:
    - a táblák létrehozásának MySQL utasítása
    - a táblák mezőinek létrehozásához és beállításához szükséges MySQL utasítások

Az utasításokat jelen fájl tartalmazza!

A bónusz feladat megoldása nem kötelező.

Nem futtatható (azaz szintaktikai hibás) SQL utasításokért nem jár pont.
A feladatot részben teljesítő megoldásokért részpontszám jár.
A bónusz feladatnál csak a teljesen helyes megoldásért jár pont.

A feladat leírása törölhető.

Jó munkát!
*/

/*
Adatbázis-táblák létrehozása (20 pont)

Az általad létrehozott adatbázist egy üzenetküldő alkalmazáshoz szeretnénk használni.
Az alkalmazásban a felhasználók regisztrálás után tudnak üzenetet küldeni szintén regisztrált felhasználóknak,
valamint a kapott üzenetekre válaszolhatnak.
Nincs lehetőség több címzett megadására - azaz egy üzenetet csak egy felhasználó részére lehet küldeni.

Az adatbázisnak képesnek kell lennie a következő adatok tárolására:
    1. regisztrált felhasználók adatai
        - kötelező adatok: név, email-cím, jelszó, aktív felhasználó-e, a regisztrálás időpontja
    2. a regisztrált felhasználók által egymásnak küldött üzenetek adatai
        - kötelező adatok: küldő, címzett, üzenet szövege, az üzenet küldésének időpontja,
          továbbá ha az üzenet egy korábban kapottra válasz, akkor hivatkozás a megválaszolt üzenetre

Kritériumok az adatbázissal kapcsolatban:
    - legalább kettő, legfeljebb négy táblát tartalmazzon
    - legyen legalább egy kapcsolat a létrehozott táblák között (idegen kulccsal)
      (egy tábla saját magával is kapcsolódhat)
    - a fent leírt adatokon kívül más adatokat is tárolhat, de egy táblán legfeljebb 8 mező lehet
    - az adatbázis, a táblák és a mezők elnevezése rajtad áll, azonban használj angol megnevezéseket, méghozzá következetesen
      (ha az egyik táblában camel-case szerinti mező-neveket adtál, akkor a másik táblában is tégy úgy)
      1.
      CREATE TABLE `gigapoli_progmatic`.`user_registration` ( `user_name` VARCHAR(100) CHARACTER SET ucs2 COLLATE ucs2_czech_ci NOT NULL , `user_email` VARCHAR(100) NOT NULL , `user_active` BOOLEAN NOT NULL , `user_reg_date` DATE NOT NULL DEFAULT CURRENT_TIMESTAMP , `user_password` INT NOT NULL , UNIQUE (`user_name`)) ENGINE = InnoDB;
      2.
      CREATE TABLE `gigapoli_progmatic`.`user_massage` ( `massage_to` VARCHAR(100) NOT NULL , `massage_from` VARCHAR(100) NOT NULL , `massage_date` DATE NOT NULL , `massage_old` VARCHAR(100) NOT NULL ) ENGINE = InnoDB;
      FOREIGN KEY (massage_from) REFERENCES user_registration(user_name), FOREIGN KEY (massage_to) REFERENCES user_registration(user_name),



*/




/*
Bónusz feladat (5 pont)

Adj hozzá adatokat mindegyik táblához!
(Az adatoknak nem kell valósnak lenniük. Egy felhasználói email-cím lehet például: 'valami@valami.va')

*/
