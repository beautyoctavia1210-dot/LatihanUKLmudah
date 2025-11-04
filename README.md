# LatihanUKLmudah
🧠 Deskripsi Program

Program ini dibuat untuk membantu perusahaan ekspedisi menghitung total biaya pengiriman sebuah paket. Biaya ditentukan berdasarkan tiga hal utama:
- Berat paket (kg)
- Jarak pengiriman (km)
- Volume paket (cm³), yang dihitung dari panjang × lebar × tinggi

Ada dua jenis biaya yang dikenakan:
1.Biaya per kilogram tergantung jarak:
 - Jika jarak ≤ 10 km → Rp 4.250 per kg
 - Jika jarak > 10 km → Rp 6.000 per kg
2.Biaya tambahan volume sebesar Rp 50.000 jika volume paket melebihi 100 cm³

Pengguna cukup memasukkan data berat, jarak, dan dimensi paket. Program akan menghitung volume, menentukan tarif yang sesuai, dan menampilkan total biaya pengiriman.
Program ini berguna untuk mempercepat proses perhitungan dan menghindari kesalahan manual dalam menentukan biaya kirim.

⚙️ Cara Kerja Program

1.Pengguna memasukkan data paket
 Program akan meminta input berupa:
   - Berat paket (dalam kilogram)
   - Jarak tempuh pengiriman (dalam kilometer)
   - Dimensi paket: panjang, lebar, dan tinggi (dalam cm)
2.Program menghitung volume paket
 Volume dihitung dengan rumus:
  \mathrm{Volume}=\mathrm{panjang}\times \mathrm{lebar}\times \mathrm{tinggi}- Program menentukan tarif per kilogram
  - Jika jarak ≤ 10 km → tarif Rp 4.250 per kg
  - Jika jarak > 10 km → tarif Rp 6.000 per kg
3.Program menghitung biaya pengiriman berdasarkan berat dan tarif
 \mathrm{Biaya}=\mathrm{berat}\times \mathrm{tarif\  per\  kg}- Program mengecek apakah volume melebihi 100 cm³
  - Jika ya, tambahkan biaya tambahan Rp 50.000
4.Program menampilkan hasil akhir
  - Volume paket
  - Biaya total pengiriman

📸 Contoh Output
<img width="1920" height="1080" alt="Screenshot 2025-11-04 104145" src="https://github.com/user-attachments/assets/2821ffdc-414a-412a-8368-77adc8fc4c00" />

