# Praktikum 1
1. Jelaskan fungsi kode program berikut
```if d(data[j-1]>data[j]){```
    ```temp = data[j];```
    ```data[j]=data[j-1];```
    ```data[j-1]=temp;```
```}```
2. Tunjukkan kode program yang merupakan algoritma pencarian nilai minimum pada selection sort!
3. Pada Insertion sort , jelaskan maksud dari kondisi pada perulangan  ```while (i>=0 &7 data[j]>temp)```
4. Pada Insertion sort, apakah tujuan dari perintah ```data[j+1]= data[j];```

## Jawaban: 
1. Kode program tersebut untuk proses swap dua elemen yang bersebelahan menggunakan bubble sort. Kondisi if untuk mengecek apakah elemen sebelumnya lebih besar dari elemen sesudahnya. Apabila iya, maka keduanya di swap menggunakan variabel sementara temp.
2. Kode program yang mencari nilai pada selection sort adalah 
```for (int j = i + 1; j < jumData; j++) {```
    ```if (data[j] < data[min]) {```
        ```min = j;```
    ```}}```
pada kondisi if membandingkan elemen sebelumnya dengan elemen minimal dan menyimpan di variabel min
3. Kondisi pada perulangan tersebut j>= 0 memastikan indeks agar tidak melewati batas awal array dan data[j] > temp agar apabila elemen j masih lebih besar daripada elemen yang disisipkan. Apabila keduanya terpenuhi, elemen temp dapat di posisi yang tepat.
4. tujuan prohram tersebut untuk menggeser elemen ke kanan sattu posisi, membuat ruang kosong untuk menaruh nilai temp di posisi yang tepat.
# Praktikum 2
## Bubble Sort
1. Perhatikan perulangan di dalam bubbleSort() di bawah ini:
```for (int i=0;m i < listMhs.length-1; i++){```
    ```for (int j=1; j<listMhs.length-i; j++){```
a.	Mengapa syarat dari perulangan i adalah i<listMhs.length-1 ?
b.	Mengapa syarat dari perulangan j adalah j<listMhs.length-i ?
c.	Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i  akan berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh?
2.	Modifikasi program diatas dimana data mahasiswa bersifat dinamis (input dari keyborad) yang terdiri dari nim, nama, kelas, dan ipk!
### Jawaban: 
1. bubbleSort()
- a. Karena setiap perulangan i selesai, satu elemen terbesar sudah berada di posisi yang benar. fungsi length-1 untuk mengurutkan semuanya sehingga elemen terakhir otomatis sudah benar tanpa perlu dibandingkan lagi.
- b. Karena setelah tahap ke-i, sebanyak i elemen di bagian akhir array sudah berada di posisi yang benar. Mengurangi i dari batas atas, perulangan j tidak memproses elemen yang sudah tersusun.
- c. Perulangan i sebanyak 49kali dan bubble sort hanya 49 tahap.
2. sudah saya modifikasi.

## Insertion Sort
Di dalam method selection sort, terdapat baris program seperti di bawah ini:
```for (int j = i + 1; j < listMhs.length; j++) {```
    ```if (listMhs[j].ipk < listMhs[idxMin].ipk) {```
        ```dxMin = j;```
            ```}```
            ```}``
Untuk apakah proses tersebut, jelaskan!
### Jawaban:
- perulangan dimulai dari elemen setelah posisi i, mencari sisa array yang belum tersusun.
- lalu pada kondisi if berfungsi untuk membandingkan ipk elemen saat ini dengan ipk elemen sementara yang dianggap minimal/terkecil.
- ```idxMin = j``` berfungsi jika ditemukan ipk yang lebih kecil, nilai tersebut disimpan di idxMin ke indeks tersebut.

## Insertion Sort
Ubahlah fungsi pada InsertionSort sehingga fungsi ini dapat melaksanakan proses sorting dengan cara descending.
### Jawaban:
Sudah saya modifikasi.