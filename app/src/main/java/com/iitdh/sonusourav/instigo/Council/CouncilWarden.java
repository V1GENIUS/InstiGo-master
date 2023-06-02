package com.iitdh.sonusourav.instigo.Council;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import androidx.core.app.NavUtils;
import androidx.viewpager.widget.PagerAdapter;
import androidx.appcompat.app.AppCompatActivity;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;

import com.iitdh.sonusourav.instigo.R;
import com.tmall.ultraviewpager.UltraViewPager;
import com.tmall.ultraviewpager.transformer.UltraDepthScaleTransformer;

import java.util.ArrayList;


public class CouncilWarden extends AppCompatActivity
        {

            @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.council_warden);

        UltraViewPager ultraViewPager = (UltraViewPager) findViewById(R.id.council_view_pager);
                ArrayList<CouncilUserClass> wardenList = new ArrayList<>();

        CouncilUserClass Asavari=new CouncilUserClass(" Vivek rathore","Asavari Hostel Warden","0836-2212834"," Vivekrathore9111@gmail.com",R.drawable.vivek1);
      //  CouncilUserClass Bhairavi=new CouncilUserClass("Rajshekar K.","Bhairavi Hostel Warden","0836-2212834","warden_bhairavi@iitdh.ac.in",R.drawable.ritik);
        CouncilUserClass Abheri=new CouncilUserClass(" ankesh verma","Abheri Hostel Warden","0836-2212834","Ankesh.verma.sdbc.@gmail.com",R.drawable.ankesh);
      //  CouncilUserClass Behag=new CouncilUserClass("Sudheer S.","Behag Hostel Warden","0836-2212847","warden_behag@iitdh.ac.in",R.drawable.ritik);
     //   CouncilUserClass Chhayanat=new CouncilUserClass("Koushik Saha","Chhayanat Hostel Warden","0836-2212834","warden_chhayanat@iitdh.ac.in",R.drawable.ritik);
        CouncilUserClass Hamsadhwani=new CouncilUserClass("Not Appointed","Hamsadhwani Hostel Warden","0836-2212834"," Vivekrathore9111@gmail.com",R.drawable.vinay);
      //  CouncilUserClass Kedar=new CouncilUserClass("Ameer K. M.","Kedar Hostel Warden","0836-2212846","warden_kedar@iitdh.ac.in",R.drawable.ritik);
     //   CouncilUserClass Kalawati=new CouncilUserClass("Not Appointed ","Kalawati Hostel Warden","0836-2212835","warden_hindol@iitdh.ac.in",R.drawable.ritik);
        CouncilUserClass Hindol=new CouncilUserClass(" manoj yadav","Hindol Hostel Warden","0836-2212834"," Vivekrathore9111@gmail.com",R.drawable.manoj);
        CouncilUserClass KeeravaniBoys=new CouncilUserClass(" Vivek ","Keeravani Boys Hostel Warden","0836-221283"," Vivekrathore9111@gmail.com",R.drawable.vivek3dress);
     //   CouncilUserClass KeeravaniGirls=new CouncilUserClass(" Ruma Ghosh","Keeravani Girls Hostel Warden","0836-2212849","warden_keeravani_girls@iitdh.ac.in",R.drawable.ritik);
      //  CouncilUserClass Saveri=new CouncilUserClass("Ridhima Tewari","Saveri Hostel Warden","0836-2212843","warden_saveri@iitdh.ac.in",R.drawable.ritik);

        wardenList.add(Asavari);
      //  wardenList.add(Bhairavi);
        wardenList.add(Abheri);
     //   wardenList.add(Behag);
      //  wardenList.add(Chhayanat);
        wardenList.add(Hamsadhwani);
     //   wardenList.add(Kedar);
     //   wardenList.add(Kalawati);
        wardenList.add(Hindol);
        wardenList.add(KeeravaniBoys);
      //  wardenList.add(KeeravaniGirls);
       // wardenList.add(Saveri);


        //main code starts here
        ultraViewPager.setScrollMode(UltraViewPager.ScrollMode.HORIZONTAL);
                PagerAdapter adapter = new UltraPagerAdapter(true, this, wardenList);
        ultraViewPager.setAdapter(adapter);

        ultraViewPager.setMultiScreen(0.8f);
        ultraViewPager.setItemRatio(1.0f);
        ultraViewPager.setRatio(0.75f);
        ultraViewPager.setAutoMeasureHeight(true);
                UltraViewPager.Orientation gravity_indicator = UltraViewPager.Orientation.HORIZONTAL;
        ultraViewPager.setPageTransformer(false, new UltraDepthScaleTransformer());



    }



    protected void onResume() {
        super.onResume();

    }

    public boolean onCreateOptionsMenu(Menu menu) {

        androidx.appcompat.app.ActionBar wardenActionBar = getSupportActionBar();
        assert wardenActionBar != null;
        wardenActionBar.setHomeButtonEnabled(true);
        wardenActionBar.setDisplayHomeAsUpEnabled(true);
        wardenActionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#5cae80")));
        wardenActionBar.setTitle(Html.fromHtml("<font color='#ffffff'>Council</font>"));
        return super.onCreateOptionsMenu(menu);

    }

    public boolean onOptionsItemSelected(MenuItem item) {

        super.onOptionsItemSelected(item);

        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return true;

    }


}
