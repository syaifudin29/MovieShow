package com.example.movieshow.utils

import com.example.movieshow.data.MovieEntity
import com.example.movieshow.data.TvEntity

object DataDummy {

    fun generateDummyMoview(): List<MovieEntity> {

        val movie = ArrayList<MovieEntity>()

        movie.add(MovieEntity(
            "a1",
            "Keramat",
            "Keramat merupakan film horor dari Indonesia yang dirilis pada tahun 2009, disutradarai oleh Monty Tiwa. Film ini dibintangi antara lain oleh Poppy Sovia, Migi Parahita, Sadha Triyudha, Miea Kusuma, Dimas Projosujadi, Diaz Ardiawan, dan Brama Sutasara. Film ini syuting tanpa menggunakan skenario film. Jadi di dalam film ini, apapun yang dilakukan oleh tim produksi selalu ditangani oleh tim Moviesta Pictures dan Monty Tiwa sendiri.",
            "https://upload.wikimedia.org/wikipedia/id/thumb/b/ba/Keramat_poster_2009.jpg/220px-Keramat_poster_2009.jpg"
                ))
        movie.add(MovieEntity(
            "a2",
            "Pengabdi Setan (film 1980)",
            "Pengabdi Setan (Internasional: Satan's Slave) adalah sebuah film horor tahun 1980 dari Indonesia yang disutradarai oleh Sisworo Gautama Putra. Film ini sangat terkenal pada masanya bahkan sampai di dunia internasional, dirilis dalam berbagai format seperti VHS dan kemudian DVD di berbagai negara seperti Amerika Serikat, Eropa dan Jepang.",
            "https://upload.wikimedia.org/wikipedia/id/3/3c/Pengabdi_Setan_%281980%3B_obverse%3B_wiki%29.jpg"
        ))
        movie.add(MovieEntity(
            "a3",
            "Danur I Can See Ghosts",
            "Danur (rilis internasional:Danur: I Can See Ghosts) merupakan film hantu Indonesia yang dirilis pada 30 Maret 2017 disutradarai oleh Awi Suryadi. Film ini diangkat dari buku karya Risa Saraswati, Gerbang Dialog Danur yang ditulis berdasarkan pengalamannya sendiri sebagai seorang gadis indigo. Film ini dibintangi oleh Prilly Latuconsina, Sandrinna Michelle, Shareefa Daanish, Indra Brotolaras, dan Kinaryosih serta memiliki jumlah penonton sebanyak 2.736.391 orang.",
            "https://upload.wikimedia.org/wikipedia/id/thumb/0/09/Danur_poster.jpg/220px-Danur_poster.jpg"
        ))
        movie.add(MovieEntity(
            "a4",
            "Kalung Jailangkung",
            "Kalung Jailangkung adalah film horor Indonesia yang dirilis pada 2 Februari 2011 dengan disutradarai oleh Koya Pagayo yang dibintangi oleh Zacky Zimah dan Soraya Larasati.Kiki dan beberapa orang temannya mengisi liburan ke sebuah kampung di mana mereka bebas bermain apa saja disana, berenang di kali, mengembala kerbau dan lain-lain. Namun suatu hari, Kiki dkk bermain Jailangkung disebuah bangunan tua. Ditengah keasyikan main jalangkung, tiba-tiba Jalangkung bergerak-gerak keras sambil bersuara dan menyebut bahwa namanya Yanti yang mati terbunuh oleh pacarnya yang tidak bertanggungjawab atas kehamilannya.",
            "https://upload.wikimedia.org/wikipedia/id/thumb/1/13/Film24631b.jpg/220px-Film24631b.jpg"

        ))
        movie.add(MovieEntity(
            "a5",
            "Hantu Ambulance",
            "Hantu Ambulance adalah film horor Indonesia yang dirilis pada tahun 2008. Film yang disutradarai oleh Koya Pagayo ini dibintangi oleh Suzzanna, Dimas Andrean, Fitri Ayu, William Alvin, Ratna Galih, Clift Sangra, Cut Alona dan Gianina Emanuela. Film ini adalah film terakhir yang dibintangi Suzzanna sebelum ia wafat pada tanggal 15 Oktober pada tahun yang sama dengan tahun rilis film ini.",
            "https://upload.wikimedia.org/wikipedia/id/thumb/6/6e/Film-hantu-ambulance-200-ok.jpg/220px-Film-hantu-ambulance-200-ok.jpg"
        ))
        movie.add(MovieEntity(
            "a6",
            "Lewat Tengah Malam (film 2007)",
            "Lewat Tengah Malam adalah film horor Indonesia yang dirilis pada tahun 2007. Film yang disutradarai oleh Koya Pagayo ini dibintangi oleh Joanna Alexandra, Catherine Wilson, Andhika Pratama, Ichi Nuraini, Krisna Murti Wibowo, Fenita Z. Zawawi dan Renny Umari.",
            "https://upload.wikimedia.org/wikipedia/id/5/5e/POSTER_LTM.jpg"
        ))
        movie.add(MovieEntity(
            "a7",
            "Nakalnya Anak Muda",
            "Nakalnya Anak Muda merupakan film horor/seru/jagal Indonesia yang dirilis pada 29 Juli 2010 dengan disutradarai oleh Nayato Fio Nuala serta dibintangi antara lain oleh Ratu Felisha dan Uli Auliani.",
            "https://upload.wikimedia.org/wikipedia/id/thumb/1/1f/Nakalnya_Anak_Muda.jpg/220px-Nakalnya_Anak_Muda.jpg"

        ))
        movie.add(MovieEntity(
            "a8",
            "Kuntilanak Kamar Mayat",
            "Kuntilanak Kamar Mayat merupakan film Indonesia yang dirilis pada 19 Maret 2009. Film ini dibintangi antara lain oleh Julia Perez, Mandala Shoji, Rizky Mocil, Imelda Lubis, dan Uwie Jasmine.",
            "https://upload.wikimedia.org/wikipedia/id/thumb/b/b7/Kuntilanak_Kamar_Mayat.jpg/220px-Kuntilanak_Kamar_Mayat.jpg"
        ))
        movie.add(MovieEntity(
            "a9",
            "Kereta Hantu Manggarai",
            "Kereta Hantu Manggarai adalah film horor Indonesia yang dirilis pada tahun 2008. Film yang disutradarai oleh Nayato Fio Nuala ini dibintangi oleh Sheila Marcia, Melvin Giovanie, Stefanie Hariadi Theresia, Nadila Ernesta, Gianina Emanuela, Fendi Trihartanto dan Rina Hasyim.",
            "https://upload.wikimedia.org/wikipedia/id/thumb/6/6f/Hantu_Manggarai.jpg/220px-Hantu_Manggarai.jpg"
        ))
        movie.add(MovieEntity(
            "a10",
            "Kain Kafan Perawan",
            "Kain Kafan Perawan merupakan film hantu Indonesia yang dirilis pada 25 Februari 2010 yang disutradarai oleh Nayato Fio Nuala dan dibintangi antara lain oleh Ratu Felisha dan Ardina Rasti.",
            "https://upload.wikimedia.org/wikipedia/id/thumb/7/79/Film-kainkafanperawan.jpg/220px-Film-kainkafanperawan.jpg"
        ))

    return movie;
    }


