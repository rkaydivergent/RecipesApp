package com.example.pc.recipesapp;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by pc on 9/7/2017.
 */

public class MyAdapterClass  extends RecyclerView.Adapter<MyAdapterClass.MyOwnHolder>{
    String [] mys1, mys2;
    int [] img_res;
    Context cntxt;
    public MyAdapterClass (Context c1, String s1[], String [] s2, int imgr[]){
        mys1 =s1;
        mys2 = s2;
        img_res = imgr;
        cntxt = c1;
    }


    @Override
    public MyOwnHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater myInflater = LayoutInflater.from(cntxt);
        View myView= myInflater.inflate(R.layout.my_row, parent,false);
        return new MyOwnHolder(myView);
    }

    @Override
    public void onBindViewHolder(MyOwnHolder holder, int position) {
        holder.txt1.setText(mys1[position]);
        holder.txt2.setText(mys2[position]);
        holder.img1.setImageResource(img_res[position]);
    }

    @Override
    public int getItemCount() {
        return mys1.length;
    }

    public class MyOwnHolder extends RecyclerView.ViewHolder  implements View.OnClickListener{
        TextView txt1, txt2;
        ImageView img1;
      //final Context context;
        public MyOwnHolder(View itemView) {
            super(itemView);
         //   context = itemView.getContext();
            txt1 = (TextView) itemView.findViewById(R.id.title);
            txt2 =(TextView) itemView.findViewById(R.id.desc);
            img1 =(ImageView) itemView.findViewById(R.id.my_img);
        }


        @Override
        public void onClick(View v) {
           final Intent detailIntent = new Intent(cntxt, DetailActivity.class);
            cntxt.startActivity(detailIntent);
        }
    }}
