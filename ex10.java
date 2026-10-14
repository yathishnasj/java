package demo;
class Mark {
    String name;
    int mark=70;
    static int count = 0;
    Mark() {
        this("unknown", 100);
        System.out.println("maximum mark");
    }
    Mark(String name, int mark) {
        this.name = name;
        this.mark = mark;
        count++;
        System.out.println("pass mark");
    }
    Mark(String name) {
        this(name, 100);
        System.out.println("Arun");
    }
}

public class ex10 {
    public static void main(String[] args) {
        Mark s1 = new Mark();
        Mark s2 = new Mark("unknown");
        Mark s3 = new Mark("Arun", 80);

        System.out.println("Count: " + Mark.count);
    }
}