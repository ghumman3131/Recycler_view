package tech.inception.recyclerview;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by ghumman on 4/14/2017.
 */

public class adapter extends RecyclerView.Adapter<view_holder> {

    // creating JSONArray variable globally
    JSONArray jsarr;

    // creating Activity variable globally
    Activity a;

    // making constructer for adapter class which will be
    // called when object of this class is created

    public adapter(JSONArray jsarr , Activity a)
    {
        this.jsarr = jsarr;

        this.a = a;
    }
    @Override
    public view_holder onCreateViewHolder(ViewGroup parent, int viewType) {

        // creating view_holder object and passing cell layout as parameter
        view_holder view = new view_holder(LayoutInflater.from(a).inflate(R.layout.cell,parent,false));

        return view;
    }

    @Override
    public void onBindViewHolder(view_holder holder, int position) {

        try {
            // iterating for each json object in json array
            JSONObject job = (JSONObject) jsarr.get(position);

            // binding values from json object to cell layout via view holder
            holder.order_id.setText(job.getString("order_id"));
            holder.user_id.setText(job.getString("user_id"));
            holder.date.setText(job.getString("date"));
            holder.time.setText(job.getString("time"));
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    @Override
    public int getItemCount()
    {
        // return how many cells will be created i.e length of json array
        return jsarr.length();
    }
}
