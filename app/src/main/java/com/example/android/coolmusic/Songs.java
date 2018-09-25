package com.example.android.coolmusic;

/** songs represent the song details such as title,artist and the play button
 *
 */

public class Songs {
    /** title  of the song */
    private String mSongTitle;

    /** song artist */
    private String mArtist;

    /**
     * Create a new Songs object.
     *
     * @param songTitle is the name of the song
     *                           (such as God's plan)
     * @param artist is the song artist
     */
    public Songs (String songTitle, String artist){
        mSongTitle = songTitle;
        mArtist = artist;
    }

    /** Get the song details */
    public String getmSongTitle() {
        return mSongTitle;
    }

    public String getmArtist() {
        return mArtist;
    }
}
