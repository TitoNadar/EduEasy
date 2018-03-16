package tito.example.com.edueasy.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import tito.example.com.edueasy.R;

/**
 * Created by tito on 16/3/18.
 */
class StackViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
TextView question,solution,score;
    public StackViewHolder(View itemView)
    {
        super(itemView);
        question=itemView.findViewById(R.id.q)
    }

    @Override
    public void onClick(View v) {

    }
}
public class StackAdapter extends RecyclerView.Adapter<StackViewHolder> {
    @Override
    public StackViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(StackViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
