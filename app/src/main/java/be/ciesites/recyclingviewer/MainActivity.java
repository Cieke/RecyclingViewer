package be.ciesites.recyclingviewer;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        List<Movie> movieList = findAllMovies();

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        MovieListAdapter movieListAdapter = new MovieListAdapter(this, movieList);
        recyclerView.setAdapter(movieListAdapter);

        // change the layout of the recyclerView je kan bv van listview naar gridview gaan
        // bv bij switch van portrait naar landscape, andere StaggeredGridLayout (zoals Google keep)
        // if portrait = linear, else gridlayout
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //recyclerView.setLayoutManager(new GridLayoutManager(this));

    }

    private List<Movie> findAllMovies(){
        List<Movie> allMovies = new ArrayList<>();
        allMovies.add(new Movie("Seven", "A movie about the 7 sins with Brad Pitt", R.drawable.ic_movie ));  // ic= icon
        allMovies.add(new Movie("The Fellowship of the Ring", "Frodo and Sam and Mordor", R.drawable.ic_movie));
        allMovies.add(new Movie("The Two Towers", "Frodo and Sam and Mordor again", R.drawable.ic_movie));
        allMovies.add(new Movie("The Return of the King", "Frodo and Sam yet again", R.drawable.ic_movie));
        allMovies.add(new Movie("De Premier", "Belgian Premier", R.drawable.ic_movie));
        allMovies.add(new Movie("Oblivion", "Cruise forgot everything", R.drawable.ic_movie));
        allMovies.add(new Movie("Zootropolis", "Konijntjes", R.drawable.ic_movie));
        allMovies.add(new Movie("Fantastic Beasts", "One movie became five!", R.drawable.ic_movie));
        allMovies.add(new Movie("Saw", "Escape rooms", R.drawable.ic_movie));
        allMovies.add(new Movie("Fifty shades of grey", "Mac Grey", R.drawable.ic_movie));
        allMovies.add(new Movie("The Fellowship of the Ring", "Frodo and Sam and Mordor", R.drawable.ic_movie));
        allMovies.add(new Movie("The Fellowship of the Ring", "Frodo and Sam and Mordor", R.drawable.ic_movie));
        allMovies.add(new Movie("The Fellowship of the Ring", "Frodo and Sam and Mordor", R.drawable.ic_movie));
        allMovies.add(new Movie("The Fellowship of the Ring", "Frodo and Sam and Mordor", R.drawable.ic_movie));
        allMovies.add(new Movie("The Fellowship of the Ring", "Frodo and Sam and Mordor", R.drawable.ic_movie));
        allMovies.add(new Movie("The Fellowship of the Ring", "Frodo and Sam and Mordor", R.drawable.ic_movie));
        allMovies.add(new Movie("The Fellowship of the Ring", "Frodo and Sam and Mordor", R.drawable.ic_movie));
        allMovies.add(new Movie("The Fellowship of the Ring", "Frodo and Sam and Mordor", R.drawable.ic_movie));
        allMovies.add(new Movie("The Fellowship of the Ring", "Frodo and Sam and Mordor", R.drawable.ic_movie));
        allMovies.add(new Movie("The Fellowship of the Ring", "Frodo and Sam and Mordor", R.drawable.ic_movie));
        allMovies.add(new Movie("The Fellowship of the Ring", "Frodo and Sam and Mordor", R.drawable.ic_movie));
        allMovies.add(new Movie("The Fellowship of the Ring", "Frodo and Sam and Mordor", R.drawable.ic_movie));
        allMovies.add(new Movie("The Fellowship of the Ring", "Frodo and Sam and Mordor", R.drawable.ic_movie));
        allMovies.add(new Movie("The Fellowship of the Ring", "Frodo and Sam and Mordor", R.drawable.ic_movie));
        allMovies.add(new Movie("Seven", "A movie about the 7 sins with Brad Pitt", R.drawable.ic_movie ));  // ic= icon
        allMovies.add(new Movie("The Fellowship of the Ring", "Frodo and Sam and Mordor", R.drawable.ic_movie));
        allMovies.add(new Movie("The Two Towers", "Frodo and Sam and Mordor again", R.drawable.ic_movie));
        allMovies.add(new Movie("The Return of the King", "Frodo and Sam yet again", R.drawable.ic_movie));
        allMovies.add(new Movie("De Premier", "Belgian Premier", R.drawable.ic_movie));
        allMovies.add(new Movie("Oblivion", "Cruise forgot everything", R.drawable.ic_movie));
        allMovies.add(new Movie("Zootropolis", "Konijntjes", R.drawable.ic_movie));
        allMovies.add(new Movie("Fantastic Beasts", "One movie became five!", R.drawable.ic_movie));
        allMovies.add(new Movie("Saw", "Escape rooms", R.drawable.ic_movie));
        allMovies.add(new Movie("Fifty shades of grey", "Mac Grey", R.drawable.ic_movie));
        allMovies.add(new Movie("The Fellowship of the Ring", "Frodo and Sam and Mordor", R.drawable.ic_movie));
        allMovies.add(new Movie("The Fellowship of the Ring", "Frodo and Sam and Mordor", R.drawable.ic_movie));
        allMovies.add(new Movie("The Fellowship of the Ring", "Frodo and Sam and Mordor", R.drawable.ic_movie));
        allMovies.add(new Movie("The Fellowship of the Ring", "Frodo and Sam and Mordor", R.drawable.ic_movie));
        allMovies.add(new Movie("The Fellowship of the Ring", "Frodo and Sam and Mordor", R.drawable.ic_movie));
        allMovies.add(new Movie("The Fellowship of the Ring", "Frodo and Sam and Mordor", R.drawable.ic_movie));
        allMovies.add(new Movie("The Fellowship of the Ring", "Frodo and Sam and Mordor", R.drawable.ic_movie));
        allMovies.add(new Movie("The Fellowship of the Ring", "Frodo and Sam and Mordor", R.drawable.ic_movie));
        allMovies.add(new Movie("The Fellowship of the Ring", "Frodo and Sam and Mordor", R.drawable.ic_movie));
        allMovies.add(new Movie("The Fellowship of the Ring", "Frodo and Sam and Mordor", R.drawable.ic_movie));
        allMovies.add(new Movie("The Fellowship of the Ring", "Frodo and Sam and Mordor", R.drawable.ic_movie));
        allMovies.add(new Movie("The Fellowship of the Ring", "Frodo and Sam and Mordor", R.drawable.ic_movie));
        allMovies.add(new Movie("The Fellowship of the Ring", "Frodo and Sam and Mordor", R.drawable.ic_movie));
        allMovies.add(new Movie("The Fellowship of the Ring", "Frodo and Sam and Mordor", R.drawable.ic_movie));
        allMovies.add(new Movie("Seven", "A movie about the 7 sins with Brad Pitt", R.drawable.ic_movie ));  // ic= icon
        allMovies.add(new Movie("The Fellowship of the Ring", "Frodo and Sam and Mordor", R.drawable.ic_movie));
        allMovies.add(new Movie("The Two Towers", "Frodo and Sam and Mordor again", R.drawable.ic_movie));
        allMovies.add(new Movie("The Return of the King", "Frodo and Sam yet again", R.drawable.ic_movie));
        allMovies.add(new Movie("De Premier", "Belgian Premier", R.drawable.ic_movie));
        allMovies.add(new Movie("Oblivion", "Cruise forgot everything", R.drawable.ic_movie));
        allMovies.add(new Movie("Zootropolis", "Konijntjes", R.drawable.ic_movie));
        allMovies.add(new Movie("Fantastic Beasts", "One movie became five!", R.drawable.ic_movie));
        allMovies.add(new Movie("Saw", "Escape rooms", R.drawable.ic_movie));
        allMovies.add(new Movie("Fifty shades of grey", "Mac Grey", R.drawable.ic_movie));
        allMovies.add(new Movie("The Fellowship of the Ring", "Frodo and Sam and Mordor", R.drawable.ic_movie));
        allMovies.add(new Movie("The Fellowship of the Ring", "Frodo and Sam and Mordor", R.drawable.ic_movie));
        allMovies.add(new Movie("The Fellowship of the Ring", "Frodo and Sam and Mordor", R.drawable.ic_movie));
        allMovies.add(new Movie("The Fellowship of the Ring", "Frodo and Sam and Mordor", R.drawable.ic_movie));
        allMovies.add(new Movie("The Fellowship of the Ring", "Frodo and Sam and Mordor", R.drawable.ic_movie));
        allMovies.add(new Movie("The Fellowship of the Ring", "Frodo and Sam and Mordor", R.drawable.ic_movie));
        allMovies.add(new Movie("The Fellowship of the Ring", "Frodo and Sam and Mordor", R.drawable.ic_movie));
        allMovies.add(new Movie("The Fellowship of the Ring", "Frodo and Sam and Mordor", R.drawable.ic_movie));
        allMovies.add(new Movie("The Fellowship of the Ring", "Frodo and Sam and Mordor", R.drawable.ic_movie));
        allMovies.add(new Movie("The Fellowship of the Ring", "Frodo and Sam and Mordor", R.drawable.ic_movie));
        allMovies.add(new Movie("The Fellowship of the Ring", "Frodo and Sam and Mordor", R.drawable.ic_movie));
        allMovies.add(new Movie("The Fellowship of the Ring", "Frodo and Sam and Mordor", R.drawable.ic_movie));
        allMovies.add(new Movie("The Fellowship of the Ring", "Frodo and Sam and Mordor", R.drawable.ic_movie));
        allMovies.add(new Movie("The Fellowship of the Ring", "Frodo and Sam and Mordor", R.drawable.ic_movie));
        return allMovies;
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
