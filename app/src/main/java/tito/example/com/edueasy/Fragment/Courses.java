package tito.example.com.edueasy.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import retrofit.Callback;
import retrofit.Retrofit;
import tito.example.com.edueasy.Adapter.Courses_Adapter;
import tito.example.com.edueasy.Helper.Common;
import tito.example.com.edueasy.Interface.Udacity_Service;
import tito.example.com.edueasy.Modal.udacity.CoursesItem;
import tito.example.com.edueasy.Modal.udacity.Response;
import tito.example.com.edueasy.R;

/**
 * Created by tito on 16/3/18.
 */

public class Courses extends Fragment {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    List<CoursesItem> udacity_response=new ArrayList<>();
    Udacity_Service udacity_service;

    public Courses() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d("yash","reached");
        View view = inflater.inflate(R.layout.content_main, container, false);
            recyclerView = view.findViewById(R.id.recyclerview);
            layoutManager=new LinearLayoutManager(getContext());
            recyclerView.setLayoutManager(layoutManager);
           udacity_service=Common.getUdacityCourses();
           udacity_service.getUdacityService().enqueue(new Callback<Response>() {
               @Override
               public void onResponse(retrofit.Response<Response> response, Retrofit retrofit) {
                   Log.d("tito","reached");
                   udacity_response=response.body().getCourses();
                   Courses_Adapter courses_adapter=new Courses_Adapter(getActivity(),udacity_response);
                   recyclerView.setAdapter(courses_adapter);
               }

               @Override
               public void onFailure(Throwable t) {
                   Log.d("divyam",t.getMessage());
               }
           });
        return view;
    }
}
