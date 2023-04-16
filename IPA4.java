import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        University[] arr = new University[4];

        for(int i=0;i<4;i++)
        {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            boolean d = sc.nextBoolean();
            double e = sc.nextDouble();sc.nextLine();

            arr[i] = new University(a,b,c,d,e);

        }
        String location = sc.nextLine();
        double rating = sc.nextDouble();

        int result = getUniversityByInnovationLab(arr,location,rating);
        if(result > 0)
            System.out.println(result);
        else
            System.out.println("No such Universities");

    }
    public static int getUniversityByInnovationLab(University[] arr,String location,double rating)
    {
        int count = 0;
        for(University u:arr){
            if(u.getLocation().equalsIgnoreCase(location)){
                if(u.getRating() > rating)
                    count++;
            }
        }
        return count;
    }

}
class University{
    private int universityId;
    private String universityName;
    private String location;
    private boolean innovationLab;
    private double rating;

    public University(int universityId, String universityName, String location, boolean innovationLab, double rating) {
        this.universityId = universityId;
        this.universityName = universityName;
        this.location = location;
        this.innovationLab = innovationLab;
        this.rating = rating;
    }

    public int getUniversityId() {
        return universityId;
    }

    public void setUniversityId(int universityId) {
        this.universityId = universityId;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean getInnovationLab() {
        return innovationLab;
    }

    public void setInnovationLab(boolean innovationLab) {
        this.innovationLab = innovationLab;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
