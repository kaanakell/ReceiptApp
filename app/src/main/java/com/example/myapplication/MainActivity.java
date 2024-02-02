package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import com.bumptech.glide.load.engine.Resource;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> selectedItems = new ArrayList<>();
    private Button button;
    ListView myListView;
    ArrayList<String> list;
    ArrayAdapter<String> mAdapter;
    ArrayList<FoodData> Dashb;
    DbManager db=new DbManager(MainActivity.this);




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myListView=(ListView)findViewById(R.id.listview1);
        myListView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

        Resources Rest = getResources();
        Drawable dr = Rest.getDrawable(R.drawable.image);
        Bitmap bitmap = ((BitmapDrawable)dr).getBitmap();
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
        byte[] bitmapdata = stream.toByteArray();


        Drawable dr1 = Rest.getDrawable(R.drawable.image2);
        Bitmap bitmap1 = ((BitmapDrawable)dr1).getBitmap();
        ByteArrayOutputStream stream1 = new ByteArrayOutputStream();
        bitmap1.compress(Bitmap.CompressFormat.JPEG, 100, stream1);
        byte[] bitmapdata1 = stream1.toByteArray();


        Drawable dr2 = Rest.getDrawable(R.drawable.image3);
        Bitmap bitmap2 = ((BitmapDrawable)dr2).getBitmap();
        ByteArrayOutputStream stream2 = new ByteArrayOutputStream();
        bitmap2.compress(Bitmap.CompressFormat.JPEG, 100, stream2);
        byte[] bitmapdata2 = stream2.toByteArray();


        Drawable dr3 = Rest.getDrawable(R.drawable.image4);
        Bitmap bitmap3 = ((BitmapDrawable)dr3).getBitmap();
        ByteArrayOutputStream stream3 = new ByteArrayOutputStream();
        bitmap3.compress(Bitmap.CompressFormat.JPEG, 100, stream3);
        byte[] bitmapdata3 = stream3.toByteArray();


        Drawable dr4 = Rest.getDrawable(R.drawable.image5);
        Bitmap bitmap4 = ((BitmapDrawable)dr4).getBitmap();
        ByteArrayOutputStream stream4 = new ByteArrayOutputStream();
        bitmap4.compress(Bitmap.CompressFormat.JPEG, 100, stream4);
        byte[] bitmapdata4 = stream4.toByteArray();


        Drawable dr5 = Rest.getDrawable(R.drawable.image6);
        Bitmap bitmap5 = ((BitmapDrawable)dr5).getBitmap();
        ByteArrayOutputStream stream5 = new ByteArrayOutputStream();
        bitmap5.compress(Bitmap.CompressFormat.JPEG, 100, stream5);
        byte[] bitmapdata5 = stream5.toByteArray();

        Drawable dr6 = Rest.getDrawable(R.drawable.image7);
        Bitmap bitmap6 = ((BitmapDrawable)dr6).getBitmap();
        ByteArrayOutputStream stream6 = new ByteArrayOutputStream();
        bitmap6.compress(Bitmap.CompressFormat.JPEG, 100, stream6);
        byte[] bitmapdata6 = stream6.toByteArray();

        Drawable dr7 = Rest.getDrawable(R.drawable.image8);
        Bitmap bitmap7 = ((BitmapDrawable)dr7).getBitmap();
        ByteArrayOutputStream stream7 = new ByteArrayOutputStream();
        bitmap7.compress(Bitmap.CompressFormat.JPEG, 100, stream7);
        byte[] bitmapdata7 = stream7.toByteArray();

        Drawable dr8 = Rest.getDrawable(R.drawable.image9);
        Bitmap bitmap8 = ((BitmapDrawable)dr8).getBitmap();
        ByteArrayOutputStream stream8 = new ByteArrayOutputStream();
        bitmap8.compress(Bitmap.CompressFormat.JPEG, 100, stream8);
        byte[] bitmapdata8 = stream8.toByteArray();

        Drawable dr9 = Rest.getDrawable(R.drawable.image10);
        Bitmap bitmap9 = ((BitmapDrawable)dr9).getBitmap();
        ByteArrayOutputStream stream9 = new ByteArrayOutputStream();
        bitmap9.compress(Bitmap.CompressFormat.JPEG, 100, stream9);
        byte[] bitmapdata9 = stream9.toByteArray();









        db.onUpgrade(db.getWritableDatabase(), 1,2);
        db.IngredientsEkle("Domates");
        db.IngredientsEkle("Patates");
        db.IngredientsEkle("İrmik");
        db.IngredientsEkle("Portakal");
        db.IngredientsEkle("Un");
        db.IngredientsEkle("Hindistan Cevizi");
        db.IngredientsEkle("Limon");
        db.IngredientsEkle("Süt");
        db.IngredientsEkle("Damla Sakızı");
        db.IngredientsEkle("Karnabahar");
        db.IngredientsEkle("Sarımsak");
        db.IngredientsEkle("Soğan");
        db.IngredientsEkle("Kıyma");
        db.IngredientsEkle("Kırmızı Biber");
        db.IngredientsEkle("Yeşil Biber");
        db.IngredientsEkle("Taze Fasulye");
        db.IngredientsEkle("Yumurta");
        db.IngredientsEkle("Yoğurt");
        db.IngredientsEkle("Kuru Soğan");
        db.IngredientsEkle("Et");
        db.IngredientsEkle("Pudra Şekeri");
        db.IngredientsEkle("Vanilya");
        db.IngredientsEkle("Tereyağ");
        db.IngredientsEkle("Toz Şeker");
        db.IngredientsEkle("Damla Sakızı");
        db.IngredientsEkle("Nişasta");
        db.IngredientsEkle("Domates Salçası");
        db.IngredientsEkle("Sıvı Yağ");
        db.IngredientsEkle("Kaşar Peynir");
        db.IngredientsEkle("Zeytinyağ");
        db.IngredientsEkle("Muskat");
        db.IngredientsEkle("Tahin");
        db.IngredientsEkle("Ceviz");
        db.IngredientsEkle("Bezelye");
        db.IngredientsEkle("Havuç");
        db.IngredientsEkle("Salça");
        db.IngredientsEkle("Çubuk Tarçın");
        db.IngredientsEkle("Antep Fıstığı");
        db.IngredientsEkle("Kuru Nane");
        db.IngredientsEkle("Kaymak");
        db.IngredientsEkle("Tarçın");
        db.IngredientsEkle("Karanfil");
        db.IngredientsEkle("Ayva");



        db.RecipeAdd("Sac Kavurma","Sac Kavurma Tarifi İçin Malzemeler:\n" +
                "1 kg kuş başı et\n" +
                "1 adet kuru soğan\n" +
                "2 adet domates\n" +
                "2 adet kırmızı biber\n" +
                "4 adet yeşil biber\n" +
                "Tuz\n" +
                "Pul biber\n" +
                "3 yemek kaşığı tereyağı\n" +
                "5-6 yemek kaşığı zeytinyağı\n" +
                "\n" +
                "Sac Kavurma Yapılışı:\n" +
                "\n" +
                "Sac tavaya etleri alalım. Kısık ateşte ağzı kapalı şekilde suyunu çekene kadar pişirelim. Üzerine tereyağını ve zeytin yağını ilave edip yüksek ateşte 5 dakika kavuralım. Sonra ince ince doğradığımız soğanı ilave edip soğanlar yumuşayana kadar kavuralım. Daha sonra ince ince doğradığımız biberleri ilave edip 5 dakika kavuralım. Süre sonunda kabuklarını soyup biraz irice doğradığımız domatesleri ilave edip domatesler hafif suyunu çekene kadar pişirelim. Son olarak tuzu ve pul biberi ilave edip ocaktan alalım. Sac Kavurmayı sıcak olarak servis yapın.",bitmapdata,"Kuru Soğan,Kıyma,Domates,Kırmızı Biber,Yeşil Biber,Et");

        db.RecipeAdd("Patatesli Taze Fasulye","Patatesli Taze Fasulye Tarifi İçin Malzemeler:\n" +
                "\n" +
                "Yarım kg taze fasulye\n" +
                "3 adet domates\n" +
                "2 adet kırmızı biber\n" +
                "2 adet yeşil biber\n" +
                "2 adet kuru soğan\n" +
                "2 adet patates\n" +
                "Tuz\n" +
                "Karabiber\n" +
                "Pul biber\n" +
                "Zeytinyağı\n" +
                "Sıcak su\n" +
                "\n" +
                "Patatesli Taze Fasulye Yapılışı:\n" +
                "\n" +
                "Fasulyeleri yıkayıp temizleyelim. Sonra fasulyeleri istediğimiz gibi doğrayalım. İnce ince doğradığımız soğanları zeytin yağında soğanlar pembeleşene kadar kavuralım. Üzerine biraz irice doğradığımız biberleri ilave edip 2-3 dakika kavuralım. Daha sonra kabuklarını soyup irice doğradığımız domatesleri, baharatları ve fasulyeleri ilave edip 10 dakika kavuralım. Sebzelerin hafif üzerini geçecek kadar sıcak su ilave edip ağzı kapalı şekilde kısık ateşte 10-15 dakika pişirelim. Son olarak küp şeklinde doğradığımız patatesleri ve tuzu ilave edip sebzeler yumuşayıncaya kadar pişirelim. Patatesli Taze Fasulyemiz servise hazır.",bitmapdata1,"Domates,Kırmızı Biber,Yeşil Biber,Kuru Soğan,Patates");

        db.RecipeAdd("Portakallı Revani","Portakallı Revani Tarifi İçin Malzemeler:\n" +
                "\n" +
                "3 adet yumurta\n" +
                "1 çay bardağı şeker\n" +
                "1 çay bardağı sıvı yağı\n" +
                "1 çay bardağı portakal suyu\n" +
                "1 su bardağı yoğurt\n" +
                "1,5 su bardağı irmik\n" +
                "1,5 su bardağı un\n" +
                "1 paket kabartma tozu (10 gr)\n" +
                "1 paket vanilya (5 gr)\n" +
                "\n" +
                "Şerbeti İçin:\n" +
                "\n" +
                "3 su bardağı şeker\n" +
                "3,5 su bardağı su\n" +
                "Çeyrek limon suyu\n" +
                "\n" +
                "Portakallı Revani Yapılışı:\n" +
                "\n" +
                "Şerbeti için; şekeri ve suyu tencereye alalım. Şerbet kaynamaya başladıktan sonra 15 dakika daha kaynatalım. İçine limon suyunu ilave edip ocaktan alalım. Bir kaba yumurtaları ve şekeri koyup iyice çırpalım. Üzerine kalan malzemeyi ilave edip çırpalım. Kek kıvamından biraz daha akışkan bir hamur olacak. Harcı yağladığımız borcama döküp eşit şekilde yayalım. Soğuk fırına koyup 175 ° fırında yaklaşık 30-35 dakika kürdan temiz çıkana kadar pişirelim. İlk sıcaklığı çıkan revaniyi dilimleyelim. Sonra revaninin üzerine gezdirerek şerbeti dökelim. Portakallı Revanimizi iyice soğuduktan sonra servis yapın.",bitmapdata2,"Yumurta,Portakal,Yoğurt,İrmik,Un,Vanilya");

        db.RecipeAdd("Şekerpare","Şekerpare Tarifi İçin Malzemeler:\n" +
                "\n" +
                "2 adet yumurta (birinin sarısı üzerine)\n" +
                "1 türk kahvesi fincanı irmik\n" +
                "1 türk kahvesi fincanı hindistan cevizi\n" +
                "1 türk kahvesi fincanı fındık yağı ya da ayçiçek yağı\n" +
                "1 türk kahvesi fincanı pudra şekeri\n" +
                "1 adet limon kabuğu rendesi\n" +
                "1 paket oda sıcaklığında tereyağı (250 gr)\n" +
                "Aldığı kadar un\n" +
                "1 paket kabartma tozu (10 gr)\n" +
                "\n" +
                "Şerbeti İçin:\n" +
                "\n" +
                "2,5 su bardağı şeker\n" +
                "3 su bardağı su\n" +
                "Çeyrek limon\n" +
                "\n" +
                "Şekerpare Yapılışı:\n" +
                "\n" +
                "Şerbeti için; şekeri ve suyu tencerede kaynatalım. Kaynayınca içine çeyrek limonu atalım. Sonra 10 dakika daha kaynatıp soğumaya bırakalım. Bir kaba tereyağını ve pudra şekerini alıp iyice karıştıralım. Üzerine un hariç kalan malzemeyi ilave edip iyice karıştıralım. Azar azar unu ilave edip kulak memesi yumuşaklığında bir hamur yoğuralım. Hamurdan ceviz büyüklüğünde parçalar koparıp istediğimiz şekli vererek yuvarlayalım. Daha sonra üzerlerine yumurta sarısı sürelim. Son olarak üzerlerine kahvaltı çatalı ile tek seferde hafif çizik atalım. Önceden ısıtılmış 180° fırında üzerleri kızarana kadar pişirelim. Fırından çıkınca 2-3 dakika bekletip soğuk şerbeti gezdirerek üzerlerine dökelim. Şekerparelerin üzerini istediğiniz şekilde süsleyip servis yapın.",bitmapdata3,"Yumurta,İrmik,Hindistan Cevizi,Pudra Şekeri,Limon,Un");

        db.RecipeAdd("Tavuk Göğsü","Tavuk Göğsü Tarifi İçin Malzemeler:\n" +
                "\n" +
                "1 litre süt (5 su bardağı)\n" +
                "125 gr tereyağ veya margarin (yarım paket)\n" +
                "1 su bardağı un\n" +
                "1 su bardağı dolusu toz şeker\n" +
                "1-2 adet dövülmüş damla sakızı (var ise)\n" +
                "1 paket vanilya (5 gr)\n" +
                "\n" +
                "\n" +
                "Çilekli Sosu İçin:\n" +
                "\n" +
                "Yarım kilo çilek\n" +
                "1 yemek kaşığı toz şeker\n" +
                "1 yemek kaşığı nişasta\n" +
                "1 paket vanilya (isteğe göre)\n" +
                "\n" +
                "\n" +
                "Tavuk Göğsü Yapılışı:\n" +
                "\n" +
                "Derin bir tencereye yağı koyup eritelim. Unu azar azar ilave edip kısık ateşte kokusu çıkana kadar kavuralım. Rengi çok dönmesin. Sonra ılık sütü ve toz şekeri ilave edip bir yandan da tel çırpıcı ile karıştıralım. Daha sonra mikserle karıştırarak kaynatıp ocaktan alalım. Son olarak vanilyayı ilave edip en az 5 dakika mikserle çırpalım. Islatıp suyunu süzdüğümüz borcama ya da kalıba  muhallebiyi döküp buzdolabına kaldıralım. Çilekli sosu için; çilekleri  ve toz şekeri rondodan birlikte geçirdikten sonra tencereye alalım. Üzerine nişastayı ilave edip karıştırarak kaynatalım. Sosu ince bir süzgeçle süzüp pürüzsüz hale getirelim. İyice soğuyan tatlının üzerine sosu döküp eşit şekilde düzgünce yayalım. Çilek Soslu Yalancı Tavuk Göğsünün üzerini istediğiniz şekilde süsleyip servis yapın.\n",bitmapdata4,"Süt,Tereyağ,Un,Toz Şeker,Damla Sakızı,Vanilya,Nişasta");

        db.RecipeAdd("Kıymalı Karnabahar","Kıymalı Karnabahar Graten Tarifi İçin Malzemeler:\n" +
                "\n" +
                "1 küçük boy karnabahar\n" +
                "400-500 gr kadar kıyma\n" +
                "1 baş soğan\n" +
                "2 diş sarımsak\n" +
                "1 yemek kaşığı dolusu domates salçası\n" +
                "2/3 çay bardağı sıvı yağı\n" +
                "1 çay kaşığı karabiber\n" +
                "1 çay kaşığı yenibahar\n" +
                "Tuz\n" +
                "\n" +
                "Beşamel Sosu İçin:\n" +
                "\n" +
                "Yarım su bardağı un\n" +
                "3 su bardağı süt\n" +
                "1 yemek kaşığı dolusu tereyağı\n" +
                "2-3 yemek kaşığı zeytinyağı\n" +
                "Tuz\n" +
                "Muskat \n" +
                "\n" +
                "Üzeri İçin:\n" +
                "\n" +
                "1 su bardağı kadar kaşar rendesi\n" +
                "\n" +
                "Kıymalı Karnabahar Graten Yapılışı:\n" +
                "\n" +
                "Kaynayan suya çiçeklerini birbirinden ayırdığımız karnabaharı ve bir dilim limonu atalım. Karnabaharı yumuşayana kadar haşlayıp suyunu süzelim. İnce ince doğradığımız soğanı ve sarımsakları sıvı yağda kavuralım. Üzerine kıymayı ilave edip kavurmaya devam edelim. Sonra salçayı, tuzu ve baharatları ilave edip 2-3 dakika daha kavurduktan sonra ocaktan alalım. Beşamel sosu için; tavaya tereyağını ve sıvı yağı koyup eritelim. Üzerine unu ilave edip unun kokusu çıkana kadar yaklaşık 5-6 dakika kavuralım. Sütü karıştırarak yavaş yavaş ilave edelim. Muhallebi kıvamına gelene kadar karıştıralım. 1-2 dakika daha karıştırarak kaynatalım. Daha sonra bir çayı kaşığı kadar muskat rendesi ve tuz ilave edip ocaktan alalım. Kare büyük borcama karnabaharları yayalım. Üzerine kıymayı döküp eşit şekilde yayalım. Kıymanın üzerine beşamel sosu ilave edip eşit şekilde yayalım. Son olarak eşit şekilde kaşar rendesi serpelim. Önceden ısıtılmış 180 derece fırında üzeri kızarana kadar yaklaşık 25-30 dakika kadar pişirelim. Kıymalı Karnabahar Gratenimiz biraz dinlendirdikten sonra servis yapın.\n",bitmapdata5,"Karnabahar,Kıyma,Soğan,Sarımsak,Domates Salçası,Sıvı Yağ,Un,Süt,Tereyağ,Zeytinyağ,Muskat,Kaşar Peynir");

        db.RecipeAdd("Un Helvası","Kolay Un Helvası Tarifi İçin Malzemeler:\n" +
                "\n" +
                "125 gr tereyağı (yarım paket)\n" +
                "Yarım çay bardağı sıvı yağı\n" +
                "2 su bardağı un\n" +
                "1 yemek kaşığı tahin\n" +
                "1 su bardağı toz şeker\n" +
                "2 su bardağı süt\n" +
                "1 paket vanilya (5 gr)\n" +
                "\n" +
                "Üzeri İçin:\n" +
                "\n" +
                "Ceviz\n" +
                "\n" +
                "Kolay Un Helvası Yapılışı:\n" +
                "\n" +
                "Tereyağını ve sıvı yağı tavaya alalım. Karıştırarak yakmadan kısık ateşte eritelim. Üzerine unu ilave edip sürekli karıştırarak kavuralım. Unu, rengi dönene kadar yaklaşık 30-35 dakika kavuralım. Rengi resimdeki gibi olmalı. Sonra toz şekeri ilave edip karıştırmaya devam edelim. Son olarak tahini ilave edip karıştıralım. Daha sonra bir kapta karıştırdığımız sütlü vanilyalı karışımı ilave edip koyu bir kıvam alana kadar karıştıralım. Helva kaşığa yapışmıyorsa olmuş demektir. Hazırladığımız helvayı ocaktan alıp 10-15 dakika dinlendirelim. Dinlenen helvayı istediğiniz şekilde şekillendirip üzerini süsleyin. Kolay Un Helvamız Servise hazır.",bitmapdata6,"Tereyağ,Sıvı Yağ,Un,Tahin,Vanilya,Ceviz");

        db.RecipeAdd("Etli Taze Bezelye","Etli Taze Bezelye Yemeği Tarifi İçin Malzemeler:\n" +
                "\n" +
                "Yarım kg taze bezelye\n" +
                "250 gr kuşbaşı et\n" +
                "1 adet havuç\n" +
                "1 adet kırmızı biber\n" +
                "1 adet kuru soğan\n" +
                "1 çorba kaşığı salça\n" +
                "Tuz\n" +
                "Karabiber\n" +
                "Pul biber\n" +
                "Zeytinyağı\n" +
                "Sıcak su\n" +
                "\n" +
                "Etli Taze Bezelye Yemeği Yapılışı:\n" +
                "\n" +
                "Kuşbaşı etleri tencereye alalım. Kısık ateşte ağzı kapalı şekilde suyunu çekene kadar pişirelim. Üzerine ince ince doğradığımız soğanı, kırmızı biberi ve zeytin yağını ilave edip 5 dakika kavuralım. Sonra salçayı ve baharatları ilave edip salçanın kokusu çıkana kadar kavuralım. Daha sonra ayıklayıp yıkadığımız bezelyeleri ilave edip karıştıralım. Son olarak tuzu ve yemeğin üzerini geçecek kadar sıcak su ilave edelim. Kısık ateşte bezelyeler yumuşayıncaya kadar pişirelim. Etli Taze Bezelye Yemeğimizi sıcak olarak servis yapın.",bitmapdata7,"Bezelye,Et,Havuç,Kırmızı Biber,Kuru Soğan,Salça");

        db.RecipeAdd("Ayva Tatlısı","Ayva Tatlısı Tarifi İçin Malzemeler:\n" +
                " \n" +
                "4 adet ayva\n" +
                "8 yemek kaşığı toz şeker\n" +
                "10 adet karanfil\n" +
                "2 adet çubuk tarçın\n" +
                "2 su bardağı su\n" +
                "Yarım limon suyu\n" +
                "\n" +
                "Üzeri İçin:\n" +
                "\n" +
                "Kaymak\n" +
                "Antep fıstığı tozu ya da ceviz\n" +
                "\n" +
                "Ayva Tatlısı Yapılışı:\n" +
                "\n" +
                "Ayvaları soyup ortadan ikiye bölelim. Çekirdeklerini çıkarıp bir kaseye ayıralım. Ayvanın kabuklarında da bir miktar ayıralım. Ayvaları önce limonla ovup sonra da yarım limonu sıktığımız su da bekletelim. Yayvan bir tencereye iç kısmı üste gelecek şekilde ayvaları dizelim. Her yarım ayvanın üzerine 2 yemek kaşığı tepeleme şeker dökelim. Ayırdığımız çekirdekleri, ayva kabuklarını, kabuk tarçını ve karanfili ayvaların arasına yerleştirelim. Tencerenin kenarından 2 su bardağı su koyup kapağı kapatalım. Kaynayıncaya kadar yüksek ateşte kaynadıktan sonra kısık ateşe alıp 1,5-2 saat kadar pişirelim. Soğuyan Ayva Tatlılarının üzerini kaymak, antep fıstığı veya cevizle süsleyip servis yapın. Ayvanın çekirdekleri ve kabukları gerekli olan rengi veriyor. Ayvanın rengi pişerken kırmızıya dönüşmüyor. Yavaş yavaş 1 saat içinde rengi değişmeye başlıyor.",bitmapdata8,"Ayva,Karanfil,Çubuk Tarçın,Limon,Antep Fıstığı,Ceviz");

        db.RecipeAdd("Yalancı Kalamar","Yalancı Kalamar Tarifi İçin Malzemeler\n" +
                "\n" +
                "500 gr tavuk göğsü\n" +
                "1 çay kaşığı pul biber\n" +
                "1 çay kaşığı kekik\n" +
                "1 çay kaşığı karabiber\n" +
                "1 tatlı kaşığı tuz\n" +
                "\n" +
                "Sosu İçin:\n" +
                "\n" +
                "1 adet yumurta\n" +
                "5 yemek kaşığı un\n" +
                "1 şişe maden suyu\n" +
                "\n" +
                "Kızartmak İçin:\n" +
                "\n" +
                "Sıvı yağı\n" +
                "\n" +
                "\n" +
                "Yalancı Kalamar Yapılışı:\n" +
                "\n" +
                "Tavuk göğsünü parmak kalınlığında jülyen keselim. Üzerine baharatları ve tuzu ilave edip iyice harmanlayalım. Sosu için; bir kapta yumurtayı çırpalım. Üzerine maden suyunu ve unu ilave edip tel çırpıcı ile pürüzsüz bir karışım elde edelim. Sonra baharatladığımız tavuk etini ilave edip sosa bulayalım. Daha sonra üzerini streç filmle kaplayıp 1 saat buzdolabında dinlendirelim. Son olarak buzdolabından çıkarıp kızgın yağda arkalı önlü kızartalım. Dışı çıtır çıtır içi yumuşacık lezzetli Yalancı Kalamarımızı sıcak olarak servis yapın. Yalancı Kalamar aslında Tempura hamuru ile yapılan bir tavuk kızartmasıdır. Tarife bu adı vermek istemedim fakat her yerde yalancı kalamar adı ile geçiyor. Tempura soslu tavuk en doğru isim olur. Tempura Japonlara ait bir kızartma tekniğidir. Deniz mahsülleri ve sebzeler bu sosa bulanarak kızartılıyor.",bitmapdata9,"Tavuk Göğüsü,Yumurta,Un,Sıvı Yağ");

        list = db.malzemeleriGetir();

        mAdapter = new ArrayAdapter<String>(this,R.layout.rowlayout,R.id.txt_lan,list);
        myListView.setAdapter(mAdapter);






        //ListView

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedItem = ((TextView)view).getText().toString();
                if (selectedItems.contains(selectedItem)){
                    selectedItems.remove(selectedItem);
                }
                else
                    selectedItems.add(selectedItem);
            }
        });










        //Button

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSelectedItems();


               if(selectedItems.size() == 0) {
                 CharSequence charSequence = "En az bir secim yapmalisiniz";
                Toast.makeText(getApplicationContext(),charSequence, LENGTH_LONG).show();
                               } else {Dashb=db.BringRecipes(selectedItems);
               openDashboard();}


            }
        });


               
    }

    public void openDashboard(){
        Intent intent = new Intent(this, DashBoard.class);
        intent.putExtra("a",selectedItems);
        startActivity(intent);
    }

    public void showSelectedItems(){
        String items="";

        for (String item:selectedItems){
            items+="-"+item+"\n";
        }
        //Toast.makeText(this,db.Show(Dashb), LENGTH_LONG).show();

    }


}