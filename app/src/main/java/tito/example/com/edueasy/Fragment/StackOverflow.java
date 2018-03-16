package tito.example.com.edueasy.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import retrofit.Callback;
import retrofit.Retrofit;
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
            layoutManager=new LinearLayoutManager(getContext());
            recyclerView.setLayoutManager(layoutManager);
            stack_service= Common.getStackDoubts();
            stack_service.getStackService().enqueue(new Callback<Response>() {
                @Override
                public void onResponse(retrofit.Response<Response> response, Retrofit retrofit) {
                    stackresponse=response.body().getItems();
                    StackAdapter adapter=new StackAdapter(getActivity(),stackresponse);
                    recyclerView.setAdapter(adapter);
                }

                @Override
                public void onFailure(Throwable t) {

                }
            });
        return view;
    }
}
