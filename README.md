# LSN_Task2

##Założenia:
- aplikacja będzie czytać dane z pliku;
- aplikacja oczekuje zwalidowanych danych (nie waliduje pliku wejściowego);
- aplikacja oczekuje danych wejściowych w formacie: 
```
1 2 10 7 5 3 6 6 13 0
```
- przykładowe dane wyjściowe:

```
0 13
3 10
6 7
6 7
```

##Uruchomienie
- projekt maven'owy, zbudować przez:

```mvn clean install```
- uruchomić zbudowanego jar'a przekazując jako parametr ścieżke do pliku, na przykład:

``` java -jar target\t2-1.0-SNAPSHOT.jar C:\_WORK\LOGISFERA_NOVA\t2_test.txt```
