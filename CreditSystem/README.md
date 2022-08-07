# Credit Application System


### Kurallar

Sisteme yeni kullanıcılar tanımlanabilir, mevcut müşteriler güncellenebilir veya
silinebilir.
<br>
● Kredi skoru 500’ün altında ise kullanıcı reddedilir. (Kredi sonucu: Red)<br>
● Krediskoru 500 puanile 1000 puanarasındaiseveaylıkgeliri5000TL’ninaltında ise
kullanıcınınkredibaşvurusuonaylanır vekullanıcıya 10.000 TLlimitatanır. (Kredi
Sonucu: Onay)<br>
● Krediskoru 500 puanile 1000 puanarasındaiseveaylıkgeliri5000TL’ninüstünde
isekullanıcınınkredibaşvurusuonaylanır vekullanıcıya 20.000TL limitatanır. (Kredi
Sonucu: Onay) <br>
● Kredi skoru 1000 puana eşit veya üzerinde ise kullanıcıya AYLIKGELİR BİLGİSİ*
KREDİ LİMİT ÇARPANI kadar limit atanır. (Kredi Sonucu: Onay)<br>

● Kredininneticelenmesisonucundailgilibaşvuruveritabanınakaydedilir. Daha
sonrasında ise ilgili telefon numarasına bilgilendirme SMS’i gönderilir ve
endpoint’ten onay durum bilgisi(red veya onay), limit bilgisi dönülür.<br>
● Gerçekleştirilmiş bir kredi başvurusu sadece kimlik numarası ile sorgulanabilir.<br>

● Varsayılan kredi skor servisinin T.C.Kimlik numaralarının son rakamına göre
aşağıdaki skorları döneceği varsayılacaktır; (sonu tek sayı ile biten T.C.Kimlik
numaraları hatalı olduğu varsayılacaktır);<br>

