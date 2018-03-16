package tito.example.com.edueasy.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import tito.example.com.edueasy.Interface.ItemClickListener;
import tito.example.com.edueasy.Modal.StackOverFlow.ItemsItem;
import tito.example.com.edueasy.R;

/**
 * Created by tito on 16/3/18.
 */
class StackViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
TextView question,solution,score,score_text_view;
ItemClickListener itemClickListener;
    public StackViewHolder(View itemView)
    {
        super(itemView);
        question=itemView.findViewById(R.id.question);
        solution=itemView.findViewById(R.id.solution);
        score=itemView.findViewById(R.id.score);
        score_text_view=itemView.findViewById(R.id.score_text_view);
        itemView.setOnClickListener(this);
    }
    public void setItemClickListener(ItemClickListener itemClickListener)
    {
        this.itemClickListener=itemClickListener;
    }

    @Override
    public void onClick(View v) {

    }
}
public class StackAdapter extends RecyclerView.Adapter<StackViewHolder> {
    private Context context;
    private List<ItemsItem> queries=new ArrayList<>();

    public StackAdapter(Context context, List<ItemsItem> queries) {
        this.context = context;
        this.queries = queries;
    }

    @Override
    public StackViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View itemView=layoutInflater.inflate(R.layout.stack_item,parent,false);
        return new StackViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(StackViewHolder holder, int position) {
     holder.question.setText(queries.get(position).getTitle());
     holder.solution.setText(queries.get(position).getLink());
     if(queries.get(position).isIsAnswered())
     {
         holder.score_text_view.setVisibility(View.VISIBLE);
         holder.score.setText(queries.get(position).getScore());
     }
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
