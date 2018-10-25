package objects;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayerView;
import com.google.android.youtube.player.YouTubeThumbnailLoader;
import com.google.android.youtube.player.YouTubeThumbnailView;
import com.jonathanyuliu.mobileassignment.R;

import java.util.ArrayList;

import static com.jonathanyuliu.mobileassignment.VideoWatchActivity.GOOGLE_API_KEY;

public class VideoAdapter extends ArrayAdapter<Video> {

    public YouTubeThumbnailView youTubeThumbnailView;
    public YouTubeThumbnailLoader youTubeThumbnailLoader;
    public String videoId;

    public VideoAdapter(Context context, ArrayList<Video> videos) {
        super(context, 0, videos);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Video video = getItem(position);
        videoId = video.getId();
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.video_list_item, parent, false);
        }
        // Lookup view for data population
        TextView titleView = convertView.findViewById(R.id.titleView);
        TextView durationView = convertView.findViewById(R.id.durationView);
        ImageView thumbnailView = convertView.findViewById(R.id.thumbnailView);

        // Populate the data into the template view using the data object
        titleView.setText(video.getTitle());
        durationView.setText(video.getDuration());
        if (video.getThumbnail() == "img1") {
            thumbnailView.setImageResource(R.drawable.img1);
        }
        else if (video.getThumbnail() == "img2") {
            thumbnailView.setImageResource(R.drawable.img2);
        }
        else if (video.getThumbnail() == "img3") {
            thumbnailView.setImageResource(R.drawable.img3);
        }
        else if (video.getThumbnail() == "img4") {
            thumbnailView.setImageResource(R.drawable.img4);
        }
        else
            thumbnailView.setImageResource(R.drawable.img5);

        // Return the completed view to render on screen
        return convertView;
    }
}