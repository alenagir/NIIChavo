package model.departments;


import model.people.implEmployee.Researcher;

public class Committee {
    private Researcher researcher[];
    private int memberNumber=0;
    private int countVote=0;

    public Committee(){
        researcher=new Researcher[Researcher.countResearch];
    }

    public void addCommitteeMember (Researcher research){
        researcher[memberNumber]=research;
        memberNumber++;
    }

    public void membersVote(boolean vote){
        if (vote = true) countVote++;
    }

    public boolean committeeVote(){
        if (countVote>=(memberNumber/2)) return true;
        else return false;
    }

}
