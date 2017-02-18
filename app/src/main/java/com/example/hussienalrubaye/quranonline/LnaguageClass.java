package com.example.hussienalrubaye.quranonline;

/**
 * Created by hussienalrubaye on 12/26/15.
 */

import android.media.MediaPlayer;
import android.os.Environment;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by ASUS S550C on 18/01/2015.
 */
public class LnaguageClass {

    public  ArrayList<String> ServerFolderName = new ArrayList<String>();
    public   ArrayList<AuthorClass> AutherListInfo = new ArrayList<AuthorClass>();
    private   ArrayList<AuthorClass> ListAya = new ArrayList<AuthorClass>();
    public   ArrayList<AuthorClass> ListAyaRanage = new ArrayList<AuthorClass>();
    //public static int ISBackgroundMusic = 1; // 1 for is not, 20 for out back ground 3 for in background
   // public static boolean  Firstentry  = true;
    // for public folder select
    //public static String OtherFolderName;

    //public static MediaPlayer mp;
    //=============================


    public static String avalible()
    {
        if (SaveSettings.LanguageSelect == 1)

            return ("من الهاتف");

        else
            return ("From phone");


    }
    public static String disavalible()
    {
        if (SaveSettings.LanguageSelect == 1)

            return ("بث مباشر");

        else
            return ("online");

    }



