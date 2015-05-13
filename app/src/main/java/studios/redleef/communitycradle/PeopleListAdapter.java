package studios.redleef.communitycradle;

/**
 * Created by Fred Lee on 5/11/2015.
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

//Class to handle the population of the List of Peopless
public class PeopleListAdapter extends BaseAdapter
{
    Context context;
    private static ArrayList<PeopleObject> peopleList;
    LayoutInflater inflater;

    //Constructor
    public PeopleListAdapter(Context context, ArrayList<PeopleObject> peopleListNew) {

        peopleList = new ArrayList<PeopleObject>();
        loadPeople();
        this.inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.context = context;
    }

    public static void loadPeople()
    {
            PeopleObject person1 = new PeopleObject(4, "Linda Yenna", "Profession: Digital Designer", "Skillset: Graphic Design, Drawing, Soccer", R.drawable.person1);
            peopleList.add(person1);
            System.out.println("ADDED ONE");

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

    //Returns count,
    public int getCount() {
        return peopleList.size();
    }
    public PeopleObject getItem(int position) {
        return peopleList.get(4);
    }
    public long getItemId(int position)
    {
        return position;
    }

    //Method to add the information from each People into a row in the listview.
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {

            holder = new ViewHolder();
            convertView = this.inflater.inflate(R.layout.people_list_item, null);

            //Find UI elements for Pay, Name, and Days
            holder.name = (TextView) convertView.findViewById(R.id.people_item_name);
            holder.prof = (TextView) convertView.findViewById(R.id.people_item_profession);
            holder.skill = (TextView) convertView.findViewById(R.id.people_item_skillset);
            holder.image = (ImageView) convertView.findViewById(R.id.imageView);
            holder.rating = (RatingBar) convertView.findViewById(R.id.ratingBar);
            holder.date = (TextView) convertView.findViewById(R.id.people_date_joined);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        //Get the current Employee Object
        PeopleObject peopleItem = peopleList.get(position);

        //Set the contents of the UI elements
        holder.name.setText(peopleItem.getName());
        holder.prof.setText(peopleItem.getProf());
        holder.skill.setText(peopleItem.getSkill());
        holder.image.setImageResource(peopleItem.getImage());
        holder.rating.setRating(peopleItem.getRating());
        holder.date.setText("5/13/15");

        return convertView;
    }

    private class ViewHolder {
        TextView name;
        TextView prof;
        TextView skill;
        ImageView image;
        RatingBar rating;
        TextView date;
    }

}