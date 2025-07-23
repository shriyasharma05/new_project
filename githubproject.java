package new_project;

import new_project.ques1;

public class githubproject {
    static int count = 0;

    githubproject() {
        count++;
        System.out.println("Object number: " + count);
    }

    public static void main(String[] args) {
    	githubproject c1 = new githubproject();
    	githubproject c2 = new githubproject();
    	githubproject c3 = new githubproject();
    }
}