package jac.com.quiz_app;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewVerticalListAdapter  extends RecyclerView.Adapter<RecyclerViewVerticalListAdapter.GroceryViewHolder>{
    private List<setter> verticalGrocderyList;
    Context context;

    public RecyclerViewVerticalListAdapter(List<setter> verticalGrocderyList, Context context){
        this.verticalGrocderyList= verticalGrocderyList;
        this.context = context;
    }

    @Override
    public GroceryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflate the layout file
        View groceryProductView = LayoutInflater.from(parent.getContext()).inflate(jac.com.quiz_app.R.layout.listitems, parent, false);
        GroceryViewHolder gvh = new GroceryViewHolder(groceryProductView);
        return gvh;
    }

    @Override
    public void onBindViewHolder(GroceryViewHolder holder, final int position) {
        holder.imageView.setImageResource(verticalGrocderyList.get(position).getImage());
        holder.txtview.setText(verticalGrocderyList.get(position).getAnswer());
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return verticalGrocderyList.size();
    }

    public class GroceryViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView txtview;
        public GroceryViewHolder(View view) {
            super(view);
            imageView= (ImageView) view.findViewById(jac.com.quiz_app.R.id.idProductImage);
            txtview= (TextView) view.findViewById(jac.com.quiz_app.R.id.idProductName);
        }
    }
}