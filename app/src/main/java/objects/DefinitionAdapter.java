package objects;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeThumbnailLoader;
import com.google.android.youtube.player.YouTubeThumbnailView;
import com.jonathanyuliu.mobileassignment.R;

import java.util.ArrayList;
import java.util.Locale;

public class DefinitionAdapter extends ArrayAdapter<Definition> {

    ArrayList<Definition> myList;
    public static ArrayList<Definition> privatearray;

    public DefinitionAdapter(Context context, ArrayList<Definition> definitions) {
        super(context, 0, definitions);
        this.myList = definitions;
        privatearray = new ArrayList<Definition>();
        privatearray.addAll(myList);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Definition definition = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.definition_list_item, parent, false);
        }
        // Lookup view for data population
        TextView definitionWordView = convertView.findViewById(R.id.definitionWordView);

        // Populate the data into the template view using the data object
        definitionWordView.setText(definition.getWord());

        // Return the completed view to render on screen
        return convertView;
    }

    public void filter(String charText) {

        charText = charText.toLowerCase(Locale.getDefault());
        myList.clear();
        if(charText.length()==0){
            myList.addAll(privatearray);
        }
        else{
            for (Definition c : privatearray) {
                if (c.getWord().toLowerCase(Locale.getDefault())
                        .contains(charText)) {
                    myList.add(c);
                }
            }
        }
        notifyDataSetChanged();
    }

    public static ArrayList<Definition> getPrivatearray() {
        return privatearray;
    }


}