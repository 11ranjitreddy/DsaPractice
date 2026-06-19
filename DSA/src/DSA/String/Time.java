package DSA.String;

public class Time {
    public static void main(String  args[]){
        String str="start time- 12:00am endtime- 1:00pm";

        String word[]=str.split(" ");
        String start="";
        String end="";

        for(String words:word){
            if(words.contains("am"))
                start+=words;
            else if(words.contains("pm"))
                end+=words;
        }
        System.out.println(start);
        System.out.println(end);

        String s[]=start.replace("am","").split(":");
        String e[]=end.replace("pm","").split(":");

        int h=Integer.parseInt(s[0]);
        int m=Integer.parseInt(s[1]);

        int h1=Integer.parseInt(e[0]);
        int m1=Integer.parseInt(e[1]);

        if(h==12)
            h=0;
        if(h1!=12)
            h1+=12;

        int startime=h*60+m;
        int endtime=h1*60+m1;

        int diff=endtime-startime;

        int minute=(diff/60)*60;
        int minute1=diff%60;

        int total=minute1+minute;
        System.out.println(total);
    }
}
