package tito.example.com.edueasy;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class CoursesDetailedActivity extends AppCompatActivity {

    TextView course_name;
    ImageView course_image;
    TextView course_description;
    FloatingActionButton floatingActionButton;
String name,description,url,image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses_detailed);

        course_name =findViewById(R.id.Course_name2);
        course_image =findViewById(R.id.Course_imageview2);
        course_description =findViewById(R.id.Course_description_2);
        floatingActionButton = findViewById(R.id.fab);
        if(getIntent()!=null)
        {
           name=getIntent().getStringExtra("name");
           image=getIntent().getStringExtra("image");
           description=getIntent().getStringExtra("description");
           url=getIntent().getStringExtra("url");
        }
        course_name.setText(name);
        course_description.setText(description);
        Picasso.with(this).load(image).into(course_image);
                floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),PlayActivity.class);
                intent.putExtra("url",url);
                startActivity(intent);
            }
        });
    }
}