    public    ArrayList<AuthorClass> AutherList()
    {
        //121 read of quran
        AutherListInfo.clear();
        if (SaveSettings.LanguageSelect == 1)
        {
            AutherListInfo.add(new AuthorClass("shatri", "ابو بكر الشاطري"));
            AutherListInfo.add(new AuthorClass( "ahmad_huth",   "أحمد الحذيفي" ));
            AutherListInfo.add(new AuthorClass( "hawashi",   " أحمد الحواشي" ));
            AutherListInfo.add(new AuthorClass( "trabulsi",   " أحمد الطرابلسي" ));
            AutherListInfo.add(new AuthorClass( "ajm",   "أحمد بن علي العجمي " ));
            AutherListInfo.add(new AuthorClass( "trablsi",   " أحمد خضر الطرابلسي" ));
            AutherListInfo.add(new AuthorClass( "saud",   "أحمد سعود " ));
            AutherListInfo.add(new AuthorClass( "saber",   " أحمد صابر" ));
            AutherListInfo.add(new AuthorClass( "Aamer",   "أحمد عامر " ));
            AutherListInfo.add(new AuthorClass( "ahmad_nu",   " أحمد نعينع" ));
            AutherListInfo.add(new AuthorClass( "akil",   " أخيل عبدالحي روا " ));
            AutherListInfo.add(new AuthorClass( "akrm",   " أكرم العلاقمي" ));
            ////put in store
            AutherListInfo.add(new AuthorClass( "akdr",   " إبراهيم الأخضر" ));
            AutherListInfo.add(new AuthorClass( "IbrahemSadan",   " إبراهيم السعدان" ));
            AutherListInfo.add(new AuthorClass( "abkr",   " إدريس أبكر" ));
            AutherListInfo.add(new AuthorClass( "jbreen",   " ابراهيم الجبرين" ));
            AutherListInfo.add(new AuthorClass( "jormy",   " ابراهيم الجرمي" ));
            AutherListInfo.add(new AuthorClass( "ibrahim_dosri_warsh",   " ابراهيم الدوسري" ));
            AutherListInfo.add(new AuthorClass( "3siri",   "ابراهيم العسيري " ));
            AutherListInfo.add(new AuthorClass( "zamri",   " استاذ زامري " ));
            AutherListInfo.add(new AuthorClass( "3zazi",   "الحسيني العزازي " ));
            AutherListInfo.add(new AuthorClass( "dokali",   " الدوكالي محمد العالم" ));
            AutherListInfo.add(new AuthorClass( "alzain",   " الزين محمد أحمد" ));
            AutherListInfo.add(new AuthorClass( "omran",   "العشري عمران " ));
            AutherListInfo.add(new AuthorClass( "koshi",   " العيون الكوشي" ));
            AutherListInfo.add(new AuthorClass( "fateh",   " الفاتح محمد الزبير" ));
            AutherListInfo.add(new AuthorClass( "qari",   "القارئ ياسين " ));

            ///new qura
            AutherListInfo.add(new AuthorClass( "twfeeq",   " توفيق الصايغ" )); //**
            AutherListInfo.add(new AuthorClass( "jamal",   " جمال شاكر عبدالله" ));
            AutherListInfo.add(new AuthorClass( "jaman",   " جمعان العصيمي" ));
            AutherListInfo.add(new AuthorClass( "hatem",   " حاتم فريد الواع" ));
            AutherListInfo.add(new AuthorClass( "qht",   " خالد القحطاني" ));
            AutherListInfo.add(new AuthorClass( "mohna",   " خالد المهنا" ));
            AutherListInfo.add(new AuthorClass( "kafi",   " خالد عبدالكافي" ));
            AutherListInfo.add(new AuthorClass( "tnjy",   "خليفة الطنيجي" ));
            AutherListInfo.add(new AuthorClass( "hamza",   " داود حمزة" ));
            AutherListInfo.add(new AuthorClass( "ifrad",   " رشيد إفراد" ));
            AutherListInfo.add(new AuthorClass( "zaki",   " زكي داغستاني" ));
            AutherListInfo.add(new AuthorClass( "sami_dosr",   " سامي الدوسري" ));
            AutherListInfo.add(new AuthorClass( "s_gmd",   " سعد الغامدي" )); //**
            AutherListInfo.add(new AuthorClass( "shur",   "سعود الشريم" ));  //**
            AutherListInfo.add(new AuthorClass( "shl",   " سهل ياسين" ));
            AutherListInfo.add(new AuthorClass( "sayed",   " سيد رمضان" ));
            AutherListInfo.add(new AuthorClass( "taher",   "شيرزاد عبدالرحمن طاهر" ));
            AutherListInfo.add(new AuthorClass( "hkm",   " صابر عبدالحكم" ));
            AutherListInfo.add(new AuthorClass( "sahood",   " صالح الصاهود" ));
            AutherListInfo.add(new AuthorClass( "s_bud",   " صلاح البدير" ));
            AutherListInfo.add(new AuthorClass( "salah_hashim_m",   " صلاح الهاشم" ));
            AutherListInfo.add(new AuthorClass( "bu_khtr",   "صلاح بو خاطر" ));//**
            AutherListInfo.add(new AuthorClass( "tareq",   "طارق عبدالغني دعوب" ));
            AutherListInfo.add(new AuthorClass( "a_klb",   " عادل الكلباني" ));
            AutherListInfo.add(new AuthorClass( "ryan",   " عادل ريان" ));
            AutherListInfo.add(new AuthorClass( "thubti",   " عبدالبارئ الثبيتي" ));
            AutherListInfo.add(new AuthorClass( "bari",   " عبدالبارئ محمد" ));
            AutherListInfo.add(new AuthorClass( "bari_molm",   " عبدالبارئ محمد م" ));
            AutherListInfo.add(new AuthorClass( "basit",   " عبدالباسط عبدالصمد ح" ));
            AutherListInfo.add(new AuthorClass( "basit_warsh",   " عبدالباسط عبدالصمد و" ));//**
            AutherListInfo.add(new AuthorClass( "basit_mjwd",   " عبدالباسط عبدالصمد  م" ));
            AutherListInfo.add(new AuthorClass( "sds",   " عبدالرحمن السديس" ));//**
            AutherListInfo.add(new AuthorClass( "soufi_klf",   " عبدالرشيد صوفي" ));
            AutherListInfo.add(new AuthorClass( "soufi",   "عبدالرشيد صوفي س" ));
            AutherListInfo.add(new AuthorClass( "a_ahmed",   " عبدالعزيز الأحمد" ));
            AutherListInfo.add(new AuthorClass( "brmi",   " عبدالله البريمي" ));
            AutherListInfo.add(new AuthorClass( "Abdullahk",   " عبدالله الكندري" ));
            AutherListInfo.add(new AuthorClass( "mtrod",   " عبدالله المطرود" ));
            AutherListInfo.add(new AuthorClass( "bsfr",   " عبدالله بصفر" ));
            AutherListInfo.add(new AuthorClass( "kyat",   " عبدالله خياط" ));
            AutherListInfo.add(new AuthorClass( "jhn",   " عبدالله عواد الجهني" ));
            AutherListInfo.add(new AuthorClass( "mohsin_harthi",   " عبدالمحسن الحارثي" ));
            AutherListInfo.add(new AuthorClass( "obk",   " عبدالمحسن العبيكان" ));
            AutherListInfo.add(new AuthorClass( "qasm",   " عبدالمحسن القاسم" ));
            AutherListInfo.add(new AuthorClass( "kanakeri",   " عبدالهادي أحمد كناكري" ));
            AutherListInfo.add(new AuthorClass( "wdod",   " عبدالودود حنيف" ));
            AutherListInfo.add(new AuthorClass( "abo_hashim",   " علي أبو هاشم" ));
            AutherListInfo.add(new AuthorClass( "huthifi_qalon",   " علي الحذيفي" ));
            AutherListInfo.add(new AuthorClass( "hthfi",   " علي بن عبدالرحمن الحذيفي" ));
            AutherListInfo.add(new AuthorClass( "a_jbr",   " علي جابر" ));
            AutherListInfo.add(new AuthorClass( "hajjaj",   " علي حجاج السويسي" ));
            AutherListInfo.add(new AuthorClass( "hafz",   " عماد زهير حافظ" ));
            AutherListInfo.add(new AuthorClass( "frs_a",   " فارس عباد" ));
            AutherListInfo.add(new AuthorClass( "lafi",   " لافي العوني" ));
            AutherListInfo.add(new AuthorClass( "zaml",   " ماجد الزامل" ));
            AutherListInfo.add(new AuthorClass( "shaibat",   "مالك شيبة الحمد" ));
            AutherListInfo.add(new AuthorClass( "maher_m",   " ماهر المعيقلي" ));
            AutherListInfo.add(new AuthorClass( "maher",   " ماهر المعيقلي ح" ));
            AutherListInfo.add(new AuthorClass( "shaksh",   " ماهر شخاشير" ));
            AutherListInfo.add(new AuthorClass( "ayyub",   " محمد أيوب" ));
            AutherListInfo.add(new AuthorClass( "braak",   " محمد البراك" )); //**
            AutherListInfo.add(new AuthorClass( "tblawi",   " محمد الطبلاوي" ));
            AutherListInfo.add(new AuthorClass( "mhsny",   " محمد المحيسني" ));
            AutherListInfo.add(new AuthorClass( "monshed",   " محمد المنشد" ));
            AutherListInfo.add(new AuthorClass( "jbrl",   " محمد جبريل" ));
            AutherListInfo.add(new AuthorClass( "rashad",   "محمد رشاد الشريف" ));
            AutherListInfo.add(new AuthorClass( "shah",   " محمد صالح" ));
            AutherListInfo.add(new AuthorClass( "minsh",   " محمد صديق المنشاوي" ));//**
            AutherListInfo.add(new AuthorClass( "minsh_mjwd",   "محمد صديق المنشاوي م" ));
            AutherListInfo.add(new AuthorClass( "abdullah_dori",   " محمد عبدالحكيم" ));
            AutherListInfo.add(new AuthorClass( "khan",   " محمد عثمان خان" ));
            AutherListInfo.add(new AuthorClass( "mrifai",   " محمود الرفاعي" ));
            AutherListInfo.add(new AuthorClass( "sheimy",   " محمود الشيمي" ));
            AutherListInfo.add(new AuthorClass( "husr",   " محمود خليل الحصري" ));
            AutherListInfo.add(new AuthorClass( "bna_mjwd",   " محمود علي البنا" ));
            AutherListInfo.add(new AuthorClass( "afs",   " مشاري العفاسي" )); //**
            AutherListInfo.add(new AuthorClass( "mustafa",   " مصطفى إسماعيل" ));
            AutherListInfo.add(new AuthorClass( "lahoni",   " مصطفى اللاهوني" ));
            AutherListInfo.add(new AuthorClass( "ra3ad",   " مصطفى رعد العزاوي" ));
            AutherListInfo.add(new AuthorClass( "harthi",   " معيض الحارثي" ));
            AutherListInfo.add(new AuthorClass( "muftah_thakwan",   " مفتاح السلطني" ));
            AutherListInfo.add(new AuthorClass( "bilal",   " موسى بلال" ));
            AutherListInfo.add(new AuthorClass( "qtm",   " ناصر القطامي" ));
            AutherListInfo.add(new AuthorClass( "nabil",   "  نبيل الرفاعي" ));
            AutherListInfo.add(new AuthorClass( "namh",   " نعمة الحسان" ));//^^
            AutherListInfo.add(new AuthorClass( "hani",   " هاني الرفاعي" ));
            AutherListInfo.add(new AuthorClass( "waleed",   " وليد النائحي" ));
            AutherListInfo.add(new AuthorClass( "yasser",   " ياسر الدوسري" ));
            AutherListInfo.add(new AuthorClass( "qurashi",   " ياسر القرشي" ));
            AutherListInfo.add(new AuthorClass( "mzroyee",   "ياسر المزروعي" ));
            AutherListInfo.add(new AuthorClass( "yahya",   " يحيى حوا" ));
            AutherListInfo.add(new AuthorClass( "yousef",   " يوسف الشويعي" ));
            AutherListInfo.add(new AuthorClass( "noah",   "يوسف بن نوح أحمد" ));
            AutherListInfo.add(new AuthorClass( "omar_warsh",   " عمر القزابري" ));


        }





        else
        {
            AutherListInfo.add(new AuthorClass( "shatri",   "Abo Bakr Al-Shtri" ));
            AutherListInfo.add(new AuthorClass( "ahmad_huth",   "Ahmed Al-Hadefy" ));
            AutherListInfo.add(new AuthorClass( "hawashi",   " Ahmed Al-Hoshy" ));
            AutherListInfo.add(new AuthorClass( "trabulsi",   " Ahmed Al-Trabulsy" ));
            AutherListInfo.add(new AuthorClass( "ajm",   "Ahmed Al-Ajmey " ));
            AutherListInfo.add(new AuthorClass( "trablsi",   " Ahmed Khudr Al-Tarabulsy" ));
            AutherListInfo.add(new AuthorClass( "saud",   "Ahmed Saûd" ));
            AutherListInfo.add(new AuthorClass( "saber",   "Ahmed Saber" ));
            AutherListInfo.add(new AuthorClass( "Aamer",   "Ahmed Amerr" ));
            AutherListInfo.add(new AuthorClass( "ahmad_nu",   "Ahmed Nuainii" ));
            AutherListInfo.add(new AuthorClass( "akil",   "Kalel Abd-Alhay" ));
            AutherListInfo.add(new AuthorClass( "akrm",   " Akram AL-Alkime" ));
            AutherListInfo.add(new AuthorClass( "akdr",   " Ibrahim Khudr" ));
            AutherListInfo.add(new AuthorClass( "IbrahemSadan",   " Ibrahim Sadan" ));
            AutherListInfo.add(new AuthorClass( "abkr",   " Idriss Abkar" ));
            AutherListInfo.add(new AuthorClass( "jbreen",   " Ibrahim Jibril" ));
            AutherListInfo.add(new AuthorClass( "jormy",   "Abrihim jazme" ));
            AutherListInfo.add(new AuthorClass( "ibrahim_dosri_warsh",   "  Ibrahim Dosri" ));
            AutherListInfo.add(new AuthorClass( "3siri",   "Abrihim Al-Aseyri" ));
            AutherListInfo.add(new AuthorClass( "zamri",   "Mister Zamiri" ));
            AutherListInfo.add(new AuthorClass( "3zazi",   "Al-Husaney Al-Azaze" ));
            AutherListInfo.add(new AuthorClass( "dokali",   " Al-Dokaley Mohammed Al-Alm" ));
            AutherListInfo.add(new AuthorClass( "alzain",   " Alzin Mohammed Ahmed" ));
            AutherListInfo.add(new AuthorClass( "omran",   "Al-Ashire Omran" ));
            AutherListInfo.add(new AuthorClass( "koshi",   " Al-eyon Al-Koshy" ));
            AutherListInfo.add(new AuthorClass( "fateh",   " Al-Fatih Mohamed Al-Zober" ));
            AutherListInfo.add(new AuthorClass( "qari",   "Yasen Al-Kare " ));
            /// update
            ///new qura
            AutherListInfo.add(new AuthorClass( "twfeeq",   "Tofek Alsaek" ));
            AutherListInfo.add(new AuthorClass( "jamal",   "Jamal Shakr Abd" ));
            AutherListInfo.add(new AuthorClass( "jaman",   " Joman Al Asime" ));
            AutherListInfo.add(new AuthorClass( "hatem",   "Hatem Farid Alwaer" ));
            AutherListInfo.add(new AuthorClass( "qht",   "Khaled Al-Kahtani" ));
            AutherListInfo.add(new AuthorClass( "mohna",   " Khaled AlMohna" ));
            AutherListInfo.add(new AuthorClass( "kafi",   " Khaled Abd AlKafi" ));
            AutherListInfo.add(new AuthorClass( "tnjy",   "Khalifa AlTanejey" ));
            AutherListInfo.add(new AuthorClass( "hamza",   "Dawood Hamza" ));
            AutherListInfo.add(new AuthorClass( "ifrad",   " Rashid Ifrad" ));
            AutherListInfo.add(new AuthorClass( "zaki",   "Zaki Daghistani" ));
            AutherListInfo.add(new AuthorClass( "sami_dosr",   "Sami AlDosrey" ));
            AutherListInfo.add(new AuthorClass( "s_gmd",   "Saad AlGhamdy" ));
            AutherListInfo.add(new AuthorClass( "shur",   "Saud AlShirem" ));
            AutherListInfo.add(new AuthorClass( "shl",   " Sahl Yasin" ));
            AutherListInfo.add(new AuthorClass( "sayed",   " Sayed Ramadan" ));
            AutherListInfo.add(new AuthorClass( "taher",   "Sherzad Abd-Arrahman Taher" ));
            AutherListInfo.add(new AuthorClass( "hkm",   " Saber Abd AlHakam" ));
            AutherListInfo.add(new AuthorClass( "sahood",   " saleh As-Sahood" ));
            AutherListInfo.add(new AuthorClass( "s_bud",   "Salah Al Badeer" ));
            AutherListInfo.add(new AuthorClass( "salah_hashim_m",   "Salah AlHashim" ));
            AutherListInfo.add(new AuthorClass( "bu_khtr",   "Salah abo Khater" ));
            AutherListInfo.add(new AuthorClass( "tareq",   "Tarek Abd-Alghani Daub" ));
            AutherListInfo.add(new AuthorClass( "a_klb",   " Adel AlKalbani" ));
            AutherListInfo.add(new AuthorClass( "ryan",   " Adel Rayyan" ));
            AutherListInfo.add(new AuthorClass( "thubti",   "Abd Al-Barey" ));
            AutherListInfo.add(new AuthorClass( "bari",   "Abd Al-Barey Mohammed" ));
            AutherListInfo.add(new AuthorClass( "bari_molm",   " Abd Al-Barey Mohammed M" ));
            AutherListInfo.add(new AuthorClass( "basit",   "Abd-AlBasit Abdessamad H" ));
            AutherListInfo.add(new AuthorClass( "basit_warsh",   " Abd-AlBasit Abdessamad w" ));
            AutherListInfo.add(new AuthorClass( "basit_mjwd",   " Abd-AlBasit Abdessamad M" ));
            AutherListInfo.add(new AuthorClass( "sds",   " Abd-AlRahman Al-Sudays" ));
            AutherListInfo.add(new AuthorClass( "soufi_klf",   " Abd-Rashed Sofe" ));
            AutherListInfo.add(new AuthorClass( "soufi",   "Abd-Rashed Sofe S" ));
            AutherListInfo.add(new AuthorClass( "a_ahmed",   "Abd-AlAziz Samad  " ));
            AutherListInfo.add(new AuthorClass( "brmi",   " Abd-Allah Al-Barimi" ));
            AutherListInfo.add(new AuthorClass( "Abdullahk",   " Abd-Allah Al-Kandary" ));
            AutherListInfo.add(new AuthorClass( "mtrod",   " Abd-Allah Matrood" ));
            AutherListInfo.add(new AuthorClass( "bsfr",   " Abd-Allah Basfar" ));
            AutherListInfo.add(new AuthorClass( "kyat",   " Abd-Allah Kayat" ));
            AutherListInfo.add(new AuthorClass( "jhn",   "Abd-Allah Awad" ));
            AutherListInfo.add(new AuthorClass( "mohsin_harthi",   " Abd-AlMohsin Al-Harithi" ));
            AutherListInfo.add(new AuthorClass( "obk",   " Abd-AlMohsin Al-Obeikan" ));
            AutherListInfo.add(new AuthorClass( "qasm",   " Abd-AlMohsin Al-Kasim" ));
            AutherListInfo.add(new AuthorClass( "kanakeri",   " Abd-AlHadi Ahmed " ));
            AutherListInfo.add(new AuthorClass( "wdod",   " Abd-AlWadood" ));
            AutherListInfo.add(new AuthorClass( "abo_hashim",   " Ali Abo Hashim" ));
            AutherListInfo.add(new AuthorClass( "huthifi_qalon",   " Ali Alhutheifi" ));
            AutherListInfo.add(new AuthorClass( "hthfi",   " Ali Bin Abd-AlRahman" ));
            AutherListInfo.add(new AuthorClass( "a_jbr",   " Ali Jaber" ));
            AutherListInfo.add(new AuthorClass( "hajjaj",   " Ali Hajaj " ));
            AutherListInfo.add(new AuthorClass( "hafz",   " Imad Zoheyr" ));
            AutherListInfo.add(new AuthorClass( "frs_a",   " Faris Abbad" ));
            AutherListInfo.add(new AuthorClass( "lafi",   " Lafey Al-Awney" ));
            AutherListInfo.add(new AuthorClass( "zaml",   " Majad Al-Zamel" ));
            AutherListInfo.add(new AuthorClass( "shaibat",   "Malak shiba" ));
            AutherListInfo.add(new AuthorClass( "maher_m",   " Maher Al-maeekly" ));
            AutherListInfo.add(new AuthorClass( "maher",   " Maher Al-maeekly H" ));
            AutherListInfo.add(new AuthorClass( "shaksh",   " Maher Shkhashero" ));
            AutherListInfo.add(new AuthorClass( "ayyub",   " Mohammad Ayoub" ));
            AutherListInfo.add(new AuthorClass( "braak",   " Mohammad Barak" ));
            AutherListInfo.add(new AuthorClass( "tblawi",   " Mohammad Al-Tablawi" ));
            AutherListInfo.add(new AuthorClass( "mhsny",   " Mohammad Al-Mahesney" ));
            AutherListInfo.add(new AuthorClass( "monshed",   "Mohammad Al-Monshid" ));
            AutherListInfo.add(new AuthorClass( "jbrl",   " Mohammad Jabril" ));
            AutherListInfo.add(new AuthorClass( "rashad",   " Mohammad Rashid " ));
            AutherListInfo.add(new AuthorClass( "shah",   " Mohammad Salih" ));
            AutherListInfo.add(new AuthorClass( "minsh",   " Mohammad Sideek Al-Minshawe" ));
            AutherListInfo.add(new AuthorClass( "minsh_mjwd",   "Mohammad Sideek Al-Minshawe M" ));
            AutherListInfo.add(new AuthorClass( "abdullah_dori",   " Mohamed Abd-AlHakeem" ));
            AutherListInfo.add(new AuthorClass( "khan",   " Mohammad Athman Khan" ));
            AutherListInfo.add(new AuthorClass( "mrifai",   " Mahmood Al-Rifaey" ));
            AutherListInfo.add(new AuthorClass( "sheimy",   " mahmmod Al-Shimey" ));
            AutherListInfo.add(new AuthorClass( "husr",   " Mahmood Al-Husary" ));
            AutherListInfo.add(new AuthorClass( "bna_mjwd",   " Mahmood Ali" ));
            AutherListInfo.add(new AuthorClass( "afs",   " Masharey Al-Afasy" ));
            AutherListInfo.add(new AuthorClass( "mustafa",   " Mostafa Ismail" ));
            AutherListInfo.add(new AuthorClass( "lahoni",   " Mostafa Al-Lahoney" ));
            AutherListInfo.add(new AuthorClass( "ra3ad",   " Mostafa Raed" ));
            AutherListInfo.add(new AuthorClass( "harthi",   " Mueyd Al-Harithey" ));
            AutherListInfo.add(new AuthorClass( "muftah_thakwan",   " Miftah Al-Soltaney" ));
            AutherListInfo.add(new AuthorClass( "bilal",   "Mosa Bilal" ));
            AutherListInfo.add(new AuthorClass( "qtm",   "Naser Al-Qatami" ));
            AutherListInfo.add(new AuthorClass( "nabil",   "Nabil Al-Rifaeey" ));
            AutherListInfo.add(new AuthorClass( "namh",   "Naama Al-Hassan" ));
            AutherListInfo.add(new AuthorClass( "hani",   "Hani Al-Rifaey" ));
            AutherListInfo.add(new AuthorClass( "waleed",   " Waleed Al-Naehiy" ));
            AutherListInfo.add(new AuthorClass( "yasser",   " Yaser Ad-Dosary" ));
            AutherListInfo.add(new AuthorClass( "qurashi",   " Yaser Korashey" ));
            AutherListInfo.add(new AuthorClass( "mzroyee",   "Yaser Al-Mazrooey" ));
            AutherListInfo.add(new AuthorClass( "yahya",   " Yahya Hawwa" ));
            AutherListInfo.add(new AuthorClass( "yousef",   " Yousef Al-Shuwaieey " ));
            AutherListInfo.add(new AuthorClass( "noah",   "Yousef Bin Nooh" ));
            AutherListInfo.add(new AuthorClass( "omar_warsh",   " Omar Al Kazabri" ));
        }

        return (AutherListInfo);

    }
    public String serverNumber (String  EnglishName ){
        String ArabicName ="11";
        if (EnglishName.endsWith("shatri"))
            ArabicName ="11";
        if (EnglishName.endsWith("ahmad_huth"))
            ArabicName ="8";
        if (EnglishName.endsWith("hawashi"))
            ArabicName ="11";
        if (EnglishName.endsWith("trabulsi"))
            ArabicName ="10";
        if (EnglishName.endsWith("ajm"))
            ArabicName ="10";
        if (EnglishName.endsWith("trablsi"))
            ArabicName ="10";
        if (EnglishName.endsWith("saud"))
            ArabicName ="11";
        if (EnglishName.endsWith("saber"))
            ArabicName ="8";
        if (EnglishName.endsWith("Aamer"))
            ArabicName ="10";
        if (EnglishName.endsWith("ahmad_nu"))
            ArabicName ="11";
        if (EnglishName.endsWith("akil"))
            ArabicName ="12";
        if (EnglishName.endsWith("akrm"))
            ArabicName ="9";
        if (EnglishName.endsWith("akdr"))
            ArabicName ="6";
        if (EnglishName.endsWith("IbrahemSadan"))
            ArabicName ="10";
        if (EnglishName.endsWith("abkr"))
            ArabicName ="6";
        if (EnglishName.endsWith("jbreen"))
            ArabicName ="6";
        if (EnglishName.endsWith("jormy"))
            ArabicName ="11";
        if (EnglishName.endsWith("ibrahim_dosri_warsh"))
            ArabicName ="10";
        if (EnglishName.endsWith("3siri"))
            ArabicName ="6";
        if (EnglishName.endsWith("zamri"))
            ArabicName ="12";
        if (EnglishName.endsWith("3zazi"))
            ArabicName ="8";
        if (EnglishName.endsWith("dokali"))
            ArabicName ="7";
        if (EnglishName.endsWith("Alzain"))
            ArabicName ="9";
        if (EnglishName.endsWith("omran"))
            ArabicName ="9";
        if (EnglishName.endsWith("koshi"))
            ArabicName ="11";
        if (EnglishName.endsWith("fateh"))
            ArabicName ="6";
        if (EnglishName.endsWith("qari"))
            ArabicName ="11";
        if (EnglishName.endsWith("twfeeq"))
            ArabicName ="6";
        if (EnglishName.endsWith("jamAl"))
            ArabicName ="6";
        if (EnglishName.endsWith("jaman"))
            ArabicName ="6";
        if (EnglishName.endsWith("hatem"))
            ArabicName ="11";
        if (EnglishName.endsWith("qht"))
            ArabicName ="10";
        if (EnglishName.endsWith("mohna"))
            ArabicName ="11";
        if (EnglishName.endsWith("kafi"))
            ArabicName ="11";
        if (EnglishName.endsWith("tnjy"))
            ArabicName ="12";
        if (EnglishName.endsWith("hamza"))
            ArabicName ="9";
        if (EnglishName.endsWith("ifrad"))
            ArabicName ="12";
        if (EnglishName.endsWith("zaki"))
            ArabicName ="9";
        if (EnglishName.endsWith("sami_dosr"))
            ArabicName ="8";
        if (EnglishName.endsWith("s_gmd"))
            ArabicName ="7";
        if (EnglishName.endsWith("shur"))
            ArabicName ="7";
        if (EnglishName.endsWith("shl"))
            ArabicName ="6";
        if (EnglishName.endsWith("sayed"))
            ArabicName ="12";
        if (EnglishName.endsWith("taher"))
            ArabicName ="12";
        if (EnglishName.endsWith("hkm"))
            ArabicName ="12";
        if (EnglishName.endsWith("sahood"))
            ArabicName ="8";
        if (EnglishName.endsWith("s_bud"))
            ArabicName ="6";
        if (EnglishName.endsWith("sAlah_hashim_m"))
            ArabicName ="12";
        if (EnglishName.endsWith("bu_khtr"))
            ArabicName ="8";
        if (EnglishName.endsWith("tareq"))
            ArabicName ="10";
        if (EnglishName.endsWith("a_klb"))
            ArabicName ="8";
        if (EnglishName.endsWith("ryan"))
            ArabicName ="8";
        if (EnglishName.endsWith("thubti"))
            ArabicName ="6";
        if (EnglishName.endsWith("bari"))
            ArabicName ="12";
        if (EnglishName.endsWith("bari_molm"))
            ArabicName ="10";
        if (EnglishName.endsWith("basit"))
            ArabicName ="7";
        if (EnglishName.endsWith("basit_warsh"))
            ArabicName ="10";
        if (EnglishName.endsWith("basit_mjwd"))
            ArabicName ="13";
        if (EnglishName.endsWith("sds"))
            ArabicName ="11";
        if (EnglishName.endsWith("soufi_klf"))
            ArabicName ="9";
        if (EnglishName.endsWith("soufi"))
            ArabicName ="9";
        if (EnglishName.endsWith("a_ahmed"))
            ArabicName ="11";
        if (EnglishName.endsWith("brmi"))
            ArabicName ="8";
        if (EnglishName.endsWith("Abdullahk"))
            ArabicName ="10";
        if (EnglishName.endsWith("mtrod"))
            ArabicName ="8";
        if (EnglishName.endsWith("bsfr"))
            ArabicName ="6";
        if (EnglishName.endsWith("kyat"))
            ArabicName ="12";
        if (EnglishName.endsWith("jhn"))
            ArabicName ="13";
        if (EnglishName.endsWith("mohsin_harthi"))
            ArabicName ="6";
        if (EnglishName.endsWith("obk"))
            ArabicName ="12";
        if (EnglishName.endsWith("qasm"))
            ArabicName ="8";
        if (EnglishName.endsWith("kanakeri"))
            ArabicName ="6";
        if (EnglishName.endsWith("wdod"))
            ArabicName ="8";
        if (EnglishName.endsWith("abo_hashim"))
            ArabicName ="9";
        if (EnglishName.endsWith("huthifi_qAlon"))
            ArabicName ="9";
        if (EnglishName.endsWith("hthfi"))
            ArabicName ="9";
        if (EnglishName.endsWith("a_jbr"))
            ArabicName ="11";
        if (EnglishName.endsWith("hajjaj"))
            ArabicName ="9";
        if (EnglishName.endsWith("hafz"))
            ArabicName ="6";
        if (EnglishName.endsWith("frs_a"))
            ArabicName ="8";
        if (EnglishName.endsWith("lafi"))
            ArabicName ="6";
        if (EnglishName.endsWith("zaml"))
            ArabicName ="9";
        if (EnglishName.endsWith("shaibat"))
            ArabicName ="9";
        if (EnglishName.endsWith("maher_m"))
            ArabicName ="12";
        if (EnglishName.endsWith("maher"))
            ArabicName ="12";
        if (EnglishName.endsWith("shaksh"))
            ArabicName ="10";
        if (EnglishName.endsWith("ayyub"))
            ArabicName ="8";
        if (EnglishName.endsWith("braak"))
            ArabicName ="13";
        if (EnglishName.endsWith("tblawi"))
            ArabicName ="12";
        if (EnglishName.endsWith("mhsny"))
            ArabicName ="11";
        if (EnglishName.endsWith("monshed"))
            ArabicName ="10";
        if (EnglishName.endsWith("jbrl"))
            ArabicName ="8";
        if (EnglishName.endsWith("rashad"))
            ArabicName ="10";
        if (EnglishName.endsWith("shah"))
            ArabicName ="12";
        if (EnglishName.endsWith("minsh"))
            ArabicName ="10";
        if (EnglishName.endsWith("minsh_mjwd"))
            ArabicName ="11";
        if (EnglishName.endsWith("abdullah_dori"))
            ArabicName ="12";
        if (EnglishName.endsWith("khan"))
            ArabicName ="6";
        if (EnglishName.endsWith("mrifai"))
            ArabicName ="11";
        if (EnglishName.endsWith("sheimy"))
            ArabicName ="10";
        if (EnglishName.endsWith("husr"))
            ArabicName ="13";
        if (EnglishName.endsWith("bna_mjwd"))
            ArabicName ="8";
        if (EnglishName.endsWith("afs"))
            ArabicName ="8";
        if (EnglishName.endsWith("mustafa"))
            ArabicName ="8";
        if (EnglishName.endsWith("lahoni"))
            ArabicName ="6";
        if (EnglishName.endsWith("ra3ad"))
            ArabicName ="8";
        if (EnglishName.endsWith("harthi"))
            ArabicName ="8";
        if (EnglishName.endsWith("muftah_thakwan"))
            ArabicName ="11";
        if (EnglishName.endsWith("bilAl"))
            ArabicName ="11";
        if (EnglishName.endsWith("qtm"))
            ArabicName ="6";
        if (EnglishName.endsWith("nabil"))
            ArabicName ="9";
        if (EnglishName.endsWith("namh"))
            ArabicName ="8";
        if (EnglishName.endsWith("hani"))
            ArabicName ="8";
        if (EnglishName.endsWith("wAleed"))
            ArabicName ="9";
        if (EnglishName.endsWith("yasser"))
            ArabicName ="11";
        if (EnglishName.endsWith("qurashi"))
            ArabicName ="9";
        if (EnglishName.endsWith("mzroyee"))
            ArabicName ="9";
        if (EnglishName.endsWith("yahya"))
            ArabicName ="12";
        if (EnglishName.endsWith("yousef"))
            ArabicName ="9";
        if (EnglishName.endsWith("noah"))
            ArabicName ="8";
        if (EnglishName.endsWith("shatri"))
            ArabicName ="11";
        if (EnglishName.endsWith("ahmad_huth"))
            ArabicName ="8";
        if (EnglishName.endsWith("hawashi"))
            ArabicName ="11";
        if (EnglishName.endsWith("trabulsi"))
            ArabicName ="10";
        if (EnglishName.endsWith("ajm"))
            ArabicName ="10";
        if (EnglishName.endsWith("trablsi"))
            ArabicName ="10";
        if (EnglishName.endsWith("saud"))
            ArabicName ="11";
        if (EnglishName.endsWith("saber"))
            ArabicName ="8";
        if (EnglishName.endsWith("Aamer"))
            ArabicName ="10";
        if (EnglishName.endsWith("ahmad_nu"))
            ArabicName ="11";
        if (EnglishName.endsWith("akil"))
            ArabicName ="12";
        if (EnglishName.endsWith("akrm"))
            ArabicName ="9";
        if (EnglishName.endsWith("akdr"))
            ArabicName ="6";
        if (EnglishName.endsWith("IbrahemSadan"))
            ArabicName ="10";
        if (EnglishName.endsWith("abkr"))
            ArabicName ="6";
        if (EnglishName.endsWith("jbreen"))
            ArabicName ="6";
        if (EnglishName.endsWith("jormy"))
            ArabicName ="11";
        if (EnglishName.endsWith("ibrahim_dosri_warsh"))
            ArabicName ="10";
        if (EnglishName.endsWith("3siri"))
            ArabicName ="6";
        if (EnglishName.endsWith("zamri"))
            ArabicName ="12";
        if (EnglishName.endsWith("3zazi"))
            ArabicName ="8";
        if (EnglishName.endsWith("dokAli"))
            ArabicName ="7";
        if (EnglishName.endsWith("Alzain"))
            ArabicName ="9";
        if (EnglishName.endsWith("omran"))
            ArabicName ="9";
        if (EnglishName.endsWith("koshi"))
            ArabicName ="11";
        if (EnglishName.endsWith("fateh"))
            ArabicName ="6";
        if (EnglishName.endsWith("qari"))
            ArabicName ="11";
        if (EnglishName.endsWith("twfeeq"))
            ArabicName ="6";
        if (EnglishName.endsWith("jamAl"))
            ArabicName ="6";
        if (EnglishName.endsWith("jaman"))
            ArabicName ="6";
        if (EnglishName.endsWith("hatem"))
            ArabicName ="11";
        if (EnglishName.endsWith("qht"))
            ArabicName ="10";
        if (EnglishName.endsWith("mohna"))
            ArabicName ="11";
        if (EnglishName.endsWith("kafi"))
            ArabicName ="11";
        if (EnglishName.endsWith("tnjy"))
            ArabicName ="12";
        if (EnglishName.endsWith("hamza"))
            ArabicName ="9";
        if (EnglishName.endsWith("ifrad"))
            ArabicName ="12";
        if (EnglishName.endsWith("zaki"))
            ArabicName ="9";
        if (EnglishName.endsWith("sami_dosr"))
            ArabicName ="8";
        if (EnglishName.endsWith("s_gmd"))
            ArabicName ="7";
        if (EnglishName.endsWith("shur"))
            ArabicName ="7";
        if (EnglishName.endsWith("shl"))
            ArabicName ="6";
        if (EnglishName.endsWith("sayed"))
            ArabicName ="12";
        if (EnglishName.endsWith("taher"))
            ArabicName ="12";
        if (EnglishName.endsWith("hkm"))
            ArabicName ="12";
        if (EnglishName.endsWith("sahood"))
            ArabicName ="8";
        if (EnglishName.endsWith("s_bud"))
            ArabicName ="6";
        if (EnglishName.endsWith("sAlah_hashim_m"))
            ArabicName ="12";
        if (EnglishName.endsWith("bu_khtr"))
            ArabicName ="8";
        if (EnglishName.endsWith("tareq"))
            ArabicName ="10";
        if (EnglishName.endsWith("a_klb"))
            ArabicName ="8";
        if (EnglishName.endsWith("ryan"))
            ArabicName ="8";
        if (EnglishName.endsWith("thubti"))
            ArabicName ="6";
        if (EnglishName.endsWith("bari"))
            ArabicName ="12";
        if (EnglishName.endsWith("bari_molm"))
            ArabicName ="10";
        if (EnglishName.endsWith("basit"))
            ArabicName ="7";
        if (EnglishName.endsWith("basit_warsh"))
            ArabicName ="10";
        if (EnglishName.endsWith("basit_mjwd"))
            ArabicName ="13";
        if (EnglishName.endsWith("sds"))
            ArabicName ="11";
        if (EnglishName.endsWith("soufi_klf"))
            ArabicName ="9";
        if (EnglishName.endsWith("soufi"))
            ArabicName ="9";
        if (EnglishName.endsWith("a_ahmed"))
            ArabicName ="11";
        if (EnglishName.endsWith("brmi"))
            ArabicName ="8";
        if (EnglishName.endsWith("Abdullahk"))
            ArabicName ="10";
        if (EnglishName.endsWith("mtrod"))
            ArabicName ="8";
        if (EnglishName.endsWith("bsfr"))
            ArabicName ="6";
        if (EnglishName.endsWith("kyat"))
            ArabicName ="12";
        if (EnglishName.endsWith("jhn"))
            ArabicName ="13";
        if (EnglishName.endsWith("mohsin_harthi"))
            ArabicName ="6";
        if (EnglishName.endsWith("obk"))
            ArabicName ="12";
        if (EnglishName.endsWith("qasm"))
            ArabicName ="8";
        if (EnglishName.endsWith("kanakeri"))
            ArabicName ="6";
        if (EnglishName.endsWith("wdod"))
            ArabicName ="8";
        if (EnglishName.endsWith("abo_hashim"))
            ArabicName ="9";
        if (EnglishName.endsWith("huthifi_qAlon"))
            ArabicName ="9";
        if (EnglishName.endsWith("hthfi"))
            ArabicName ="9";
        if (EnglishName.endsWith("a_jbr"))
            ArabicName ="11";
        if (EnglishName.endsWith("hajjaj"))
            ArabicName ="9";
        if (EnglishName.endsWith("hafz"))
            ArabicName ="6";
        if (EnglishName.endsWith("frs_a"))
            ArabicName ="8";
        if (EnglishName.endsWith("lafi"))
            ArabicName ="6";
        if (EnglishName.endsWith("zaml"))
            ArabicName ="9";
        if (EnglishName.endsWith("shaibat"))
            ArabicName ="9";
        if (EnglishName.endsWith("maher_m"))
            ArabicName ="12";
        if (EnglishName.endsWith("maher"))
            ArabicName ="12";
        if (EnglishName.endsWith("shaksh"))
            ArabicName ="10";
        if (EnglishName.endsWith("ayyub"))
            ArabicName ="8";
        if (EnglishName.endsWith("braak"))
            ArabicName ="13";
        if (EnglishName.endsWith("tblawi"))
            ArabicName ="12";
        if (EnglishName.endsWith("mhsny"))
            ArabicName ="11";
        if (EnglishName.endsWith("monshed"))
            ArabicName ="10";
        if (EnglishName.endsWith("jbrl"))
            ArabicName ="8";
        if (EnglishName.endsWith("rashad"))
            ArabicName ="10";
        if (EnglishName.endsWith("shah"))
            ArabicName ="12";
        if (EnglishName.endsWith("minsh"))
            ArabicName ="10";
        if (EnglishName.endsWith("minsh_mjwd"))
            ArabicName ="11";
        if (EnglishName.endsWith("abdullah_dori"))
            ArabicName ="12";
        if (EnglishName.endsWith("khan"))
            ArabicName ="6";
        if (EnglishName.endsWith("mrifai"))
            ArabicName ="11";
        if (EnglishName.endsWith("sheimy"))
            ArabicName ="10";
        if (EnglishName.endsWith("husr"))
            ArabicName ="13";
        if (EnglishName.endsWith("bna_mjwd"))
            ArabicName ="8";
        if (EnglishName.endsWith("afs"))
            ArabicName ="8";
        if (EnglishName.endsWith("mustafa"))
            ArabicName ="8";
        if (EnglishName.endsWith("lahoni"))
            ArabicName ="6";
        if (EnglishName.endsWith("ra3ad"))
            ArabicName ="8";
        if (EnglishName.endsWith("harthi"))
            ArabicName ="8";
        if (EnglishName.endsWith("muftah_thakwan"))
            ArabicName ="11";
        if (EnglishName.endsWith("bilAl"))
            ArabicName ="11";
        if (EnglishName.endsWith("qtm"))
            ArabicName ="6";
        if (EnglishName.endsWith("nabil"))
            ArabicName ="9";
        if (EnglishName.endsWith("namh"))
            ArabicName ="8";
        if (EnglishName.endsWith("hani"))
            ArabicName ="8";
        if (EnglishName.endsWith("wAleed"))
            ArabicName ="9";
        if (EnglishName.endsWith("yasser"))
            ArabicName ="11";
        if (EnglishName.endsWith("qurashi"))
            ArabicName ="9";
        if (EnglishName.endsWith("mzroyee"))
            ArabicName ="9";
        if (EnglishName.endsWith("yahya"))
            ArabicName ="12";
        if (EnglishName.endsWith("yousef"))
            ArabicName ="9";
        if (EnglishName.endsWith("noah"))
            ArabicName ="8";
	if (EnglishName.endsWith("omar_warsh"))
	    ArabicName = 9;
        return ArabicName;


    }
    public ArrayList<AuthorClass> GuranAya(String ReciteName)
    {

        ListAya.clear();
        if (SaveSettings.LanguageSelect == 1) {
            ListAya.add(new AuthorClass("001", " الفاتحة"));
            ListAya.add(new AuthorClass("002", "البقرة"));
            ListAya.add(new AuthorClass("003", "ال عمران "));
            ListAya.add(new AuthorClass("004", "النساء"));
            ListAya.add(new AuthorClass("005", " المائدة"));
            ListAya.add(new AuthorClass("006", " الانعام"));
            ListAya.add(new AuthorClass("007", " الأعراف"));
            ListAya.add(new AuthorClass("008", " الأنفال"));
            ListAya.add(new AuthorClass("009", " التوبة "));
            ListAya.add(new AuthorClass("010", " يونس"));
            ListAya.add(new AuthorClass("011", " هود"));
            ListAya.add(new AuthorClass("012", " يوسف"));
            ListAya.add(new AuthorClass("013", " الرعد"));
            ListAya.add(new AuthorClass("014", " إبراهيم"));
            ListAya.add(new AuthorClass("015", " الحجر"));
            ListAya.add(new AuthorClass("016", " النحل"));
            ListAya.add(new AuthorClass("017", " الإسراء"));
            ListAya.add(new AuthorClass("018", " الكهف"));
            ListAya.add(new AuthorClass("019", " مريم"));
            ListAya.add(new AuthorClass("020", " طه"));
            ListAya.add(new AuthorClass("021", " الأنبياء"));
            ListAya.add(new AuthorClass("022", " الحج"));
            ListAya.add(new AuthorClass("023", " المؤمنون"));
            ListAya.add(new AuthorClass("024", " النّور"));
            ListAya.add(new AuthorClass("025", "  الفرقان "));
            ListAya.add(new AuthorClass("026", "  الشعراء "));
            ListAya.add(new AuthorClass("027", " النّمل"));
            ListAya.add(new AuthorClass("028", " القصص"));
            ListAya.add(new AuthorClass("029", " العنكبوت"));
            ListAya.add(new AuthorClass("030", " الرّوم"));
            ListAya.add(new AuthorClass("031", " لقمان"));
            ListAya.add(new AuthorClass("032", " السجدة"));
            ListAya.add(new AuthorClass("033", " الأحزاب"));
            ListAya.add(new AuthorClass("034", " سبأ"));
            ListAya.add(new AuthorClass("035", " فاطر"));
            ListAya.add(new AuthorClass("036", " يس"));
            ListAya.add(new AuthorClass("037", " الصافات"));
            ListAya.add(new AuthorClass("038", " ص"));
            ListAya.add(new AuthorClass("039", " الزمر"));
            ListAya.add(new AuthorClass("040", " غافر"));
            ListAya.add(new AuthorClass("041", " فصّلت"));
            ListAya.add(new AuthorClass("042", " الشورى"));
            ListAya.add(new AuthorClass("043", " الزخرف"));
            ListAya.add(new AuthorClass("044", " الدّخان"));
            ListAya.add(new AuthorClass("045", " الجاثية"));
            ListAya.add(new AuthorClass("046", " الأحقاف"));
            ListAya.add(new AuthorClass("047", " محمد"));
            ListAya.add(new AuthorClass("048", " الفتح"));
            ListAya.add(new AuthorClass("049", " الحجرات"));
            ListAya.add(new AuthorClass("050", " ق"));
            ListAya.add(new AuthorClass("051", " الذاريات"));
            ListAya.add(new AuthorClass("052", " الطور"));
            ListAya.add(new AuthorClass("053", " النجم"));
            ListAya.add(new AuthorClass("054", " القمر"));
            ListAya.add(new AuthorClass("055", " الرحمن"));
            ListAya.add(new AuthorClass("056", " الواقعة"));
            ListAya.add(new AuthorClass("057", " الحديد"));
            ListAya.add(new AuthorClass("058", " المجادلة"));
            ListAya.add(new AuthorClass("059", " الحشر"));
            ListAya.add(new AuthorClass("060", " الممتحنة"));
            ListAya.add(new AuthorClass("061", " الصف"));
            ListAya.add(new AuthorClass("062", " الجمعة"));
            ListAya.add(new AuthorClass("063", " المنافقون"));
            ListAya.add(new AuthorClass("064", " التغابن"));
            ListAya.add(new AuthorClass("065", " الطلاق"));
            ListAya.add(new AuthorClass("066", " التحريم"));
            ListAya.add(new AuthorClass("067", " الملك"));
            ListAya.add(new AuthorClass("068", " القلم"));
            ListAya.add(new AuthorClass("069", " الحاقة"));
            ListAya.add(new AuthorClass("070", " المعارج"));
            ListAya.add(new AuthorClass("071", " نوح"));
            ListAya.add(new AuthorClass("072", " الجن"));
            ListAya.add(new AuthorClass("073", " المزّمّل"));
            ListAya.add(new AuthorClass("074", " المدّثر"));
            ListAya.add(new AuthorClass("075", " القيامة"));
            ListAya.add(new AuthorClass("076", " الإنسان"));
            ListAya.add(new AuthorClass("077", " المرسلات"));
            ListAya.add(new AuthorClass("078", " النبأ"));
            ListAya.add(new AuthorClass("079", " النازعات"));
            ListAya.add(new AuthorClass("080", " عبس"));
            ListAya.add(new AuthorClass("081", " التكوير"));
            ListAya.add(new AuthorClass("082", " الإنفطار"));
            ListAya.add(new AuthorClass("083", " المطفّفين"));
            ListAya.add(new AuthorClass("084", " الإنشقاق"));
            ListAya.add(new AuthorClass("085", " البروج"));
            ListAya.add(new AuthorClass("086", " الطارق"));
            ListAya.add(new AuthorClass("087", " الأعلى"));
            ListAya.add(new AuthorClass("088", " الغاشية"));
            ListAya.add(new AuthorClass("089", " الفجر"));
            ListAya.add(new AuthorClass("090", " البلد"));
            ListAya.add(new AuthorClass("091", " الشمس"));
            ListAya.add(new AuthorClass("092", " الليل"));
            ListAya.add(new AuthorClass("093", " الضحى"));
            ListAya.add(new AuthorClass("094", " الشرح"));
            ListAya.add(new AuthorClass("095", " التين"));
            ListAya.add(new AuthorClass("096", " العلق"));
            ListAya.add(new AuthorClass("097", " القدر"));
            ListAya.add(new AuthorClass("098", " البينة"));
            ListAya.add(new AuthorClass("099", " الزلزلة"));
            ListAya.add(new AuthorClass("100", " العاديات"));
            ListAya.add(new AuthorClass("101", " القارعة"));
            ListAya.add(new AuthorClass("102", " التكاثر"));
            ListAya.add(new AuthorClass("103", " العصر"));
            ListAya.add(new AuthorClass("104", " الهمزة"));
            ListAya.add(new AuthorClass("105", " الفيل"));
            ListAya.add(new AuthorClass("106", " قريش"));
            ListAya.add(new AuthorClass("107", " الماعون"));
            ListAya.add(new AuthorClass("108", " الكوثر"));
            ListAya.add(new AuthorClass("109", " الكافرون"));
            ListAya.add(new AuthorClass("110", " النصر"));
            ListAya.add(new AuthorClass("111", " المسد"));
            ListAya.add(new AuthorClass("112", " الإخلاص"));
            ListAya.add(new AuthorClass("113", " الفلق"));
            ListAya.add(new AuthorClass("114", " النّاس"));
        }
        else{
        //english aya
            ListAya.add(new AuthorClass("001", "Al-Fatihah "));
            ListAya.add(new AuthorClass("002", "Al-Baqarah "));
            ListAya.add(new AuthorClass("003", "Al-'Imran "));
            ListAya.add(new AuthorClass("004", "An-Nisa' "));
            ListAya.add(new AuthorClass("005", "Al-Ma'idah "));
            ListAya.add(new AuthorClass("006", "Al-An'am "));
            ListAya.add(new AuthorClass("007", "Al-A'raf "));
            ListAya.add(new AuthorClass("008", "Al-AnfAl "));
            ListAya.add(new AuthorClass("009", "Al-Bara'at  "));
            ListAya.add(new AuthorClass("010", "Yunus  "));
            ListAya.add(new AuthorClass("011", " Hud "));
            ListAya.add(new AuthorClass("012", " Yusuf "));
            ListAya.add(new AuthorClass("013", "Ar - Ra'd  "));
            ListAya.add(new AuthorClass("014", "Ibrahim "));
            ListAya.add(new AuthorClass("015", " Al - Hijr "));
            ListAya.add(new AuthorClass("016", " An - Nahl "));
            ListAya.add(new AuthorClass("017", " Al - Isra' "));
            ListAya.add(new AuthorClass("018", " Al - Kahf  "));
            ListAya.add(new AuthorClass("019", "Maryam "));
            ListAya.add(new AuthorClass("020", "Ta Ha  "));
            ListAya.add(new AuthorClass("021", "Al - Anbiya' "));
            ListAya.add(new AuthorClass("022", "Al - Hajj "));
            ListAya.add(new AuthorClass("023", "Al - Mu'minun "));
            ListAya.add(new AuthorClass("024", "An - Nur "));
            ListAya.add(new AuthorClass("025", "Al - Furqan "));
            ListAya.add(new AuthorClass("026", "Ash - Shu'ara' "));
            ListAya.add(new AuthorClass("027", "An - Naml "));
            ListAya.add(new AuthorClass("028", "Al - Qasas "));
            ListAya.add(new AuthorClass("029", "Al - 'Ankabut "));
            ListAya.add(new AuthorClass("030", "Ar - Rum "));
            ListAya.add(new AuthorClass("031", "Luqman "));
            ListAya.add(new AuthorClass("032", "As - Sajdah "));
            ListAya.add(new AuthorClass("033", "Al - Ahzab "));
            ListAya.add(new AuthorClass("034", "Al - Saba'  "));
            ListAya.add(new AuthorClass("035", "Al - Fatir "));
            ListAya.add(new AuthorClass("036", "Ya Sin "));
            ListAya.add(new AuthorClass("037", "As - Saffat"));
            ListAya.add(new AuthorClass("038", "Sad "));
            ListAya.add(new AuthorClass("039", "Az - Zumar "));
            ListAya.add(new AuthorClass("040", "Al - Mu'minun "));
            ListAya.add(new AuthorClass("041", "Ha Mim "));
            ListAya.add(new AuthorClass("042", "Ash - Shura "));
            ListAya.add(new AuthorClass("043", "Az - Zukhruf "));
            ListAya.add(new AuthorClass("044", "Ad - Dukhan "));
            ListAya.add(new AuthorClass("045", "Al - Jathiyah  "));
            ListAya.add(new AuthorClass("046", "Al - Ahqaf "));
            ListAya.add(new AuthorClass("047", "Muhammad "));
            ListAya.add(new AuthorClass("048", "Al - Fath "));
            ListAya.add(new AuthorClass("049", "Al - Hujurat "));
            ListAya.add(new AuthorClass("050", "Qaf  "));
            ListAya.add(new AuthorClass("051", "Ad - Dhariyat "));
            ListAya.add(new AuthorClass("052", "At - Tur "));
            ListAya.add(new AuthorClass("053", "An - Najm "));
            ListAya.add(new AuthorClass("054", "Al - Qamar "));
            ListAya.add(new AuthorClass("055", "Ar - Rahman "));
            ListAya.add(new AuthorClass("056", "Al - Waqi'ah "));
            ListAya.add(new AuthorClass("057", "Al - Hadid "));
            ListAya.add(new AuthorClass("058", "Al - Mujadilah "));
            ListAya.add(new AuthorClass("059", "Al - Hashr "));
            ListAya.add(new AuthorClass("060", "Al - Mumtahinah "));
            ListAya.add(new AuthorClass("061", "As - Saff "));
            ListAya.add(new AuthorClass("062", "Al - Jumu'ah "));
            ListAya.add(new AuthorClass("063", "Al - Munafiqun "));
            ListAya.add(new AuthorClass("064", "At - Taghabun "));
            ListAya.add(new AuthorClass("065", "At - Talaq "));
            ListAya.add(new AuthorClass("066", "At - Tahrim "));
            ListAya.add(new AuthorClass("067", "Al - Mulk "));
            ListAya.add(new AuthorClass("068", "Al - QAlam "));
            ListAya.add(new AuthorClass("069", "Al - Haqqah "));
            ListAya.add(new AuthorClass("070", "Al - Ma'arij "));
            ListAya.add(new AuthorClass("071", "Nuh  "));
            ListAya.add(new AuthorClass("072", "Al - Jinn "));
            ListAya.add(new AuthorClass("073", "Al - Muzzammil "));
            ListAya.add(new AuthorClass("074", "Al - Muddaththir "));
            ListAya.add(new AuthorClass("075", "Al - Qiyamah "));
            ListAya.add(new AuthorClass("076", "Al - Insan "));
            ListAya.add(new AuthorClass("077", "Al - Mursalat "));
            ListAya.add(new AuthorClass("078", "An - Naba'  "));
            ListAya.add(new AuthorClass("079", "An - Nazi'at "));
            ListAya.add(new AuthorClass("080", "'Abasa  "));
            ListAya.add(new AuthorClass("081", "At - Takwir "));
            ListAya.add(new AuthorClass("082", "Al - Infitar "));
            ListAya.add(new AuthorClass("083", "At - Tatfif "));
            ListAya.add(new AuthorClass("084", "Al - Inshiqaq "));
            ListAya.add(new AuthorClass("085", "Al - Buruj "));
            ListAya.add(new AuthorClass("086", "At - Tariq "));
            ListAya.add(new AuthorClass("087", "Al - A'la "));
            ListAya.add(new AuthorClass("088", "Al - Ghashiyah "));
            ListAya.add(new AuthorClass("089", "Al - Fajr "));
            ListAya.add(new AuthorClass("090", "Al - Balad "));
            ListAya.add(new AuthorClass("091", "Ash - Shams "));
            ListAya.add(new AuthorClass("092", "Al - Lail "));
            ListAya.add(new AuthorClass("093", "Ad - Duha "));
            ListAya.add(new AuthorClass("094", "As - Sharh "));
            ListAya.add(new AuthorClass("095", "At - Tin "));
            ListAya.add(new AuthorClass("096", "Al - 'Alaq  "));
            ListAya.add(new AuthorClass("097", "Al - Qadr "));
            ListAya.add(new AuthorClass("098", "Al - Bayyinah "));
            ListAya.add(new AuthorClass("099", "Al - Zalzalah  "));
            ListAya.add(new AuthorClass("100", "Al - 'Adiyat "));
            ListAya.add(new AuthorClass("101", "Al - Qari'ah "));
            ListAya.add(new AuthorClass("102", "At - Takathur "));
            ListAya.add(new AuthorClass("103", "Al - 'Asr "));
            ListAya.add(new AuthorClass("104", "Al - Humazah "));
            ListAya.add(new AuthorClass("105", "Al - Fil "));
            ListAya.add(new AuthorClass("106", "Al - Quraish "));
            ListAya.add(new AuthorClass("107", "Al - Ma'un  "));
            ListAya.add(new AuthorClass("108", "Al - Kauthar "));
            ListAya.add(new AuthorClass("109", "Al - Kafirun "));
            ListAya.add(new AuthorClass("110", "An - Nasr "));
            ListAya.add(new AuthorClass("111", "Al - Lahab "));
            ListAya.add(new AuthorClass("112", "Al - Ikhlas "));
            ListAya.add(new AuthorClass("113", "Al - Falaq "));
            ListAya.add(new AuthorClass("114", "An - Nas  "));
        }
        ListBeginEndAya ListRange = new ListBeginEndAya();
        ListRange = managment.autherRanageDetermine(ReciteName);
        ListAyaRanage.clear();
        //IsolatedStorageFile isoStore = IsolatedStorageFile.GetUserStoreForApplication();
        String AYAPAth;

        for (int i = ListRange.beginR; i < ListRange.endread; i++) {
            try{


            AuthorClass ac = new AuthorClass();
            ac = ListAya.get(i);
                String SDPath = Environment.getExternAlStorageDirectory().getPath() + "/";
            AYAPAth =SDPath+  ReciteName+ ac.ServerName +".mp3";

            //    String[] fmyFilemyFileiles = isoStore.GetFileNames(ReAlServerFolder + ListAya[i].ServerName + ".mp3");
            File myFile = new File(AYAPAth);
            if (myFile.exists())
                ListAyaRanage.add(new AuthorClass(ac.ServerName, ac.ReAlName,  avAlible(),  AYAPAth  ));
            else
            {
                AYAPAth ="http://server"+  serverNumber (ReciteName) + ".mp3quran.net/" +ReciteName + "/" +  ac.ServerName + ".mp3";

              //  AYAPAth = "http://www.quran.Alrubaye.com/quran/" + LnaguageClass.RecitesName + "/" + ac.ServerName + ".mp3";
             ListAyaRanage.add(new AuthorClass(ac.ServerName, ac.ReAlName, disavAlible(), AYAPAth));
            }


            }catch (Exception ex){}


        }
        return(ListAyaRanage);
    }



}

