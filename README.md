# Asal Sayılar Programı / Prime Numbers Program

[English version below](#english-version)

## Türkçe

Bu Java programı, 1'den 1000'e kadar olan asal sayıları bulur ve ekrana yazdırır.

### Asal Sayı Nedir?

Asal sayı, sadece 1'e ve kendisine tam bölünebilen 1'den büyük tam sayılardır. Örneğin, 2, 3, 5, 7, 11 asal sayılardır.

### Nasıl Çalışır

1. Program 2'den 1000'e kadar olan her sayıyı kontrol eder.
2. Her sayı için, 2'den başlayarak o sayının kareköküne kadar olan sayılara bölünüp bölünmediğini kontrol eder.
3. Eğer sayı hiçbir şekilde tam bölünmezse, asal sayı olarak kabul edilir ve ekrana yazdırılır.

### Nasıl Kullanılır

1. Sisteminizde Java'nın kurulu olduğundan emin olun.
2. Java dosyasını derleyin:
   ```
   javac AsalSayilar.java
   ```
3. Programı çalıştırın:
   ```
   java AsalSayilar
   ```
4. Program otomatik olarak 1'den 1000'e kadar olan asal sayıları ekrana yazdıracaktır.

### Program Çıktısı

Program, 1'den 1000'e kadar olan tüm asal sayıları yan yana, aralarında birer boşluk olacak şekilde yazdırır.

Örnek çıktı başlangıcı:
```
1'den 1000'e kadar olan asal sayılar:
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 ...
```

### Katkıda Bulunma

Bu projeyi fork edip geliştirmeler yapabilir veya farklı aralıklar için asal sayı bulan versiyonlar ekleyebilirsiniz.

### Lisans

Bu proje açık kaynaklıdır ve [MIT Lisansı](https://opensource.org/licenses/MIT) altında kullanıma sunulmuştur.

---

## English Version

This Java program finds and prints prime numbers from 1 to 1000.

### What is a Prime Number?

A prime number is a whole number greater than 1 that is only divisible by 1 and itself. For example, 2, 3, 5, 7, 11 are prime numbers.

### How It Works

1. The program checks every number from 2 to 1000.
2. For each number, it checks if it's divisible by any number from 2 up to its square root.
3. If the number is not divisible by any of these numbers, it's considered prime and is printed.

### How to Use

1. Ensure you have Java installed on your system.
2. Compile the Java file:
   ```
   javac AsalSayilar.java
   ```
3. Run the program:
   ```
   java AsalSayilar
   ```
4. The program will automatically print all prime numbers from 1 to 1000.

### Program Output

The program prints all prime numbers from 1 to 1000 side by side, separated by spaces.

Example of the beginning of the output:
```
1'den 1000'e kadar olan asal sayılar: (Prime numbers from 1 to 1000:)
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 ...
```

### Note

The program output is in Turkish. The message "1'den 1000'e kadar olan asal sayılar:" translates to "Prime numbers from 1 to 1000:".

### Contributing

Feel free to fork this project and make improvements or add versions that find prime numbers for different ranges.

### License

This project is open source and available under the [MIT License](https://opensource.org/licenses/MIT).
