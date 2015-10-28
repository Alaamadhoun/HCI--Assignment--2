package com.assignment.HCI.limko;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class Activity1 extends Activity //implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity1); // links it to the XML file

        Button courses=(Button)this.findViewById(R.id.btn_courses); // links it to the button and assigns a variable name courses set by the user
        Button TimeTable=(Button)this.findViewById(R.id.btn_timetable);
        Button Gallery=(Button)this.findViewById(R.id.btn_image);
        Button info=(Button)this.findViewById(R.id.btn_contact);
        Button camera=(Button)this.findViewById(R.id.btn_camera);
        ImageButton US = (ImageButton)this.findViewById(R.id.aboutUS);


        US.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                Intent aboutus = new Intent(Activity1.this, MainActivity.class);  // Intent method to link and open a new activity in ths case activity_courses.xml by courseActivity.class java file
                startActivity(aboutus);
            }
        });

        courses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                Intent web_courses = new Intent(Activity1.this, coursesActivity.class);
                startActivity(web_courses);
            }
        });

        TimeTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                Intent web_Semester = new Intent(Activity1.this, SemestersActivity.class);
                startActivity(web_Semester);
            }
        });

        Gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                Intent gallery = new Intent(Activity1.this, GalleryActivity.class);
                startActivity(gallery);
            }
        });

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                Intent contact = new Intent(Activity1.this, ContactActivity.class);
                startActivity(contact);
            }
        });

        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                Intent photo = new Intent(Activity1.this, CameraActivity.class);
                startActivity(photo);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) { // useless code for the menu bar which is hidden and unused
        getMenuInflater().inflate(R.menu.menu_activity1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) // same unused and hiiden
    {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
