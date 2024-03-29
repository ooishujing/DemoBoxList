package sg.edu.rp.c346.demoboxlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<Colours> coloursList;

    public CustomAdapter(Context context, int resource, ArrayList<Colours> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        coloursList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        ImageView ivGender = rowView.findViewById(R.id.imageView);

        Colours currentItem = coloursList.get(position);

        if (coloursList.get(position).getColour() == "Blue") {
            ivGender.setImageResource(R.drawable.blue_box);
        } else if (coloursList.get(position).getColour() == "Orange") {
            ivGender.setImageResource(R.drawable.orange_box);
        } else if (coloursList.get(position).getColour() == "Brown") {
            ivGender.setImageResource(R.drawable.brown_box);

        }
        return rowView;
    }
}
