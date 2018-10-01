package model.departments;


import java.util.Arrays;

public class Committee <T> {

    public int countMember;
    public String idError=new String("Correct members' id.");
    public String reVoteError=new String("All the members have voted one time.");
    private T member[];
    private int countVote[] = new int[5];
    private int countPositiveVote = 0;
    private int voteCounter = 0;

    public Committee(T memb[]) {
        member = memb;
    }

    public void addCommitteeMember(T memb) {
        member[countMember] = (memb);
        countMember++;
    }

    public T getMember(int memberID) {
        return member[memberID];
    }

    public int getCountPositiveVote() {
        return countPositiveVote;
    }

    // Add each positive vote
    public void memberVote(int memberID, boolean vote) {
        if (memberID <= 0 || memberID > 5 ){
            idError = memberID + " - This member does not exist.";}

        if (memberID <= 5 && countVote[memberID - 1] != 0){
            reVoteError = memberID + " - This member has already voted.";}

        else try {
            countVote[memberID - 1] = memberID;
            if (vote == true) countPositiveVote++;
            voteCounter++;
        }catch (ArrayIndexOutOfBoundsException e){
            e.getMessage();
        }
    }
    // The Committee takes positive decision if total positive member votes are >= 50% from total number of members
    public String committeeDecision() {
        if (voteCounter!=countVote.length) return "Missing " + (countVote.length-voteCounter)+ " vote(s).";
        if (countPositiveVote > (countVote.length / 2)&&voteCounter==countVote.length) return "Positive";
        else return "Negative";
    }
    @Override
    public String toString() {
        return "Committee: " + Arrays.toString(member);
    }
}


