package be.ciesites.recyclingviewer;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import java.util.Collections;
import java.util.List;

/**
 * Created by tywinlannister on 19/10/16.
 */

public class MovieListAdapter extends RecyclerView.Adapter<MovieViewHolder> {
    private Context context;
    private List<Movie> movieList = Collections.emptyList();

    public MovieListAdapter(Context context, List<Movie> movieList) {
        this.context = context;
        this.movieList = movieList;
    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // load xml and create ViewHolder
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, parent, false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) {
        Movie currentMovie = movieList.get(position);
        holder.getTitleTextView().setText(currentMovie.getTitle());
        holder.getDescriptionTextView().setText(currentMovie.getDescription());
        holder.getImageView().setImageResource(currentMovie.getPoster());
        animate(holder);
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public void insertMovie(int position, Movie movie){
        movieList.add(position, movie);
        notifyItemInserted(position);
    }

    public void removeMovie(Movie movie){
        int position = movieList.indexOf(movie);
        movieList.remove(position);
        notifyItemRemoved(position);

    }

    private void animate(RecyclerView.ViewHolder viewHolder){
       Animation animation = AnimationUtils.loadAnimation(context, R.anim.bounce_animation);
        viewHolder.itemView.setAnimation(animation);
    }

}
