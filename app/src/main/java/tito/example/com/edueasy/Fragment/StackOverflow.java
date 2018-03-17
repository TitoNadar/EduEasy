package tito.example.com.edueasy.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import dmax.dialog.SpotsDialog;
import io.paperdb.Paper;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import tito.example.com.edueasy.Adapter.BooksAdapter;
import tito.example.com.edueasy.Adapter.StackAdapter;
import tito.example.com.edueasy.Helper.Common;
import tito.example.com.edueasy.Interface.Stack_Service;
import tito.example.com.edueasy.Modal.StackOverFlow.ItemsItem;
import tito.example.com.edueasy.Modal.StackOverFlow.Response;
import tito.example.com.edueasy.R;

/**
 * Created by tito on 16/3/18.
 */

public class StackOverflow extends Fragment {
RecyclerView recyclerView;
RecyclerView.LayoutManager layoutManager;
Stack_Service stack_service;
List<ItemsItem> stackresponse=new ArrayList<>();
    SpotsDialog spotsDialog;
    SwipeRefreshLayout swipeRefreshLayout;
    StackAdapter adapter;
    public StackOverflow() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.content_main, container, false);
            recyclerView = view.findViewById(R.id.recyclerview);
        spotsDialog = new SpotsDialog(getContext());
        swipeRefreshLayout = view.findViewById(R.id.swiperefresh);
            layoutManager=new LinearLayoutManager(getContext());
            recyclerView.setLayoutManager(layoutManager);
            stack_service= Common.getStackDoubts();
            stack_service.getStackService().enqueue(new Callback<Response>() {
                @Override
                public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                    stackresponse=response.body().getItems();
                    StackAdapter adapter=new StackAdapter(getActivity(),stackresponse);
                    recyclerView.setAdapter(adapter);
                }

                @Override
                public void onFailure(Call<Response> call, Throwable t) {

                }
            });

        swipeRefreshLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                load(true);
            }
        });
        return view;
    }

    private void load(boolean loadsite) {
        if (!loadsite) {
            String cache = Paper.book().read("cache");
            //if there is a cache
            if (cache != null && !cache.isEmpty()) {
                tito.example.com.edueasy.Modal.StackOverFlow.Response response = new Gson().fromJson(cache, tito.example.com.edueasy.Modal.StackOverFlow.Response.class);//Convert cache from Json to object
                adapter = new StackAdapter(getActivity(), response.getItems());
                adapter.notifyDataSetChanged();
                recyclerView.setAdapter(adapter);
            } else   //if not have cache
            {
                spotsDialog.show();
                //Fetch new data
                stack_service.getStackService().enqueue(new Callback<Response>() {
                    @Override
                    public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                        stackresponse = response.body().getItems();
                        StackAdapter adapter = new StackAdapter(getActivity(), stackresponse);
                        recyclerView.setAdapter(adapter);

                        Paper.book().write("cache",new Gson().toJson(response.body()));
                        spotsDialog.dismiss();
                    }

                    @Override
                    public void onFailure(Call<Response> call, Throwable t) {

                    }
                });
            }
        }
    }
}
