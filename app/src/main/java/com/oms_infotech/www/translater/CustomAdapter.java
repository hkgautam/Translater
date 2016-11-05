package com.oms_infotech.www.translater;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Himanshu on 10/8/2016.
 */
public class CustomAdapter extends BaseAdapter{
    ArrayList<Integer> imgsid;
    ArrayList<String> nameid;
    ArrayList<String> transid;
    LayoutInflater inflater;
    Context context;


    public CustomAdapter(Context context, ArrayList<String> name, ArrayList<String> trans, ArrayList<Integer> imgs){
        nameid=name;
        transid=trans;
        imgsid=imgs;
        inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    public class Holder{
        TextView nametv;
        TextView transtv;
        CircleImageView imgv;
    }

    @Override
    public int getCount() {
        return nameid.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Holder holder=new Holder();

        view=inflater.inflate(R.layout.model,null);
        holder.nametv=(TextView)view.findViewById(R.id.textView5);
        holder.imgv=(CircleImageView)view.findViewById(R.id.profile_image);
        holder.transtv=(TextView)view.findViewById(R.id.textView6);
        holder.nametv.setText(nameid.get(i));
        holder.transtv.setText(transid.get(i));
        holder.imgv.setImageResource(imgsid.get(i));
        return view;
    }
}
