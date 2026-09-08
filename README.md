# Minpro-1-PBO-SistemPengelolaanPaketEkspedisi

MUHAMMAD ARHAM ANUGRAH - 2509116044


--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Sistem Pengelolaan Paket merupakan program berbasis Java yang dibuat untuk membantu proses pencatatan dan pengelolaan data paket pada suatu layanan pengiriman. Program ini dirancang untuk mengelola paket dari berbagai jasa ekspedisi, seperti JNE, J&T, dan SPX, sehingga sistem tidak terbatas pada satu perusahaan ekspedisi saja.Setiap paket memiliki informasi yang dapat dikelola, seperti nomor resi, nama penerima, alamat tujuan, jenis layanan, serta jasa ekspedisi yang digunakan. Dengan demikian, pengguna dapat mencatat dan mengelola berbagai paket dari ekspedisi yang berbeda dalam satu sistem.


Program menyediakan fitur CRUD (Create, Read, Update, Delete) yang memungkinkan pengguna untuk menambahkan data paket baru, melihat daftar paket, mengubah informasi paket, dan menghapus data paket. Penggunaan berbagai jasa ekspedisi pada program bertujuan agar sistem lebih fleksibel dan dapat digunakan untuk mengelola paket secara umum. Jasa ekspedisi diperlakukan sebagai bagian dari informasi paket, sehingga pengguna dapat mencatat paket berdasarkan ekspedisi yang digunakan tanpa perlu membuat sistem yang berbeda untuk setiap perusahaan ekspedisi.

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Alur Program

1. Start dan masuk pada tampilan menu utama <img width="1920" height="1080" alt="Screenshot 2026-09-08 183228" src="https://github.com/user-attachments/assets/158b4b33-9802-42e7-8e56-d4aa82d6d055" />

Program menampilkan 6 pilihan menu yakni tambah paket, tampilkan semua paket, cari paket, update paket, hapus paket, dan keluar

2. User memilih menu 1 untuk menambah data paket (create) <img width="1920" height="1080" alt="Screenshot 2026-09-08 183902" src="https://github.com/user-attachments/assets/d08f0e8d-0094-49a1-9975-5b3da9faf7b7" />

Setelah masuk dalam menu tambah paket, user akan diminta untuk mengisi data paket mulai dari id paket, no resi, nama pengirim, dan tanggal masuk. Di data penerima id penerima, nama penerima, alamat, dan no hp. Pada data ekspedisi, id ekspedisi, nama ekspedisi ex"JNE", dan jenis layanan ex"REG, EXPRESS etc". Terakhir adalah data kurir yakni idkurir, nama kurir dan no hp kurir.

3. Untuk menampilkan semua data paket (Read), user memilih menu 2 <img width="1920" height="1080" alt="Screenshot 2026-09-08 183936" src="https://github.com/user-attachments/assets/379cf89c-52f1-4255-95ef-9bdc6065bbbb" />

4. Cari paket menggunakan menu 3 (Read), <img width="1920" height="1080" alt="Screenshot 2026-09-08 191134" src="https://github.com/user-attachments/assets/b7ccb05b-f4e8-47df-8235-247cb10863aa" />


pertama, user akan memilih mencari berdasarkan id atau no resi, pada kasus dimana paket sedikit, user bisa menggunakan pencarian berdasarkan id, disaat data paket cukup banyak dapat menggunakan no resi. Program akan menampilkan data paket yang tertera mulai dari detail, penerima, ekspedisi hingga kurir.

5. Update paket (update), dapat digunakan user untuk mengubah status paket ataupun data penerima hinngga kurir jika terjadi salah input menggunakan menu 4. <img width="1920" height="1080" alt="Screenshot 2026-09-08 184058" src="https://github.com/user-attachments/assets/6758cf94-6c92-4d4e-8858-a18d22d36fa5" />

6. Hapus paket(delete) <img width="1920" height="1080" alt="Screenshot 2026-09-08 184309" src="https://github.com/user-attachments/assets/da5aad80-8724-4313-ac91-79069437b788" />

dapat user gunakan apabila ingin menghapus data paket


7. Menu keluar, dapat digunakan user untuk keluar dari program <img width="1920" height="1080" alt="Screenshot 2026-09-08 184309" src="https://github.com/user-attachments/assets/103b9c02-0483-46a1-8294-38f471f2e932" />


------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Access modifier diterapkan pada deklarasi atribut dan method di setiap class, seperti penggunaan private pada atribut dan public pada method. Encapsulation diterapkan dengan membatasi akses atribut menggunakan private dan menyediakan method seperti getter untuk mengakses data tersebut. Input validation diterapkan pada bagian program yang menerima input dari pengguna seperti pada menu utama yang mewajibkan user memilih menu 1 - 6, ketika user memilih 0, maka user akan diminta untuk memasukkan angka >0 dan jika >6 maka menampilkan output menu tidak tersedia!
