package studios.redleef.communitycradle;

/**
 * Created by Fred Lee on 5/8/2015.
 */
public class PeopleObject {

    private String name, prof, skill;
    private int image;
    private float rating;

    public PeopleObject(float newRating, String newName, String newProf, String newSkill, int newImage)
    {
        name = newName;
        prof = newProf;
        skill = newSkill;
        image = newImage;
        rating = newRating;

    }

    //Getter Setter Methods
    public String getName() {return name;}
    public String getProf() {return prof;}
    public String getSkill() {return skill;}
    public int getImage() {return image;}
    public float getRating() {return rating;}

}
