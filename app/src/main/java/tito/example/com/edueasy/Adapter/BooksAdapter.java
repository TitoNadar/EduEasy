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
import tito.example.com.edueasy.Modal.Books.BooksItem;
import tito.example.com.edueasy.R;

/**
 * Created by tito on 16/3/18.
 */

class Book_View_Holder extends RecyclerView.ViewHolder implements View.OnClickListener{
   ItemClickListener itemClickListener;
   TextView title,subtitle,authorname,pageno;
    public Book_View_Holder(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        title=itemView.findViewById(R.id.book_title);
        subtitle=itemView.findViewById(R.id.book_subtitle);
        authorname=itemView.findViewById(R.id.book_author_name);
        pageno=itemView.findViewById(R.id.book_page_no);
    }

    @Override
    public void onClick(View v) {
        itemClickListener.onClick(v,getAdapterPosition(),false );
    }
    public void setItemClickListener(ItemClickListener itemClickListener)
    {
        this.itemClickListener=itemClickListener;
    }
}

public class BooksAdapter extends RecyclerView.Adapter<Book_View_Holder> {
    private Context context;
    private List<BooksItem> booksItems=new ArrayList<>();

    public BooksAdapter(Context context, List<BooksItem> booksItems) {
        this.context = context;
        this.booksItems = booksItems;
    }

    @Override
    public Book_View_Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View itemView=layoutInflater.inflate(R.layout.book_item,parent,false);
        return new Book_View_Holder(itemView);
    }

    @Override
    public void onBindViewHolder(Book_View_Holder holder, int position) {
       holder.title.setText(booksItems.get(position).getTitle());
       holder.subtitle.setText(booksItems.get(position).getSubTitle());
       holder.pageno.setText("300");
    }

    @Override
    public int getItemCount() {
        return booksItems.size();
    }
}
