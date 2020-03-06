package com.example.marvelheroes;


import android.appwidget.AppWidgetHost;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class HeroAdapter extends BaseAdapter {

    private ArrayList<Hero> heroList;
    private Context context;

    public HeroAdapter(ArrayList<Hero> heroList, Context context){
        this.heroList = heroList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return this.heroList.size();
    }

    @Override
    public Object getItem(int position) {
        return this.heroList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder = null;

        if (convertView == null) {

            LayoutInflater inf = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inf.inflate(R.layout.item_list_view, null);

            holder = new ViewHolder();
            holder.name =(TextView)convertView.findViewById(R.id.item_name);
            holder.realName =(TextView)convertView.findViewById(R.id.item_real_name);
            holder.bio =(TextView)convertView.findViewById(R.id.item_bio);
            holder.createdBy =(TextView)convertView.findViewById(R.id.item_created_by);
            holder.publisher =(TextView)convertView.findViewById(R.id.item_publisher);
            holder.team =(TextView)convertView.findViewById(R.id.item_team);
            holder.firstAppearance =(TextView)convertView.findViewById(R.id.item_first_appearance);
            holder.photo = (ImageView) convertView.findViewById(R.id.item_photo);

            convertView.setTag(holder);

        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Hero hero = heroList.get(position);
        holder.name.setText("Hero Name: " + hero.getName());
        holder.realName.setText("Real Name: " + hero.getRealname());
        holder.firstAppearance.setText("First Appearance: " + hero.getFirstappaearance());
        holder.team.setText("Team: " + hero.getTeam());
        holder.publisher.setText("Publisher: " + hero.getPublisher());
        holder.createdBy.setText("Created By: " + hero.getCreateBy());
        holder.bio.setText("BIO: " + hero.getBio());
        Picasso.with(context).load(hero.getImageurl()).into(holder.photo);

        return convertView;
    }

    private static class ViewHolder{
        public TextView name, realName, bio, team, firstAppearance, createdBy, publisher;
        public ImageView photo;
    }
}
