package us.nauvil.tw2.tools;


public class TribeData {

    private String rank;
    private String tag;
    private String tribe;
    private int members;
    private int villages;
    private int points;
    private int pointsPerMember;
    private int pointsPerVillage;


    public void TribeData() {

    }

    @Override
    public String toString() {
        return "TribeData{" +
                "rank='" + rank + '\'' +
                ", tag='" + tag + '\'' +
                ", tribe='" + tribe + '\'' +
                ", members=" + members +
                ", villages=" + villages +
                ", points=" + points +
                ", pointsPerMember=" + pointsPerMember +
                ", pointsPerVillage=" + pointsPerVillage +
                '}';
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTribe() {
        return tribe;
    }

    public void setTribe(String tribe) {
        this.tribe = tribe;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    public int getVillages() {
        return villages;
    }

    public void setVillages(int villages) {
        this.villages = villages;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getPointsPerMember() {
        return pointsPerMember;
    }

    public void setPointsPerMember(int pointsPerMember) {
        this.pointsPerMember = pointsPerMember;
    }

    public int getPointsPerVillage() {
        return pointsPerVillage;
    }

    public void setPointsPerVillage(int pointsPerVillage) {
        this.pointsPerVillage = pointsPerVillage;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
