package fr.app.movies.tasks;

import android.graphics.Bitmap;
import android.os.AsyncTask;

/**
 * Created by ousse on 01/12/2017.
 */

public class DownloadMoviesAsyncTask extends AsyncTask<String, Void, Bitmap> {

    public DownloadMoviesAsyncTask() {
        super();
    }

    @Override
    protected Bitmap doInBackground(String... strings) {
        return null;
    }

    @Override
    protected void onPostExecute(Bitmap bitmap) {
        super.onPostExecute(bitmap);

    }
}
