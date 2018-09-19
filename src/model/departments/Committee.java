package model.departments;


import java.util.Arrays;

public class Committee <T> {
    private T member[];
    public int countMember;
    private int countVote[] = new int[5];
    private int countPositiveVote = 0;
    public String idError;


    public Committee(T memb[]) {
        member = memb;
    }

    public void addCommitteeMember(T memb) {
        member[countMember] = (memb);
        countMember++;
    }

    @Override
    public String toString() {
        return "Committee: " +
                Arrays.toString(member);
    }

    public T getMember(int memberID) {
        return member[memberID];
    }

    public int getCountPositiveVote() {
        return countPositiveVote;
    }

    // Add each positive vote
    public void memberVote(int memberID, boolean vote) {
        if (memberID <= 0 || memberID > 5 || countVote[memberID - 1] != 0)
            idError = memberID + " - This member have already voted or does not exist!";

        else {
            countVote[memberID - 1] = memberID;
            if (vote == true) countPositiveVote++;
        }
    }

    // The Committee takes positive decision if total positive member votes are >= 50% from total number of members
    public boolean committeeDecision() {
        if (countPositiveVote > (5 / 2)) return true;
        else return false;
    }
}


