package com.ziadsyahrul.mahadapps.activities

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ziadsyahrul.mahadapps.R
import com.ziadsyahrul.mahadapps.activities.adapter.ArticleAdapter
import com.ziadsyahrul.mahadapps.activities.image.ImageArticle

class ArticleActivity : AppCompatActivity() {

    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article)

        val imageList = listOf<ImageArticle>(
            ImageArticle(R.drawable.img_article1, "Mengenal Syarat Shalat dari Kitab Bulughul Maram Ibnu Hajar","Yang dimaksud syarat sah shalat adalah bersuci, kita terapkan dengan pengertian di atas misalnya untuk bersuci. Shalat itu tergantung pada bersuci. Tidak ada bersuci berarti tidak ada shalat. Namun jika bersuci itu ada, belum tentu shalat itu ada, karena masih ada syarat lainnya selain dari bersuci yang mesti dipenuhi seperti menutup aurat\n" +
                    "\n" +
                    "Para ulama membedakan antara rukun dan syarat. Kalau syarat itu di luarnya sesuatu, sedangkan rukun itu di dalamnya atau bagian dari sesuatu.\n" +
                    "\n" +
                    "Dalam bahasan Bulughul Maram karya Ibnu Hajar ini, beliau menyebutkan hadits-hadits terkait dengan empat syarat shalat yaitu bersuci, menutup aurat, menghadap kiblat, dan menjauhi najis. Sedangkan syarat mengetahui waktu shalat sudah dijelaskan dalam hadits-hadits sebelumnya ketika menjelaskan bab waktu shalat. Karena mengetahui waktu shalat itu merupakan syarat wajib shalat dan syarat pelaksanaan. Setelah itu barulah beliau membahas hadits tentang azan karena azan itu berkumandang kalau sudah masuk waktu shalat. Ada juga bahasan tambahan dalam syarat shalat ini tentang berbicara dan banyak gerak.\n" +
                    "\n"),
            ImageArticle(R.drawable.img_article2, "Makruh Dibolehkan Ketika Ada Hajat", "Tahukan perkara makruh? Yaitu perkara yang ditinggalkan itu lebih baik. Sedangkan hajat itu adalah sesuatu yang dibutuhkan untuk menghilangkan kesempitan.\n" +
                    "\n" +
                    "Ada kaedah yang sangat membantu ketika memahami makruh sebagai berikut,\n" +
                    "\n" +
                    "الكَرَاهَةُ تَزُوْلُ بِالحَاجَةِ\n" +
                    "\n" +
                    "“Suatu yang makruh menjadi hilang karena ada hajat.”\n" +
                    "\n" +
                    "Dalil dari kaedah tentang makruh di atas di antaranya adalah dalil berikut.\n" +
                    "\n" +
                    "Diriwayatkan dari Abi Barzah, beliau berkata,\n" +
                    "\n" +
                    "أَنَّ رَسُولَ اللَّهِ – صلى الله عليه وسلم – كَانَ يَكْرَهُ النَّوْمَ قَبْلَ الْعِشَاءِ وَالْحَدِيثَ بَعْدَهَا\n" +
                    "\n" +
                    "“Rasulullah shallallahu ‘alaihi wa sallam membenci tidur sebelum shalat ‘Isya dan ngobrol-ngobrol setelahnya.” (HR. Bukhari, no. 568). Namun Rasulullah shallallahu ‘alaihi wa sallam pernah begadang bersama Abu Bakar membicarakan urusan kaum muslimin. Hal ini dikatakan oleh Umar bin Al-Khattab, sebagaimana disebutkan dalam hadits riwayat Tirmidzi, no. 169. Ini menandakan suatu yang makruh dibolehkan ketika ada hajat.\n" +
                    "\n" +
                    "Ibnul ‘Arabi rahimahullah mengatakan, “Tidur sebelum Isya dimakruhkan karena dikhawatirkan melewatkan waktu shalat Isya. Sedangkan begadang bakda Isya dimakruhkan pada perkara yang bukan untuk menuntut ilmu, kebaikan, dan hajat. Namun jika maksud begadang demi ilmu dan menunaikan hajat, seperti itu dibolehkan.” (Al-‘Aridhah, Ibnul ‘Arabi, 1:227, dinukil dari Al-Haajatu Asy-Syar’iyyah Hududuha wa Qawa’iduhaa, hlm. 131)\n"),
            ImageArticle(R.drawable.img_article3, "Ortu Membagi Harta Waris Sebelum Meninggal", "Apa perbedaan antara waris, hibah dan wasiat?\n" +
                    "\n" +
                    "Ada pertanyaan yang biasa muncul seperti ini. Ada orang tua yang sudah membagi-bagi harta yang ia miliki kepada anak-anaknya sebelum ia meninggal dunia, apakah itu termasuk dalam waris, hibah ataukah wasiat?\n" +
                    "\n" +
                    "Jika orang tua membagi-bagi harta kepada anak-anaknya ketika ia hidup, maka statusnya adalah sebagai hibah. Ada beberapa point penting yang perlu diingatkan tentang masalah hibah ini:\n" +
                    "\n" +
                    "Anak-anak dibagi hibah ketika masa hidup orang tuanya, bukan setelah matinya.\n" +
                    "Jika baru dimiliki setelah orang tua meninggal dunia, statusnya bukanlah hibah.\n" +
                    "Tidak dipersyaratkan dalam pembagian hibah mesti sama, tidak mesti juga pembagiannya mengikuti pembagian dalam hukum waris. Terserah bagi orang tua untuk membagi hibah tadi, yang jelas harus dengan adil.\n" +
                    "Adapun jika orang tua membagi harta dan kepemilikannya nantinya setelah orang tua meninggal dunia, maka dianggap sebagai wasiat. Namun wasiat tidaklah boleh dibagi untuk ahli waris.\n" +
                    "\n" +
                    "Dari ‘Amr bin Kharijah radhiyallahu ‘anhu, ia berkata bahwa Rasulullah shallallahu ‘alaihi wa sallam bersabda,\n" +
                    "\n" +
                    "إِنَّ اللَّهَ قَسَمَ لِكُلِّ وَارِثٍ نَصِيبَهُ مِنَ الْمِيرَاثِ فَلاَ يَجُوزُ لِوَارِثٍ وَصِيَّةٌ\n" +
                    "\n" +
                    "“Sesungguhnya Allah membagi untuk setiap ahli warisnya sudah mendapatkan bagian-bagiannya. Karenanya tidak boleh ada wasiat untuk ahli waris.” (HR. Ibnu Majah, no. 2712; Tirmidzi, no. 2121. Al-Hafizh Abu Thahir mengatakan bahwa sanad hadits ini hasan)\n"),
            ImageArticle(R.drawable.img_article4, "Lailatul Qadar Masih Bisa Diperoleh Walau di Rumah Saat Pandemi\n", "Apakah kalau kita di rumah seperti saat ini, kita bisa mendapatkan\n" +
                    "\n" +
                    "Perlu dipahami, para ulama salaf berpendapat bahwa keutamaan lailatul qadar itu akan diperoleh oleh setiap muslim yang diterimanya amalnya di malam tersebut.\n" +
                    "\n" +
                    "Ibnu Rajab dalam kitabnya Lathaif Al-Ma’arif (hlm. 341) membawakan hadits dalam musnad Imam Ahmad, sunan An-Nasai, dari Abu Hurairah radhiyallahu ‘anhu, dari Nabi shallallahu ‘alaihi wa sallam, beliau bersabda,\n" +
                    "\n" +
                    "فِيهِ لَيْلَةٌ خَيْرٌ مِنْ أَلْفِ شَهْرٍ مَنْ حُرِمَ خَيْرَهَا فَقَدْ حُرِمَ\n" +
                    "\n" +
                    "“Di dalam bulan Ramadhan itu terdapat suatu malam yang lebih baik dari seribu bulan. Siapa yang tidak mendapati malam tersebut, maka ia akan diharamkan mendapatkan kebaikan.” (HR. An-Nasai, no. 2108. Al-Hafizh Abu Thahir mengatakan bahwa sanad hadits ini dhaif. Syaikh Al-Albani mengatakan bahwa hadits ini sahih).\n" +
                    "\n" +
                    "Bahkan sampai musafir dan wanita haidh pun bisa mendapatkan malam lailatul qadar.\n" +
                    "\n" +
                    "Juwaibir pernah mengatakan bahwa dia pernah bertanya pada Adh-Dhahak, “Bagaimana pendapatmu dengan wanita nifas, haidh, musafir, dan orang yang tidur (namun hatinya tidak lalai dalam dzikir), apakah mereka bisa mendapatkan bagian dari lailatul qadar?” Adh-Dhahak pun menjawab, “Iya, mereka tetap bisa mendapatkan bagian. Siapa saja yang Allah terima amalannya, dia akan mendapatkan bagian malam tersebut.” (Lathaif Al-Ma’arif, hlm. 341)\n" +
                    "\n" +
                    "Ibnu Rajab rahimahullah menasehatkan, “Wahai saudaraku … Yang terpenting bagaimana membuat amalan itu diterima, bukan kita bergantung pada kerja keras kita. Yang jadi patokan adalah pada baiknya hati, bukan usaha keras badan. Betapa banyak orang yang begadang untuk shalat malam, namun tak mendapatkan rahmat. Bahkan mungkin orang yang tidur yang mendapatkan rahmat tersebut. Orang yang tertidur hatinya dalam keadaan hidup karena berdzikir kepada Allah. Sedangkan orang yang begadang shalat malam, hatinya yang malah dalam keadaan fajir (berbuat maksiat pada Allah).” (Lathaif Al-Ma’arif, hlm. 341)\n" +
                    "\n" +
                    "Kesimpulan paling penting dari penjelasan di atas, malam lailatul qadar tidak disyaratkan iktikaf di masjid atau untuk mendapatkannya dengan beribadah di masjid. Orang yang beribadah di rumah pun masih bisa mendapatkan lailatul qadar. Itulah karunia Allah.\n"),

            ImageArticle(R.drawable.img_article5, "Dosa Riba Tidak Diampuni, Benarkah?\n", "Dosa riba itu tidak diampuni. Benarkah?\n" +
                    "\n" +
                    "Dari ‘Auf bin Malik radhiyallahu ‘anhu, ia berkata bahwa Rasulullah shallallahu ‘alaihi wa sallam bersabda,\n" +
                    "\n" +
                    "إِيَّايَ وَالذُّنُوبَ الَّتِي لا تُغْفَرُ: الْغُلُولُ، فَمَنْ غَلَّ شَيْئًا أَتَى بِهِ يَوْمَ الْقِيَامَةِ، وَآكِلُ الرِّبَا فَمَنْ أَكَلَ الرِّبَا بُعِثَ يَوْمَ الْقِيَامَةِ مَجْنُونًا يَتَخَبَّطُ”, ثُمَّ قَرَأَ: “الَّذِينَ يَأْكُلُونَ الرِّبَا لا يَقُومُونَ إِلا كَمَا يَقُومُ الَّذِي يَتَخَبَّطُهُ الشَّيْطَانُ مِنَ الْمَسِّ”[البقرة آية 275]\n" +
                    "\n" +
                    "“Hati-hati dengan dosa yang tidak diampuni: (1) ghulul (khianat), siapa yang berbuat ghulul, maka ia akan didatangkan dengan sesuatu yang ia khianati pada hari kiamat; (2) pemakan riba, siapa yang memakan riba, maka ia akan dibangkitkan pada hari kiamat dalam keadaan gila seperti kesurupan. Kemudian dibacakanlah ayat (yang artinya), ‘Orang-orang yang makan (mengambil) riba tidak dapat berdiri melainkan seperti berdirinya orang yang kemasukan syaitan lantaran (tekanan) gila.” (QS. Al-Baqarah: 275).” (HR. Ath-Thabrani dalam Al-Mu’jam Al-Kabir, 18/ 60/ 100. Syaikh Al-Albani menilai bahwa hadits ini hasan sebagaimana disebutkan dalam Silsilah Al-Ahadits Ash-Shahihah, no. 3313)\n" +
                    "\n" +
                    "Syaikh Sulaiman Ar-Ruhaili memberikan catatan bahwa yang dimaksud tidak diampuni hanya kalimat untuk sekedar menakut-nakuti. Karena tetap dosa di bawah kesyirikan berada dalam masyiah Allah (kehendak Allah). Namun dikhawatirkan memang pelakukan sulit dimaafkan oleh Allah. (Lihat Dhawabith Ar-Riba, hlm. 21)\n" +
                    "\n" +
                    "Moga Allah menjauhkan kita dari riba dan debu-debunya.\n" +
                    "\n"),

            ImageArticle(R.drawable.img_article6, "Riba dalam e-wallet, dompet digital (Go Pay, OVO, dkk)\n", "Dompet digital atau e-wallet adalah sebuah perangkat elektronik, layanan jasa, atau bahkan program perangkat lunak (aplikasi) yang memungkinkan para penggunanya untuk melakukan transaksi secara online dengan pengguna lainnya untuk membeli barang dan jasa.\n" +
                    "\n" +
                    "Menitip uang pada e-wallet, itu sama seperti kita menitip uang pada suatu toko/ warung. Jika mau belanja, akan didebet langsung dari saldo kita. \n" +
                    "\n" +
                    "Riba dalam Go Pay, OVO, dkk?\n" +
                    "Go-pay, OVO, dkk = muqtaridh = penerima pinjaman\n" +
                    "\n" +
                    "Konsumen = muqridh = pemberi pinjaman\n" +
                    "\n" +
                    "Kaidah: Tidak boleh ada manfaat/ keuntungan yang diterima oleh muqridh (pemberi pinjaman) \n" +
                    "\n" +
                    "Kaidah riba: kullu qordhin jarro manfa’atan fahuwa ribaa, setiap utang piutang yang di dalamnya ada manfaat/ keuntungan untuk kreditur, maka termasuk riba.\n" +
                    "\n" +
                    "\n" +
                    "Hukum menggunakan e-wallet bagaimana?\n" +
                    "Kalau sekadar menyimpan pada e-wallet, terus kita gunakan : hukumnya BOLEH.\n" +
                    "Kalau menyimpan pada e-wallet dan mendapatkan manfaat “free ongkir”, “masa promo” karena top-up pada e-wallet: inilah RIBA.\n" +
                    "Kalau kami sih lebih tentram bisa transfer saja langsung kalau belanja di marketplace, tanpa manfaatin top-up e-wallet (yang ada manfaat bagi kami). Bahkan yang kami harapkan bisa ada marketplace Islami yang bebas dari trik-trik topup riba semacam tadi. Namun, kapan yah marketplace seperti itu hadir? \n" +
                    "\n" +
                    "Semoga segera insya Allah.\n" +
                    "\n"),

            ImageArticle(R.drawable.img_article7, "Bolehkah Menggunakan Hand Sanitizer yang Mengandung Alkohol?\n" +
                    "\n", "Bolehkah menggunakan hand sanitizer yang mengandung alkohol?\n" +
                    "\n" +
                    "Jawabannya, boleh. Alasannya:\n" +
                    "Alkohol pada hand sanitizer bukanlah khamar. Sedangkan yang dilarang dalam Alquran dan hadits untuk khamar adalah segala sesuatu yang memabukkan.\n" +
                    "Asal alkohol adalah zat yang suci. Adapun khamar menurut pendapat sebagian ulama adalah zat suci, walau mayoritas ulama menganggapnya najis. Alkohol sekali lagi berbeda dengan khamar.\n" +
                    "Alkohol pada hand sanitizer digunakan untuk luar tubuh dan tidak bisa dikonsumsi, berbeda dengan khamar yang memang diproduksi untuk diminum (dikonsumsi).\n" +
                    "\n"),

            ImageArticle(R.drawable.img_article8, "Mati Karena Virus Corona, Apakah Mati Syahid?\n" +
                    "\n",
                    "Apakah mati karena virus corona tergolong mati syahid?\n" +
                            "\n" +
                            "Pertama kali akan dikaji lebih dahulu, apakah virus corona masuk kategori ath-tha’un (wabah yang mematikan) ataukah tidak? Baru nanti akan dibahas apakah dapat dikatakan mati syahid jika ada yang mati karena corona? Lalu syarat disebut syahid apakah sama dengan syahid di medan perang?\n" +
                            "\n" +
                            "Apakah virus corona termasuk ath-tha’un ataukah al-waba’?\n" +
                            "Para ulama berbeda pendapat tentang pengeritan ath-tha’un dan al-waba’. Ada yang menganggap keduanya itu sama dan ada yang membedakan keduanya.\n" +
                            "\n" +
                            "Menurut pakar bahasa arab dan pakar kesehatan, al-waba’ (wabah) adalah penyakit yang menular pada suatu wilayah, bisa penyebarannya cepat dan meluas. Sedangkan ath-tha’un adalah wabah yang menyebar lebih luas dan menimbulkan kematian. Inilah pengertian ath-tha’un menurut pakar bahasa dan ulama fikih.\n" +
                            "\n" +
                            "Para ulama menganggap bahwa virus corona masuk dalam kategori ath-tha’un. Ulama saat ini yang berpendapat demikian adalah Syaikh ‘Abdul ‘Aziz Alu Asy-Syaikh (mufti ‘aam kerajaan Saudi Arabia), Syaikh ‘Abdul Muhsin Al-‘Abbad Al-Badr (ulama besar di kota Madinah), juga Syaikh Sulaiman Ar-Ruhaily (ulama besar di kota Madinah).\n" +
                            "\n" +
                            "Apalagi kalau kita melihat pandangan WHO bahwa virus corona sudah masuk pandemik, lebih jelas lagi kita menyebutnya sebagai ath-tha’un.\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "Jika termasuk ath-tha’un, muslim yang mati karena virus corona tergolong syahid.\n" +
                            "Dari Abu Hurairah radhiyallahu ‘anhu, Rasulullah shallallahu ‘alaihi wa sallam bersabda,\n" +
                            "\n" +
                            "الشُّهَدَاءُ خَمْسَةٌ الْمَطْعُونُ وَالْمَبْطُونُ وَالْغَرِقُ وَصَاحِبُ الْهَدْمِ وَالشَّهِيدُ فِي سَبِيلِ اللَّهِ\n" +
                            "\n" +
                            "“Orang yang mati syahid ada lima, yakni orang yang mati karena ath-tha’un (wabah), orang yang mati karena menderita sakit perut, orang yang mati tenggelam, orang yang mati karena tertimpa reruntuhan dan orang yang mati syahid di jalan Allah.” (HR. Bukhari, no. 2829 dan Muslim, no. 1914)\n" +
                            "\n" +
                            "Dari ‘Abdullah bin Busr radhiyallahu anhu, bahwa Rasulullah shallallahu ‘alaihi wa sallam bersabda,\n" +
                            "\n" +
                            "الْقَتِيلُ فِى سَبِيلِ اللَّهِ شَهِيدٌ وَالْمَطْعُونُ شَهِيدٌ وَالْمَبْطُونُ شَهِيدٌ وَمَنْ مَاتَ فِى سَبِيلِ اللَّهِ فَهُوَ شَهِيدٌ\n" +
                            "\n" +
                            "“Orang yang terbunuh di jalan Allah (fii sabilillah) adalah syahid; orang yang mati karena ath-tha’un (wabah) adalah syahid; orang yang mati karena penyakit perut adalah syahid; dan wanita yang mati karena melahirkan adalah syahid.” (HR. Ahmad, 2: 522. Syaikh Syu’aib Al-Arnauth dan ‘Adil Mursyid menyatakan bahwa sanad hadits ini shahih sesuai syarat Muslim).\n" +
                            "\n" +
                            "Dari Jabir bin ‘Atik radhiyallahu ‘anhu, Nabi shallallahu ‘alaihi wa sallam bersabda,\n" +
                            "\n" +
                            "الشَّهَادَةُ سَبْعٌ سِوَى الْقَتْلِ فِى سَبِيلِ اللَّهِ الْمَطْعُونُ شَهِيدٌ وَالْغَرِقُ شَهِيدٌ وَصَاحِبُ ذَاتِ الْجَنْبِ شَهِيدٌ وَالْمَبْطُونُ شَهِيدٌ وَصَاحِبُ الْحَرِيقِ شَهِيدٌ وَالَّذِى يَمُوتُ تَحْتَ الْهَدْمِ شَهِيدٌ وَالْمَرْأَةُ تَمُوتُ بِجُمْعٍ شَهِيدٌ\n" +
                            "\n" +
                            "“Orang-orang yang mati syahid yang selain terbunuh di jalan Allah ‘azza wa jalla itu ada tujuh orang, yaitu korban ath-tha’un (wabah) adalah syahid; mati tenggelam (ketika melakukan safar dalam rangka ketaatan) adalah syahid; yang punya luka pada lambung lalu mati, matinya adalah syahid; mati karena penyakit perut adalah syahid; korban kebakaran adalah syahid; yang mati tertimpa reruntuhan adalah syahid; dan seorang wanita yang meninggal karena melahirkan (dalam keadaan nifas atau dalam keadaan bayi masih dalam perutnya, pen.) adalah syahid.” (HR. Abu Daud, no. 3111. Al-Hafizh Abu Thahir mengatakan bahwa sanad hadits ini shahih. Lihat keterangan ‘Aun Al-Ma’bud, 8: 275)\n" +
                            "\n" +
                            "Di antara maksud syahid sebagaimana dikatakan oleh Ibnul Ambari,\n" +
                            "\n" +
                            "لِأَنَّ اللَّه تَعَالَى وَمَلَائِكَته عَلَيْهِمْ السَّلَام يَشْهَدُونَ لَهُ بِالْجَنَّةِ . فَمَعْنَى شَهِيد مَشْهُود لَهُ\n" +
                            "\n" +
                            "“Karena Allah Ta’ala dan malaikatnya ‘alaihimus salam menyaksikan orang tersebut dengan surga. Makna syahid di sini adalah disaksikan untuknya.” (Syarh Shahih Muslim, 2:142, juga disebutkan dalam Fath Al-Bari, 6:42).\n" +
                            "\n" +
                            "Ibnu Hajar menyebutkan pendapat lain, yang dimaksud dengan syahid adalah malaikat menyaksikan bahwa mereka mati dalam keadaan husnul khatimah (akhir hidup yang baik). (Lihat Fath Al-Bari, 6:43)\n" +
                            "\n" +
                            "Imam Nawawi rahimahullah menjelaskan bahwa syahid itu ada tiga macam:\n" +
                            "\n" +
                            "Syahid yang mati ketika berperang melawan kafir harbi (yang berhak untuk diperangi). Orang ini dihukumi syahid di dunia dan mendapat pahala di akhirat. Syahid seperti ini tidak dimandikan dan tidak dishalatkan.\n" +
                            "Syahid dalam hal pahala namun tidak disikapi dengan hukum syahid di dunia. Contoh syahid jenis ini ialah mati karena melahirkan, mati karena wabah penyakit, mati karena reruntuhan, dan mati karena membela hartanya dari rampasan, begitu pula penyebutan syahid lainnya yang disebutkan dalam hadits shahih. Mereka tetap dimandikan, dishalatkan, namun di akhirat mendapatkan pahala syahid. Namun pahalanya tidak harus seperti syahid jenis pertama.\n" +
                            "Orang yang khianat dalam harta ghanimah (harta rampasan perang), dalam dalil pun menafikan syahid pada dirinya ketika berperang melawan orang kafir. Namun hukumnya di dunia tetap dihukumi sebagai syahid, yaitu tidak dimandikan dan tidak dishalatkan. Sedangkan di akhirat, ia tidak mendapatkan pahala syahid yang sempurna. Wallahu a’lam. (Syarh Shahih Muslim, 2: 142-143).\n" +
                            "Dari pembagian Imam Nawawi rahimahullah di atas, jika ada yang mati karena virus corona, makai a masuk dalam golongan syahid yang kedua.\n" +
                            "\n" +
                            "\n" +
                            "Syarat syahid adalah bersabar dan berharap pahala dari Allah\n" +
                            "Dari Yahya bin Ya’mar, Aisyah radhiyallahu ‘anha mengabarkan kepadanya bahwa ia bertanya kepada Rasulullah shallallahu ‘alaihi wa sallam tentang ath-tha’un (wabah yang menyebar dan mematikan), maka beliau menjawab,\n" +
                            "\n" +
                            "كَانَ عَذَابًا يَبْعَثُهُ اللَّهُ عَلَى مَنْ يَشَاءُ ، فَجَعَلَهُ اللَّهُ رَحْمَةً لِلْمُؤْمِنِينَ ، مَا مِنْ عَبْدٍ يَكُونُ فِى بَلَدٍ يَكُونُ فِيهِ ، وَيَمْكُثُ فِيهِ ، لاَ يَخْرُجُ مِنَ الْبَلَدِ ، صَابِرًا مُحْتَسِبًا ، يَعْلَمُ أَنَّهُ لاَ يُصِيبُهُ إِلاَّ مَا كَتَبَ اللَّهُ لَهُ ، إِلاَّ كَانَ لَهُ مِثْلُ أَجْرِ شَهِيدٍ\n" +
                            "\n" +
                            "“Itu adalah adzab yang Allah turunkan pada siapa saja yang Allah kehendaki. Namun Allah menjadikannya sebagai rahmat kepada orang beriman. Tidaklah seorang hamba ada di suatu negeri yang terjangkit wabah di dalamnya, lantas ia tetap di dalamnya, ia tidak keluar dari negeri tersebut lalu bersabar dan mengharapkan pahala dari Allah, ia tahu bahwa tidaklah wabah itu terkena melainkan dengan takdir Allah, maka ia akan mendapatkan pahala syahid.” (HR. Bukhari, no. 6619)\n" +
                            "\n" +
                            "Ibnu Hajar menerangkan bahwa yang dimaksud sebagai adzab adalah untuk orang kafir dan ahli maksiat. Sedangkan wabah itu jadi rahmat untuk orang beriman. Lihat Fath Al-Bari, 10:192.\n" +
                            "\n"),

            ImageArticle(R.drawable.img_article9, "Denda Karena Telat Bayar Cicilan Kredit, Benarkah Termasuk Riba?\n" ,
                    "Jika seseorang membeli barang dengan pembayaran tertunda, maka bentuknya berarti berutang. Dalam berutang ini, pihak kreditor (pemberi pinjaman) tidak boleh memberikan tambahan jika pelunasan itu telat.\n" +
                            "\n" +
                            "Majma’ Al-Fiqh Al-Islami pernah mengeluarkan keputusan, “Ketiga: Jika pembeli kredit telat dalam melunasi cicilan sesuai dengan janji yang ditetapkan, maka tidak boleh dikenakan tambahan (denda) dengan syarat sebelumnya atau tanpa syarat. Karena denda dalam hal ini termasuk riba yang diharamkan.” (Dinukil dari Fatwa Al-Islam Sual wa Jawab, no. 101384)\n" +
                            "\n" +
                            "Dari Jabir radhiyallahu ‘anhu, Nabi shallallahu ‘alaihi wa sallam bersabda,\n" +
                            "\n" +
                            "لَعَنَ رَسُولُ اللَّهِ -صلى الله عليه وسلم- آكِلَ الرِّبَا وَمُوكِلَهُ وَكَاتِبَهُ وَشَاهِدَيْهِ وَقَالَ هُمْ سَوَاءٌ\n" +
                            "\n" +
                            "“Rasulullah shallallahu ‘alaihi wa sallam melaknat pemakan riba (rentenir), penyetor riba (nasabah yang meminjam), penulis transaksi riba (sekretaris) dan dua saksi yang menyaksikan transaksi riba.” Kata beliau, “Semuanya sama dalam dosa.” (HR. Muslim, no. 1598).\n" +
                            "\n" +
                            "Bolehkah tetap kita ikut transaksi, di mana kita bertekad membayarnya tepat waktu biar tidak dikenakan denda?\n" +
                            "\n" +
                            "Syaikh Muhammad Shalih Al-Munajjid menyatakan bahwa tetap tidak boleh mengikuti transaksi semacam itu. Walaupun pembeli bertekad untuk melunasinya tepat waktu karena dua alasan:\n" +
                            "\n" +
                            "Ini sama saja menyetujui syarat riba, itu haram.\n" +
                            "Bisa jadi ia tetap terjatuh dalam riba karena telat saat punya udzur yaitu karena lupa, sakit, atau pergi safar. (Dinukil dari Fatwa Al-Islam Sual wa Jawab, no. 101384)\n" +
                            " \n" +
                            "\n" +
                            "Denda Ketika Telat dalam Pelunasan Utang Termasuk dalam Riba Jahiliyah\n" +
                            "Syaikh Muhammad Shalih Al-Munajjid hafizahullah menyatakan dengan tegas bahwa denda ketika membayar angsuran dari waktu yang ditetapkan termasuk dalam riba jahiliyah yang para ulama sepakat akan keharamannya. Karena riba jahiliyah dahulu seperti itu. Lihat bahasan dalam Fatwa Al-Islam Sual wa Jawab, no. 117956.\n" +
                            "\n" +
                            "Ibnu Katsir rahimahullah mengatakan, ”Bersabarlah kepada orang yang sulit melunasi utang.” (Tafsir Al-Qur’an Al-‘Azhim, 2:287)\n" +
                            "\n" +
                            "Di halaman yang sama, Ibnu Katsir juga menyatakan bahwa jangan seperti orang jahiliyah yang akan berkata kepada pihak yang berutang (debitor) ketika sudah jatuh tempo, “Lunasilah! Kalau tidak, utangmu akan dibungakan.”\n" +
                            "\n" +
                            "Yang harusnya dilakukan pada orang yang berutang sebagaimana disebutkan dalam ayat berikut,\n" +
                            "\n" +
                            "وَإِنْ كَانَ ذُو عُسْرَةٍ فَنَظِرَةٌ إِلَى مَيْسَرَةٍ وَأَنْ تَصَدَّقُوا خَيْرٌ لَكُمْ إِنْ كُنْتُمْ تَعْلَمُونَ\n" +
                            "\n" +
                            "“Dan jika (orang yang berutang itu) berada dalam kesukaran maka berilah tangguh sampai dia lapang. Dan menyedekahkan (sebagian atau semua utang) itu lebih baik bagimu, jika kamu mengetahui.” (QS. Al-Baqarah: 280)\n" +
                            "\n" +
                            "Dari salah seorang sahabat Rasulullah shallallahu ‘alaihi wa sallam, yaitu Abul Yasar; beliau shallallahu ‘alaihi wa sallam bersabda,\n" +
                            "\n" +
                            "مَنْ أَحَبَّ أَنْ يُظِلَّهُ اللَّهُ عَزَّ وَجَلَّ فِى ظِلِّهِ فَلْيُنْظِرِ الْمُعْسِرَ أَوْ لِيَضَعْ عَنْهُ\n" +
                            "\n" +
                            "“Barang siapa ingin mendapatkan naungan Allah ‘Azza wa Jalla, hendaklah dia memberi tenggang waktu bagi orang yang mendapat kesulitan untuk melunasi utang atau bahkan dia membebaskan utangnya tadi.” (HR. Ahmad, 3:427. Syaikh Syu’aib Al-Arnauth mengatakan bahwa hadits ini shahih)\n" +
                            "\n"),
            ImageArticle(R.drawable.img_article10, "Membunuh Semut yang Mengganggu, Padahal Semut Diharamkan untuk Dibunuh\n" +
                    "\n",
                    "Bolehkah membunuh semut yang mengganggu? Padahal semut itu diharamkan untuk dibunuh.\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "Dari Ibnu Abbas radhiyallahu ‘anhuma, ia berkata,\n" +
                            "\n" +
                            "إِنَّ النَّبِىَّ -صلى الله عليه وسلم- نَهَى عَنْ قَتْلِ أَرْبَعٍ مِنَ الدَّوَابِّ النَّمْلَةُ وَالنَّحْلَةُ وَالْهُدْهُدُ وَالصُّرَدُ.\n" +
                            "\n" +
                            "“Nabi shallallahu ‘alaihi wa sallam melarang membunuh empat hewan: semut, lebah, burung Hudhud dan burung Shurad.” (HR. Abu Daud, no. 5267; Ibnu Majah, no. 3224; Ahmad 1:332. Syaikh Al-Albani mengatakan bahwa hadits ini sahih).\n" +
                            "\n" +
                            "Ada soal yang pernah diajukan pada Syaikh Muhammad bin Shalih Al-‘Utsaimin rahimahullah dalam kajian Liqaat Al-Bab Al-Maftuh, “Ada hadits tentang larangan membunuh empat hewan, yaitu semut, lebah, burung Hudhud, dan burung Shurad. Namun semut di rumah kadang mengganggu, kadang masuk ke kamar dan biasa bergerombol. Apakah boleh kami membunuh semut tadi dengan racun dan semisal itu?”\n" +
                            "\n" +
                            "Jawab Syaikh rahimahullah:\n" +
                            "\n" +
                            "Nabi shallallahu ‘alaihi wa sallam melarang membunuh empat hewan yaitu semut, lebah, burung Hudhud, dan burung Shurad.\n" +
                            "\n" +
                            "Allah juga meralang membunuh seorang muslim. Namun jika ada muslim yang mengganggu seperti pelaku begal di jalanan atau pelaku semisal itu yang halal dibunuh, maka hukumnya boleh dibunuh.\n" +
                            "\n" +
                            "Kalau ada seseorang yang menghalangimu lantas ingin merampas hartamu, maka janganlah berikan ia harta. Jika ia ingin membunuhmu, lawanlah dia. Engkau halal untuk membunuhnya (dalam rangka membela diri, pen.). Karena Rasulullah shallallahu ‘alaihi wa sallam mengatakan tentang orang yang merampas harta, “Janganlah memberikan harta padanya.” “Bagaimana jika ia sampai mencoba membunuhku?” Nabi shallallahu ‘alaihi wa sallam menjawab, “Bunuhlah dia.” “Bagaimana jika ia malah membunuhku?” Nabi shallallahu ‘alaihi wa sallam bersabda, “Engkau syahid.” “Bagaimana jika aku membunuhnya?” Nabi shallallahu ‘alaihi wa sallam menjawab, “Dia di neraka.” Kesimpulannya, yang mengganggu berarti boleh dibunuh.\n" +
                            "\n" +
                            "Maka semut yang mengganggu yang tidak bisa dihilangkan kecuali dengan membunuhnya, maka silakan membunuhnya. Melakukan seperti itu tidaklah berdosa. Namun ada cara lain sebelum membunuhnya, yaitu di rumah diberi sesuatu untuk mengusir semut (seperti kapur semut dan semacamnya, pen.). Kami sendiri sudah mencobanya. Kami pandang seperti itu akan mengusir semut yang mengganggu tadi, akhirnya semut-semut tersebut pergi, tidak tersisa lagi dalam rumah. Jika mungkin lakukan demikian, itu lebih baik. Jika tidak mungkin seperti itu, maka tidaklah masalah membunuhnya.\n" +
                            "\n" +
                            "(Liqaat Al-Bab Al-Maftuh, 6:277, pertemuan ke-130 dari Syaikh Muhammad bin Shalih Al-‘Utsaimin, Penerbit Muassasah Asy-Syaikh Muhammad bin Shalih Al-‘Utsaimin, Cetakan pertama, Tahun 1438 H)\n" +
                            "\n" +
                            "\n")
        )

        val recyclerView = findViewById<RecyclerView>(R.id.article_recycler)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ArticleAdapter(this, imageList){
            val intent = Intent(this, DetailArticleActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }

    }
}