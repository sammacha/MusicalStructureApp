package com.example.android.coolmusic;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link SongAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Songs} objects.
 */

public class SongAdapter extends ArrayAdapter<Songs>{
    /**
     * Create a new {@link SongAdapter} object
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param albums is the list of {@link Songs}s to be displayed.
     */
    public SongAdapter(Context context, ArrayList<Songs> albums) {super (context,0,albums);}

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_items, parent, false);
        }
        // Get the {@link Songs} object located at this position in the list
        Songs currentSong = getItem(position);

        // Find the TextView in the song_items.xml layout with the ID song_title.
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.song_title);

        // Get the song title from the currentSong object and set this text on
        // the title TextView.
        titleTextView.setText(currentSong.getmSongTitle());

        // Find the TextView in the song_items.xml layout with the ID artist.
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist);

        // Get the song artist from the currentSong object and set this text on
        // the artist TextView.
        artistTextView.setText(currentSong.getmArtist());

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.

        return listItemView;

    }
}
