package com.example.movieapp


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.movieapp.databinding.ActivityMainBinding
import com.example.movieapp.databinding.CardCellBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity(), MovieClickListener
{
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)

//            val bottomNavigationView: BottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
//            val navController = findNavController(R.id.fragmentContainerView)
//            val appBarConfiguration = AppBarConfiguration(setOf(R.id.home, R.id.nowShowing, R.id.comingSoon))
//            setupActionBarWithNavController(navController, appBarConfiguration)
//
//            bottomNavigationView.setupWithNavController(navController)

            populateMovies()

            val mainActivity = this
            binding.recyclerView.apply {
                layoutManager = GridLayoutManager(applicationContext, 3)
                adapter = CardAdapter(movieList, mainActivity)
            }
            }

    override fun onClick(movie: Movie) {
        val intent = Intent(applicationContext, DetailActivity::class.java)
        intent.putExtra(MOVIE_ID_EXTRA, movie.id)
        startActivity(intent)
    }
}

    private fun populateMovies()
    {
        val movie1 = Movie(
            R.drawable.srbanner,
            "The Shawshank Redemption",
            "Frank Darabont",
            "Morgan Freeman, Juki, Timesquare",
            "1994",
            "Andy Dufresne (Tim Robbins) is sentenced to two consecutive life terms in prison for the murders of his wife and her lover and is sentenced to a tough prison. However, only Andy knows he didn't commit the crimes. While there, he forms a friendship with Red (Morgan Freeman), experiences brutality of prison life, adapts, helps the warden, etc., all in 19 years."

        )
        movieList.add(movie1)

        val movie2 = Movie(
            R.drawable.tgbanner,
            "The Godfather",
            "Francis Ford Coppola",
            "Vito Corleone, Michael Cera, Pool Dead",
            "1972",
            "Widely regarded as one of the greatest films of all time, this mob drama, based on Mario Puzo's novel of the same name, focuses on the powerful Italian-American crime family of Don Vito Corleone (Marlon Brando). When the don's youngest son, Michael (Al Pacino), reluctantly joins the Mafia, he becomes involved in the inevitable cycle of violence and betrayal. Although Michael tries to maintain a normal relationship with his wife, Kay (Diane Keaton), he is drawn deeper into the family business."

        )
        movieList.add(movie2)

        val movie3 = Movie(
            R.drawable.pfbanner,
            "Pulp Fiction",
            "Quentin Tarantino",
            "John Travolta, Samuel L. Jackson, Uma Thurman",
            "1994",
            "Vincent Vega (John Travolta) and Jules Winnfield (Samuel L. Jackson) are hitmen with a penchant for philosophical discussions. In this ultra-hip, multi-strand crime movie, their storyline is interwoven with those of their boss, gangster Marsellus Wallace (Ving Rhames) ; his actress wife, Mia (Uma Thurman) ; struggling boxer Butch Coolidge (Bruce Willis) ; master fixer Winston Wolfe (Harvey Keitel) and a nervous pair of armed robbers, \"Pumpkin\" (Tim Roth) and \"Honey Bunny\" (Amanda Plummer)."
        )
        movieList.add(movie3)

        val movie4 = Movie(
            R.drawable.fgbanner,
            "Forrest Gump",
            "Robert Zemeckis",
            "Tom Hanks, Burning, Love",
            "1994",
            "Slow-witted Forrest Gump (Tom Hanks) has never thought of himself as disadvantaged, and thanks to his supportive mother (Sally Field), he leads anything but a restricted life. Whether dominating on the gridiron as a college football star, fighting in Vietnam or captaining a shrimp boat, Forrest inspires people with his childlike optimism. But one person Forrest cares about most may be the most difficult to save -- his childhood love, the sweet but troubled Jenny (Robin Wright)."
        )
        movieList.add(movie4)

        val movie5 = Movie(
            R.drawable.tfgbanner,
            "Fight Club",
            "David Fincher",
            "Edward Norton, Brad Pitt, Helena Bonham Carter",
            "1999",
            "A depressed man (Edward Norton) suffering from insomnia meets a strange soap salesman named Tyler Durden (Brad Pitt) and soon finds himself living in his squalid house after his perfect apartment is destroyed. The two bored men form an underground club with strict rules and fight other men who are fed up with their mundane lives. Their perfect partnership frays when Marla (Helena Bonham Carter), a fellow support group crasher, attracts Tyler's attention."
        )
        movieList.add(movie5)

        val movie6 = Movie(
            R.drawable.tdkbanner,
            "The Dark Knight",
            "Christopher Nolan",
            "Christian Bale, Heath Ledger,Morgan Freeman",
            "2008",
            "With the help of allies Lt. Jim Gordon (Gary Oldman) and DA Harvey Dent (Aaron Eckhart), Batman (Christian Bale) has been able to keep a tight lid on crime in Gotham City. But when a vile young criminal calling himself the Joker (Heath Ledger) suddenly throws the town into chaos, the caped Crusader begins to tread a fine line between heroism and vigilantism."
        )
        movieList.add(movie6)

        movieList.add(movie1)
        movieList.add(movie2)
        movieList.add(movie3)
        movieList.add(movie4)
        movieList.add(movie5)
        movieList.add(movie6)
    }




//    fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        menuInflater.inflate(R.menu.toolbar_menu, menu)
//        return true
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        when(item.itemId){
//            R.id.search_button -> {
//                Toast.makeText(this, "You pressed the search button", Toast.LENGTH_LONG).show()
//            }
//        }
//        return true
//    }