    fun generateDummyTvShow(): List<TvEntity> {

        val tvshow = ArrayList<TvEntity>()

        tvshow.add(TvEntity(
            "b1",
            "Hometown Cha-Cha-Cha",
            "Hometown Cha-Cha-Cha (Korean, RR: Gaenmaeul Chachacha; lit. Seaside Village Chachacha) is a 2021 South Korean television series starring Shin Min-a, Kim Seon-ho and Lee Sang-yi. It is a remake of 2004 South Korean film Mr. Handy, Mr. Hong.[4] It aired from August 28 to October 17, 2021 on tvN's Saturdays and Sundays at 21:00 (KST) time slot. It is also available internationally for streaming on Netflix.",
            "https://upload.wikimedia.org/wikipedia/en/thumb/3/3e/Hometown_Cha-Cha-Cha.jpg/250px-Hometown_Cha-Cha-Cha.jpg"
        ))
        tvshow.add(TvEntity(
            "b2",
            "Children of a Lesser God (TV series)",
            "Children of a Lesser God (Korean, RR: Jageun Sinui Aideul) is a 2018 South Korean television series starring Kang Ji-hwan and Kim Ok-bin. It aired on OCN's Saturdays and Sundays at 22:20 (KST) time slot from March 3 to April 22, 2018",
            "https://upload.wikimedia.org/wikipedia/en/6/68/Children_of_a_Lesser_God_%28TV_series%29.jpg"
        ))
        tvshow.add(TvEntity(
            "b3",
            "Guardian: The Lonely and Great God",
            "Guardian: The Lonely and Great God[4] (Korean, RR: Sseulsseulhago Challanhasin – Dokkaebi; lit. The Lonely Shining God – Goblin) is a South Korean television series starring Gong Yoo in the title role with Kim Go-eun, Lee Dong-wook, Yoo In-na, and Yook Sung-jae. It was shown on the cable network tvN from December 2, 2016, to January 21, 2017. It was written by popular drama writer Kim Eun-sook.[5]",
            "https://upload.wikimedia.org/wikipedia/en/6/69/Golbin_Poster.jpg"
        ))
        tvshow.add(TvEntity(
            "b4",
            "Lawless Lawyer",
            "The series follows characters Bong Sang-pil and Ha Jae-yi who form the Lawless Law Firm. Sang-pil, a former gangster turned lawyer, seeks to avenge his mother and fight against those with absolute power. He often resorts to using his fists and loopholes in the law to achieve his goals.[4] Ha Jae-yi is a lawyer of high integrity who works with Sang-pil after she is suspended for assaulting a judge.[3] Together they use the law to fight for justice against corrupt judge Cha Moon-sook and her associates.",
            "https://upload.wikimedia.org/wikipedia/en/thumb/2/2f/Lawless_Lawyer-poster.jpg/250px-Lawless_Lawyer-poster.jpg"
        ))
        tvshow.add(TvEntity(
            "b5",
            "What's Wrong with Secretary Kim",
            "What's Wrong with Secretary Kim (Korean, RR: Kimbiseoga Wae Geureolkka) is a 2018 South Korean television series starring Park Seo-joon and Park Min-young. It is based on the novel of the same title by Jung Kyung-yoon which was first published in 2013, which was then serialized into a Webtoon comic by KakaoPage in 2015.[1] The series aired on tvN from June 6 to July 26, 2018, on Wednesdays and Thursdays for 16 episodes",
            "https://upload.wikimedia.org/wikipedia/en/1/10/What%27s_Wrong_with_Secretary_Kim.jpg"
        ))
        tvshow.add(TvEntity(
            "b6",
            "A Korean Odyssey",
            "A Korean Odyssey[3] (Korean, RR: Hwayugi) is a South Korean fantasy television series starring Lee Seung-gi, Cha Seung-won, Oh Yeon-seo, Lee Hong-gi and Jang Gwang. Written by the Hong sisters, the drama is a modern spin-off of the Chinese classic 16th-century novel Journey to the West. It aired on tvN starting December 23, 2017, every Saturday and Sunday at 21:00 (KST).",
            "https://upload.wikimedia.org/wikipedia/en/thumb/e/e4/A_Korean_Odyssey_%28Hwayugi%29.jpg/250px-A_Korean_Odyssey_%28Hwayugi%29.jpg"
        ))
        tvshow.add(TvEntity(
            "b7",
            "Memories of the Alhambra",
            "Memories of the Alhambra[4] (Korean, RR: Alhambeura Gungjeonui Chueok) is a 2018 South Korean television series, starring Hyun Bin and Park Shin-hye.[5] Primarily set in Spain (and in South Korea in latter episodes), the series centers on a company CEO and a hostel owner who get entangled in a series of mysterious incidents surrounding a new and intricate augmented reality game inspired by the stories of the Alhambra Palace",
            "https://upload.wikimedia.org/wikipedia/en/thumb/3/34/Memories_of_the_Alhambra.jpg/250px-Memories_of_the_Alhambra.jpg"
        ))
        tvshow.add(TvEntity(
            "b8",
            "100 Days My Prince",
            "100 Days My Prince[1] (Korean, Hanja: 百日의 郎君님; RR: Baegirui Nanggunnim; lit. Hundred-Day Husband) is a 2018 South Korean television series starring Do Kyung-soo and Nam Ji-hyun. The series aired on tvN from September 10 to October 30, 2018, every Monday and Tuesday at 21:30 (KST).[2][3][4][5] It is the eleventh highest-rated Korean drama in cable television",
            "https://upload.wikimedia.org/wikipedia/en/f/f0/100_Days_My_Prince.jpg"
        ))
        tvshow.add(TvEntity(
            "b9",
            "The Witch's Diner",
            "The Witch's Diner (Korean, RR: Manyeosikdang-euro Oseyo; lit. Come to the Witch's Restaurant) is a South Korean web series starring Song Ji-hyo, Nam Ji-hyun, and Chae Jong-hyeop. It aired on TVING from July 16 – August 13, 2021, on every Friday at 16:00 (KST) for 8 episodes",
            "https://upload.wikimedia.org/wikipedia/en/6/6c/The_Witch%27s_Diner.jpg"
        ))
        tvshow.add(TvEntity(
            "b10",
            "Sweet Home (TV series)",
            "Sweet Home (Korean, RR: Seuwiteuhom) is a South Korean apocalyptic horror streaming television series starring Song Kang, Lee Jin-wook, Lee Si-young and Lee Do-hyun. Based on the Naver webtoon of the same name by Kim Carnby and Hwang Young-chan, which recorded over 2.1 billion net views, the series was released on Netflix on December 18, 2020.[1][2]",
            "https://upload.wikimedia.org/wikipedia/en/thumb/1/1e/Sweet_Home_TV_series.jpg/250px-Sweet_Home_TV_series.jpg"
        ))



        return tvshow
    }
}