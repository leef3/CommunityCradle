package studios.redleef.communitycradle;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;


public class PeopleFinderActivity extends Activity {

    private static ArrayList<PeopleObject> peopleList;

    private static PeopleListAdapter mAdapter;
    private static Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.find_people_list);

        context = this;
        peopleList = new ArrayList<PeopleObject>();

        loadPeople();

        ListView peopleListView = (ListView)findViewById(R.id.listView);
        mAdapter = new PeopleListAdapter(context, peopleList);

        peopleListView.setAdapter(mAdapter);
    }

    private static void loadPeople()
    {
        PeopleObject person1 = new PeopleObject(4, "Linda Yenna", "Profession: Digital Designer", "Skillset: Graphic Design, Drawing, Soccer", R.drawable.person1);
        peopleList.add(person1);

        PeopleObject person2 = new PeopleObject(4, "Jim Kennel", "Profession: Marine Biologist", "Skillset: Knitting, Writing, Carving", R.drawable.person2);
        peopleList.add(person2);

        PeopleObject person3 = new PeopleObject(3, "Joseph Pratt", "Profession: Financial Advisor", "Skillset: Time Management, Sailing", R.drawable.person3);

        peopleList.add(person3);
        PeopleObject person4 = new PeopleObject(5, "Bill Hedley", "Profession: Computer Programmer", "Skillset: Coding, Fishing, Cooking, Camping", R.drawable.person4);

        peopleList.add(person4);
        PeopleObject person5 = new PeopleObject(4, "Tom Brones", "Profession: Travel Advisor", "Skillset: Travel, Food, Singing", R.drawable.person5);

        peopleList.add(person5);
        PeopleObject person6 = new PeopleObject(2, "Brandon Mazzara", "Profession: Actor", "Skillset: Acting, Impressions, Improv", R.drawable.person6);

        peopleList.add(person6);
        PeopleObject person7 = new PeopleObject(5, "Louise Barrett", "Profession: Writer", "Skillset: Writer, Creative Writing, Painting", R.drawable.person7);

        peopleList.add(person7);
        PeopleObject person8 = new PeopleObject(5, "Kurt Philmer", "Profession: Car Mechanic", "Skillset: Machinery, Design, AutoCAD", R.drawable.person8);

        peopleList.add(person8);
        PeopleObject person9 = new PeopleObject(2, "Ronald Lonkin", "Profession: Lawyer", "Skillset: Debate, Law, Brewing, Flying", R.drawable.person9);

        peopleList.add(person9);
        PeopleObject person10 = new PeopleObject(4, "Nick Lucas", "Profession: Airline Pilot", "Skillset: Flying, Bird Watching, Swimming", R.drawable.person10);

        peopleList.add(person10);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
