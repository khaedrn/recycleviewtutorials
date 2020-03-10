package com.amikomdeveloper.traditionalfood;

import java.util.ArrayList;

public class FoodData {
    private static String[] foodNames = {
            "Nasi Lengko",
            "Tapai Ketan",
            "Tahu Kuningan",
            "Mie Kocok",
            "Nasi Jamblang Daun Jati",
            "Lepet Kuningan",
            "Makaroni Panggang",
            "Karedok",
            "Dorokdok",
            "Dodol Garut",
            "Chocodot",
            "Doclang",
            "Asinan Bogor",
            "Toege Goreng",
            "Lontong Kari",
            "Soto Kuning",
            "Tahu Gejrot",
            "Surabi",
            "Tahu sumedang",
            "Batagor",
            "Cireng",
    };

    private static String[] foodDetails = {
            "Nasi lengko merupakan olahan yang dipadukan antara nasi dengan isian salah satunya sayuran dan gorengan. seperti tahu dan tempe goreng, serta daun kucai, mentimun, dan tauge. Dengan tamabahan lagi taburan saos kacang yang memiliki rasa yang sangat enak, dan yang pastinya akan menggoyang lidah para penikmatnya.",
            "Tapai Ketan diolah dengan cara difermentasi. Tapai Ketan ini berasal dari Kuningan. Bahan dasar dai pembuatan Tapi ketan ini menggunakan Beras Ketan baik menggunakan Ketan yang putih maupun yang hitam, apapun berasnya yang pasti rasanya bakalan sama dan akan membuat anda ketagihan.",
            "Tahu yang terbuat dari olaha kedelai dengan fermentasi, tapi yang membuat beda dengan tahu Kuningan adalah kalau tahu kuningan itu betuknya yang padat dan rasanya yang gurih dan yang akan membuat lidah para penyicipnya menari-nari keenakan.",
            "Dalam Mie Kocookk tersebut dalam satu porsinya bisa diisi dengan Mie, Sawi, Telur dan lain-lain. Semakin banyak peminatnya sekarang Mie Kocok sudah diinovasi dengan adanya penambahan Bakso dan Daging yang membuatnya mirip dengan Mie Ayam atau Mie Bakso, hanya kuah dan tambahan telurnya yang membedakanya.",
            "Mengenai nasi jamblang, sebenarnya olahan ini hanya nasi biasa yang didalamnya ditambahkan lauk, penyajianya menggunakan daun jati. Namun ada cerita dibalik lahirnya kuliner dari kota Cirebon ini. yakni dimulai ketika Belanda memerintahkan pembuatan jalan raya Anyer-Panarukan.",
            "Lepet Kuningan ini biasanya diisi dengan kacang dan sebelumnya itu ketan akan dicmour dengan parutan kelapa. Untuk rasa Lepet Kuningan ini mirip dengan Lepet pada umumnya yakni dengan rasa gurih, begitu pula Lepet yang lainya.",
            "Pada Makaroni panggang, ukuran macaroni ini lebih panjang dibandingkan dengan macaroni yang lainya. Selain itu kuliner ini dibuat beda dengan macaroni yang lain karena disajikan dengan ditaburi keju untuk menambah rasa ngurih pada makaroni tersebut.",
            "Makanan khas Jawa Barat ini merupakan makanan dengan bahan-bahan sayuran segar yang disajikan dengan siraman bumbu kacang. Makanan Karedok ini mirip dengan makanan yang banyak diketahui dengan nama Gado-gado atau pecel, tetapi perbedaannya terdapat pada penyajian sayurnya yang disajikan dengan sayuran mentah.",
            "Makanan ini merupakan makanan yang berasal dari kota Garut. Mungkin banyak yang berpikiran bahwa ketika kita mendengar nama Garut yang terlintas dipikiran kita adalah Dodol, padahal masih ada Derokdok yang tidak kalah enaknya dengan Dodol. Derokdok ini dibuat dengan menggunakan kulit sapi atau kulit kerbau.",
            "Dodol dibuat dengan menggunakan tepung ketan, parutan kelapa, dan gula merah, itu adalah rasa yang original dari makanan itu. Sekarang rasa dari Dodol tersebu sudah bervareasi ada banyak rasa yang dibuat oleh para produsen untuk membuat Dodol semakin berkembang.",
            "Chocodot merupakan olahan perpaduan antara Coklat dan Dodol. Makanan ini ditemukan tidak sengaja karana paa saat itu si pembuat tidak sengaja menjatuhkan dodol ke Coklat, dan Si pembuat mencoba ternyata rasanya enak, jadilah Chocodot.",
            "Donclang merupakan makanan dari ketupat, tahu, kentang, serta ada siraman bumbu kacang megitarinya. Makanan ini sedikit mirip dengan makanan Jakarta yaitu Ketoprak maupun kupat tahu Bandung. Yang menjadi pembedanya yaitu dari penbungkusnya yang sedikit berbeda. Namun untuk rasa agak sedikit mirip.",
            "Asinan bogor mempunyai tiga varian yaitu asinan buah, asinan sayuran, dan asinan buah dan sayuran. Untuk sayuran sering digunakan dengan Taoge dan Kol yang nantinya akan dipotong kecil-kecil. Sedangkan untuk buahnya menggunakan buah tropis, seperti bengkuang, jambu, salak, dan nanas.",
            "Tidak hanya Toege saja dalam makanan ini, didalamnya juga terdapat Mie rebus, Potongan Ketupat, dan ditambahi kuah oncom yang akan melengkapi Toege Goreng ini, dan yang pastinya akan membuat lidah keenakan.",
            "Berbicara mengenai Lontong, biasanya bumbu yang sering kita jumpai adalah menggunakan bumbu kacang, namun untuk kuahnya adalah kari. Sebenarnya makanan ini hamper sama dengan Lontong pada umumnya namun karena adanya kari itulah yang membuat makanan khas Jawa Barat ini berbeda dengan Lontong lainya.",
            "Sesuai dengan namanya, soto ini berwarna kuning dengan bahan pembuatan kuahnya menggunakan kunyit. Makanan ini berasal dari Kota Bogor yang akan disajikan dengan berbagai macam daging untuk pelengkapnya mulai dari daging sapi, daging ayam, limpa maupun babat.",
            "Tahu Gejrot merupakan makan sederhana dar Jawa Barat namun memiliki olahan yang sangat nikmat. Makanan dari daerah Cirebon ini dibuat dari bahan dasarnya tahu goring dengan tekstur yang lebih berisi.",
            "Serabi atau surabi adalah makanan yang sudah merata di Jawa Barat bisa dikatakan makanan ini adalah khas dari sunda dengan pembuatanya dari bahantepung beras dan dimasak dengan cara yang masih tradisional akan lebih membuat makanan lebih terasa nikmat.",
            "Olahan tahu ini adalah salah satu makanan atau cemilan yang terkenal, sesuai dengan namanya tahu ini berasal dari Sumedang Jawa Barat. Bahan utama Tahu Sumedang sendiri tidak berbeda dengan tahu-tahu yang lain,yaitu dengan bahan kedelai yang kaya akan protein.",
            "Batagor adalah salah satu makanan yang sudah sangat familiar di telinga masyarakat Indonesia, makanan ini awal mulanya bukan dari Indinoseia melainkan makanan yang dijadikan dari perpaduan antara Indonesia dan Tionghoa, namun karena makanan ini diopsi sedimikian rupa maka makanan ini diadopsi oleh Suku Sunda, dan tergolong makanan khas Jawa Barat.",
            "Cireng atau nama aslinya aci goreng adalah makanan dengan bahan utama pembuatannya berupa tepung kanji dengan pemasakan dengan cara digoreng. Dalam adonan tepung kanji tersebut nantinya akan dicampur dengan terigu, garam, merica bubuk, bawang putih, daun bawang, kedelai, air, dan dimasak dengan minyak goring.",
    };

    private static int[] foodImages = {
            R.drawable.nasi_lengko,
            R.drawable.tapai_ketan,
            R.drawable.tahu_kuningan,
            R.drawable.mie_kocok,
            R.drawable.nasi_jamblang,
            R.drawable.lepet_kuningan,
            R.drawable.makaroni_panggang,
            R.drawable.karedok,
            R.drawable.dorokdok,
            R.drawable.dodol_garut,
            R.drawable.chochodot,
            R.drawable.doclang,
            R.drawable.asinan_bogor,
            R.drawable.toege_goreng,
            R.drawable.lontong_kari,
            R.drawable.soto_kuning,
            R.drawable.tahu_gejrot,
            R.drawable.surabi,
            R.drawable.tahu_sumedang,
            R.drawable.batagor,
            R.drawable.cireng,
    };

    static ArrayList<Food> getListData() {
        ArrayList<Food> list = new ArrayList<>();
        for (int position = 0; position < foodNames.length; position++) {
            Food food = new Food();
            food.setName(foodNames[position]);
            food.setDetail(foodDetails[position]);
            food.setPhoto(foodImages[position]);
            list.add(food);
        }
        return list;
    }
}
