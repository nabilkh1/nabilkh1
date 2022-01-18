class User{ //This class gives basic information about a given user on twitter
    String UserName;
    String FullName;
    int FollowerCount;
//We are using a constructor in order to use several methods on the information with using different types
    User(String UserName, String FullName, int FollowerCount){
        this.UserName= UserName;
        this.FullName= FullName;
        this.FollowerCount=FollowerCount;
    }
    String toText(){
        return FullName + " @" + UserName;
    }
}
//this is a class that we made in order to create a constructor that we can do methods on the information
class Tweet{
    String TweetText;
    int LikeCount;
    String UniqueID;
    User accountDetails;
//this is a constructor with different types that we can juse methods on the data of a tweet              
    Tweet(String TweetText,int LikeCount, String UniqueID, User accountDetails){
        this.TweetText=TweetText;
        this.LikeCount=LikeCount;
        this.UniqueID=UniqueID;
        this.accountDetails =accountDetails;
    }
//this is a method that we use to determine a tweet is longer than a other tweet
    boolean longerThan(Tweet other){
        if (this.TweetText.length()>other.TweetText.length()){
            return true;
        }
        else{
            return false;
        }
    }
//this is a method that we can use to determine if a tweet has more likes than an other tweet
    boolean moreLikes(Tweet other){
        if (this.LikeCount>other.LikeCount){
            return true;
        }
        else{
            return false;
        }
            
    }
//This is a method that we can use to combine the information in a string to easily display the information in a tweet
    String toText(){
        return accountDetails.toText() + ": " + TweetText + " : " + LikeCount + " Likes";
    }
//This is a method that we can use the link to twitter plus the information we ahve to create a link to the twitter of any given post
    String toLink(){
        return "http://twitter.com/" + accountDetails.UserName + "/status/" + UniqueID;
    }
}
//This is an example class that we can use test the methods that we created
class ExampleTweets{
    User Example1= new User("StephenCurry30","Stephen Curry", 15700000);
    User Example2= new User("elonmusk","Elon Musk", 70600000);
    User Example3= new User("NFL", "NFL", 28200000 );

    Tweet Sample1= new Tweet("Cardinals activate DE J.J. Watt off IR.", 15500,"1483183628414853126", Example3);
    Tweet Sample2= new Tweet("Good thing I never tweet anything controversial", 233500 , "1482858149900136448", Example2);
    Tweet Sample3= new Tweet("Klay Day", 142600 , "1480272699918143489", Example3);
    Tweet Sample4= new Tweet("#TCC great day to be a Wildcat!", 6507 , "1473474490646499328", Example3);

    boolean length1= this.Sample2.longerThan(this.Sample1);//should be true
    boolean length2= this.Sample3.longerThan(this.Sample4);//should be false

    boolean LikeComparison1= this.Sample4.moreLikes(this.Sample3);
    boolean LikeComparison2= this.Sample2.moreLikes(this.Sample1);

    String ExampleText1 = this.Sample1.toText();
    String ExampleText2=this.Sample2.toText();

    String ExmapleToLink1= this.Sample1.toLink();
    String ExampleToLink2= this.Sample4.toLink();
}