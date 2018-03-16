package tito.example.com.edueasy.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import tito.example.com.edueasy.Interface.ItemClickListener;
import tito.example.com.edueasy.Modal.udacity.CoursesItem;
import tito.example.com.edueasy.R;

/**
 * Created by tito on 16/3/18.
 */

class Courses_View_Holder extends RecyclerView.ViewHolder implements View.OnClickListener {
  ItemClickListener itemClickListener;
 TextView coursename,coursedescription;
 ImageView courseImage;

    public Courses_View_Holder(View itemView) {
        super(itemView);
        coursename=itemView.findViewById(R.id.Course_name);
        coursedescription=itemView.findViewById(R.id.Course_description);
        courseImage=itemView.findViewById(R.id.Course_imageview);
        itemView.setOnClickListener(this);
    }

    public void setItemClickListener(ItemClickListener itemClickListener)
    {
        this.itemClickListener=itemClickListener;
    }

    @Override
    public void onClick(View v) {
        itemClickListener.onClick(v,getAdapterPosition(),false );
    }
}

public class Courses_Adapter extends RecyclerView.Adapter<Courses_View_Holder> {
private Context context;
private List<CoursesItem> coursesItems=new ArrayList<>();

    public Courses_Adapter(Context context, List<CoursesItem> coursesItems) {
        this.context = context;
        this.coursesItems = coursesItems;
    }

    @Override
    public Courses_View_Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View itemView=layoutInflater.inflate(R.layout.feed_item,parent,false);
        return new Courses_View_Holder(itemView);
    }

    @Override
    public void onBindViewHolder(Courses_View_Holder holder, int position) {
holder.coursename.setText(coursesItems.get(position).getTitle());
holder.coursedescription.setText(coursesItems.get(position).getProjectDescription());
        Picasso.get().load(coursesItems.get(position).getImage()).into(holder.courseImage);
        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClick(View view, int position, boolean isLongClick) {
                Log.d("done","success");
            }
        });
    }

    @Override
    public int getItemCount() {
        return coursesItems.size();
    }
}
