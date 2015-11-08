package csci4100.uoit.ca.mobilenoteproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class CreateNewTextNote extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_text_note);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_create_new_text_note, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void submitText (View btn) {
        Intent returnTextIntent = new Intent();
        EditText noteText = (EditText) findViewById(R.id.EditText_CreateNewNotePage);
        returnTextIntent.putExtra("noteTextResult", noteText.getText().toString());
        setResult(RESULT_OK, returnTextIntent);
        finish();
    }

    public void cancelNewNote(View btn) {
        Intent returnNoteCanelIntent = new Intent();
        setResult(RESULT_CANCELED, returnNoteCanelIntent);
        finish();
    }
}
