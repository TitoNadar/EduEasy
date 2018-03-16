package tito.example.com.edueasy.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import tito.example.com.edueasy.Interface.ItemClickListener;

/**
 * Created by tito on 16/3/18.
 */

class Courses_View_Holder extends RecyclerView.ViewHolder implements ItemClickListener {
  ItemClickListener itemClickListener;

    public Courses_View_Holder(View itemView) {
        super(itemView);
    }

    public void setItemClickListener(ItemClickListener itemClickListener)
    {
        this.itemClickListener=itemClickListener;
    }
    @Override
    public void onClick(View view, int position, boolean isLongClick) {

    }
}

public class Courses_Adapter extends RecyclerView.Adapter<Courses_View_Holder> {

    @Override
    public Courses_View_Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(Courses_View_Holder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
