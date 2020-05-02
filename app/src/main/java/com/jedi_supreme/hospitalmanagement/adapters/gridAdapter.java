package com.jedi_supreme.hospitalmanagement.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.jedi_supreme.hospitalmanagement.R;
import com.jedi_supreme.hospitalmanagement.activities.WorkArea;

public class gridAdapter extends BaseAdapter {

    private LayoutInflater layoutInflater;
    private String[] texts;
    private int[] icons_arr;

    private Context mcontext;

    public gridAdapter(Context context, String[] texts, int[] icons_arr) {
        layoutInflater = LayoutInflater.from(context);
        this.texts = texts;
        this.icons_arr = icons_arr;
    }

    @Override
    public int getCount() {
        return texts.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {



        if (convertView == null){
            convertView = layoutInflater.inflate(R.layout.frag_grid_item,parent,false);
        }

        TextView tv_grid_label = convertView.findViewById(R.id.tv_grid_label);
        ImageView iv_grid_icon = convertView.findViewById(R.id.iv_grid_icon);
        ConstraintLayout const_grid_item = convertView.findViewById(R.id.const_grid_item);
        mcontext = convertView.getContext();
        tv_grid_label.setText(texts[position]);
        iv_grid_icon.setImageResource(icons_arr[position]);

        const_grid_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mcontext, texts[position], Toast.LENGTH_SHORT).show();
                work_intent();
            }
        });
        return convertView;
    }
    
    private void work_intent(){
        Intent workArea_intent = new Intent(mcontext, WorkArea.class);
        mcontext.startActivity(workArea_intent);
    }
}
