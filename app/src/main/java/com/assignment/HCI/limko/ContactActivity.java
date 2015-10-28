package com.assignment.HCI.limko;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class ContactActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        Button Call = (Button)this.findViewById(R.id.btn_call);
        Button Twitter=(Button)this.findViewById(R.id.btn_twitter);
        Button Facebook=(Button)this.findViewById(R.id.btn_facebook);
        Button Limkokwing=(Button)this.findViewById(R.id.btn_web);
        Button loc=(Button)this.findViewById(R.id.loc);

        loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                Intent web_loc = new Intent(ContactActivity.this, WebActivity2.class);
                startActivity(web_loc);
            }
        });

        Limkokwing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                Intent web_limkokwing = new Intent(ContactActivity.this, WebActivity.class);
                startActivity(web_limkokwing);
            }
        });

        Facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                Intent web_facebook = new Intent(ContactActivity.this, FacebookActivity.class);
                startActivity(web_facebook);
            }
        });

        Twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                Intent web_twitter = new Intent(ContactActivity.this, coursesActivity.class);
                startActivity(web_twitter);
            }
        });

        Call.setOnClickListener(new View.OnClickListener()
        {
            @Override
        public void onClick(View w)
            {
                Intent callIntent = new Intent(Intent.ACTION_CALL);  // intent that opens the caller by using a pre-default function calls "ACTION_CALL" To start a voice call
                callIntent.setData(Uri.parse("tel: +60383178888"));  // the data or the method/condition that hold the number that will be extracted by the "action_call" method
                startActivity(callIntent);  // call function
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_contact, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
